package sorting.app.insertion;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int[] arr = {8, 4, 23, 42, 16, 15};
        int[] arr2 = {20, 18, 12, 8, 5, -2};
        int[] arr3 = {5, 12, 7, 5, 5, 7};
        int[] arr4 = {2, 3, 5, 7, 13, 11};

        System.out.println("Before Sort -> "+Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After Sort -> "+Arrays.toString(arr)+"\n************************************");

        System.out.println("Before Sort -> "+Arrays.toString(arr2));
        insertionSort(arr2);
        System.out.println("After Sort -> "+Arrays.toString(arr2)+"\n************************************");

        System.out.println("Before Sort -> "+Arrays.toString(arr3));
        insertionSort(arr3);
        System.out.println("After Sort -> "+Arrays.toString(arr3)+"\n************************************");

        System.out.println("Before Sort -> "+Arrays.toString(arr4));
        insertionSort(arr4);
        System.out.println("After Sort -> "+Arrays.toString(arr4));

    }

    public static void insertionSort(int[] arr) {

        int j,temp;

        for (int i = 1; i < arr.length; ++i) {
            j = i - 1;
            temp = arr[i];

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }
}
