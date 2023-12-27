public class InsertionSort{
  public static void main(String[] args) {
    int[] arr = {23, 42, 11, 0, 1, 2, 3, 18};
    insertionSort(arr);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
  }


  public static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int j = i - 1;
            int current = array[i];
            while(j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
        array[++j] = current;
        }
  }
}
