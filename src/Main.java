import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int arr [] ={ 11,11,12,13,14,14,15,16,17,17};
        TreeSet<Integer> un = new TreeSet<>();
        for(int i:arr)
        {
            un.add(i);
        }
        System.out.println(un);
        int brr[] = new int[un.size()];
        int index=0;
        for( Integer i:un)
        {
            brr[index]=i;
            index++;
        }
        for (int i = 0; i < brr.length ; i++) {
            System.out.print(brr[i] +" ");
        }



    }
}