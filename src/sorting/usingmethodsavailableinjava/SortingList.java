package sorting.usingmethodsavailableinjava;

import java.util.ArrayList;
import java.util.Collections;

public class SortingList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(111);
        arr.add(12);
        arr.add(15);
        arr.add(99);
        arr.add(2);
        arr.add(97);

        System.out.println("Before sorting :- "+ arr);

        Collections.sort(arr);

        System.out.println("After sorting :- "+ arr);
    }
}
