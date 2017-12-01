import java.util.*;

public class NonRecursive {

static int calls = 0;    
static Map<Integer, String> codes  = new HashMap<Integer, String>();

private static void construct(){
codes.put(1, "A");
codes.put(2, "B");
codes.put(3, "C");
codes.put(4, "D");
codes.put(5, "E");
codes.put(6, "F");
codes.put(7, "G");
codes.put(8, "H");
codes.put(9, "I");
codes.put(10, "J");
codes.put(11, "K");
codes.put(12, "L");
codes.put(13, "M");
codes.put(14, "N");
codes.put(15, "O");
codes.put(16, "P");
codes.put(17, "Q");
codes.put(18, "R");
codes.put(19, "S");
codes.put(20, "T");
codes.put(21, "U");
codes.put(22, "V");
codes.put(23, "W");
codes.put(24, "X");
codes.put(25, "Y");
codes.put(26, "Z");
}

private static void decode(String str, String built){

    construct();        

    int n = str.length();

    if (n == 0) {
        System.out.println(built);
        return;
    }

        // If you have 0's, then they don't have a corresponding singular letter. Break off the recursion.
        if (str.substring(0, 1).equals("0"))
            return;

        String x = codes.get(Integer.parseInt(str.substring(0, 1)));     
        if (x == null)
            return;
        decode(str.substring(1), built+x);

        if (n > 1) {

            // If it's more than 26, it doesn't have a corresponding letter. Break off the recursion.
            if (Integer.parseInt(str.substring(0, 2)) > 26)
                return;

            String y = codes.get(Integer.parseInt(str.substring(0, 2)));

            decode(str.substring(2), built+y);
        }
    }

public static void main(String[] args) {
    decode("1132", "");
}
}