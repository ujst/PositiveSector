package Data;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeMap;

import static java.lang.System.out;

public class InputData {
    /*InputData info = new InputData();

    Scanner typeIn = new Scanner(System.in);

    String typedInfo = typeIn.nextLine();

    TreeMap<String, String> base = new TreeMap<String, String>();

    LinkedHashSet<String> email = new LinkedHashSet<String>(5);*/

    public int[] lookFor(int[] array) {
//        array = new int[]{0, 1, 2, 3, 0, -8, 4, 0, -4, 32, 5, 7, 82, 0, 3, 6, -12, 0};
        //int[] array = new int[]{0, -2, -3, -15};

        int[] res = new int[2];

        int j = 0;
        int saveLength = 0;
        int begin = 0;
        int end = 0;
        int resLength;

        int temp = 0;

        int negCounter = 1;


        //  0  1  2  3   4  5   6   7   8  9  10 11  12 13 14 15   16  17 18 19 20  21 22
        // {0, 2, 3, 15, 6, 8, -4, -5, -4, 32, 5, 7, 82, 0, 3, 6, -12, 0, 2, 3, 15, 6, 8}

        for (int i = 0; i < array.length; i++) {

            if (array[i] > 0) {

                for (resLength = 1, j = i ; j < array.length; ) {
                    System.out.println(j);
                    if (array[j] > 0) {
                        temp = resLength++;
                        j++;
                    } else {
                        break;
                    }
                }
            } else {
                negCounter++;
            }

            if (temp >= saveLength) {   // На третей лабораторной знак ">" поменять на ">=".
                saveLength = temp;
                temp = 0;
                begin = i;
                end = j - 1;

            }

            System.out.println(" Промежуточный результат: " + "saveLength" + " = " + saveLength);
            System.out.println(" Промежуточный результат: " + "temp" + " = " + temp);
            System.out.println(" Промежуточный результат: " + "begin" + " = " + begin + " и i" + " = " + i);
            System.out.println(" Промежуточный результат: " + "end" + " = " + end + " и j" + " = " + j);
            System.out.println(" ");

        }

        if (negCounter == array.length) {
            int[] mass = new int[0];
            return mass;
        } else {
            res[0] = begin;
            res[1] = end;
        }



        for (int f = 0; f < res.length; f++) {
            System.out.println("Это массив");
            System.out.println(res[f] + " ");
        }

        return res;
    }

}
