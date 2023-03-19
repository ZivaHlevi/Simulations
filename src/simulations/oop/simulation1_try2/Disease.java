package simulations.oop.simulation1_try2;

public class Disease {
    private DiseaseDescription diseaseDescription;
    private int timeToCure;

    public Disease() {
        this.diseaseDescription = DiseaseDescription.randomDisease();
        this.timeToCure = MethodFactory.randomTimeToCare();
    }

    public DiseaseDescription getDiseaseDescription() {
        return diseaseDescription;
    }

    public void setDiseaseDescription(DiseaseDescription diseaseDescription) {
        this.diseaseDescription = diseaseDescription;
    }

    public int getTimeToCure() {
        return timeToCure;
    }

    public void setTimeToCure(int timeToCure) {
        this.timeToCure = timeToCure;
    }

    @Override
    public String toString() {
        return "Disease Description: " +
                diseaseDescription +
                ", timeToCure: " + timeToCure +
                " days";
    }
}
