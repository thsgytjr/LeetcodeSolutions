public class FlippingAnImage {
    int[][] flipAndInvertImage(int[][]A){
        //Edge case: If A[0] length is 1
        if (A[0].length==1){
            for (int i=0; i<A.length; i++){
                for (int j=0; j<A[0].length; j++){
                    A[i][j]=A[i][j]^1;
                }
            }
            return A;
        }
        for (int i=0; i<A.length; i++){
            //Invert the middle image if length is 1 or odd
            if (A.length==1||A[0].length%2==1){
                A[i][A[i].length/2]= A[i][A[i].length/2]^1;
            }
            for (int j=0; j<A[0].length/2; j++){
                //Swap the array with inverted image
                int temp;
                temp = A[i][j]^1;
                A[i][j]=A[i][A[0].length-1-j]^1;
                A[i][A[0].length-1-j] = temp;
            }
        }
        return A;
    }
    public static void main(String[] args) {
        FlippingAnImage fi = new FlippingAnImage();
        int[][] arr = new int[][]{
                {0,1,1,1,1},
                {0,1,1,0,0},
                {0,1,1,1,1},
                {1,0,0,1,0},
                {0,0,0,0,1}
        };
        fi.flipAndInvertImage(arr);
//        System.out.println(7/2);
//        0,0,1,0,1     1,0,1,0,0
//        1,1,0,0,0     0,0,0,1,1
//        0,1,0,1,0     0,1,0,1,0

//                        for i = a.length /2 ;
//        0,1,0,1       int[0] = int [a.length-i-1] //3
//        1,0,0,1       int[1] = int [a.length-i-1] //2
//        0,0,1,1

//        1,0,1,0,0,2   6-1-0 //5
//                      6-1-1 //4
//                      6-1-2//3
    }
}
