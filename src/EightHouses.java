import java.util.ArrayList;
import java.util.List;

public class EightHouses {
    public List<Integer> cellCompete(int[] states, int days){
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> temp = new ArrayList<Integer>();

        for (int i=0; i<days; i++){
            //Very first day
            if (i==0){
                for (int j=0; j<states.length;j++){
                    // Edge case: First index
                    if (j==0){
                        //if both neighbors are inactive;
                        if (states[i+1]==0){
                            list.add(0);
                            temp.add(0);
                        }else {
                            list.add(1);
                            temp.add(1);
                        }
                    }
                    else if (j!=0 && j!=states.length-1){
                        list.add(states[j-1]^states[j+1]);
                        temp.add(states[j-1]^states[j+1]);
                    }
                    // Edge case: last index
                    if (j==states.length-1){
                        //if both neighbors are inactive;
                        if (states[j-1]==0){
                            list.add(0);
                            temp.add(0);
                        }else {
                            list.add(1);
                            temp.add(1);
                        }

                    }
                }
            }else{
                for (int j=0; j<states.length;j++){
                    // Edge case: First index
                    if (j==0){
                        //if both neighbors are inactive;
                        if (list.get(j+1)==0){
                            temp.set(j,0);
                        }else {
                            temp.set(j,1);
                        }
                    }
                    else if (j!=0 && j!=states.length-1){
                        temp.set(j,list.get(j-1)^list.get(j+1));
                    }
                    // Edge case: last index
                    if (j==states.length-1){
                        //if both neighbors are inactive;
                        if (list.get(j-1)==0){
                            temp.set(j,0);
                        }else {
                            temp.set(j,1);
                        }

                        list = temp;
                    }
                }
            }


        }

        return list;
    }



    public static void main(String[] args) {
        EightHouses eh = new EightHouses();
        int[] array = new int[]{1,1,1,0,1,1,1,1};
        // 1 :                 [1,0,1,0,1,0,0,1]
    //2                        [0.0.0.0.0.1.1.0]
        System.out.println(eh.cellCompete(array,2));

    }

}
