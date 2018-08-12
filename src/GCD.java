import java.util.Arrays;

public class GCD {

    public static int gg(int a, int b){
        if (b == 0) {
            return a;
        } else {
            return gg(b, a%b);
        }
    }

    public static int gg(int[] a, int n) {
        // the GCD of a number with itself is... itself
        int gcd = a[0];

        // compute incrementally
        for( int i=1; i<n; i++ ) {
            gcd = gg( gcd, a[i] );
        }

        // return result
        return gcd;
    }

//        public static int gg(int[] array, int n ){
//            Arrays.sort(array);
//            int low = array[0];
//
//
//            return low;
//
//        }


    public static void main(String[] args) {
        int[] tc = new int[]{4,8,3,12,60};
        System.out.println(gg(tc,5));

//        System.out.println(4%4);
//        System.out.println(%);



//        System.out.println(6%2);
//        System.out.println(8%2);
//        System.out.println(10%2);

    }
}
