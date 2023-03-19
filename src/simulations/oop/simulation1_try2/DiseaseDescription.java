package simulations.oop.simulation1_try2;

public  enum DiseaseDescription {
    DISEASE0,
    DISEASE1,
    DISEASE2,
    DISEASE3,
    DISEASE4;

    public static DiseaseDescription randomDisease(){
        return DiseaseDescription.values()[(int) (Math.random()*DiseaseDescription.values().length)];
    }

}
