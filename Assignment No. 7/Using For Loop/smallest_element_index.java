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
        int smallestIndex = 0;
        int smallest = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] < smallest){
                smallest = a[i];
                smallestIndex = i;
            }
        }
        System.out.println("Index of smallest element: " + smallestIndex);
    }
}


// Enter number of elements of array
// 5
// Enter array elements
// 5 2 8 1 3
// Index of smallest element: 3