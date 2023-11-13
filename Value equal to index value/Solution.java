import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int sizeArr = scan.nextInt();

        // Crateing the object for array input
        int arr[] = new int[sizeArr];
        
        for (int i = 0; i < sizeArr; i++) {
            System.out.println("Enter the " + (i + 1) + "th Element");
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < sizeArr; i++) {
            if( i+1 == arr[i]){
                System.out.println("Value " + arr[i] + " is equal to index value ");
                break;
            } else {
                System.out.println("There is no Value equal to index value");
            }
        }

        

        

        
    }
}
