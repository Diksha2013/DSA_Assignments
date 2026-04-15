import java.util.*;
class most_freq_char_in_string{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int freq[] = new int[26];
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            freq[ch -'a']++;
        }
        char mostFreqChar = ' ';
        int maxFreq = 0;
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                mostFreqChar = (char)(i + 'a');
            }
        }
        System.out.println("Most frequent character: " + mostFreqChar);
    }
}


// Enter a string
// apple
// Most frequent character: p