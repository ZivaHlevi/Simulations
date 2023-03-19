package simulations.oop.simulation2_NBA;

import java.util.Arrays;
import java.util.Random;

public class Team {
    private static final int SIZE = 5;
    private static int count = 1;
    private String name;
    private Player[] players;
    private int totalScore;
    private Couch couch;

    public Team() {
        this.name = "Team " + count++;
        this.players = new Player[SIZE];
        for (int i = 0; i < players.length; i++) {
            this.players[i] = new Player();
        }
        updateTeamScore();
        this.couch = new Couch();
    }

    public void Play() {
        int turn = 1;
        while (turn <= 5) {
            boolean twoOrThree = new Random().nextBoolean();
            int idx = (int) (Math.random() * SIZE);
            if (twoOrThree) {
                this.players[idx].throwBallTwo();
            } else {
                this.players[idx].throwBallThree();
            }
            turn++;
        }
        updateTeamScore();
    }

    public void teamMPV() {
        Player valuablePlayer = null;
        int maxScore = 0;
        for (Player player : this.players) {
            if (player.getTotalScore() > maxScore) {
                maxScore = player.getTotalScore();
                valuablePlayer = player;
            }
        }

        System.out.println("the valuable player is " + valuablePlayer.getName());
        System.out.println("Max shoot points is: " + maxScore);
    }

    public void updateTeamScore() {
        for (Player player : this.players) {
            this.totalScore += player.getTotalScore();
        }

    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", players=" + Arrays.toString(players) +
                ", totalScore=" + totalScore +
                ", couch=" + couch +
                '}';
    }
}
