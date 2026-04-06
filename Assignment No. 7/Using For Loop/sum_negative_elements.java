import java.util.*;
class sum_negative_elements{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] < 0){
                sum += a[i];
            }
        }
        System.out.println("Sum of negative elements in the array is: " + sum);
    }
}


// Enter number of elements of array
// 5
// Enter array elements
// 1 -2 3 -4 5
// Sum of negative elements in the array is: -6