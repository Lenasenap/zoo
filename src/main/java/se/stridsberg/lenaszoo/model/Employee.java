package se.stridsberg.lenaszoo.model;

public class Employee extends Person {
    private String role;

    public Employee(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
