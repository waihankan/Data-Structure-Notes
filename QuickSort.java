public class QuickSort{
    public static void main(String[] args) {
        int[] arr = {234, 21, 34, 99999, 800, 8902};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        if(left < right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
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
            swap(arr, left, j);
        }
        return j;
    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
