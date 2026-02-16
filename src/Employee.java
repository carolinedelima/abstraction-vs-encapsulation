abstract class Employee {

    // Encapsulated fields (private = hidden)
    private final String name;
    private final double baseSalary;

    // Constructor
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation: controlled access with getters
    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Abstraction: force subclasses to implement this
    public abstract double calculateSalary();
}
