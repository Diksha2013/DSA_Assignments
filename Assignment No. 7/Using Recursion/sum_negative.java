import java.util.*;
class sum_negative{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter element of array");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int sum = f(a,0);
        System.out.println("Sum of negative elements: "+sum);
    }
    static int f(int a[],int index){
        if(index >= a.length){
            return 0;
        }
        if(a[index] < 0){
            return a[index] + f(a,index+1);
        }
        return f(a,index+1);
    }
}


// Enter number of elements of array
// 5  
// Enter element of array
// 1 -2 3 -4 5
// Sum of negative elements: -6