import java.lang.Math;

public class arrtst {
    public static void main(String[] args) {
        int [] arr = { 2, 4, 6, 8, 10, 12 };
        int h = 0;
        int t = arr.length-1;
        int t_, t__;
        int l = arr.length;
        // int [] arr = new int[5];
        
        // for ( int i = 0, int j = 0; i < arr.length; i++, j=j+2 ){
        //     arr[i] = j;
        // }
        
        System.out.println("Hello Remote World!");
        // System.out.println(arr);
        // for (int i : arr){
        //     System.out.print(i);
        //     // System.out.println(i);
        // }

        for (int i = 0; i < l; i++){
            for(int c = 0, x = i, v=0; c<l; c++, x++){
                // System.out.print("i: " + i + "; c:  " + c + "; v:  " + v );
                v = (l + (x))%l;
                // System.out.print(v + ":  " + arr[v] + "; ");
                System.out.print(arr[v] + "  ");
            }
            System.out.println();
        }

        // for (int i = 0; i < l; i++){
        //     h = i;
        //     t = Math.abs(h%(arr.length-1));
        //     t_ = h == 0 ? 0 : Math.abs((arr.length-1)%h);
        //     t__ = (h+(l-1))%l;
        //     System.out.println("i: " + i + "; Head: " + h + "; Tail: " + t + "; Tail_: " + t_ + "; Tail__: " + t__);
        //     for(int c = 0, v = i; c<l; c++, v++){
        //         System.out.print(c + " " + i);
        //     }
        //     System.out.println();
        // }



    }
}

