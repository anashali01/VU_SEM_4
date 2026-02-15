import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        i = 0;
        while (i < size) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
            i++;
        }

        System.out.println("Array is: ");
        i = 0;
        while (i < size) {
            System.out.print(arr[i] + " ");
            i++;
        }
    }
}
