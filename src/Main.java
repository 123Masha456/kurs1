public class Main {
    private static Employee[] person = new Employee[10];

    public static void main(String[] args) {
        Employee iii = new Employee("Иванов", "Иван", "Иванович", 1, 30000);
        Employee ppp = new Employee("Петров", "Петр", "Петрович", 2, 40000);
        Employee sss = new Employee("Семёнов", "Семён", "Семёнович", 3, 50000);
        Employee mmm = new Employee("Михайлов", "Михаил", "Михайлович", 4, 60000);
        Employee vvv = new Employee("Викторов", "Виктор", "Викторович", 5, 70000);
        Employee abc = new Employee("Аверин", "Борис", "Семёнович", 1, 32000);
        Employee sdf = new Employee("Сидорова", "Дарья", "Фёдоровна", 2, 42000);
        Employee kld = new Employee("Калинина", "Людмила", "Дмитриевна", 3, 52000);
        Employee vni = new Employee("Викторова", "Надежда", "Ивановна", 4, 62000);
        Employee gko = new Employee("Григорьева", "Кристина", "Олеговна", 5, 72000);

        person[0] = iii;
        person[1] = ppp;
        person[2] = sss;
        person[3] = mmm;
        person[4] = vvv;
        person[5] = abc;
        person[6] = sdf;
        person[7] = kld;
        person[8] = vni;
        person[9] = gko;
        printPersonInformation();
        printTotalSalary();
        printMiddleSalary();
        printPersonMinMoney();
        printPersonMaxMoney();
    }

    public static void printPersonInformation() {
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    public static float printTotalSalary() {
        float totalSalary = 0f;
        for (int i = 0; i < person.length; i++) {
            totalSalary += person[i].getSalary();
            if (i == person.length - 1) {
            }
        }
        return totalSalary;
    }


    public static float printMiddleSalary() {
        return printTotalSalary() / person.length;
    }


    public static void printPersonMinMoney() {
        Employee min = person[0];
        for (int i = 0; i < person.length; i++) {
            if (person[i].getSalary() < min.getSalary()) {
                min = person[i];
            }
        }
        System.out.println(min.toStringFio() + " с минимальной зарплатой " + min.getSalary());
    }

    public static void printPersonMaxMoney() {
        Employee max = person[0];
        for (int i = 0; i < person.length; i++) {
            if (person[i].getSalary() > max.getSalary()) {
                max = person[i];
            }
        }
        System.out.println(max.toStringFio() + " с максимальной зарплатой " + max.getSalary());
    }
}








