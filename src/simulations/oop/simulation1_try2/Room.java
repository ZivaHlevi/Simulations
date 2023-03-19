package simulations.oop.simulation1_try2;

import java.util.Arrays;

public class Room {
    private static final int SIZE = 5;
    private static int numOfRoom = 1;
    private int roomNumber;
    private Doctor doctor;
    private Nurse nurse;
    private Patient[] patients;

    public Room() {
        super();
        setRoomNumber();
        this.doctor = new Doctor();
        doctor.setRoomNumber(this.roomNumber);
        this.nurse = new Nurse();
        nurse.setRoomNumber(this.roomNumber);
        initPatients(SIZE);
    }

    public static int getNumOfRoom() {
        return numOfRoom;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber() {
        this.roomNumber = numOfRoom++;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Patient[] getPatients() {
        return patients;
    }

    public void setPatients(Patient[] patients) {
        this.patients = patients;
    }

    private void initPatients(int len) {
        this.patients= new Patient[len];
        for (int i = 0; i < patients.length; i++) {
            patients[i]= new Patient();
        }
    }

    @Override
    public String toString() {
        return "\nRoom Number=".toUpperCase() + roomNumber +'\n'+
                 doctor +'\n'+
                 nurse + '\n'+
                "Patients: \n" + Arrays.toString(patients);
    }
}
