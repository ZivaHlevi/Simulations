package simulations.oop.simulation1_try2;

public class Patient extends Person {
    private Disease disease;


    public Patient() {
        super();
        super.setName("Patient ");
        this.disease = new Disease();
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return super.toString()+ " has " +
                "disease=" + disease;
    }
}
