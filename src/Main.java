public class Main {

    public static void main(String[] args) {
        Employee emp = new FullTimeEmployee("John", 3000, 500);

        System.out.println("Employee: " + emp.getName());
        System.out.println("Salary: " + emp.calculateSalary());
    }
}