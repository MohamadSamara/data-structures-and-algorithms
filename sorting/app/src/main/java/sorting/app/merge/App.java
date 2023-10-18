package sorting.app.merge;

import java.util.Arrays;
public class App {

    public static void main(String[] args) {

        int[] arr = {8,4,23,42,16,15};
        int[] arr2 = {20,18,12,8,5,-2};
        int[] arr3 = {5,12,7,5,5,7};
        int[] arr4 = {2,3,5,7,13,11};


        System.out.println("Before Sort -> "+Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("After Sort -> "+Arrays.toString(arr)+"\n************************************");

        System.out.println("Before Sort -> "+Arrays.toString(arr2));
        mergeSort(arr2);
        System.out.println("After Sort -> "+Arrays.toString(arr2)+"\n************************************");

        System.out.println("Before Sort -> "+Arrays.toString(arr3));
        mergeSort(arr3);
        System.out.println("After Sort -> "+Arrays.toString(arr3)+"\n************************************");

        System.out.println("Before Sort -> "+Arrays.toString(arr4));
        mergeSort(arr4);
        System.out.println("After Sort -> "+Arrays.toString(arr4));
    }

    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n>1){
            int mid = n/2;
            int[] left = new int[mid];
            int[] right = new int[n-mid];

            System.arraycopy(arr, 0, left, 0, left.length);
            System.arraycopy(arr, mid, right, 0, right.length);

            mergeSort(left);
            mergeSort(right);
            merge(left,right,arr);
        }
    }
    public static void merge(int[] left , int[] right , int[] arr){
        int i=0,j=0,k=0;

        while( i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        if(i == left.length){
            while ( j < right.length){
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        if( j == right.length){
            while ( i < left.length){
                arr[k] = left[i];
                i++;
                k++;
            }
        }

    }
}