import java.util.*;
class sum_all_digits_of_all_elements{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int sum = f(a,0);
        System.out.println("Sum of all digits of all elements: "+sum);
    }
    static int f(int a[],int index){
        if(index == a.length){
            return 0;
        }
        int sum = 0;
        int num = a[index];
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum + f(a,index+1);
    }
}   

// Enter number of elements of array
// 3
// Enter array elements
// 12 34 5
// Sum of all digits of all elements: 15