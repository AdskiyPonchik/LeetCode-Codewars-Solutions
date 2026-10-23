# LeetCode & Codewars solutions

My Java practice repository for LeetCode problems and Codewars katas.
LeetCode solutions are organized by topic, with NeetCode list membership separated from additional practice.

## Structure

```text
src/
├── Leetcode/
│   ├── NeetCode/          # NeetCode 150 / 250 tasks, organized by all 18 topics
│   │   ├── ArraysAndHashing/
│   │   ├── Backtracking/
│   │   ├── Graphs/
│   │   ├── DynamicProgramming1D/
│   │   ├── DynamicProgramming2D/
│   │   ├── Stack/
│   │   └── ...
│   ├── Additional/        # Other LeetCode tasks, also organized by topic
│   ├── ListNode.java      # Existing shared helper
│   └── README.md          # Topic map, problem IDs, difficulty, membership, links
├── Codewars/              # Codewars katas
└── main/
    └── Main.java          # Current local example/check runner
```

See the [LeetCode topic map and complete index](src/Leetcode/README.md) for every implementation, including alternative solutions and unfinished stubs.
All 18 NeetCode topic directories are present; an empty directory is a planned topic, not a completed one.
Accepted totals, local source coverage, and current understanding are separate measures.

## Build and run

Requires Java 21 and Maven. Import `pom.xml` into IntelliJ IDEA or run:

```bash
mvn test
java -cp target/classes main.Main
```

`Main` contains the current manual checks. The Maven test-source directory is `tests/`; it currently has no automated tests.
