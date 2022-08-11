package benchmarks

import org.openjdk.jmh.annotations._
import org.openjdk.jmh.infra.Blackhole

import java.util.UUID
import java.util.concurrent.{ThreadLocalRandom, TimeUnit}
import scala.annotation.tailrec
import scala.collection.mutable

@BenchmarkMode(Array(Mode.SampleTime))
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Measurement(iterations = 3, time = 10, timeUnit = TimeUnit.MINUTES)
@Fork(2)
class BenchmarkUUID {

  @Benchmark
  def newUUID(blackhole: Blackhole): Unit = {
    blackhole.consume(fastUUID())
  }

  @Benchmark
  def nativeUUID(blackhole: Blackhole): Unit = {
    blackhole.consume(UUID.randomUUID().toString)
  }

  def fastUUID(): String = {
    val hex = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'a', 'b', 'c', 'd', 'e', 'f')
    val msbees = ThreadLocalRandom.current.nextLong()
    val lsbees = ThreadLocalRandom.current.nextLong()
    val sb = new mutable.StringBuilder(36)

    @tailrec
    def appendHex(l: Long, d: Int, acc: mutable.StringBuilder): Unit = {
      if (d != 0) {
        appendHex(l >> 4, d - 1, acc.append(hex((l & 0xf).toInt)))
      }
    }

    appendHex(msbees, 8, sb)
    sb.append("-")
    appendHex(msbees >> 32, 4, sb)
    sb.append("-")
    appendHex(msbees >> 48, 4, sb)
    sb.append("-")
    appendHex(lsbees, 4, sb)
    sb.append("-")
    appendHex(lsbees >> 16, 12, sb)
    sb.toString

  }

}
