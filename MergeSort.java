public class MergeSort{
    public static void main(String[] args) {
        int[] arr = {234, 21, 34, 89234, 800, 8902};
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int leftLen = mid - left + 1;
        int rightLen = right - mid;

        int[] L = new int[leftLen];
        int[] R = new int[rightLen];


        for(int i = 0; i < leftLen; i++) {
            L[i] = arr[left + i];
        }

        for(int j = 0; j < rightLen; j++) {
            R[j] = arr[mid + j + 1];
        }

        int i = 0, j = 0;
        int k = left;

        while(i < leftLen && j < rightLen) {
            if(L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < leftLen) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j < rightLen) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }
}

