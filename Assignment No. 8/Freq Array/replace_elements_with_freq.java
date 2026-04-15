import java.util.*;
class replace_elements_with_freq{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int max = 0;
        for(int i = 0; i < n ; i++){
            max = Math.max(max, a[i]);
        }
        int freq[] = new int[max + 1];
        for(int i = 0; i < n ; i++){
            freq[a[i]]++;
        }
        System.out.println("Array after replacing elements with their frequency:");
        for(int i = 0; i < n ; i++){
            System.out.print(freq[a[i]]+" ");
        }
    }
}


// Enter number of elements of array
// 4
// Enter array elements
// 1 2 2 3
// Array after replacing elements with their frequency:
// 1 2 2 1