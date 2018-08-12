import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PlayGround {

        // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
        static public List<Integer> cellCompete(int[] states, int days)
        {
            // WRITE YOUR CODE HERE
            List<Integer> list = new ArrayList<>();
            int[] result = new int[states.length];

            int value;
            for(int i=0; i<days;i++){
                for (int j=0; j<states.length;j++) {
                    if (i == 0) {
                        if (j == 0) {
                            value = 0 ^ states[j + 1];
                        } else if (j == states.length - 1) {
                            value = states[j-1] ^ 0;
                        } else {
                            value = states[j - 1] ^ states[j + 1];
                        }
                        list.add(value);
                        result[j]=value;
                    } else {
                        if (j == 0) {
                            value = 0 ^ list.get(j + 1);
                        } else if (j == (list.size() - 1)) {
                            value = list.get(j-1) ^ 0;
                        } else {
                            value = list.get(j - 1) ^ list.get(j + 1);
                        }
                            result[j]=value;
                        if (j==states.length-1){
                            for (int k=0;k<states.length;k++){
                                list.set(k,result[k]);
                            }
                        }
                    }
                }
            }
            return list;
        }

    public static void main(String[] args) {
//        System.out.println(fib(5));
        int[] list = new int[]{0, 1, 0, 1, 0, 1, 0, 1};
        PlayGround pg = new PlayGround();
        System.out.println(cellCompete(list,3));


    }

}
