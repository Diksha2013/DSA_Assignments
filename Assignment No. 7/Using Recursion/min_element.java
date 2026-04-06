import java.util.*;
class min_element{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int min = f(a,0);
        System.out.println("Minimum element of array: "+min);
    }
    static int f(int a[],int index){
        if(index == a.length-1){
            return a[index];
        }
        int min = f(a,index+1);
        if(a[index]<min){
            return a[index];
        }
        return min;
    }
}


// Enter number of elements of array
// 4
// Enter array elements
// 3 9 1 7
// Minimum element of array: 1