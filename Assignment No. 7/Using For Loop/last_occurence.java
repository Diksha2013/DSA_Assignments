import java.util.*;
class last_occurence{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to find its last occurrence");
        int target = sc.nextInt();
        for(int i = a.length - 1; i >= 0; i--){
            if(a[i] == target){
                System.out.println("Last occurrence of " + target + " is at index: " + i);
                break;
            }
        }
    }
}


// Enter number of elements of array
// 5
// Enter array elements
// 5 2 3 2 4
// Enter the element to find its last occurrence
// 2
// Last occurrence of 2 is at index: 3