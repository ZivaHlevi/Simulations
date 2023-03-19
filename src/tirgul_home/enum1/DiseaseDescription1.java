package tirgul_home.enum1;

    public enum DiseaseDescription1 {
        TUBERCULOSIS(0),
        PNEUMONIA(1),
        COVID19(2),
        FRACTURE(3),
        CARDIO(4);

        private int disease;

        DiseaseDescription1(int i) {
            this.disease = i;
        }

        public int getDisease() {
            return disease;
        }

        public DiseaseDescription1 setDisease() {
            switch (this.disease) {
                case 0:
                    return TUBERCULOSIS;

                case 1:
                    return PNEUMONIA;

                case 2:
                    return COVID19;

                case 3:
                    return FRACTURE;

                case 4:
                    return CARDIO;

                default:
                    throw new IllegalStateException("Unexpected value: " + this.disease);
            }
        }
    }

