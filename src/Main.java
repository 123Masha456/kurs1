public class Main {
    static Employee[] Person = new Employee[10];

    public static void main(String[] args) {
        Employee iii = new Employee("Иванов Иван Иванович", 1, 30000);
        Employee ppp = new Employee("Петров Петр Петрович", 2, 40000);
        Employee sss = new Employee("Семёнов Семён Семёнович", 3, 50000);
        Employee mmm = new Employee("Михайлов Михайл Михайлович", 4, 60000);
        Employee vvv = new Employee("Викторов Виктор Викторович", 5, 70000);
        Employee abc = new Employee("Аверин Борис Семёнович", 1, 32000);
        Employee sdf = new Employee("Сидорова Дарья Фёдоровна", 2, 42000);
        Employee kld = new Employee("Калинина Людмила Дмитриевна", 3, 52000);
        Employee vni = new Employee("Викторова Надежда Ивановна", 4, 62000);
        Employee gko = new Employee("Григорьева Кристина Олеговна", 5, 72000);

        Person[0] = iii;
        Person[1] = ppp;
        Person[2] = sss;
        Person[3] = mmm;
        Person[4] = vvv;
        Person[5] = abc;
        Person[6] = sdf;
        Person[7] = kld;
        Person[8] = vni;
        Person[9] = gko;
        totalSalary();
        personInformation();
        personMinMoney();
        personMaxMoney();
        bil3();
    }

    public static void personInformation() {
        for (int i = 0; i < Person.length; i++) {
            System.out.println(Person[i].toString());
        }
    }

    public static void totalSalary() {
        float totalSalary = 0f;
        float middleMoneyMounth = 0f;
        int totalPersons = 10;
        for (int i = 0; i < Person.length; i++) {
            totalSalary += Person[i].getSalary();
            middleMoneyMounth = totalSalary / totalPersons;
            if (i == Person.length - 1) {
                System.out.println("За месяц на все отделы тратятся " + totalSalary + " рублей");
                System.out.println("Среднее значение зарплат " + middleMoneyMounth + " рублей");
            }
        }
    }

    public static void personMinMoney() {
        Employee min = Person[0];
        for (int i = 0; i < Person.length; i++) {
            if (Person[i].getSalary() < min.getSalary()) {
                min = Person[i];
            }
        }
        System.out.println(min.getFullName() + " с минимальной зарплатой " + min.getSalary());
    }

    public static void personMaxMoney() {
        Employee max = Person[0];
        for (int i = 0; i < Person.length; i++) {
            if (Person[i].getSalary() > max.getSalary()) {
                max = Person[i];
            }
        }
        System.out.println(max.getFullName() + " с минимальной зарплатой " + max.getSalary());
    }

    public static void bil3() {
        System.out.println("Программа, которая разделяет любую строку на две части ровно пополам по количеству символов.");
        String s = "qwerty";
        int sLength = s.length();
        System.out.println("Длина сроки равняется " + sLength + " символам");
        int a = sLength / 2;
        System.out.println("Половиной строки будут " + a + " символа");

        for (int i = 0; i < s.length(); i++) {
            if (i < a) {
                String s1 = s.substring(i, i + 1);
                System.out.println("Первая половина строки " + s1);
            } else {
                String s2 = s.substring(i, i + 1);
                System.out.println("Вторая половина строки " + s2);
            }
        }
    }
}








