## 📘 README Conclusion — *BoyerMooreMajorityVoteTest*  

This project implements and benchmarks the **Boyer-Moore Majority Vote Algorithm**, which efficiently identifies the majority element in an array with **O(n)** time complexity and **O(1)** space complexity.  

### 🔍 Summary  
The program includes:  
- **Main.java** — Core implementation of the Boyer-Moore Majority Vote algorithm.  
- **BenchmarkRunner.java** — Performance benchmarking that measures execution time, comparisons, and array accesses for input sizes ranging from *10* to *100,000*.  
- **Result.java** — Data class for storing algorithm statistics.  
- **BoyerMooreMajorityVoteTest.java** — JUnit tests verifying algorithm correctness and exception handling.  

### 🧪 Test Results  
Comprehensive testing was conducted using fixed arrays and randomized datasets.  
All tests in **BoyerMooreMajorityVoteTest** were successfully passed, confirming that:  
- The algorithm correctly identifies the majority element when one exists.  
- It properly throws an exception when no majority element is present.  
- Benchmark results are consistent across multiple input sizes.  

### 📊 Benchmark Summary  
| n | Majority | Time (ns) | Comparisons | Array Accesses |
|---|-----------|------------|--------------|----------------|
| 10 | 1 | 4,200 | 17 | 20 |
| 100 | 1 | 5,100 | 180 | 200 |
| 1,000 | 1 | 39,500 | 1,747 | 2,000 |
| 10,000 | 1 | 378,400 | 17,484 | 20,000 |
| 100,000 | 1 | 3,711,600 | 174,972 | 200,000 |

### ✅ Conclusion  
All algorithm tests and performance benchmarks were executed successfully.  
The **Boyer-Moore Majority Vote implementation** demonstrates **reliable correctness**, **linear scalability**, and **efficient performance** across varying input sizes, validating both the theoretical and empirical expectations of the algorithm.
