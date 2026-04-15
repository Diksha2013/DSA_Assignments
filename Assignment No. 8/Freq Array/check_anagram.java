import java.util.*;
class check_anagrams{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String str1 = sc.nextLine();
        System.out.println("Enter second string");
        String str2 = sc.nextLine();
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for(int i = 0; i < str1.length(); i++){
            char ch = str1.charAt(i);
            freq1[ch - 'a']++;
        }
        for(int i = 0; i < str2.length(); i++){
            char ch = str2.charAt(i);
            freq2[ch - 'a']++;
        }
        boolean areAnagrams = Arrays.equals(freq1, freq2);
        System.out.println("Are the strings anagrams? " + areAnagrams);
    }
}

// Enter first string
// heart
// Enter second string
// earth
// Are the strings anagrams? true