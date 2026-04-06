import java.util.*;
class smallest_element_index{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int index = f(a,0);
        System.out.println("Index of smallest element: " + index);
    }
    static int f(int a[],int index){
        if(index == a.length-1){
            return index;
        }
        int minIndex = f(a,index+1);
        if(a[index] < a[minIndex]){
            minIndex = index;
        }
        return minIndex;
    }
}


// Enter number of elements of array
// 5
// Enter array elements
// 5 2 8 1 3
// Index of smallest element: 3