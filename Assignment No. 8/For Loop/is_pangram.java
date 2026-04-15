import java.util.*;
class is_pangram{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        boolean isPangram = true;
        for(char ch = 'a'; ch <= 'z'; ch++){
            if(str.indexOf(ch) == -1){
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