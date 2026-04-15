import java.util.*;
class check_anagrams{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string1");
        String str1 = sc.nextLine();
        System.out.println("Enter string2");
        String str2 = sc.nextLine();
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for(int i = 0; i < str1.length(); i++){
            char ch = str1.charAt(i);
            hm1.put(ch, hm1.getOrDefault(ch, 0) + 1);
        }
        for(int i = 0; i < str2.length(); i++){
            char ch = str2.charAt(i);
            hm2.put(ch, hm2.getOrDefault(ch, 0) + 1);
        }
        boolean areAnagrams = hm1.equals(hm2);
        System.out.println("Are the strings anagrams? " + areAnagrams);
    }
}


// Enter string1
// heart
// Enter string2
// earth
// Are the strings anagrams? true