package simulations.oop.simulation2_NBA;

import simulations.oop.Person;

public class AppRun {
    public static void main(String[] args) {
//        Person p1 = new Person();
//        System.out.println(p1);
//        p1.setName("Moshe Zaerd");
//        System.out.println(p1);
//        Couch c1= new Couch();
//        System.out.println(c1);
//        Player p1 = new Player();
//        System.out.println(p1);
        Team team = new Team();
        System.out.println(team);
        team.Play();
        System.out.println(team);
       team.teamMPV();

    }
}
