import java.util.*;
class any_negative{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();   
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        boolean negative = f(a,0);
        System.out.println("Is there any negative element: "+negative);
    }
    static boolean f(int a[],int index){
        if(index == a.length){
            return false;
        }
        if(a[index] < 0){
            return true;
        }
        return f(a,index+1);
    }
}

// Enter number of elements of array
// 4
// Enter array elements
// 1 2 -3 4
// Is there any negative element: true