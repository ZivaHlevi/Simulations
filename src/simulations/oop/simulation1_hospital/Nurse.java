package simulations.oop.simulation1_hospital;

public class Nurse extends Person{
    private static int idx=1;
    private  final int  roomNumber;

    public Nurse() {
        roomNumber= idx;
        super.setName("Nurse"+ idx++);
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "roomNumber=" + roomNumber +
                "} " + super.toString();
    }

    public String display() {
        return super.toString()+
                " belong to room number "+
                roomNumber;
    }
}
