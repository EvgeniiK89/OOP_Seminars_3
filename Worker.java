public class Worker extends Employee {
    public Worker(String name, String surName, int age, double salary) {
        super(name, surName, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; %d лет; Среднемесячная заработная плата " +
                "(фиксированная) %.2f", surName, name, age, salary);
    }
}

