package simulations.oop.simulation1_try2;

import java.util.Arrays;

public class HospitalStatistics {

    public static void totalPersons(Hospital hospital) {
        int numberOfPersons = 0;
        for (Room r : hospital.getRooms()) {
            if (r.getNurse() != null) {
                numberOfPersons++;
            }
            if (r.getDoctor() != null) {
                numberOfPersons++;
            }
            for (Patient p : r.getPatients()) {
                if (p != null)
                    numberOfPersons++;
            }

        }
        System.out.println("The numbersof all thr persons in the hospital :" + numberOfPersons);
    }

//        public static int getNumOfPeople(Hospital hospital) {
//            int sumPeople = 0;
//            for (Room room : hospital.getRooms()) {
//
//                // Each room have 1 Nurse & 1 Doctor.
//                if (room.getDoc() != null)
//                    sumPeople++;
//
//                if (room.getNurse() != null)
//                    sumPeople++;
//
//                for (Patient p : room.getPatients()) {
//                    sumPeople++;
//                }
//            }
//            return sumPeople;}

    public static void timeToCure(Hospital hospital) {
        Room[] room = hospital.getRooms();
        int countPatient = 0;
        float totaTime = 0;
        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[i].getPatients().length; j++) {
                countPatient++;
                totaTime += room[i].getPatients()[j].getDisease().getTimeToCure();
            }

        }
        System.out.println("The avg time to cure : " + totaTime / countPatient);
    }

    public static void avgTimeCureForDeisease(Hospital hospital) {
        int d0 = 0;
        int d1 = 0;
        int d2 = 0;
        int d3 = 0;
        int d4 = 0;
        float timeCureD0 = 0;
        float timeCureD1 = 0;
        float timeCureD2 = 0;
        float timeCureD3 = 0;
        float timeCureD4 = 0;

        for (Room room : hospital.getRooms()) {
            for (Patient p : room.getPatients()) {
                switch (p.getDisease().getDiseaseDescription()) {
                    case DISEASE0: {
                        timeCureD0 = +p.getDisease().getTimeToCure();
                        d0++;
                        break;
                    }
                    case DISEASE1: {
                        timeCureD1 = +p.getDisease().getTimeToCure();
                        d1++;
                        break;
                    }
                    case DISEASE2: {
                        timeCureD2 = +p.getDisease().getTimeToCure();
                        d2++;
                        break;
                    }
                    case DISEASE3: {
                        timeCureD3 = +p.getDisease().getTimeToCure();
                        d3++;
                        break;
                    }
                    case DISEASE4: {
                        timeCureD4 = +p.getDisease().getTimeToCure();
                        d4++;
                        break;
                    }

                }

            }
        }
        System.out.println("DISEASE0: num of sicks = " + d0 + "  totalcure=" + timeCureD0);
        System.out.println("DISEASE1: num of sicks = " + d1 + "  totalcure=" + timeCureD1);
        System.out.println("DISEASE2: num of sicks = " + d2 + "  totalcure=" + timeCureD2);
        System.out.println("DISEASE3: num of sicks = " + d3 + "  totalcure=" + timeCureD3);
        System.out.println("DISEASE4: num of sicks = " + d4 + "  totalcure=" + timeCureD4);

    }
}
