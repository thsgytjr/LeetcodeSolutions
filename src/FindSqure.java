public class FindSqure {

    int findSqure(int A, int B){
        int count = 0;

        for (int i=A; i<=B; i++){
            if (i==0){
                continue;
            }
            double sr = Math.sqrt(i);
            if (sr%1==0){
                count++;
            }

        }
        return count;


//        int cnt = 0; // Initialize result
//
//        // Traverse through all numbers
//        for (int i = A; i <= B; i++)
//
//            // Check if current number 'i' is perfect
//            // square
//            for (int j = 1; j * j <= i; j++)
//                if (j * j == i)
//                    cnt++;
//        return cnt;
    }

    public static void main(String[] args) {
        FindSqure fs = new FindSqure();
        System.out.println(fs.findSqure(3,17));
//        double sr = Math.sqrt(4);
////        System.out.println(sr);
//        boolean isSq = sr-Math.floor(sr)==0;
//        System.out.println(Math.sqrt(0));
//        System.out.println(Math.pow(1,1));
//        System.out.println(3.00%1);

    }
}
