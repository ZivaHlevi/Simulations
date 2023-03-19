package simulations.oop.simulation1_try2;

//public class Statistics {private static int disease0 = 0, disease1 = 0, disease2 = 0, disease3 = 0, disease4 = 0;

//    public static void getPatientStatistics(Hospital hospital) {
//        int sumTimeToCure = 0, sumPeople = 0;
//        for (Room room : hospital.getRooms()) {
//            for (Patient p : room.getPatients()) {
//                sumTimeToCure += p.getDisease().getTimeToCure();
//                sumPeople++;
//            }
//        }
//        System.out.println("The AVG time to cure: " + sumTimeToCure / sumPeople + "\n");
//    }
//
//    public static int getNumOfPeople(Hospital hospital) {
//        int sumPeople = 0;
//        for (Room room : hospital.getRooms()) {
//
//            // Each room have 1 Nurse & 1 Doctor.
//            if (room.getDoc() != null)
//                sumPeople++;
//
//            if (room.getNurse() != null)
//                sumPeople++;
//
//            for (Patient p : room.getPatients()) {
//                sumPeople++;
//            }
//        }
//        return sumPeople;
//    }
//
//    public static void getAVGTimeForEachDisease(Hospital hospital) {
//        for (Room room : hospital.getRooms()) {
//            for (Patient p : room.getPatients()) {
//                switch (p.getDisease().getDiseaseDescription()) {
//                    case TUBERCULOSIS:
//                        disease0++;
//                        break;
//                    case PNEUMONIA:
//                        disease1++;
//                        break;
//                    case COVID19:
//                        disease2++;
//                        break;
//                    case FRACTURE:
//                        disease3++;
//                        break;
//                    case CARDIO:
//                        disease4++;
//                        break;
//                }
//            }
//        }
//        System.out.println("The AVG of each disease is: ");
//        System.out.println("\tDisease: TUBERCULOSIS\n\t\t have " + (disease0 == 0 ? "no" : disease0) + " people sick");
//        System.out.println("\tDisease: PNEUMONIA\n\t\t have " + (disease1 == 0 ? "no" : disease1) + " people sick");
//        System.out.println("\tDisease: COVID19\n\t\t have " + (disease2 == 0 ? "no" : disease2) + " people sick");
//        System.out.println("\tDisease: FRACTURE\n\t\t have " + (disease3 == 0 ? "no" : disease3) + " people sick");
//        System.out.println("\tDisease: CARDIO\n\t\t have " + (disease4 == 0 ? "no" : disease4) + " people sick");
//    }
//
//    public static int getAVGAge(Hospital hospital) {
//        int sumOfAges = 0;
//        for (Room room : hospital.getRooms()) {
//            for (Patient patient : room.getPatients()) {
//                sumOfAges += patient.getAge();
//            }
//        }
//        return sumOfAges / getNumOfPeople(hospital);
//    }
//
//    public static String getTheMostCommon(Hospital hospital) {
//        int max = disease0;
//        DiseaseDescription disease = TUBERCULOSIS;
//
//        if (max < disease1) {
//            max = disease1;
//            disease = PNEUMONIA;
//        }
//        if (max < disease2) {
//            max = disease2;
//            disease = COVID19;
//        }
//        if (max < disease3) {
//            max = disease3;
//            disease = FRACTURE;
//        }
//        if (max < disease4) {
//            max = disease4;
//            disease = CARDIO;
//        }
//        return String.valueOf(disease);
//    }
//
//    public static String getTheLeastCommon(Hospital hospital) {
//        int min = disease0;
//        DiseaseDescription disease = TUBERCULOSIS;
//
//        if (min > disease1) {
//            min = disease1;
//            disease = PNEUMONIA;
//        }
//        if (min > disease2) {
//            min = disease2;
//            disease = COVID19;
//        }
//        if (min > disease3) {
//            min = disease3;
//            disease = FRACTURE;
//        }
//        if (min > disease4) {
//            min = disease4;
//            disease = CARDIO;
//        }
//        return String.valueOf(disease);
//    }
//
//    public static int getAVGAgeOfEmployee(Hospital hospital) {
//        int avg = 0, amountOfEmployees = 0;
//        for (Room room : hospital.getRooms()) {
//            if (room.getDoc() != null) {
//                avg += room.getDoc().getAge();
//                amountOfEmployees++;
//            }
//            if (room.getNurse() != null) {
//                avg += room.getNurse().getAge();
//                amountOfEmployees++;
//            }
//        }
//        return avg / amountOfEmployees;
//    }
//
//
//
//}
