
## 📘 README Conclusion — *BoyerMooreMajorityVote*  

This project implements, tests, and benchmarks the **Boyer-Moore Majority Vote Algorithm**, an efficient algorithm used to find the majority element in an array (the element that appears more than ⌊n/2⌋ times). The algorithm operates in **O(n)** time and **O(1)** space, making it one of the most optimal solutions for this problem.  

---

### 🔍 Project Structure  
- **Main.java** — Core implementation of the Boyer-Moore Majority Vote algorithm, enhanced with counters for comparisons and array accesses to support performance analysis.  
- **Result.java** — A simple data structure to store algorithm output (majority element, number of comparisons, and array accesses).  
- **BenchmarkRunner.java** — Benchmarks the algorithm’s performance across different input sizes (*10, 100, 1,000, 10,000, 100,000*), measuring execution time and operation counts.  
- **BoyerMooreMajorityVoteTest.java** — Unit tests that verify correctness for multiple predefined test cases, including both valid and invalid (no-majority) scenarios.

---

### 🧪 Testing and Validation  

**Purpose:**  
The goal of testing was to confirm the algorithm’s correctness by comparing **expected outputs** with **actual results** returned by the implementation, and to ensure proper exception handling for arrays without a majority element.  

**Test Arrays and Expected Results:**  

| Test Case | Input Array | Expected Majority | Actual Output | Test Result |
|------------|--------------|-------------------|----------------|--------------|
| 1 | [1, 2, 1, 2, 2] | 2 | ✅ 2 | ✅ Passed |
| 2 | [] | No majority (Exception) | ✅ Exception thrown | ✅ Passed |
| 3 | [1, 1, 1, 2, 2, 2] | No majority (Exception) | ✅ Exception thrown | ✅ Passed |
| 4 | [1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 1, 1] | No majority (Exception) | ✅ Exception thrown | ✅ Passed |

**Analysis:**  
All tests produced the **expected outcomes**, confirming that:
- The algorithm correctly identifies the majority element when one exists.
- It throws an appropriate **IllegalArgumentException** when no majority element is present.
- Edge cases (such as empty arrays) are properly handled.

---

### ⚙️ Benchmark Results  

Performance testing was conducted using random arrays with guaranteed majority elements.  
The table below summarizes execution time, comparisons, and array accesses for different input sizes.

| n | Majority | Time (ns) | Comparisons | Array Accesses |
|---|-----------|------------|--------------|----------------|
| 10 | 1 | 4,200 | 17 | 20 |
| 100 | 1 | 5,100 | 180 | 200 |
| 1,000 | 1 | 39,500 | 1,747 | 2,000 |
| 10,000 | 1 | 378,400 | 17,484 | 20,000 |
| 100,000 | 1 | 3,711,600 | 174,972 | 200,000 |

**Observation:**  
- The number of **comparisons** and **array accesses** scales linearly with input size (*O(n)*).  
- The **execution time** also increases proportionally, confirming the expected linear time complexity.  
- For small `n`, variations are due to measurement overhead and system noise, but for large `n`, performance growth stabilizes and aligns closely with theoretical predictions.

---

### ✅ Conclusion  

All tests in **BoyerMooreMajorityVoteTest** were executed successfully, matching the expected results.  
The **Boyer-Moore Majority Vote Algorithm** implementation demonstrates:

- ✔ **Correctness:** Output matches theoretical and expected results.  
- ✔ **Efficiency:** Time and operation counts confirm *O(n)* performance.  
- ✔ **Robustness:** Proper handling of invalid inputs (empty or no-majority arrays).  
- ✔ **Scalability:** Efficient and consistent performance for large datasets.

Overall, the implementation and benchmark results validate both the **theoretical efficiency** and **practical accuracy** of the Boyer-Moore Majority Vote Algorithm.
