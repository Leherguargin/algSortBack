package pl.awsome.workshops;


import pl.awsome.workshops.tools.algorithms.QuickSort;
import pl.awsome.workshops.tools.algorithms.SelectionSort;

public class Main { //klasa do testowania algorytmów konsolowo
    public static void main(String[] args) {
        int[] tab = {3, 5, 2, 7, 1, 8, 4, 9};
        print(tab);
        QuickSort qs = new QuickSort();
        qs.sort(tab);
        print(tab);
        System.out.println();

        tab = new int[]{3, 5, 2, 7, 1, 8, 4, 9};
        print(tab);
        SelectionSort ss = new SelectionSort();
        ss.sort(tab);
        print(tab);
        System.out.println();



    }

    public static void print(int[] arr) {
        for(int element : arr){
            System.out.print(element);
            System.out.print(" ");
        }
        System.out.println();
    }
}
