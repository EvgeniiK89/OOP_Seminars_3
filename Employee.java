public abstract class Employee implements Comparable <Employee> {
    protected String name;
    protected String surName;
    protected double salary;

    public int getAge() {
        return age;
    }

    public int age;

    public Employee(String name, String surName, double salary, int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {

        return String.format("%s %s", surName, name);
    }

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if(surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }

    public abstract double calculateSalary();

}
