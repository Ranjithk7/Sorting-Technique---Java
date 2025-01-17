package Sorting;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        Bubble bubble = new Bubble();
        Selection sel = new Selection();
        Insertion insert = new Insertion();
        Quick quick = new Quick();
        Merge merge = new Merge();

        Random ran = new Random();
//        int[] a = new int[50];
//        for (int i = 0; i < a.length; i++) {
//            int r = ran.nextInt(1000);
//            a[i] = r;
//        }

        int[] a = {8,5,9,3,3,3,3,3,6,6,4};
//        int size = a.length;


        // bubble.sort(a, size);
        // sel.sort(a, size);
//        insert.sort(a, size);
//        quick.sort(a, 0, size-1);
        merge.sort(a, 0, a.length - 1);

//        System.out.println(1/2);
    }
}

