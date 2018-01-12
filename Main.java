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
    public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        printArray(arr);
        System.out.println();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    printPartialArray(arr, j, j+1);
                    System.out.println();
                }
    }
 
    /* Prints the array */
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public static void printPartialArray(int arr[], int index1, int index2)
    {
        int n = arr.length;
        for (int i=0; i < n; ++i)
            if(i == index1)
            {
                System.out.print("\u001B[1m" + arr[i] + "\001B[0m ");
            }else if(i == index2)
            {
                System.out.print("\033[1m" + arr[i] + "\033[0m ");
            }else
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
        int arr[] = new int[20];
        arr = gen();
        bubbleSort(arr);
        System.out.println("Sorted array");
        printArray(arr);
    }
    
    public static int[] gen()
    {
        int arr[] = new int[20];
        for(int i = 0; i < 20; i++)
            {
                arr[i] = (((int)(Math.random()*100)) + 1);
            }
        return arr;
    }
}
