boolean radar(int [] a, int target) {
    int start = 0;
    int end = a.length - 1;

    while(start <= end) {
        int mid = (end - start) / 2 + start
        if(a[mid] == target) {
            return true;
        } else if (a[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }

        System.out.println("Searching [ ");
        for(int i = start; i <= end; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("]");
    }
    return false;
}