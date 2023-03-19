package simulations.oop.simulation1_hospital;

public class Doctors extends  Person{
    private static int idx=1;
  private DiseaseDescription diseaseSpeciality;
  private  final int  roomNumber;

    public Doctors() {
        diseaseSpeciality= DiseaseDescription.valueOf(DiseaseDescription.values()[(int)(Math.random()*(DiseaseDescription.values().length))].name());
        roomNumber= idx;
        super.setName("Doctor"+idx++);
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "diseaseSpeciality=" + diseaseSpeciality +
                ", roomNumber=" + roomNumber +
                "} " + super.toString();
    }

    public String display() {
        return super.toString()+
                " specialist to cure "+ this.diseaseSpeciality+
                " and belong to room number "+ this.roomNumber;
    }
}
