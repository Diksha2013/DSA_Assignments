import java.util.*;
class contains_target{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the target element to check if it is present in the array");
        int target = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < a.length; i++){
            if(a[i] == target){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println(target + " is present in the array.");
        } else {
            System.out.println(target + " is not present in the array.");
        }
    }
}


// Enter number of elements of array
// 4
// Enter array elements
// 1 2 3 4
// Enter the target element to check if it is present in the array
// 3
// 3 is present in the array.