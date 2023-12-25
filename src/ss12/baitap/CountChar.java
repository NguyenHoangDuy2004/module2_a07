package ss12.baitap;

import java.util.HashMap;
import java.util.Map;

public class CountChar {
    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>();
        String string = "nguyen duy";

        for (int i = 0; i < string.length(); i++) {
            if (!map.containsKey(string.charAt(i))) {
                map.put(string.charAt(i),1);
            } else {
                map.put(string.charAt(i),map.get(string.charAt(i)) +1);
            }
        }
        System.out.println(map.entrySet());
    }
}
