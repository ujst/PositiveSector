package Main;

import Data.InputData;

import java.util.Random;


public class MainRealisation {

    public static void main(String[] args) {
//        int count = 0;

        /*int[] array = new int[]{0, -2, -3, -15, 0, -8, 4, 0, -4, 32, 5, 7, 82, 0, 3, 6, -12, 0};
        //int[] array = new int[]{0, -2, -3, -15};

        int[] res = new int[2];


        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;

                for (int j = (i + 1); j < array.length; ) {
                    if (array[j] > 0) {

                        res[1] = j;
                        j++;
                    } else {
                        break;
                    }
                }

                res[0] = i;
            }

            if (res[1] > 0) {
                break;
            }
        }*/
//        0, 2, 3, 15, 6, 8, -4, -5, -4, 32, 5, 7, 82, 0, 3, 6, -12, 0, 2, 3, 15, 6, 8
        InputData db = new InputData();
        int[] array = new int[]{-110};
        System.out.println(" ");
        System.out.println("Это длинна массива: " + db.lookFor(array).length);



    }
}
