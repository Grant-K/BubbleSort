import java.util.Arrays;
import java.util.List;
import java.util.*;
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    void bubbleSort(ArrayList<Integer> arr)
    {
        int n = arr.size();
        
        printArray(arr);
        System.out.println();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr.get(j) > arr.get(j+1))
                {
                    // swap temp and arr[i]
                    int temp = arr.get(j);
                    arr.set(j,j+1);
                    arr.set(j+1,temp);
                    printArray(arr.subList(1, 4));
                    System.out.println();
                }
    }
 
    /* Prints the array */
    void printArray(List<Integer> arr)
    {
        int n = arr.size();
        for (int i=0; i<n; ++i)
            System.out.print(arr.get(i) + " ");
        System.out.println();
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
        Main ob = new Main();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(26);
        // 60, 14, 96, 29	62	76	95	28	89	76	64	58	38	84	23	75	41	29	66)
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
