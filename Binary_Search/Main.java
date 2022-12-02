package Binary_Search;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        int array[] = new int[54000];
        int target = 17800;

        for(int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int index = Arrays.binarySearch(array, target);

        if(index == -1) {
            System.out.println("Element " + target + " was not found");
        }
        else {
            System.out.println("Element " + target + " found at index: " + index);
        }

        int array2[] = new int[250000];
        int target2 = 175000;

        for(int i = 0; i < array2.length; i++) {
            array2[i] = i;
        }

        int index2 = Arrays.binarySearch(array2, target2);

        if(index2 == -1) {
            System.out.println("Element " + target2 + " was not found");
        }
        else {
            System.out.println("Element " + target2 + " found at index: " + index2);
        }
    }
}
