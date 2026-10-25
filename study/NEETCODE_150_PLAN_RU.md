# Подготовка к LeetCode: продолжение NeetCode 150

Обновлено: 22 октября 2026. Это восстановленный план: прежний остался на другом компьютере, его текст здесь не восстановлен. Основания — предоставленный скриншот, текущие Java-решения и проверенный официальный список [NeetCode 150](https://neetcode.io/practice/practice/neetcode150).

## Что нужно изменить

Основной прогресс теперь должен идти через новые семейства задач: графы, DP, greedy, оставшиеся backtracking и intervals, затем advanced graphs, bits и math. На знакомые массивы, окна, стек, деревья и кучи отводим около 20% времени для проверки сохранности навыка. Около 80% — новые состояния, переходы и доказательства корректности.

Это рабочая пропорция, а не научно установленная норма. Если новая тема требует двух занятий на одну задачу, это нормально. Количество Accepted не заменяет понимания.

Скриншот показывает закрытую верхнюю часть roadmap, но это не независимая проверка знаний. По репозиторию подтверждается частичная работа в нижних разделах:

| Раздел актуального NC150 | Всего | Что найдено локально | Без найденного решения |
| --- | ---: | --- | ---: |
| Backtracking | 10 | 5 реализаций | 5 |
| Graphs | 13 | Реализаций из раздела не найдено | 13 |
| Advanced Graphs | 6 | Реализаций не найдено | 6 |
| 1-D DP | 12 | Реализаций из раздела не найдено | 12 |
| 2-D DP | 11 | Interleaving String | 10 |
| Greedy | 8 | Есть другие greedy-задачи, но не эти восемь | 8 |
| Intervals | 6 | Merge Intervals, Meeting Rooms | 4 |
| Bit Manipulation | 7 | Missing Number, решён через сумму | 6 |
| Math & Geometry | 8 | Happy Number; Plus One требует исправления | 6 |
| **Итого** | **81** | **10 реализаций + 1 решение с найденной ошибкой** | **70** |

«Без найденного решения» не означает, что задача никогда не решалась на сайте или другом компьютере. Общий счёт solved из этого аудита не выводим.

Generate Parentheses в актуальном списке находится в Backtracking: там 10 задач, в Stack — 6. Word Search в `src/NeedCode/Tries/WordSearch.java` — это Word Search II; Word Search I используем как короткую проверку обхода без trie. Interleaving String уже использует 2D-состояние со сжатием памяти — DP не совсем с нуля.

Plus One: в `src/Leetcode/Easy/PlusOne.java:32` цикл увеличивает индекс вместо уменьшения; по коду вход `[9]` приводит к выходу за границы. В рамках плана исходник не менялся, решение отдельно не запускалось. Это задача для исправления и проверки, а не новый материал.

## Как заниматься

Одно занятие: ориентир 60–90 минут, при другом доступном времени делить занятие на части.

1. 10–15 минут: разобрать одну идею и маленький пример из [конспекта](NEETCODE_CONCEPTS_RU.md).
2. 25–40 минут: самостоятельно сформулировать модель и написать решение. Если прогресса нет, взять одну подсказку: сначала про модель/состояние, затем про переход. Не сидеть без движения ради таймера.
3. 15–25 минут: разобрать ошибку, крайние случаи и сложность, затем воспроизвести ключевую часть без просмотра решения.
4. 5 минут: записать, что именно было новым и где потребовалась помощь.

На первые 2–3 задачи нового паттерна нормально заранее разобрать алгоритм. Следующая задача должна проверять самостоятельный перенос идеи. После 3–4 однотипных задач — одна задача без названия раздела, чтобы тренировать распознавание.

Повторять задачи, решённые с существенной помощью, примерно через 2, 7 и 21 день. Это удобные контрольные точки, а не обязательный календарь. Повторение — решить или восстановить рассуждение с пустого листа; перечитать код недостаточно.

Статусы в личном журнале: `новая` → `с подсказкой` → `самостоятельно` → `воспроизведена после паузы`. Статус `есть код` описывает только исходное состояние репозитория. Пустые чекбоксы ниже специально не выдают старые решения за подтверждённый навык.

## Первые десять занятий

Одна основная задача обязательна. Вторая задача — продолжение при наличии времени; иначе переносится на следующее занятие. Номера — LeetCode, все задачи входят в текущий NC150.

| Занятие | Основная задача | Продолжение | Что нужно объяснить после занятия |
| ---: | --- | --- | --- |
| 1 | 200 Number of Islands | Второй способ обхода на бумаге | Почему сетка — граф; почему посещение не откатывается |
| 2 | 133 Clone Graph | 695 Max Area of Island | Зачем отображение original → clone и почему его заполняют до обхода соседей |
| 3 | 994 Rotting Oranges | 286 Walls and Gates | Почему все источники кладём в очередь сразу; что означает один слой |
| 4 | 207 Course Schedule | Трассировка примера с циклом | Направление prerequisite → course; indegree; почему необработанные вершины означают цикл |
| 5 | 210 Course Schedule II | Один старый Medium на 20–30 минут | Как получить порядок зависимостей и учесть изолированные вершины |
| 6 | 70 Climbing Stairs | 746 Min Cost Climbing Stairs | Смысл состояния; почему для подсчёта используем сумму, для цены — минимум |
| 7 | 198 House Robber | 213 House Robber II | Выбор взять/пропустить; что меняется при замыкании в кольцо |
| 8 | 322 Coin Change | Контрпример для greedy | Почему `dp[0]=0`, как обозначить недостижимую сумму |
| 9 | 139 Word Break | Рекурсия → memo → таблица | Что значит состояние по префиксу; где повторяются подзадачи |
| 10 | 91 Decode Ways | Повтор одной из Graphs без подсказки | Какие переходы допустимы для `0`, `10`, `06`, `226` |

Это старт маршрута, не обещание закрыть Graphs и DP за две недели. Если вторые задачи не помещаются, не компенсировать это просмотром готового кода.

## Последовательность оставшегося пути

Порядок внутри стрелок — рекомендуемый учебный порядок, а не обязательный порядок сайта. Все 81 задачи перечислены далее; здесь — маршрут для тех, которые не подтверждены.

| Этап | Задачи и порядок | Условие перехода |
| --- | --- | --- |
| A. Основы Graphs | 200 → 695 → 133 → 994 → 286 → 130 → 417 → 207 → 210 | Самостоятельно отличать поиск компоненты, кратчайшее расстояние без весов и порядок зависимостей |
| B. Основа 1D DP | 70 → 746 → 198 → 213 → 91 → 322 → 139 → 152 → 300 → 416 | Для трёх разных задач записать смысл состояния, переход, базу и порядок вычислений |
| C. Добрать Backtracking и палиндромы | 17 → 22 → 79 → 131 → 5 → 647 → 51 | Объяснить локальное состояние пути, откат, ограничения и пропуск дублей; N-Queens — итоговая задача |
| D. Greedy и Intervals | 57 → 435 → 253 → 53 → 55 → 45 → 763 → 134 → 846 → 1899 → 678 → 1851 | Обосновать жадный выбор или назвать инвариант; различать объединение, отбор и число одновременных интервалов |
| E. 2D DP | 62 → 1143 → 518 → 494 → проверка 97 → 309 → 72 → 115 → 329 → 312 → 10 | Выбирать достаточный ключ состояния; понимать порядок циклов; самостоятельно вывести хотя бы одну таблицу |
| F. Связность и Advanced Graphs | 323 → 261 → 684 → 127 → 743 → 1584 → 787 → 778 → 269 → 332 | Отличать DSU, BFS, Dijkstra, ограниченные релаксации, MST, топологический порядок и эйлеров маршрут |
| G. Bits и Math | 136 → 191 → 338 → 190 → проверка 268 → 371 → 7; 48 → 54 → 73 → проверка 202 → исправление 66 → 50 → 43 → 2013 | Объяснить биты и переполнение Java, индексы матрицы и ограничения выбранного числового типа |

A и B — первые главные блоки; темы из них чередуются в стартовых занятиях. C можно добирать параллельно после первых уроков A/B. В F связность идёт перед MST, а Course Schedule уже пройден до Alien Dictionary. Bits и Math допустимо вставлять отдельными короткими занятиями, но не подменять ими основные блоки.

Не нужно идеально закрывать каждый Hard, чтобы двигаться дальше. На сложную задачу выделить до двух содержательных занятий; если нужен разбор, зафиксировать конкретную трудность и дату повторной попытки. Новая тема продолжается, задача остаётся в очереди повторения.

70 отсутствующих локально решений — ориентир объёма, не требование решить их все заново. При пяти действительно новых задачах в неделю первый проход занимает около 14 недель без резерва на сложные задачи и повторения. Календарь уточнять после первых десяти занятий по реальному темпу.

## Как понять, что тема освоена

- До кода назвать модель, состояние и допустимые действия.
- Объяснить, почему алгоритм не пропускает ответ, не считает его дважды или не делает неверный жадный выбор.
- Проверить 2–3 случая, которые ломают наивное решение: цикл, пустой переход, повтор, недостижимое состояние, отрицательное число, переполнение.
- Оценить время и дополнительную память, включая стек рекурсии и очередь.
- После паузы решить одну репрезентативную задачу без подсказки и перенести идею на другую задачу этого семейства.

Если провалена одна проверка, возвращаем конкретный навык, а не весь раздел с начала.

## Полный рабочий список нижних девяти разделов

Ниже — 81 задача актуального NC150. `Новая*` означает отсутствие локального решения в проверенном репозитории. `Проверка` — код есть, навык ещё не оценён. `Исправление` — в коде обнаружена проблема. Ссылки ведут на NeetCode, рядом указан номер LeetCode. Для задач с платным условием LeetCode доступна соответствующая формулировка на NeetCode.

### Backtracking — 10

| Проверено | LC | Задача | Сложность | Исходный статус | Учебная цель |
| --- | ---: | --- | --- | --- | --- |
| ☐ | 78 | [Subsets](https://neetcode.io/problems/subsets/question?list=neetcode150) | Medium | Проверка: Subsets.java | Взять/пропустить элемент; дерево решений |
| ☐ | 39 | [Combination Sum](https://neetcode.io/problems/combination-target-sum/question?list=neetcode150) | Medium | Проверка: CombinationSum.java | Неограниченное повторение кандидата; ограничение суммы |
| ☐ | 40 | [Combination Sum II](https://neetcode.io/problems/combination-target-sum-ii/question?list=neetcode150) | Medium | Проверка: CombinationSum2.java | Одно использование элемента; дубли на одном уровне |
| ☐ | 46 | [Permutations](https://neetcode.io/problems/permutations/question?list=neetcode150) | Medium | Проверка: Permutations.java | Выбор из ещё не использованных элементов |
| ☐ | 90 | [Subsets II](https://neetcode.io/problems/subsets-ii/question?list=neetcode150) | Medium | Проверка: Subsets2.java | Сортировка и пропуск одинаковых веток |
| ☐ | 22 | [Generate Parentheses](https://neetcode.io/problems/generate-parentheses/question?list=neetcode150) | Medium | Новая* | Инвариант: закрывающих не больше открывающих |
| ☐ | 79 | [Word Search](https://neetcode.io/problems/search-for-word/question?list=neetcode150) | Medium | Новая* | Посещение только в текущем пути; откат клетки |
| ☐ | 131 | [Palindrome Partitioning](https://neetcode.io/problems/palindrome-partitioning/question?list=neetcode150) | Medium | Новая* | Перебор разрезов; допустимость палиндрома |
| ☐ | 17 | [Letter Combinations of a Phone Number](https://neetcode.io/problems/combinations-of-a-phone-number/question?list=neetcode150) | Medium | Новая* | Декартово произведение выборов |
| ☐ | 51 | [N Queens](https://neetcode.io/problems/n-queens/question?list=neetcode150) | Hard | Новая* | Ограничения столбцов и диагоналей |

### Graphs — 13

| Проверено | LC | Задача | Сложность | Исходный статус | Учебная цель |
| --- | ---: | --- | --- | --- | --- |
| ☐ | 200 | [Number of Islands](https://neetcode.io/problems/count-number-of-islands/question?list=neetcode150) | Medium | Новая* | Компоненты связности в сетке |
| ☐ | 695 | [Max Area of Island](https://neetcode.io/problems/max-area-of-island/question?list=neetcode150) | Medium | Новая* | Агрегация размера компоненты |
| ☐ | 133 | [Clone Graph](https://neetcode.io/problems/clone-graph/question?list=neetcode150) | Medium | Новая* | Original → clone; циклы и общие соседи |
| ☐ | 286 | [Walls And Gates](https://neetcode.io/problems/islands-and-treasure/question?list=neetcode150) | Medium | Новая* | BFS из всех источников одновременно |
| ☐ | 994 | [Rotting Oranges](https://neetcode.io/problems/rotting-fruit/question?list=neetcode150) | Medium | Новая* | Слои BFS как время; недостижимые клетки |
| ☐ | 417 | [Pacific Atlantic Water Flow](https://neetcode.io/problems/pacific-atlantic-water-flow/question?list=neetcode150) | Medium | Новая* | Обратный поиск от границ; пересечение достижимых множеств |
| ☐ | 130 | [Surrounded Regions](https://neetcode.io/problems/surrounded-regions/question?list=neetcode150) | Medium | Новая* | Сначала сохранить связанные с границей области |
| ☐ | 207 | [Course Schedule](https://neetcode.io/problems/course-schedule/question?list=neetcode150) | Medium | Новая* | Цикл в ориентированном графе; indegree |
| ☐ | 210 | [Course Schedule II](https://neetcode.io/problems/course-schedule-ii/question?list=neetcode150) | Medium | Новая* | Построить топологический порядок |
| ☐ | 261 | [Graph Valid Tree](https://neetcode.io/problems/valid-tree/question?list=neetcode150) | Medium | Новая* | Связность плюс отсутствие цикла |
| ☐ | 323 | [Number of Connected Components In An Undirected Graph](https://neetcode.io/problems/count-connected-components/question?list=neetcode150) | Medium | Новая* | DFS или DSU для подсчёта компонент |
| ☐ | 684 | [Redundant Connection](https://neetcode.io/problems/redundant-connection/question?list=neetcode150) | Medium | Новая* | Ребро внутри одной компоненты создаёт цикл |
| ☐ | 127 | [Word Ladder](https://neetcode.io/problems/word-ladder/question?list=neetcode150) | Hard | Новая* | Неявный граф; BFS и эффективный поиск соседей |

### Advanced Graphs — 6

| Проверено | LC | Задача | Сложность | Исходный статус | Учебная цель |
| --- | ---: | --- | --- | --- | --- |
| ☐ | 743 | [Network Delay Time](https://neetcode.io/problems/network-delay-time/question?list=neetcode150) | Medium | Новая* | Dijkstra; устаревшие записи в куче |
| ☐ | 332 | [Reconstruct Itinerary](https://neetcode.io/problems/reconstruct-flight-path/question?list=neetcode150) | Hard | Новая* | Эйлеров маршрут; каждое ребро ровно один раз |
| ☐ | 1584 | [Min Cost to Connect All Points](https://neetcode.io/problems/min-cost-to-connect-points/question?list=neetcode150) | Medium | Новая* | Минимальное остовное дерево; Prim или Kruskal |
| ☐ | 778 | [Swim In Rising Water](https://neetcode.io/problems/swim-in-rising-water/question?list=neetcode150) | Hard | Новая* | Минимизировать максимум высоты на пути |
| ☐ | 269 | [Alien Dictionary](https://neetcode.io/problems/foreign-dictionary/question?list=neetcode150) | Hard | Новая* | Порядок символов; топосортировка и неверный префикс |
| ☐ | 787 | [Cheapest Flights Within K Stops](https://neetcode.io/problems/cheapest-flight-path/question?list=neetcode150) | Medium | Новая* | Не более K+1 рёбер; релаксации по снимку прошлого слоя |

### 1-D Dynamic Programming — 12

| Проверено | LC | Задача | Сложность | Исходный статус | Учебная цель |
| --- | ---: | --- | --- | --- | --- |
| ☐ | 70 | [Climbing Stairs](https://neetcode.io/problems/climbing-stairs/question?list=neetcode150) | Easy | Новая* | Подсчёт способов; база и переход |
| ☐ | 746 | [Min Cost Climbing Stairs](https://neetcode.io/problems/min-cost-climbing-stairs/question?list=neetcode150) | Easy | Новая* | Минимальная стоимость достижения ступени |
| ☐ | 198 | [House Robber](https://neetcode.io/problems/house-robber/question?list=neetcode150) | Medium | Новая* | Максимум при выборе взять/пропустить |
| ☐ | 213 | [House Robber II](https://neetcode.io/problems/house-robber-ii/question?list=neetcode150) | Medium | Новая* | Кольцо; два линейных случая; один дом |
| ☐ | 5 | [Longest Palindromic Substring](https://neetcode.io/problems/longest-palindromic-substring/question?list=neetcode150) | Medium | Новая* | Расширение из центра или DP по отрезку |
| ☐ | 647 | [Palindromic Substrings](https://neetcode.io/problems/palindromic-substrings/question?list=neetcode150) | Medium | Новая* | Подсчёт нечётных и чётных центров |
| ☐ | 91 | [Decode Ways](https://neetcode.io/problems/decode-ways/question?list=neetcode150) | Medium | Новая* | Одно- и двухзначные переходы; нули |
| ☐ | 322 | [Coin Change](https://neetcode.io/problems/coin-change/question?list=neetcode150) | Medium | Новая* | Минимум монет; недостижимые суммы |
| ☐ | 152 | [Maximum Product Subarray](https://neetcode.io/problems/maximum-product-subarray/question?list=neetcode150) | Medium | Новая* | Хранить и минимум, и максимум произведения |
| ☐ | 139 | [Word Break](https://neetcode.io/problems/word-break/question?list=neetcode150) | Medium | Новая* | Достижимость префикса через допустимые слова |
| ☐ | 300 | [Longest Increasing Subsequence](https://neetcode.io/problems/longest-increasing-subsequence/question?list=neetcode150) | Medium | Новая* | Сначала DP O(n²), затем при желании tails O(n log n) |
| ☐ | 416 | [Partition Equal Subset Sum](https://neetcode.io/problems/partition-equal-subset-sum/question?list=neetcode150) | Medium | Новая* | 0/1 knapsack; обратный проход по сумме |

### 2-D Dynamic Programming — 11

| Проверено | LC | Задача | Сложность | Исходный статус | Учебная цель |
| --- | ---: | --- | --- | --- | --- |
| ☐ | 62 | [Unique Paths](https://neetcode.io/problems/count-paths/question?list=neetcode150) | Medium | Новая* | Два индекса; границы таблицы |
| ☐ | 1143 | [Longest Common Subsequence](https://neetcode.io/problems/longest-common-subsequence/question?list=neetcode150) | Medium | Новая* | Два префикса или суффикса; совпадение и пропуск |
| ☐ | 309 | [Best Time to Buy And Sell Stock With Cooldown](https://neetcode.io/problems/buy-and-sell-crypto-with-cooldown/question?list=neetcode150) | Medium | Новая* | День плюс состояние владения и cooldown |
| ☐ | 518 | [Coin Change II](https://neetcode.io/problems/coin-change-ii/question?list=neetcode150) | Medium | Новая* | Число комбинаций; номиналы снаружи |
| ☐ | 494 | [Target Sum](https://neetcode.io/problems/target-sum/question?list=neetcode150) | Medium | Новая* | Индекс плюс сумма; одинаковые суммы на разных слоях |
| ☐ | 97 | [Interleaving String](https://neetcode.io/problems/interleaving-string/question?list=neetcode150) | Medium | Проверка: InterleavingString.java | Два индекса; третий определяется их суммой |
| ☐ | 329 | [Longest Increasing Path In a Matrix](https://neetcode.io/problems/longest-increasing-path-in-matrix/question?list=neetcode150) | Hard | Новая* | DFS + memo по ацикличным переходам к большему |
| ☐ | 115 | [Distinct Subsequences](https://neetcode.io/problems/count-subsequences/question?list=neetcode150) | Hard | Новая* | Количество способов; совпадение допускает взять и пропустить |
| ☐ | 72 | [Edit Distance](https://neetcode.io/problems/edit-distance/question?list=neetcode150) | Medium | Новая* | Вставить, удалить, заменить; границы префиксов |
| ☐ | 312 | [Burst Balloons](https://neetcode.io/problems/burst-balloons/question?list=neetcode150) | Hard | Новая* | DP по интервалу; выбрать последний шар внутри него |
| ☐ | 10 | [Regular Expression Matching](https://neetcode.io/problems/regular-expression-matching/question?list=neetcode150) | Hard | Новая* | Индексы строки/шаблона; ноль или несколько повторов для * |

### Greedy — 8

| Проверено | LC | Задача | Сложность | Исходный статус | Учебная цель |
| --- | ---: | --- | --- | --- | --- |
| ☐ | 53 | [Maximum Subarray](https://neetcode.io/problems/maximum-subarray/question?list=neetcode150) | Medium | Новая* | Лучший отрезок, заканчивающийся здесь |
| ☐ | 55 | [Jump Game](https://neetcode.io/problems/jump-game/question?list=neetcode150) | Medium | Новая* | Самая дальняя достижимая позиция |
| ☐ | 45 | [Jump Game II](https://neetcode.io/problems/jump-game-ii/question?list=neetcode150) | Medium | Новая* | Границы слоя достижимости; минимальное число прыжков |
| ☐ | 134 | [Gas Station](https://neetcode.io/problems/gas-station/question?list=neetcode150) | Medium | Новая* | Невозможный участок исключает несколько стартов |
| ☐ | 846 | [Hand of Straights](https://neetcode.io/problems/hand-of-straights/question?list=neetcode150) | Medium | Новая* | Минимальная оставшаяся карта обязана начинать группу |
| ☐ | 1899 | [Merge Triplets to Form Target Triplet](https://neetcode.io/problems/merge-triplets-to-form-target/question?list=neetcode150) | Medium | Новая* | Отсечь тройки, превышающие цель; покрыть координаты |
| ☐ | 763 | [Partition Labels](https://neetcode.io/problems/partition-labels/question?list=neetcode150) | Medium | Новая* | Граница по последним вхождениям |
| ☐ | 678 | [Valid Parenthesis String](https://neetcode.io/problems/valid-parenthesis-string/question?list=neetcode150) | Medium | Новая* | Диапазон возможного числа открытых скобок |

### Intervals — 6

| Проверено | LC | Задача | Сложность | Исходный статус | Учебная цель |
| --- | ---: | --- | --- | --- | --- |
| ☐ | 57 | [Insert Interval](https://neetcode.io/problems/insert-new-interval/question?list=neetcode150) | Medium | Новая* | До пересечения, объединение, оставшийся хвост |
| ☐ | 56 | [Merge Intervals](https://neetcode.io/problems/merge-intervals/question?list=neetcode150) | Medium | Проверка: MergeIntervals.java | Сортировка и объединение пересечений |
| ☐ | 435 | [Non Overlapping Intervals](https://neetcode.io/problems/non-overlapping-intervals/question?list=neetcode150) | Medium | Новая* | Выбирать ближайшее окончание; аргумент обмена |
| ☐ | 252 | [Meeting Rooms](https://neetcode.io/problems/meeting-schedule/question?list=neetcode150) | Easy | Проверка: MeetingRoom.java | Проверка конфликтов встреч |
| ☐ | 253 | [Meeting Rooms II](https://neetcode.io/problems/meeting-schedule-ii/question?list=neetcode150) | Medium | Новая* | Максимум одновременно активных встреч |
| ☐ | 1851 | [Minimum Interval to Include Each Query](https://neetcode.io/problems/minimum-interval-including-query/question?list=neetcode150) | Hard | Новая* | Запросы по возрастанию; куча допустимых интервалов |

### Bit Manipulation — 7

| Проверено | LC | Задача | Сложность | Исходный статус | Учебная цель |
| --- | ---: | --- | --- | --- | --- |
| ☐ | 136 | [Single Number](https://neetcode.io/problems/single-number/question?list=neetcode150) | Easy | Новая* | XOR одинаковых значений взаимно уничтожается |
| ☐ | 191 | [Number of 1 Bits](https://neetcode.io/problems/number-of-one-bits/question?list=neetcode150) | Easy | Новая* | n & (n-1) убирает младший установленный бит |
| ☐ | 338 | [Counting Bits](https://neetcode.io/problems/counting-bits/question?list=neetcode150) | Easy | Новая* | Связь числа битов x и x >> 1 |
| ☐ | 190 | [Reverse Bits](https://neetcode.io/problems/reverse-bits/question?list=neetcode150) | Easy | Новая* | Ровно 32 бита; беззнаковый сдвиг |
| ☐ | 268 | [Missing Number](https://neetcode.io/problems/missing-number/question?list=neetcode150) | Easy | Проверка: MissingNumber.java | Повторить через XOR вместо известного решения суммой |
| ☐ | 371 | [Sum of Two Integers](https://neetcode.io/problems/sum-of-two-integers/question?list=neetcode150) | Medium | Новая* | XOR без переноса; AND и сдвиг для переноса |
| ☐ | 7 | [Reverse Integer](https://neetcode.io/problems/reverse-integer/question?list=neetcode150) | Medium | Новая* | Границы int до умножения и добавления цифры |

### Math & Geometry — 8

| Проверено | LC | Задача | Сложность | Исходный статус | Учебная цель |
| --- | ---: | --- | --- | --- | --- |
| ☐ | 48 | [Rotate Image](https://neetcode.io/problems/rotate-matrix/question?list=neetcode150) | Medium | Новая* | Поворот индексов; транспонирование и разворот |
| ☐ | 54 | [Spiral Matrix](https://neetcode.io/problems/spiral-matrix/question?list=neetcode150) | Medium | Новая* | Четыре границы; не обойти слой дважды |
| ☐ | 73 | [Set Matrix Zeroes](https://neetcode.io/problems/set-zeroes-in-matrix/question?list=neetcode150) | Medium | Новая* | Маркеры в первой строке/столбце и отдельные флаги |
| ☐ | 202 | [Happy Number](https://neetcode.io/problems/non-cyclical-number/question?list=neetcode150) | Easy | Проверка: HappyNumber.java | Цикл в последовательности состояний |
| ☐ | 66 | [Plus One](https://neetcode.io/problems/plus-one/question?list=neetcode150) | Easy | Исправление: PlusOne.java | Перенос справа налево; проверить [9] и [9,9] |
| ☐ | 50 | [Pow(x, n)](https://neetcode.io/problems/pow-x-n/question?list=neetcode150) | Medium | Новая* | Бинарное возведение; отрицательный Integer.MIN_VALUE |
| ☐ | 43 | [Multiply Strings](https://neetcode.io/problems/multiply-strings/question?list=neetcode150) | Medium | Новая* | Поразрядное умножение и переносы |
| ☐ | 2013 | [Detect Squares](https://neetcode.io/problems/count-squares/question?list=neetcode150) | Medium | Новая* | Частоты точек; выбор осевого квадрата и кратности |


## Шаблон записи одного занятия

```text
Дата / задача:
Статус: новая | с подсказкой | самостоятельно | после паузы
Новая идея:
Смысл состояния или инвариант:
Почему это работает:
Где потребовалась помощь:
Контрпример / крайний случай:
Время и память:
Что повторить и когда:
```

Полные объяснения: [NEETCODE_CONCEPTS_RU.md](NEETCODE_CONCEPTS_RU.md). Рабочий план хранится в проекте; сохранение файла само по себе не означает отправку на GitHub или синхронизацию на второй компьютер.
