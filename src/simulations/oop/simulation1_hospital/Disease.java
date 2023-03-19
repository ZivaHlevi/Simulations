package simulations.oop.simulation1_hospital;

public class Disease {

    private String description;
    private  int timeToCare;

    public Disease() {
        this.description= DiseaseDescription.values()[(int)(Math.random()*(DiseaseDescription.values()).length)].name();
        this.timeToCare = (int)(Math.random()*19+3);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTimeToCare() {
        return timeToCare;
    }

    public void setTimeToCare(int timeToCare) {
        this.timeToCare = timeToCare;
    }

    @Override
    public String toString() {
        return  "Disease description: '" + description + '\'' +
                ", timeToCare: " + timeToCare +
                " days"+
                '}'+'\n';
    }
}
