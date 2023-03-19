package simulations.oop.simulation1_hospital;

import java.util.Arrays;

public class Hospital {
    private static final int SIZE=5;
    private String name= "TEL-HASHOMER";
    private Room[] rooms;

    public Hospital() {
        this.rooms= initRooms(SIZE);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
    public Room[] initRooms(int size){
        Room[]rooms1= new Room[size];
        for (int i = 0; i < size; i++) {
            rooms1[i]= new Room();
        }
        return rooms1;
    }

    @Override
    public String toString() {
        return "Hospital " +
                 name.toUpperCase() + '\'' +". Number of rooms: "+ SIZE+"\n"+
                 Arrays.toString(rooms) +
                '}';
    }
}
