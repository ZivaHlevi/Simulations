package simulations.APIs.simulation_bank_system_try2;

public abstract class Person {
    private static int count=1;
    private final int  id;
    private String name;
    private double age;

    public Person() {
        this.id = count;
        this.age = (Math.random()*104)+16;
    }

    public Person(int id, String name, double age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name+count++;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Id: %d , name: %s , age: %.1f" ,id,name,age);

    }
}
