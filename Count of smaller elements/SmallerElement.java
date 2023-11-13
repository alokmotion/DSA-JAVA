

public class SmallerElement {
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3, 4};
        long x = 9;
        for(int i =0; i<arr.length; i++){
            if(x <= arr[i]){
                System.out.println(i);
            }
        }
    }
    
}
