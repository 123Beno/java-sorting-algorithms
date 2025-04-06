/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class insertion_sort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {//the main function
        //in the best case it has a time complexity of 0(n)
        //in the average and worst case it has a time complexity of 0(n^2)
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        insertionSort(arr);

        System.out.println("\nAfter Insertion Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
