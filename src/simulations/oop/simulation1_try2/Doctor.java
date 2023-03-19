package simulations.oop.simulation1_try2;

public class Doctor extends Person{
    private DiseaseDescription diseaseDescription;
    private int roomNumber;

    public Doctor() {
        super();
        super.setName("Doctor ");
        this.diseaseDescription = DiseaseDescription.randomDisease();
        this.roomNumber = MethodFactory.randomNumber(1,10);
    }

    public DiseaseDescription getDiseaseDescription() {
        return diseaseDescription;
    }

    public void setDiseaseDescription(DiseaseDescription diseaseDescription) {
        this.diseaseDescription = diseaseDescription;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return super.toString()+ " ,specialist to cure " +
                 diseaseDescription +
                ", and belong to room number " + roomNumber ;
    }
}
