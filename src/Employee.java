public class Employee {
    private String fullName;
    private int department;
    private float salary;
    private static int counter = 1;
    private final int id;

    public Employee(String fullName, int department, float salary) {

        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public float getSalary() {
        return this.salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник " + fullName + " отдел " + department +
                " зарплата " + salary;
    }
}
