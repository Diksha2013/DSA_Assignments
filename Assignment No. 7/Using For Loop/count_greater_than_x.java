import java.util.*;
class count_greater_than_x{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > x){
                count++;
            }
        }
        System.out.println("Number of elements greater than " + x + " is: " + count);
    }
}

// Enter number of elements of array
// 5
// Enter array elements
// 1 5 3 7 2
// Enter the value of x
// 3
// Number of elements greater than 3 is: 2