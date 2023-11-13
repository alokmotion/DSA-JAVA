
/**
 * ForLoop
 * print number in the reange of 1-10;
 * print number in reverse order
 * itarte forword array
 * itrate reverse array
 */
public class ForLoop {

    public static void main(String[] args) {
        // Example 1 print number
        // System.out.println("Number between 1-10: ");
        // for(int i = 1; i<= 10; i++){
        //     System.out.printf(i + "");
        // }
        // System.out.println();

        
        // Example 2 revese number
        // System.out.println("Number between 10-1: ");
        //  for(int i = 10; i>= 1; i--){
        //     System.out.printf(i + "");
        // }

        // System.out.println();


        // Example 3 print array in forword order

        // int[] arr = {5,10,30,26,55};
        // for(int i=0;i<=arr.length-1;i++){
        //     System.out.println(arr[i]);

        // }

        // Example 4 print array in Revers order

        int[] arr = {5,10,30,26,55};
        for(int i=arr.length-1 ;i>=0; i--){
            System.out.println(arr[i]);

        }

    }
}