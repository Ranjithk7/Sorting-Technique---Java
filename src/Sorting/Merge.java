package Sorting;

public class Merge {

    private static void merge(int[] arr, int l, int mid, int r) {

        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] larr = new int[n1];
        int[] rarr = new int[n2];

        for (int i = 0; i < n1; i++) {
            larr[i] = arr[i+l];
        }

        for (int i = 0; i < n2; i++) {
            rarr[i] = arr[mid+i+1];
        }

        int i = 0, j = 0, k = l;

        while (i+j < n1+n2) {
            if (i==n1) {
                arr[k] = rarr[j];
                j++;
            } else if (j==n2) {
                arr[k] = larr[i];
                i++;
            } else if(larr[i] <= rarr[j]) {
                arr[k] = larr[i];
                i++;
            } else {
                arr[k] = rarr[j];
                j++;
            }
            k++;
        }

//        while (i<n1) {
//            arr[k] = larr[i];
//            i++;
//            k++;
//        }
//
//        while (j<n2) {
//            arr[k] = rarr[j];
//            j++;
//            k++;
//        }
    }

    public void sort(int[] arr, int l, int r) {
        if (l<r) {

            int mid = (l + r) / 2;
            sort(arr, l, mid);
            sort(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }

        for (int e : arr) {
            System.out.print(e);
        }
        System.out.println();
    }
}