import java.util.*;
class exactly_k_freq_element{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter value of k");
        int k = sc.nextInt();
        int max = 0;
        for(int i = 0;i < n ; i++){
            max = Math.max(max,a[i]);
        }
        int freq[] = new int[max+1];
        for(int i = 0;i < n ; i++){
            freq[a[i]]++;
        }
        for(int i = 0;i < freq.length; i++){
            if(freq[i] == k){
                System.out.println("Element that appears exactly "+k+" :"+i);
            }
        }
    }
}

// Enter number of elements of array
// 6
// Enter array elements
// 1 1 2 2 2 3
// Enter value of k
// 2
// Element that appears exactly 2 :1