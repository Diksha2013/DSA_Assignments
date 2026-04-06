import java.util.*;
class check_palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter element of array");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        boolean isPalindrome = f(a,0,a.length-1);
        if(isPalindrome){
            System.out.println("Array is a palindrome");
        }
        else{
            System.out.println("Array is not a palindrome");
        }
    }
    static boolean f(int a[],int start,int end){
        if(start>=end){
            return true;
        }
        if(a[start]!=a[end]){
            return false;
        }
        return f(a,start+1,end-1);
    }
}


// Enter number of elements of array
// 5
// Enter element of array
// 1 2 3 2 1
// Array is a palindrome