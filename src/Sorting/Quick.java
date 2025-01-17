package Sorting;

public class Quick {
    public void  sort(int[] arr, int size) {
        sort(arr, 0, size - 1);
    }

    public static void sort(int [] a, int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);
            sort(a, low, pi - 1);
            sort(a,pi + 1,high);
        }

        for (int e : a) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    private static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;

        return i + 1;
    }
}
