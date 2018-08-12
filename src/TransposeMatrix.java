public class TransposeMatrix {

    int[][] transpose(int[][] arr){
        int[][] result = new int[arr[0].length][arr.length];
        for (int i=0; i<arr[0].length;i++){
            for(int j=0; j<arr.length;j++){
                result[i][j] = arr[j][i];
            }
        }
        return result;
    }



    public static void main(String[] args) {
        TransposeMatrix tm = new TransposeMatrix();
        int[][] arr = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(tm.transpose(arr));

    }

}
