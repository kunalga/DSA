public class MargeSort { 

    public static void divideArr(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        divideArr(arr, low, mid);
        divideArr(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int arr[], int low, int mid, int high) {
        int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int k = 0;

        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp[k] = arr[left];
                left++;
            } else {
                temp[k] = arr[right];
                right++;
            }
            k++;
        }

        while (left <= mid) {
            temp[k] = arr[left];
            left++;
            k++;
        }

        while (right <= high) {
            temp[k] = arr[right];
            right++;
            k++;
        }

        // Copy back the sorted elements into the original array
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 24, 23, 86, 928, 9, 10};

        System.out.println("Before sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        divideArr(arr, 0, arr.length - 1);

        System.out.println("\nAfter sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
