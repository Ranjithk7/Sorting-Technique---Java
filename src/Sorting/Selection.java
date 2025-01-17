package Sorting;
public class Selection {
    public void sort(int[] a, int size) {

        int temp = 0;
        int minI = -1;
        System.out.println("Before sorting");
        for (int i : a) {
            System.out.print(i + " ");
        }

        for (int i = 0; i <size - 1; i++) {
            minI = i;
            for (int j = i + 1; j < size; j++) {
                if (a[minI] > a[j]) {
                    minI = j;
                }
            }

            temp = a[i];
            a[i] = a[minI];
            a[minI] = temp;;
        }

        System.out.println();
        System.out.println("After sorting");
        for (int i : a) {
            System.out.print(i + " ");
        }

    }    

}
