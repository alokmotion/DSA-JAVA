

public abstract class SumOfArray2 {
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3, 4};
        long sum = 0;
        for(long element : arr){
            sum += element;
        }
        System.out.println(sum);
    }
    
}
