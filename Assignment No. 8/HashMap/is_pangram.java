import java.util.*;
class is_pangram{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        str = str.toLowerCase();
        boolean isPangram = true;
        HashMap<Character, Boolean> hm = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            hm.put(ch, true);
        }
        if(hm.size() != 26){
            isPangram = false;
        } 
        System.out.println("Is the string a pangram? " + isPangram);
    }
}


// Enter a string
// thequickbrownfoxjumpsoverthelazydog
// Is the string a pangram? true