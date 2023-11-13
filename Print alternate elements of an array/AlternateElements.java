import java.util.Scanner;

public class AlternateElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int sizeArr = scan.nextInt();

        int arr[] = new int[sizeArr];
        // taking array element from user using for loop
        for (int i = 0; i < sizeArr; i++) {
            System.out.println("Enter the " + (i + 1) + "th Element");
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            i++;


        }
      
        
    }
    
}
