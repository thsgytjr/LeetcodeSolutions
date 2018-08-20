import java.util.ArrayList;
import java.util.List;

public class SpriralMatrix {

    List<Integer> spiralOrder(int[][] matrix){
        List<Integer> res = new ArrayList<>();
        int colBegin = 0;
        int rowBegin = 0;
        int colEnd = matrix[0].length-1;
        int rowEnd = matrix.length-1;

        while (colBegin<=colEnd && rowBegin<=rowEnd){
            //Traverse to right
            for (int i=colBegin; i<=colEnd; i++){
                res.add(matrix[colBegin][i]);
            }
            rowBegin++;

            //Traverse to down
            for(int i=rowBegin; i<=rowEnd; i++){
                res.add(matrix[i][colEnd]);
            }
            colEnd--;
            //Traverse to left
            for (int i=colEnd; rowBegin<=rowEnd&&i>=colBegin; i--){
                res.add(matrix[rowEnd][i]);
            }
            rowEnd--;

            //Traverse to up
            for (int i=rowEnd; colBegin<=colEnd&&i>=rowBegin; i--){
                res.add(matrix[i][colBegin]);
            }
            colBegin++;
        }
        return res;
    }

    List<Integer> counterSpiralOrder(int[][] matrix){
        List<Integer> res = new ArrayList<>();
        int colBegin = matrix[0].length-1;
        int rowBegin = 0;
        int colEnd = 0;
        int rowEnd = matrix.length-1;
        while (colBegin>=colEnd && rowBegin<=rowEnd){
            //Traverse to left
            for (int i=colBegin; i>=colEnd; i--){
                res.add(matrix[colEnd][i]);
            }
            rowBegin++;

            //Traverse to down
            for (int i=rowBegin; i<=rowEnd; i++){
                res.add(matrix[i][colEnd]);
            }
            colEnd++;

            //Traverse to right
            for (int i=colEnd; rowBegin<=rowEnd&&i<=colBegin; i++){
                res.add(matrix[rowEnd][i]);
            }
            rowEnd--;

            //Traverse to up
            for (int i=rowEnd; colBegin>=colEnd&&i>=rowBegin; i--){
                res.add(matrix[i][colBegin]);
            }
            colBegin--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        SpriralMatrix sm = new SpriralMatrix();
//        sm.spiralOrder(arr);
        sm.counterSpiralOrder(arr);
    }
}

