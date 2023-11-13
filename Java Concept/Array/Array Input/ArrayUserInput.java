import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int sizeArr = scan.nextInt();

        // Creating object for taking array
        int arr[] = new int[sizeArr];
        
        for (int i = 0; i < sizeArr; i++) {
            System.out.println("Enter the " + (i + 1) + "th Element");
            arr[i] = scan.nextInt();
        }

        System.out.println("Elements in the array:");
        for (int i = 0; i < sizeArr; i++) {
            System.out.println(arr[i]);
        }
    }
}
