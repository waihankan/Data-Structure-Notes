package Main;


import java.util.Comparator;
import java.util.PriorityQueue;

public class Sorting {

    // swap with the smallest element to the right in the array
    /*
     *  find min in each loop
     *  swap i and min
     */
    public static int[] selectionSort(int[] arr) {
        int length = arr.length;
        int[] sortedArr = arr.clone();

        for (int i = 0; i < length; i++) {
            int minIndex = i;
            for (int j = i; j < length; j++) {
                if (sortedArr[j] < sortedArr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = sortedArr[i];
            sortedArr[i] = sortedArr[minIndex];
            sortedArr[minIndex] = temp;
        }

        return  sortedArr;
    }


    public static int[] heapSort(int[] arr) {
        int length = arr.length;
        int[] sortedArr = arr.clone();

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());    // reverseOrder to make it MaxHeap
        // add arrays into maxHeap      O(NlogN)
        for (int num : arr) {           // O(N)
            maxHeap.add(num);           // O(logN)
        }

        for (int i = length - 1; i >= 0; i--) {    // O(N)
            sortedArr[i] = maxHeap.poll();             // O(logN)
        }

        return sortedArr;
    }


    /*
        start from index 1
        mark the key
        go forward and push them to right if they're smaller than key
        put back key into j+1 position
     */


    // shift greater item to the right of the key
    public static int[] insertionSort(int[] arr) {
        int length = arr.length;
        int[] sortedArr = arr.clone();

        for (int i = 1; i < length; i++) {
            int key = sortedArr[i];
            int j = i - 1;
            while (j >= 0 && sortedArr[j] > key) {
                sortedArr[j + 1] = sortedArr[j];
                j--;
            }
            sortedArr[j + 1] = key;
        }

        return sortedArr;
    }


    /**
     *  Merge Sort
     *
     * @param arr
     * @param left
     * @param right
     */
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

           merge(arr, left, middle, right);
        }
    }

    private static void merge(int[] arr, int left, int middle, int right) {
        int leftLength = middle - left + 1; // middle is in the left part
        int rightLength = right - middle;

        int L[] = new int[leftLength];
        int R[] = new int[rightLength];

        for (int i = 0; i < leftLength; i++) {
            L[i] = arr[left + i];
        }

        for (int j = 0; j < rightLength; j++) {
            R[j] = arr[middle + j + 1];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < leftLength && j < rightLength) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < leftLength) {
            arr[k] = L[i];
            k++;
            i++;
        }


        while(j < rightLength) {
            arr[k] = R[j];
            k++;
            j++;
        }
    }

    /**
     * QuickSort
     *
     * @param
     * @param
     * @param
     */
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int j = partition(arr, left, right);
            quickSort(arr, left, j - 1);
            quickSort(arr, j + 1, right);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int i = left;
        int j = right;
        int pivot = arr[left];

        while(i < j) {
            while(i < j && arr[i] <= pivot) {
                i++;
            }
            while(arr[j] > pivot) {
                j--;
            }
            if(i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, left, j);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
















































    public static void quickSort2(int[]arr, int low, int high) {
        if(low < high) {
            int j = partition2(arr, low, high);
            quickSort2(arr, low, j - 1);
            quickSort2(arr, j + 1, high);
        }
    }

    private static int partition2(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i < j) {
            while(arr[i] <=pivot && i < j) {
                i++;
            }

            while(arr[j] > pivot) {
                j--;
            }

            if(i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[low] = arr[j];
        arr[j] = pivot;
        return j;
    }

}