package simulations.oop.simulation1_hospital;

import java.util.Arrays;

public class Room {
    private static int idx = 1;
    private final int roomNumber = idx++;
    private Doctors doctor;
    private Nurse nurse;
    private Patient[] patients;

    public Room() {
        doctor = new Doctors();
        nurse = new Nurse();
        patients = setPatients(5);
    }

    public int getRoomNumber() {
        return roomNumber;
    }


    public Doctors getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctors doctor) {
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

    public Patient[] setPatients(int size) {
        Patient[] patients = new Patient[size];
        for (int i = 0; i < size; i++) {
            patients[i] = new Patient();
        }
        return patients;
    }

    @Override
    public String toString() {
        return ("Room number " + this.roomNumber).toUpperCase() + ':' + '\n' +
                doctor.display() + '\n' +
                nurse.display() + '\n' + "The patients are:\n".toUpperCase() +
                Arrays.toString(patients) + '\n';
    }

//        return
//                Arrays.toString(patients);

    }

