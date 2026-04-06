import java.util.*;
class count_divisible_by_k{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] % k == 0){
                count++;
            }
        }
        System.out.println("Number of elements divisible by " + k + " is: " + count);
    }
}


// Enter number of elements of array
// 5
// Enter array elements
// 2 4 5 6 9
// Enter the value of k
// 2
// Number of elements divisible by 2 is: 3