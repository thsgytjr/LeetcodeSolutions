public class DefectFix {

    int solution(int M, int[] A) {
        int N = A.length;
        int[] count = new int[M + 1];
        for (int i = 0; i <= M; i++)
            count[i] = 0;
        //Maybe 0?
        int maxOccurence = 1;
        //Maybe index 0?
        int index = 0;
        for (int i = 0; i < N; i++) {
            if (count[A[i]] > 0) {
                int tmp = count[A[i]];
                //change > to >=
                if (tmp >= maxOccurence) {
                    maxOccurence = tmp;
                    //change i to A[i]
                    index = A[i];
                }
                count[A[i]] = tmp + 1;
            } else {
                count[A[i]] = 1;
            }
        }
        //Change to return from count array index
        return index;
    }
    public static void main(String[] args) {

        int[] array = new int[]{5,4,3,4,3,5,4,4};
        DefectFix d = new DefectFix();
        System.out.println(d.solution(5,array));

    }
}
