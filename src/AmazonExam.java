import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AmazonExam {

    List<List<Integer>> optimalUtilization(int deviceCapacity, List<List<Integer>> foregroundAppList,
                                           List<List<Integer>> backgroundAppList){
        //Initialize array list to store max IDs.
        List<List<Integer>> result = new ArrayList<>();
        //Initialize current ID's maximum value;
        int max=0;

        for (int i=0; i<foregroundAppList.size(); i++){
            for (int j=0; j<backgroundAppList.size(); j++){
                //Current Id nd Size variables
                int currentSize = foregroundAppList.get(i).get(1)+backgroundAppList.get(j).get(1);
                int currentForegroundAppId = foregroundAppList.get(i).get(0);
                int currentBackgroundAppId = backgroundAppList.get(j).get(0);
                //Skip if foreground app and background app size is more then device capacity
                if (currentSize<=deviceCapacity){
                    //Create array list to store both app IDs
                    List<Integer> current = new ArrayList<>();
                    current.add(0,currentForegroundAppId);
                    current.add(1,currentBackgroundAppId);
                    //Edge case: Add first IDs as max app
                    if (i==0 && j==0){
                        result.add(i,current);
                        max = currentSize;
                    }
                    //Replace if both size of app is larger then current stored max size.
                    if (currentSize>max){
                        //Delete stored max IDs from the list and add current max IDs
                        result.clear();
                        result.add(0,current);
                        max = currentSize;
                        continue;
                    }
                    //Add current IDs to max IDs if size is equal.
                    else if(i!=0 && j!=0 && currentSize==max){
                        result.add(i-1,current);
                    }
                }
            }
        }
        //Return  maximum size app ID(s)
        return result;
    }

    public static void main(String[] args) {
       AmazonExam ae = new AmazonExam();
        List fgapp1 = new ArrayList();
        List fgapp2 = new ArrayList();
        List fgapp3 = new ArrayList();
        List fgapp4 = new ArrayList();

        fgapp1.add(0,1);
        fgapp1.add(1,8);

        fgapp2.add(0,2);
        fgapp2.add(1,15);

        fgapp3.add(0,3);
        fgapp3.add(1,9);

//        fgapp4.add(0,4);
//        fgapp4.add(1,10);



        List bgapp1 = new ArrayList();
        List bgapp2 = new ArrayList();
        List bgapp3 = new ArrayList();
        List bgapp4 = new ArrayList();



        bgapp1.add(0,1);
        bgapp1.add(1,8);

        bgapp2.add(0,2);
        bgapp2.add(1,11);

        bgapp3.add(0,3);
        bgapp3.add(1,12);

//        bgapp4.add(0,4);
//        bgapp4.add(1,5);

        List<List<Integer>> foregroundAppList = new ArrayList<List<Integer>>();
        List<List<Integer>> bgroundAppList = new ArrayList<List<Integer>>();
        foregroundAppList.add(fgapp1);
        foregroundAppList.add(fgapp2);
        foregroundAppList.add(fgapp3);
//        foregroundAppList.add(fgapp4);
        bgroundAppList.add(bgapp1);
        bgroundAppList.add(bgapp2);
        bgroundAppList.add(bgapp3);
//        bgroundAppList.add(bgapp4);

        System.out.println(ae.optimalUtilization(20,foregroundAppList,bgroundAppList));




    }
}
