package collectionsframework.lists.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
//        Here we didn't need to define the size of the Array it grows Dynamically.
        arr.add(12);
        arr.add(15);
        arr.add(99);
        arr.add(2);
        arr.add(97);
        System.out.println("Elements of arraylist  are "+arr);

        arr.remove(1);  //In remove method we pass the index inside it, so that the element present at that specific index will  be removed/deleted.
        System.out.println("Elements of arraylist after removal are "+arr);

//       Suppose we want to know the index of the element
        System.out.println("Index of 97 is "+arr.indexOf(97));

//       accessing specific element (element present at a specific index)  {get method}
        System.out.println("Element at index 3 is "+arr.get(3));


//        using (for loop , enhanced for loop )  with arraylist

        System.out.println("\nPrinting the elements of the array using for loop");
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }

        System.out.println("\nPrinting the elements of the array using enhanced for loop");

        for(Integer i:arr)
        {
            System.out.print(i+" ");
        }

//        U can use iterators too, iterators are used for traversing through collections such as lists, sets, and maps.

        System.out.println("\nUsing iterator to traverse");
        Iterator<Integer> it = arr.iterator();
        while ((it.hasNext()))
        {
            System.out.print(it.next()+" ");
        }
//        Here we used the iterators because they are safe.  Iterators provide a safe way to remove elements from a collection while iterating over it using the remove() method. This ensures that you can remove elements without causing issues with the iteration process.
//        we'll see more about the iterators in a separate package.

    }
}
