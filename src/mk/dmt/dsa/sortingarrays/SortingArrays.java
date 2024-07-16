package mk.dmt.dsa.sortingarrays;

import java.util.Arrays;

public class SortingArrays {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22 };

        Arrays.parallelSort(array);
        Arrays.sort(array);
        for(int num:array) {
            System.out.println("" + num);
        }
    }
}
