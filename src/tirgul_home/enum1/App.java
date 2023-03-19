package tirgul_home.enum1;

public class App {
    public static void main(String[] args) {
        Person p1= new Person(DiseaseDescription1.CARDIO, "or");
        System.out.println(p1.getDescription1());
        System.out.println(p1.getDescription1().ordinal());
        p1.getDescription1().setDisease();
        System.out.println(p1);
    }
}
