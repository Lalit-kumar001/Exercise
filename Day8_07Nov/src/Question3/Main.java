package Question3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Character result = findFirstNonRepeating(str);

        if (result != null)
            System.out.println("First non-repeating character: " + result);
        else
            System.out.println("No non-repeating character found.");

    }

    public static Character findFirstNonRepeating(String str){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }


        for(char c : map.keySet()){
            if(map.get(c)==1){
                return c;
            }
        }
        return null;
    }
}
//lalit