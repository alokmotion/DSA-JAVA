/**
 * FindIndex
 */
public class FindIndex {

    public static void main(String[] args) {
        int N = 6;
        int a[] = {1,2,3,4,5,5};
        int start = -1;
        int end = -1;
        for(int i = 0 ; i<N; i++ ){
            if(a[i] == i){
                start = i;
                break;
            }
        }
       
        
        for(int i = N-1; i>=0; i--){
            if(a[i] == i){
                end = i;
                // end = end - N;
            }
        }
        System.out.println(start);
        System.out.println(end);
    }
}