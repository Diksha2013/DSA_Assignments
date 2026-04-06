import java.util.*;
class sum_all_digits_of_elements{
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
            int num = a[i];
            while(num != 0){
                sum += num % 10;
                num /= 10;
            }
        }
        System.out.println("Sum of all digits of elements in the array is: " + sum);
    }
}


// Enter number of elements of array
// 3
// Enter array elements
// 12 34 5
// Sum of all digits of elements in the array is: 15