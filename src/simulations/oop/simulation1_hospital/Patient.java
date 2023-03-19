package simulations.oop.simulation1_hospital;

public class Patient extends Person {
    private static int idx=1;
    private Disease disease;

    public Patient() {
        disease = new Disease();
        super.setName("Patient"+idx++);
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }
    @Override
    public String toString() {
        return  super.toString()+
                " has "+ this.disease.getDescription()+
                " and will cured in approximately in "+
                this.disease.getTimeToCare()+ " days."+'\n';
    }

    public String display() {
        return "Patient{" +
                "disease=" + disease +
                "} " + super.toString();
    }
}
