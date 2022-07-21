
public class permtst {

    public static void main(String[] args) {
      
        if (args[0].equals("-r")) {
            System.out.println("-----------------------------------------------------");
            System.out.println("Recursive solution...");
            System.out.println("-----------------------------------------------------");
            permtgtr(args[1],"");
        } else {
            System.out.println("-----------------------------------------------------");
            System.out.println("Non-recursive solution...");
            System.out.println("-----------------------------------------------------");
            permtgt(args[0]);
        }
    

    }

    private static void permtgtr(String ts, String sub){
        if ( ts == null ||  ts.length() < 2 ){
            System.out.println(sub + " ");
            return;
        }
        
        for (int i = 0; i < ts.length(); i++) {
                permtgtr(ts.substring(0, i) + ts.substring(i + 1), sub + ts.substring(i, i + 1));
            }
    }

    private static void permtgt(String ts){

        int l = ts.length();
        int [] f = new int[ l+1 ];
        
        // initialize the array
        f[0] = 1;
        for ( int i = 1; i <= l; i++ ) {
            f[i] = f[ i-1 ] * i;
        }

        for ( int i = 0; i < f[l]; i++ ) {
            String perm = "";
            String tmp = ts;
            int posCd = i;

            for ( int pos = l; pos > 0 ; pos-- ){
                int selected = posCd / f[pos-1];
                perm += tmp.charAt(selected);
                posCd = posCd % f[ pos-1 ];
                tmp = tmp.substring(0,selected) + tmp.substring(selected+1);

                System.out.print("Pos: " + pos + ", f: " + f[pos] + ", posCd: " + posCd + ", selected: " + selected + ", perm: " + perm + ", tmp: " + tmp + "\n");
            }

            System.out.println(perm);
        }
    }
}