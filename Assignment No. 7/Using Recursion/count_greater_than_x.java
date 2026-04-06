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
        System.out.println("Enter value of x");
        int x = sc.nextInt();
        int count = f(a,0,x);
        System.out.println("Count of elements greater than x: "+count);
    }
    static int f(int a[],int index,int x){
        if(index >= a.length){
            return 0;
        }
        if(a[index] > x){
            return 1 + f(a,index+1,x);
        }
        return f(a,index+1,x);
    }
}


// Enter number of elements of array
// 5  
// Enter array elements
// 1 5 3 7 2
// Enter value of x
// 3
// Count of elements greater than x: 2
