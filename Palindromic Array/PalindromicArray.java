
public class PalindromicArray {
    public static void main(String[] args) {
        int[] arr = { 31, 222, 333, 444, 75 };
        for (int element : arr) {
            String number = String.valueOf(element);
            int i = 0;
            int j = number.length() - 1;
            while (i < j) {
                if (number.charAt(i) != number.charAt(j)) {
                    System.out.println(0);
                    break;

                }
                i++;
                j--;

            }
            if (i >= j) {
                System.out.println(1);
            }
        }

    }

}
