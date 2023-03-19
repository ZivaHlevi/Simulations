package simulations.oop.simulation1_try2;

public class App {
    public static void main(String[] args) {
//        Disease d = new Disease();
//        System.out.println(d);
//        Patient p = new Patient();
//        Nurse n = new Nurse();
//        Doctor doc = new Doctor();
//
////        Person p1 = new Person();
////        Person p2 = new Person();
//        System.out.println(p);
//        System.out.println(n);
//        System.out.println(doc);

//        Room r1=new Room();
////        System.out.println(r1);
//        System.out.println(p1);
//        System.out.println(p2);
      Hospital hospital= new Hospital();
        //System.out.println(hospital);
       // HospitalStatistics.TotalPersoiption1(2);ns(hospital);
        HospitalStatistics.totalPersons(hospital);
        HospitalStatistics.timeToCure(hospital);
        HospitalStatistics.avgTimeCureForDeisease(hospital);


    }
}
