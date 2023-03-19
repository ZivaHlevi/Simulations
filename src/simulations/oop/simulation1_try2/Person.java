package simulations.oop.simulation1_try2;

public abstract class  Person {
    public static  int count=1;
    private  final int  id;
    private String name;
    private int age;

    public Person() {
        this.id = count;
//        setName("Person ");
        this.age = MethodFactory.randomNumber(18,120);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name+ count++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  "Id: " + id +
                ", name " + name +
                ", age:" + age;
    }
}
