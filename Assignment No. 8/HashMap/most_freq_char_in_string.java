import java.util.*;
class most_freq_char_in_string{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        char mostFreqChar = ' ';
        int maxFreq = 0;
        for(Map.Entry<Character, Integer> entry : hm.entrySet()){
            char ch = entry.getKey();
            int freq = entry.getValue();
            if(freq > maxFreq){
                maxFreq = freq;
                mostFreqChar = ch;
            }
        }
        System.out.println("Most frequent character: " + mostFreqChar);
    }
}