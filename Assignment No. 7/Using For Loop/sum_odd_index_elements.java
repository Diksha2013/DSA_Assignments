import java.util.*;
class sum_odd_index_elements{
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
        for(int i = 1; i < a.length; i+=2){
            sum += a[i];
        }
        System.out.println("Sum of elements at odd indices is: " + sum);
    }
}


// Enter number of elements of array
// 5
// Enter array elements
// 10 20 30 40 50 
// Sum of elements at odd indices is: 60