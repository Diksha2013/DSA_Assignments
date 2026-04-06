import java.util.*;
class check_palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        char a[] = new char[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.next().charAt(0);
        }
        boolean isPalindrome = true;
        int left = 0;
        int right = a.length - 1;
        while(left < right){
            if(a[left] != a[right]){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Array is palindrome: " + isPalindrome);
    }
}


// Enter number of elements of array
// 5
// Enter array elements
// 1 2 3 2 1
// Array is palindrome: true