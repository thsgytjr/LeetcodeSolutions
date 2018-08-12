import java.util.Map;
import java.util.TreeMap;

public class CountWords {

    Map countWords(String words){
        TreeMap<String, Integer> tm = new TreeMap<String,Integer>();
        String[] word = words.split("\\s+");
        for (String x: word){
            if (tm.get(x)==null){
                tm.put(x,1);
            }else{
                int value = tm.get(x);
                value++;
                tm.put(x,value);
            }
        }


        return tm;
    }

    public static void main(String[] args) {
        CountWords cw = new CountWords();
        cw.countWords("Hi my name is david and my wife name is chloe");
    }
}
