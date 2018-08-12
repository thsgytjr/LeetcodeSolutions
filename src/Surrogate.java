import java.util.ArrayList;
import java.util.List;

public class Surrogate {
    //Assuming input value is my name and there are 2 pair of high/low surrogate values
    public String reverse(String name){
        //Create sb variable to store return value
        StringBuilder sb = new StringBuilder();
        //Create highLow variable to store high and low surrogate value
        StringBuilder highLow = new StringBuilder();
        //Create array list so store pair or words (high and low);
        List<String> arr = new ArrayList<>();
        //Boolean to keep track of pair
        boolean match = false;

        //Assuming isLow and isHigh methods are available and assuming inputs are correct (tue)
        boolean isLow = true;
        boolean ishigh = true;
        //Looping through entire input string
        for (int i=name.length()-1; i>=0; i--){
            //Condition where it found low surrogate
            if (isLow){
                //Change match variable to true if low surrogate is found
                match = true;
                //Assign low surrogate to highLow string builder variable
                highLow.append(name.charAt(i));
                //Exit Loop
                continue;
            }
            //Condition where it found high surrogate
            if (ishigh&&match){
                //Change match variable back to false to track next values
                match = false;
                //Insert it to front of highLow since high should to front of low surrogate
                highLow.insert(0,name.charAt(i));
                //Add this high/low to array list
                arr.add(highLow.toString());
                //Clear highLow variable to empty
                highLow.setLength(0);
                //Exit loop
                continue;
            }
            //Reverse string and save to string builder sb for non high/low pairs
            sb.append(name.charAt(i));
        }
        //Append last found high/low pair to front
        sb.append(arr.get(1));
        //Append first found high/low pair ar the end.
        sb.insert(0,arr.get(0));
        //return result
        return sb.toString();
    }

    public static void main(String[] args) {
        Surrogate s = new Surrogate();
        s.reverse("hlDavidhl");
        //BS
    }
}
