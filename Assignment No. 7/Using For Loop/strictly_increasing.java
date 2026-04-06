import java.util.*;
class strictly_increasing{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        boolean isStrictlyIncreasing = true;
        for(int i = 0; i < a.length - 1; i++){
            if(a[i] >= a[i+1]){
                isStrictlyIncreasing = false;
                break;
            }
        }
        System.out.println("Array is strictly increasing: " + isStrictlyIncreasing);
    }
}

// Enter number of elements of array
// 4
// Enter array elements
// 1 2 3 3
// Array is strictly increasing: false