import java.util.*;
class count_divisible_by_x{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of an array");
        for(int i =0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter value of k");
        int k = sc.nextInt();
        int count = f(a,0,k);
        System.out.println("Count of elements divisible by k: "+count);
    }
    static int f(int a[],int index,int k){
        if(index >= a.length){
            return 0;
        }
        if(a[index] % k == 0){
            return 1 + f(a,index+1,k);
        }
        return f(a,index+1,k);
    }
}


// Enter number of elements:
// 5
// Enter elements of an array
// 2 4 5 6 9
// Enter value of k
// 2
// Count of elements divisible by k: 3