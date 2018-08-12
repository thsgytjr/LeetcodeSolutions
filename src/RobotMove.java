import java.util.TreeMap;

public class RobotMove {

    boolean judge(String moves){
        // U == 1
        // D == -1
        // L ==-2
        // R==2
        String [] array = moves.split("(?!^)");
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        for (int i = 0; i<array.length;i++){
            String key = array[i];
            if (map.get(key)==null){
                map.put(key,1);
            }else{
                int value = map.get(key).intValue();
                value++;
                map.put(key,value);
            }

        }
        System.out.println(map);
        if (map.size()%2!=0){
            return false;
        }else {
            if (map.containsKey("U") && map.containsKey("D") && map.containsKey("R") && map.containsKey("L")) {
                return map.get("U").intValue() == map.get("D").intValue() && map.get("R").intValue() == map.get("L").intValue();
            } else if (map.containsKey("U") && map.containsKey("D")) {
                return map.get("U").intValue() == map.get("D").intValue();
            } else if (map.containsKey("R") && map.containsKey("L")) {
                return map.get("R").intValue() == map.get("R").intValue();
            } else {
                return false;
            }
        }







//        int count = 0;
//        for (String item: array){
//            if (item.equals("U")){
//                count += 1;
//            }else if (item.equals("D")){
//                count -= 1;
//            }else if (item.equals("R")){
//                count += 2;
//            }else if (item.equals("L")){
//                count -= 2;
//            }else {
//                return false;
//            }
//        }
//        if (count==0){
//            return true;
//        }else{
//            return false;
//        }
    }


    public static void main(String[] args) {
        RobotMove r = new RobotMove();
        System.out.println(r.judge("RRULURRULL"));
    }
}
