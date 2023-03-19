package tirgul_home.enum1;

public class Person {
    private DiseaseDescription1 description1 ;
    private String name ;

    public Person(DiseaseDescription1 description1, String name) {
        this.description1 = description1;
        this.name = name;
    }

    public DiseaseDescription1 getDescription1() {
        return description1;
    }

    public void setDescription1(DiseaseDescription1 description1) {
        this.description1 = description1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "description1=" + description1 +
                ", name='" + name + '\'' +
                '}';
    }
}
