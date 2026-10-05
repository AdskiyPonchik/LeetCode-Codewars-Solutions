# Leet[code]wars

Решения задач LeetCode, NeetCode и Codewars. Для Java нужны JDK 21 и Maven 3.9+.

## Открыть в IntelliJ IDEA

1. Открыть корневой `pom.xml` через **File → Open → Open as Project**.
2. Выбрать **Project SDK: 21**.
3. В окне Maven выполнить **Reload All Maven Projects**.

Если проект уже открыт со старой структурой, закрыть его и открыть заново
через `pom.xml`. Maven задаёт корень исходников `src` и версию Java.

`.iml` — локальное описание модуля IDEA: исходники, SDK, зависимости и пути
компиляции. IDEA создаёт его при импорте Maven. `.idea/`, `*.iml` и `target/`
исключены из Git; для восстановления проекта достаточно исходников и `pom.xml`.

## Сборка и запуск

```sh
mvn clean verify
java -cp target/classes main.Main
```

Сохранена текущая раскладка: `src/Leetcode`, `src/NeedCode`, `src/Codewars` и
`src/main/Main.java`. Python-решения Maven не собирает.

Для будущих Java-тестов в POM отведён отдельный каталог `tests/`, чтобы они
не попадали в основные исходники. Сейчас автотестов и тестовых зависимостей
нет: успешная сборка проверяет компиляцию, но не правильность алгоритмов.
