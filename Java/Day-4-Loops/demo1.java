import java.util.Scanner;

public class demo1 {
    public static void printArr(int size, int[] arr){
        System.out.println("Array Elements are: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void largestElement(int size,int[] arr){
        int largest=arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("\nLargest Element is: "+largest);
    }
    public static void main(String[] args) {
        System.out.print("Enter Size of Array: ");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<size;i++){
            System.out.print("Element "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }
        printArr(size, arr);
        largestElement(size, arr);
        sc.close();
    }
}
