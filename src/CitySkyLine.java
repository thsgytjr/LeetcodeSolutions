public class CitySkyLine {


    int maxIncreaseKeepingSkyline(int[][] grid){
        int[] maxColumn = new int[grid[0].length]; //[0,0] [0,1] [0,2][0,3]
        int[] maxRow = new int[grid.length];       //[0,0][1,0][2,0][3,0]
        int result =0;
        for (int i=0; i<grid.length; i++){
            for (int j=0; j<grid[0].length; j++){
                maxRow[i] = Math.max(maxRow[i], grid[i][j]);        //8,7,9,3
                maxColumn[j] = Math.max(maxColumn[j], grid[i][j]);  //9,4,5,7
            }

        }
        for (int i=0; i<maxColumn.length;i++){
            for(int j=0; j<maxRow.length;j++){
                result += Math.min(maxColumn[i],maxRow[j])-grid[j][i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {3,0,8,4},
                {2,4,5,7},
                {9,2,6,3},
                {0,3,1,0}
        };
        CitySkyLine sk = new CitySkyLine();
//        System.out.println(sk.maxIncreaseKeepingSkyline(grid));
        System.out.println();
    }
}
