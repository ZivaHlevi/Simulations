package simulations.oop.simulation1_hospital;

public abstract class Person {
    private static int count = 1;
    private int id;
    private String name;
    private int age;

    public Person() {
        id = count;
        name = "Person " + count++;
        age = (int) (Math.random() * 103 + 18);
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = ifAge(age);
    }

    private int ifAge(int age) {
        if (age >= 18 && age <= 120) {
            return age;
        }
        System.out.println("not a valid age");
        return 0;
    }

    @Override
    public String toString() {
        return "Id " + id +
                ", name " + name  +
                ", age " + age;
    }
}
