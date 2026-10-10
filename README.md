# 🧠 LeetCode & Codewars Solutions

My personal grind log: **algorithm & data-structure solutions** from LeetCode (following the **NeetCode roadmap**) and Codewars katas, written in **Java**.

![Java](https://img.shields.io/badge/Java-main-orange?logo=openjdk)
![NeetCode](https://img.shields.io/badge/roadmap-NeetCode-blueviolet)

## 📁 Structure

```
src/
├── NeedCode/            # LeetCode problems, grouped by NeetCode topics
│   ├── Backtracking/    #   Subsets, Combination Sum, Permutations, ...
│   ├── BinarySearch/    #   Rotated arrays, Koko Eating Bananas, ...
│   ├── Heap/            #   Kth Largest, Task Scheduler, Median from Stream, ...
│   ├── Intervals/       #   Insert / Merge / Non-overlapping intervals
│   ├── LinkedList/      #   Reverse, Merge K Lists, LRU Cache, ...
│   ├── SlidingWindow/   #   Longest Substring, Min Window, ...
│   ├── Stack/           #   Valid Parentheses, Car Fleet, ...
│   ├── Tree/            #   Traversals, LCA, Serialize/Deserialize, Max Path Sum, ...
│   └── Tries/           #   Prefix Tree, Word Search II, ...
├── Leetcode/            # other LeetCode problems (Java / Python)
└── Codewars/            # katas (Java / Python): ciphers, parsers, simple VMs, ...
```

## 🎯 What this repo shows

- **Topic-by-topic mastery** — each folder maps to a core interview pattern: two pointers over sorted data, monotonic stacks, sliding windows, heaps, backtracking, tree recursion, tries
- **Hard problems included** — e.g. *Binary Tree Maximum Path Sum*, *Serialize and Deserialize Binary Tree*, *Rail Fence Cipher*, *Simple Assembler* (a mini VM interpreter)

## 🏃 Running a solution

Solutions are self-contained classes. Import `pom.xml` into IntelliJ IDEA or compile any file directly:

```bash
javac src/NeedCode/Tree/MaxPathSum.java
```

> This repo is updated as I grind — new topics and solutions land regularly. 💪
