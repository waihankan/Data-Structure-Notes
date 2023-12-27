package Main;

public class Main {
    public static void main(String[] args) {

        // original array
        int[] arr = {65, 24, 22, 23423, 23423, 112, 12, 1, 2, 4, 5, 11, 20, 20};
//        int[] arr = {5, 4, 3, 2, 1};


        // Selection sort  O(N^2)
        int[] selectionSorted = Sorting.selectionSort(arr);
        System.out.print("Array Sorted by Selection Sort: ");
        for (int num : selectionSorted) {
            System.out.print(num + " ");
        }
        System.out.println("");

        Sorting.quickSort2(arr, 0, arr.length - 1);
        System.out.print("Array Sorted by Quick Sort:     ");
        for(int num: arr) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }
}
