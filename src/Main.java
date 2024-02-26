public class Main {
    private Employee[] employees;


    public static void main(String[] args) {
        Employee ivanov = new Employee(Employee.counter,"Ivanov Ivan Ivanovich", 5, 165000);
        Employee girich = new Employee(Employee.counter,"Girich Daniil Denisovich", 3, 115000);
        Employee nicolaev = new Employee(Employee.counter,"Nicolaev Nicolay Nicolaivich", 2, 125000);
        Employee shtopin = new Employee(Employee.counter,"Shtopin Denis Alexsandrovich", 1, 185000);
        Employee smirnov = new Employee(Employee.counter,"Smirnov Maks Olegovich", 4, 145000);
        checkDepartmentNumber(ivanov.getDepartmentNumber());
        Employee[] employee = new Employee[10];
            employee[0] = ivanov;
            employee[1] = girich;
            employee[2] = nicolaev;
            employee[3] = shtopin;
            employee[4] = smirnov;
        printEmployee(employee);
        calculateTheAmountOfSalaryCosts(employee);
        System.out.println("Общая сумма трат на зп в месяц: " + calculateTheAmountOfSalaryCosts(employee));
        findTheMaximumSalary(employee);
        System.out.println("Максимальная зп: " + findTheMaximumSalary(employee));
        printEmployeeWithMaximumSalary(employee,findTheMaximumSalary(employee));
        findTheMinimumSalary(employee);
        System.out.println("Минимальная зп: " + findTheMinimumSalary(employee));
        printEmployeeWithMinimumSalary(employee,findTheMinimumSalary(employee));
        calculateAverageSalary(calculateTheAmountOfSalaryCosts(employee));
        System.out.println("Средняя заработная плата: " + calculateAverageSalary(calculateTheAmountOfSalaryCosts(employee)));
        printFIO(employee);



    }
    public static void checkDepartmentNumber(int departmentNumber){
        if (departmentNumber < 1 || departmentNumber > 5){
           System.out.println("Введите существующий номер отдела.");
        }
    }
    public static void printEmployee(Employee employee []){
        for(Employee allData : employee){
            System.out.println(allData);
        }
    }
    public static double calculateTheAmountOfSalaryCosts(Employee employee []){
        double sum = 0;
        for (int i = 0; i < employee.length; i ++){
            if (employee[i] != null) {
                sum = sum + employee[i].getSalary();
            }
        }
        return sum;
    }
    public static double findTheMaximumSalary(Employee employee []){
        double maxMoney = -1;
        for (int i = 0; i < employee.length; i ++){
            if (employee[i] != null && employee[i].getSalary() > maxMoney) {
                maxMoney = employee[i].getSalary();
            }
        }
        return maxMoney;
    }
    public static void printEmployeeWithMaximumSalary(Employee employee [],double maxMoney){
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] != null && employee[i].getSalary() == maxMoney){
                System.out.println("Сотрудник с максимальной заработной платой: " + employee[i]);
            }
        }
    }
    public static double findTheMinimumSalary(Employee employee []){
        double minMoney = 1000000;
        for (int i = 0; i < employee.length; i ++){
            if (employee[i] != null && employee[i].getSalary() < minMoney) {
                minMoney = employee[i].getSalary();
            }
        }
        return minMoney;
    }
    public static void printEmployeeWithMinimumSalary(Employee employee [],double minMoney){
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] != null && employee[i].getSalary() == minMoney){
                System.out.println("Сотрудник с минимальной заработной платой: " + employee[i]);
            }
        }
    }
    public static double calculateAverageSalary(double sum){
        double averageSalary = sum / 5;
        return averageSalary;
    }
    public static void printFIO(Employee employee []){
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i].getFullName());
            }
        }
    }




}