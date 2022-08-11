### Results

UUID:
```
[info] Benchmark                                      Mode        Cnt         Score   Error  Units
[info] BenchmarkUUID.nativeUUID                     sample  126499553       447.365 ± 0.821  ns/op
[info] BenchmarkUUID.nativeUUID:nativeUUID·p0.00    sample                      ≈ 0          ns/op
[info] BenchmarkUUID.nativeUUID:nativeUUID·p0.50    sample                  459.000          ns/op
[info] BenchmarkUUID.nativeUUID:nativeUUID·p0.90    sample                  584.000          ns/op
[info] BenchmarkUUID.nativeUUID:nativeUUID·p0.95    sample                  625.000          ns/op
[info] BenchmarkUUID.nativeUUID:nativeUUID·p0.99    sample                  667.000          ns/op
[info] BenchmarkUUID.nativeUUID:nativeUUID·p0.999   sample                 1040.000          ns/op
[info] BenchmarkUUID.nativeUUID:nativeUUID·p0.9999  sample                17792.000          ns/op
[info] BenchmarkUUID.nativeUUID:nativeUUID·p1.00    sample             11288576.000          ns/op
[info] BenchmarkUUID.newUUID                        sample  118583660       511.477 ± 1.123  ns/op
[info] BenchmarkUUID.newUUID:newUUID·p0.00          sample                   41.000          ns/op
[info] BenchmarkUUID.newUUID:newUUID·p0.50          sample                  500.000          ns/op
[info] BenchmarkUUID.newUUID:newUUID·p0.90          sample                  625.000          ns/op
[info] BenchmarkUUID.newUUID:newUUID·p0.95          sample                  667.000          ns/op
[info] BenchmarkUUID.newUUID:newUUID·p0.99          sample                  791.000          ns/op
[info] BenchmarkUUID.newUUID:newUUID·p0.999         sample                 1208.000          ns/op
[info] BenchmarkUUID.newUUID:newUUID·p0.9999        sample                 6832.000          ns/op
[info] BenchmarkUUID.newUUID:newUUID·p1.00          sample              4898816.000          ns/op
```