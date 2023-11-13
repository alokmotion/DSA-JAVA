import java.util.Scanner;

/**
 * SumofSeries
 * 
 * to reduce time complexcity we can simple use formula ===>
 *      Sn = n(n+1)/2
 * 
 */
public class SumofSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();
        System.out.println(seriesSum(n));
    }

    public static int seriesSum(int n) {
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        //     sum += i;
        // }
        // return sum;


        ///////////////////////////////////////////////////

        return (n*(n+1))/2;  // time -  O(1)

    }

}