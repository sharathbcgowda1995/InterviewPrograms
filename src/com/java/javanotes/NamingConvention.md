# Java Naming Conventions

| **Type**          | **Convention** | **Example**            | **Explanation** |
|-------------------|----------------|-------------------------|-----------------|
| **Class**         | PascalCase     | `PaymentProcessor`     | Class names start with a **capital letter** and use PascalCase (each word starts with a capital). |
| **Interface**     | PascalCase     | `Serializable`         | Interfaces follow the same rule as classes. Often adjectives (e.g., `Runnable`, `Cloneable`). |
| **Method**        | camelCase      | `calculateSalary()`    | Start with lowercase, subsequent words capitalized. Must be verbs (action-oriented). |
| **Variable**      | camelCase      | `employeeAge`          | Descriptive and meaningful. Start lowercase, no underscores. |
| **Constant**      | UPPER_CASE     | `MAX_RETRY`            | All caps with underscores between words. Declared with `static final`. |
| **Package**       | lowercase      | `com.company.project`  | Always lowercase to avoid conflicts (no uppercase letters). Hierarchical naming (domain → project → module). |
| **Generic Types** | Single Letter  | `<T>, <E>, <K, V>`     | `T` = Type, `E` = Element, `K,V` = Key,Value. Keep them short and conventional. |
| **Test Class**    | ClassName+Test | `EmployeeDetailsTest`  | Test classes should mirror the class being tested + `Test` suffix. |

---

## Additional Points

- **Enum Names** → PascalCase (e.g., `DayOfWeek`), but enum **constants** are UPPER_CASE (e.g., `MONDAY, TUESDAY`).
- **Boolean Variables** → should sound like a condition, e.g., `isActive`, `hasPermission`, `canExecute`.
- **Annotations** → PascalCase (e.g., `@Override`, `@Autowired`).  
