import java.util.*;
class is_pangram{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        str = str.toLowerCase();
        boolean isPangram = true;
        int freq[] = new int[26];
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(freq[i] == 0){
                isPangram = false;
                break;
            }
        }
        System.out.println("Is the string a pangram? " + isPangram);
    }
}

// Enter a string
// thequickbrownfoxjumpsoverthelazydog
// Is the string a pangram? true