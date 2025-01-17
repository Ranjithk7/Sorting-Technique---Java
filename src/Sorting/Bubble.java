package Sorting;
public class Bubble {
    public void sort(int[] a, int size) {

        int temp = 0;

        System.out.println("Before sorting");
        for (int i : a) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-1-i; j++) {
                if (a[j] > a[j+1]) {
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("After sorting");
        for (int i : a) {
            System.out.print(i + " ");
        }

    }    
}
