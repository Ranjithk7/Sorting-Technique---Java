package Sorting;
public class Insertion{
    public void sort(int[] a, int size) {
        for (int i = 1; i < size; i++) {
            int key = a[i];
            int j = i - 1;
            while ( j >= 0 && a[j] > key) {
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = key;

            System.out.println();
            for (int it : a) {
                System.out.print(it + " ");
            }
        }

        System.out.println();
        System.out.println("After sorting");
        for (int i : a) {
            System.out.print(i + " ");
        }

    }
}
