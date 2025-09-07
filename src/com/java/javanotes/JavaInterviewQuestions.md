package com.java.javanotes.concepts;

public class StringConcepts {

	public static void main(String[] args) {
		String str = new String("Sharath");
		
		#Two String Objects are Created:
		
## One in the String Pool (interned):

> The string literal "ankit" is first looked up in the String Pool.
> If "ankit" does not already exist in the String Pool, it is added there.
> If "ankit" already exists in the String Pool, the existing object is reused.

##One on the Heap (new object):

> The new String("ankit") explicitly creates a new String object on the heap.
> This object is a distinct, new object that holds the value "ankit" and is not part of the String Pool.
> Even though its value is the same as the string literal "ankit", it's stored separately in memory.
		
		System.out.println(str.hashCode());
		
		String str2 = "Sharath";
		
		System.out.println(str2.hashCode());
		
		System.out.println(str == str2);//False
		
		String str3 = "Sharath";
		
		System.out.println(str3 == str2);//True

	}

}

### Given multiple mobile numbers on a site, how would you validate them and count valid/invalid ones?

Manual/Testing Approach

```
Example rules for India:

[6-9][0-9]{9}$ → Starts with 6-9, followed by 9 digits (total 10).

Example rules (E.164 international):

\+?[1-9]\d{1,14}$ → Optional +, then 2–15 digits, no leading zero.

Collect all numbers shown on the page.
Apply regex/validation rules.
Mark each number as valid or invalid.
Count totals.

List<WebElement> numbers = driver.findElements(By.cssSelector(".mobile-number"));
int validCount = 0;
int invalidCount = 0;

String regex = "^[6-9][0-9]{9}$";  // For India 10-digit numbers
Pattern pattern = Pattern.compile(regex);

for (WebElement numElement : numbers) {
String num = numElement.getText().trim();
if (pattern.matcher(num).matches()) {
validCount++;
} else {
invalidCount++;
}
}

System.out.println("Valid numbers: " + validCount);
System.out.println("Invalid numbers: " + invalidCount);
```

### Explain primary key vs foreign key.

```declarative
Primary Key : 
- A unique identifier for each record in a table.
- Must be unique (no duplicates).
- Cannot be NULL.
- One table can have only one primary key, but it can consist of multiple columns (composite key).

CREATE TABLE Users (
user_id INT PRIMARY KEY,
name VARCHAR(50),
email VARCHAR(100) UNIQUE
);

Here, user_id uniquely identifies each user.
No two users can have the same user_id, and it cannot be NULL.

Foreign Key : 

- A column (or set of columns) that references the primary key of another table.
- Used to establish relationships between tables (maintains referential integrity).
- Can contain duplicate values and can be NULL (depending on design).

CREATE TABLE Orders (
order_id INT PRIMARY KEY,
user_id INT,
order_date DATE,
FOREIGN KEY (user_id) REFERENCES Users(user_id)
);

Users(user_id) → Primary Key
Orders(user_id) → Foreign Key referencing Users(user_id)

```
###  What is inheritance? Where do you apply it in your framework? 

```declarative

Base Test Class : 
A BaseTest (or TestBase) class contains common setup/teardown code. 
All test classes inherit from this base class.

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

public class LoginTest extends BaseTest {
    @Test
    public void testLogin() {
        driver.get("https://example.com");
        // test steps...
    }
}


```
###  Separate characters and digits from an input string in an online editor.

```declarative

public class Separator {
    public static Result separate(String s, boolean keepOthers) {
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder others = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) letters.append(c);
            else if (Character.isDigit(c)) digits.append(c);
            else others.append(c);
        }
        return new Result(letters.toString(), digits.toString(), keepOthers ? others.toString() : "");
    }

    public static class Result {
        public final String letters, digits, others;
        public Result(String l, String d, String o) { letters = l; digits = d; others = o; }
    }

    public static void main(String[] args) {
        Result r = separate("abc123def456!@#", true);
        System.out.println("Letters: " + r.letters);
        System.out.println("Digits:  " + r.digits);
        System.out.println("Others:  " + r.others);
    }
}
```
### Explain Agile methodology and ceremonies. ? 

```dtd
Agile is a software development approach that emphasizes:
        Iterative and incremental delivery (small usable pieces instead of one big release).
        Customer collaboration (continuous feedback).
        Adaptability (responding to change quickly).
        Cross-functional teams (devs, testers, product, etc., working together).
        Frameworks that follow Agile principles include Scrum, Kanban, XP, etc.
        
Agile Ceremonies (Scrum as the most common)
        1. Sprint Planning :
        When: At the start of each sprint.
        Who: Entire Scrum Team (PO, Scrum Master, Developers, QA).
        Purpose: Decide what backlog items (stories/tasks) can be delivered in the sprint and how they’ll be done.
        Output: Sprint Goal + Sprint Backlog.

        2. Daily Stand-up (Daily Scrum) : 
        When: Daily, short (15 min max).
        Who: Development team (PO/SM can attend but not lead).
        Purpose: Synchronize work and identify blockers.
        Each team member answers (classic format):
        What did I do yesterday?
        What will I do today?
        Any impediments/blockers?

        3. Sprint Review :
        When: End of sprint.
        Who: Scrum Team + Stakeholders.
        Purpose: Demonstrate the working product increment to stakeholders, gather feedback, and adapt the backlog.
        Focus: What was delivered.

        4. Sprint Retrospective :
        When: After Sprint Review, before next Sprint Planning.
        Who: Scrum Team.
        Purpose: Reflect on the sprint and discuss improvements.
        Format: What went well? What didn’t go well? What can we improve?
        Focus: How the team works together.

        🔹 Supporting Concepts :
        Product Backlog: Prioritized list of features/user stories maintained by the Product Owner.
        Sprint Backlog: Subset of backlog items committed for the sprint.
        Increment: A potentially shippable piece of working software.
        
Summary for interviews:
        Agile = iterative, customer-focused, adaptable way of working.
        Ceremonies = Sprint Planning, Daily Stand-up, Sprint Review, Sprint Retrospective.

```

### Write a program to read multiple data from properties files. ?

``` 
Sample config.properties file
    url=https://example.com
    username=testuser
    password=secret123
    browser=chrome
    timeout=30

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesExample {

    public static void main(String[] args) {
        Properties prop = new Properties();

        try {
            // Load the properties file
            FileInputStream fis = new FileInputStream("config.properties");
            prop.load(fis);

            // Reading individual properties
            String url = prop.getProperty("url");
            String username = prop.getProperty("username");
            String password = prop.getProperty("password");
            String browser = prop.getProperty("browser");
            String timeout = prop.getProperty("timeout");

            // Print the values
            System.out.println("URL       : " + url);
            System.out.println("Username  : " + username);
            System.out.println("Password  : " + password);
            System.out.println("Browser   : " + browser);
            System.out.println("Timeout   : " + timeout);

            // ✅ Iterate over all properties
            System.out.println("\n--- All properties ---");
            for (String key : prop.stringPropertyNames()) {
                System.out.println(key + " = " + prop.getProperty(key));
            }

        } catch (IOException e) {
            System.out.println("Error reading properties file: " + e.getMessage());
        }
    }
}
```

### What type of test cases do you automate? 

```
We automate test cases that are:
    1. Stable (requirements are not changing frequently).
    2. Repeatable (executed often).
    3. Time-consuming or error-prone when done manually.
    4. High business impact (critical flows).
    
Types of test case that I automate.
1. Smoke & Sanity Tests
2. Regression Tests
3. Data-driven / Repetitive Tests
4. Critical Business Workflows (End-to-End)
5. Cross-browser / Cross-platform Scenarios : In UI automation (Selenium/Appium), automating across browsers and devices saves huge manual effort.

What You Usually Avoid Automating
    - Very frequently changing UI features (maintenance overhead).
    - Exploratory / Ad-hoc testing (requires human intuition).
    - One-time or very low frequency scenarios.
    
What type of test cases usually can't be automated  :
    - Captcha / OTP / Third-party Authentication.
```

### If you have 500 test cases, how long would execution take?

```
Factors Affecting Execution Time : 
1. Type of tests: 
- UI tests (Selenium/Appium) → slower (seconds to minutes per test).
- API tests (RestAssured, Postman) → much faster (milliseconds to seconds).

2. Average execution time per test case
Example: 
If UI test takes ~1 min each → 500 tests = ~500 minutes (~8 hours).
If API test takes ~2 seconds each → 500 tests = ~1,000 seconds (~16 minutes).

3.Parallel execution : 
Sequential run (one by one) = very long.
With 5 threads parallel = 1/5th of the time.
Cloud grids (Selenium Grid, BrowserStack, Jenkins pipelines) reduce execution massively.

4. Test environment :
Local machine vs. CI/CD server vs. distributed grid.
Network speed, DB calls, environment stability.

5. Dependencies :
If tests are independent → easier to parallelize.
If tests have dependencies → might force sequential runs.
```
###

```
When we execute the auomation pipeline : 
    On PR: @smoke + unit — immediate (minutes).
    On merge to main: @regression — enforced build (30–60 min).
    Nightly @ 02:00: full E2E + DB migration tests (run overnight).
    Weekly Sunday 03:00: perf/load tests (long-running).
    Before release: run full suite + manual exploratory session.

Jenkins declarative sample snippet : 
 pipeline {
  triggers { cron('H 2 * * *') } // run nightly at ~02:00
  stages {
    stage('Checkout') { ... }
    stage('Full Regression') {
      steps {
        sh './gradlew clean test -Ptags=regression'
      }
    }
  }
}

```
### Jenkins cron expression : 

```
cron('H 2 * * *')  >> 
    Minute: H → Jenkins picks a consistent “hashed” minute (0–59).
    Hour: 2 → Runs in the 2 AM hour.
    Day of Month: * → Every day.
    Month: * → Every month.

Day of Week: * → Every day of the week.
Jenkins uses a 5-field cron syntax (with some Jenkins-specific extensions).

MINUTE HOUR DOM MONTH DOW 

MINUTE (0–59)
HOUR (0–23)
DOM (Day of Month, 1–31)
MONTH (1–12)
DOW (Day of Week, 0–7, where 0 and 7 = Sunday)

| Expression          | Meaning                                                                      |
| ------------------- | ---------------------------------------------------------------------------- |
| `H * * * *`         | Run **every hour**, at a hashed minute (e.g., 17 past every hour).           |
| `H/15 * * * *`      | Run **every 15 minutes**, at a hashed offset per job.                        |
| `0 * * * *`         | Run **at the top of every hour** (00 minutes).                               |
| `H H * * *`         | Run **once per day, at a random stable hour + minute** (spread across jobs). |
| `H 2 * * *`         | Run **daily at around 2 AM**, minute chosen by hash.                         |
| `0 2 * * *`         | Run **exactly at 2:00 AM every day**.                                        |
| `H 2 * * 1-5`       | Run **weekdays at around 2 AM**.                                             |
| `0 9 * * 1`         | Run **every Monday at 9:00 AM**.                                             |
| `0 0 1 * *`         | Run **on the 1st of every month at midnight**.                               |
| `H 12 * * 0`        | Run **every Sunday at around 12 PM (noon)**.                                 |
| `*/5 * * * *`       | Run **every 5 minutes**.                                                     |
| `H/30 9-17 * * 1-5` | Run **every 30 minutes during working hours (9 AM–5 PM, Mon–Fri)**.          |
| `0 22 * * 1-5`      | Run **at 10 PM on weekdays**.                                                |
| `H H(0-7) * * *`    | Run **once between midnight and 7 AM daily** (spread out).                   |
```
### Write code to achieve multiple Inheritance using Interface ? 

```
in Java, you cannot achieve multiple inheritance with classes (to avoid the diamond problem), but you can achieve it using interfaces.
    - A class in Java can implement multiple interfaces.
    - Interfaces can declare methods (abstract by default, or default/static methods in Java 8+).
    - The implementing class provides concrete implementations.

// First interface
interface InterfaceA {
    void methodA();  // abstract method
}

// Second interface
interface InterfaceB {
    void methodB();  // abstract method
}

// Class implementing both interfaces (multiple inheritance)
public class MultipleInheritanceExample implements InterfaceA, InterfaceB {

    @Override
    public void methodA() {
        System.out.println("methodA() from InterfaceA implemented");
    }

    @Override
    public void methodB() {
        System.out.println("methodB() from InterfaceB implemented");
    }

    public static void main(String[] args) {
        MultipleInheritanceExample obj = new MultipleInheritanceExample();
        obj.methodA();
        obj.methodB();
    }
}

Output : 
methodA() from InterfaceA implemented
methodB() from InterfaceB implemented

🔹 Java 8+ (Default Methods Case) :
    If two interfaces define a default method with the same signature, 
    the implementing class must override it to resolve ambiguity.
    [In case of conflicting default methods (Java 8+), we must override them explicitly.]

interface InterfaceA {
    default void show() {
        System.out.println("Default from InterfaceA");
    }
}

interface InterfaceB {
    default void show() {
        System.out.println("Default from InterfaceB");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    @Override
    public void show() {
        // explicitly resolve conflict
        InterfaceA.super.show();
        InterfaceB.super.show();
        System.out.println("Overridden in MyClass");
    }
}

public class Test {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();
    }
}

Output : 
Default from InterfaceA
Default from InterfaceB
Overridden in MyClass
```

### Why String is immutable and use of StringBuffer ?

```
Reasons for immutability: 
1. Security : 
    - Strings are heavily used in security-sensitive operations (e.g., usernames, passwords, file paths, class loading, database URLs).
    - If String were mutable, someone could change "https://bank.com" into "https://hacker.com" while another object is using it.

2. String Pool (Performance & Memory Efficiency) :
    - Java maintains a String Constant Pool (SCP) to reuse String objects.
    String s1 = "Hello";
    String s2 = "Hello";
    - Both s1 and s2 point to the same object in the pool.
    - If String were mutable, changing s1 would also change s2, breaking pooling.
    
3.Thread Safety: 
    - Since Strings cannot be modified, they are naturally thread-safe.
    - Multiple threads can share the same String instance without synchronization.

4. Caching & Hashcode: 
String’s hashCode() is widely used in HashMap, HashSet, etc.
If Strings were mutable, hashcodes would change → leading to broken collections behavior.
Immutability ensures consistent hashing.

Why StringBuffer?
Since String is immutable, every modification (concat, replace, etc.) creates a new object, which is costly for frequent operations.
To solve this, Java provides mutable alternatives:

1. StringBuffer :
    - Mutable sequence of characters.
    - Thread-safe (synchronized).
    - Good when multiple threads may modify the string.

StringBuffer sb = new StringBuffer("Hello");
sb.append(" World");   // modifies existing object
System.out.println(sb); // Output: Hello World

2. StringBuilder (Java 5+) :
    - Same as StringBuffer but not synchronized → faster. 
    - Use in single-threaded environments.

public class TestStrings {
    public static void main(String[] args) {
        // String (immutable)
        String s = "Hello";
        s.concat(" World");
        System.out.println(s); // Output: Hello (unchanged)

        // StringBuffer (mutable)
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb); // Output: Hello World
    }
}


```