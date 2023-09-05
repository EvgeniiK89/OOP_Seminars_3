public class Freelancer extends Employee{


    static int daysWork;
    static int hoursWork;
    public Freelancer(String name, String surName, int age, double salary) {
        super(name, surName, salary, age);
    }

    {
        daysWork = 22;
        hoursWork = 8;
    }

    @Override
    public double calculateSalary() {
        return salary * daysWork * hoursWork;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; %d лет; Заработная плата по результатам" +
                " месяца: %.2f", surName, name, age, salary);
    }

}
