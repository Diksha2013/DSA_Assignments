import java.util.*;
class strictly_increasing{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        boolean isIncreasing = f(a,0);
        System.out.println("Is array strictly increasing: "+isIncreasing);
    }
    static boolean f(int a[],int index){
        if(index >= a.length-1){
            return true;
        }
        if(a[index] >= a[index+1]){
            return false;
        }
        return f(a,index+1);
    }
}

// Enter number of elements of array
// 4
// Enter array elements
// 1 2 3 3
// Is array strictly increasing: false