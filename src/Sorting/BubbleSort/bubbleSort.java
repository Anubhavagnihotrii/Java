package Sorting.BubbleSort;
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {99,4,63,2,1,3,0,1,2};
        int n = a.length;
        System.out.println("Before sorting array elements are:");
        display(a, n);
        System.out.println("\nAfter sorting array elements are:");
        bubble(a, n);
        display(a, n);
    }
    public static void bubble(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    public static void display(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
