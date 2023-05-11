import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeated {
    public String findFirstNonRepeated(String s){

        HashMap<Character, Integer> map= new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char current=s.charAt(i);
            map.put(current, map.getOrDefault(current,0)+1);
        }

        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i))==1){
                return String.valueOf(s.charAt(i));
            }
        }
        return new String();
    }
}
