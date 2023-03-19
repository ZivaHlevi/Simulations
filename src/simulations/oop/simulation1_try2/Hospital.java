package simulations.oop.simulation1_try2;

import java.util.Arrays;

public class Hospital {
    private static final int SIZE=10;
    private String name;
    private Room[] rooms;

    public Hospital() {
        this.name = "ichilov";
        initRooms(SIZE);
    }
    public void initRooms(int len){
        this.rooms = new Room[len];
        for (int i = 0; i < rooms.length; i++) {
            this.rooms[i]= new Room();
        }
    }

    public String getName() {
        return name;
    }

    public Room[] getRooms() {
        return rooms;
    }

    @Override
    public String toString() {
        return "Hospital " +
                 name.toUpperCase() + '\'' +
                ", rooms=" + Arrays.toString(rooms);
    }
}
