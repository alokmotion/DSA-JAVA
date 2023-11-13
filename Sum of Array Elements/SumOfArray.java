import java.util.Scanner;

public class SumOfArray {
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

        // now retriving the all the array element
        int arrESum = 0;
        for (int i = 0; i < arr.length; i++) {

            arrESum += arr[i];

        }
        System.out.println(arrESum);

    }

}
