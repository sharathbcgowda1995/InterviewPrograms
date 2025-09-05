package com.java.javanotes.concepts.immutable;
import java.util.Date;
import java.util.Objects;
//To create an immutable class in Java, I always follow these rules:
//        1. Declare the class as final, so it can’t be subclassed.
//2. Make all fields private and final.
//        3. Don’t provide setters, only getters.
//        4. Initialize all fields only in the constructor.
//5. For mutable fields (like Date or List), always use defensive copies when setting or returning them.


public final class EmployeeImmutableClass {

    private final String name;
    private final int id;
    private final Date joiningDate;

    public EmployeeImmutableClass(String name, int id, Date joiningDate) {
        this.name = Objects.requireNonNull(name, "Name cannot be null");
        this.id = id;
        // Defensive copy for mutable Date
        this.joiningDate = new Date(Objects.requireNonNull(joiningDate).getTime());
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Date getJoiningDate() {
        // Return a copy to protect internal state
        return new Date(joiningDate.getTime());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", joiningDate=" + joiningDate +
                '}';
    }
}
