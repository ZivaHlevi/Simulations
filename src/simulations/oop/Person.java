package simulations.oop;

public abstract class Person {
    private static int count = 1;
    private final int id;
    private String name;
    private int age;
    private float height;

    public Person() {
        this.id = count;
        this.name = "name" + count++;
        this.age = (int) (Math.random() * 18 + 18);
        this.height = (float) (Math.random() * 0.56 + 1.65);
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
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("Id:%d,Name:%s,Age:%d,Height:%.1f", this.id, this.name, this.age, this.height);

    }
}
