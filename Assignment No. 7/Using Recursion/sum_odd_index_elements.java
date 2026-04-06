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
        int sum = f(a,1);
        System.out.println("Sum of odd index elements of array: "+sum);
    }
    static int f(int a[],int index){
        if(index >= a.length){
            return 0;
        }
        return a[index] + f(a,index+2);
    }
}

// Enter number of elements of array
// 5
// Enter array elements
// 10 20 30 40 50 
// Sum of odd index elements of array: 60