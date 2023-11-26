package integer;

import java.util.Arrays;

public class Sort {

    public static void sort(int[] array){
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array){
        int length = array.length;

        // int[] array = {5, 2, 3, 4, 1};
        for(int i = 1; i < length;i++){
            int temp = array[i];
            int j = i - 1;

            // create right place by moving elements
            while(j>=0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;

            // i = 1,j = 0 -> 5 > 2  ->  array[1] = 5 -> j=-1 -> array[0] = 2 -> 2,5,3,4,1
            // i = 2,j = 1 -> 5 > 3  ->  array[2] = 5 -> j= 0 ->                 2, ,5,4,1
                   //j = 0 -> 2 > 3  ->                       -> array[1] = 3 -> 2,3,5,4,1
            // i = 3;j = 2 -> 5 > 4  ->  array[3] = 5 -> j= 1 ->                 2,3, ,5,1
                  // j = 1 -> 3 > 4  ->                       -> array[2] = 4 -> 2,3,4,5,1
            // i = 4;j = 3 -> 5 > 1  ->  array[4] = 5 -> j= 2 ->              -> 2,3,4, ,5
                  // j = 2 -> 4 > 1  ->  array[3] = 4 -> j= 1 ->              -> 2,3, ,4,5
                  // j = 1 -> 3 > 1  ->  array[2] = 3 -> j= 0 ->              -> 2, ,3,4,5
                  // j = 0 -> 2 > 1  ->  array[1] = 2 -> j=-1 ->              -> 1,2,3,4,5
        }

        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array){
        for(int i = 0;i < array.length - 1; i++){
            for(int j = 0; j < array.length -i - 1; j++){
                if(array[j] > array[j +1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
