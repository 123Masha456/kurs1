public class Employee {
    private String name;
    private String lastName;
    private String patronymic;


    private int department;
    private float salary;
    private static int counter;
    private int id;

    public Employee(String lastName, String name, String patronymic, int department, float salary) {

        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String name() {
        return this.name;
    }
    public String lastName(){
        return this.lastName;
    }
    public String patronymic(){
        return this.patronymic;
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


   public String toStringFio(){
     return "Сотрудник " + lastName + " " + name + " " + patronymic;
   }


   @Override
    public String toString() {
        return "Сотрудник " + lastName + name + patronymic + " отдел " + department +
                " зарплата " + salary + " " + "id" + " " + id;
    }
}
