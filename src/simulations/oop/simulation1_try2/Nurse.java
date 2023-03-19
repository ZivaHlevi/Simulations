package simulations.oop.simulation1_try2;

public class Nurse extends Person {
    private  int roomNumber;

    public Nurse() {
        super();
        super.setName("Nurse ");
        this.roomNumber = MethodFactory.randomNumber(1, 10);
    }

    public static int getCount() {
        return count;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return super.toString() + " belong to room number " + roomNumber;
    }
}
