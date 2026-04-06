import java.util.*;
class strictly_decreasing{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        boolean isStrictlyDecreasing = true;
        for(int i = 0; i < a.length - 1; i++){
            if(a[i] <= a[i+1]){
                isStrictlyDecreasing = false;
                break;
            }
        }
        System.out.println("Array is strictly decreasing: " + isStrictlyDecreasing);
    }
}


// Enter number of elements of array
// 4
// Enter array elements
// 9 7 5 2
// Array is strictly decreasing: true