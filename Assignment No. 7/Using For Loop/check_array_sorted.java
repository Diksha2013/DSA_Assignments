import java.util.*;
class check_array_sorted{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        boolean isSorted = true;
        for(int i = 0; i < a.length - 1; i++){
            if(a[i] > a[i+1]){
                isSorted = false;
                break;
            }
        }
        System.out.println("Array is sorted: " + isSorted);
    }
}


// Enter number of elements of array
// 4
// Enter array elements
// 1 2 3 4
// Array is sorted: true