import java.util.Objects;

public class Employee {
    private String fullName;
    private int departmentNumber;
    private double salary;
    private Integer id;
    private static int counter = 1;


    public Employee(Integer id, String fullName, int departmentNumber, double salary) {
        this.fullName = fullName;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
        this.id = counter;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departmentNumber == employee.departmentNumber && Double.compare(salary, employee.salary) == 0 && Objects.equals(fullName, employee.fullName) && Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, departmentNumber, salary, id);
    }

    @Override
    public String toString() {
        return id + " " + fullName + " " + departmentNumber + " " + salary;
    }
}
