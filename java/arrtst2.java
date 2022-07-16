
public class arrtst2 {
    public static void main(String[] args) {
        int [] arr = { 2, 4, 6, 8, 10, 12 };
        int l = arr.length;

        for (int i = 0; i < l; i++){
            for( int c = 0, x = i, v = 0; c < l; c++, x++ ){
                v = (l + (x))%l;
                System.out.print(arr[v] + "  ");
            }
            System.out.println();
        }
    }
}

