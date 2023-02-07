//package simulation1;
//
//public class App2 {
//    public static void main(String[] args) {
//
//
//        int[][] magicArray = {{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31},
//                {2, 3, 6, 7, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30, 31},
//                {4, 5, 6, 7, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29, 30, 31},
//                {8, 9, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30, 31},
//                {16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31}};
//        int[][] arr = new int[1][8];
//
////        for (int i = 0; i < arr.length; i++) {
////            for (int j = 0; j < arr[i].length; j++) {
////                arr[i][j] = (int) Math.pow(2, i);
////                System.out.printf("%3d", arr[i][j]);
////            }
////            System.out.println();
////        }
////        double i = 0;
////        double j = 0;
//        arr[0][0]= (int) Math.pow(2,0);// place 0
//        arr[0][4]= (int) (Math.pow(2,0)+Math.pow(2,3));// place 4
//        arr[0][8]= (int) (Math.pow(2,0)+Math.pow(2,4));//place 8
//
//        arr[0][1]= (int) (Math.pow(2,0)+Math.pow(2,1));//place 1
//        arr[0][5] = (int) (Math.pow(2, 0) + Math.pow(2, 3) + Math.pow(2, 1));//place5
//        arr[0][9]= (int) (Math.pow(2,0)+Math.pow(2,4)+Math.pow(2,1));//place 9
//      //  arr[0][13]= (int) (Math.pow(2,0)+Math.pow(2,4)+Math.pow(2,3)+Math.pow(2,2));//place 13
//
//        arr[0][2]= (int) (Math.pow(2,0)+Math.pow(2,2));// place 2
//        arr[0][3]= (int) (Math.pow(2,0)+Math.pow(2,2)+Math.pow(2,1));// place 3
//
//
//        arr[0][6]= (int) (Math.pow(2,0)+Math.pow(2,3)+Math.pow(2,2));//place 6
//        arr[0][7]= (int) (Math.pow(2,0)+Math.pow(2,3)+Math.pow(2,2)+Math.pow(2,1));//place 7
//
//
//        arr[0][10]= (int) (Math.pow(2,0)+Math.pow(2,4)+Math.pow(2,2));//place 10
//        arr[0][11]= (int) (Math.pow(2,0)+Math.pow(2,4)+Math.pow(2,3));//place 11
//        arr[0][12]= (int) (Math.pow(2,0)+Math.pow(2,4)+Math.pow(2,3)+Math.pow(2,1));//place 12
//
//        arr[0][14]= (int) (Math.pow(2,0)+Math.pow(2,4)+Math.pow(2,3)+Math.pow(2,2));//place 14
//        arr[0][15]= (int) (Math.pow(2,0)+Math.pow(2,4)+Math.pow(2,3)+Math.pow(2,2)+Math.pow(2,1));//place 15
//
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                int a = j%4;
//                if (a==0)
//                {arr[i][j]= (int) Math.pow(2,i);
//                }
//                if (a==1)
//                {arr[i][j]= (int) Math.pow(2,i)+ (int) Math.pow(2,a);
//                }
//                if(a==2){
//                    arr[i][j]= (int) Math.pow(2,i)+ (int) Math.pow(2,a)+(int) Math.pow(2,(a-1));
//                }
//                if(a==3){
//                    arr[i][j]= (int) Math.pow(2,i)+ (int) Math.pow(2,a)+;
//                }
//
//            }
//
//        }
//
//
//
//
//    }
//    /*
//
//     */
//}