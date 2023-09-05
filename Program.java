import java.util.Arrays;
import java.util.Random;


public class Program {

    static Random random = new Random();

    static Employee generateEmployee(){
        
        final int heirsCount = 2;
        int heir = random.nextInt(heirsCount);

        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", 
                "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", 
                "Горбунов", "Лыткин", "Соколов" };

        int salary;

        switch (heir){
            case 0:
                salary = random.nextInt(50000, 80000);
                return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)],
                        random.nextInt(18, 65), salary);
            case 1:
                salary = random.nextInt(1000, 1500) * Freelancer.hoursWork * Freelancer.daysWork;
                return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)],
                        random.nextInt(18, 65), salary);
        }
        return null;
    }

    static void printEmployees(Employee[] employees){
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[12];

        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }
        
        Arrays.sort(employees, new AgeComparator());
        printEmployees(employees);
        
    }
}
