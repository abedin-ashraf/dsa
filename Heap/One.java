package Heap;

import java.util.ArrayList;
import java.util.Arrays;

public class One {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);
            int x = arr.size() - 1;
            int par = (x - 1) / 2;
            while (arr.get(x) < arr.get(par)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }
        }

        public void print() {
            for (int i = 0; i < arr.size(); i++) {
                System.out.println(arr.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.add(2);
        hp.add(3);
        hp.add(4);
        hp.add(1);
        hp.add(11);
        hp.add(0);

        hp.print();
    }

}
