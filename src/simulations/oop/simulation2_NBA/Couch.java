package simulations.oop.simulation2_NBA;


import simulations.oop.Person;
public class Couch extends Person {
    private static int count=1;
    public Couch() {
        super.setName("Couch"+count++);
    }
}

