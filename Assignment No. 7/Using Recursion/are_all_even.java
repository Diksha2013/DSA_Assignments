import java.util.*;
class are_all_even{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        boolean even = f(a,0);
        System.out.println("Are all elements even: "+even);
    }
    static boolean f(int a[],int index){
        if(index == a.length){
            return true;
        }
        if(a[index] % 2 != 0){
            return false;
        }
        return f(a,index+1);
    }
}

// Enter number of elements of array
// 3
// Enter array elements
// 2 4 6
// Are all elements even: true