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
        for(int i = 0; i < n ; i++){
            int count = 0;
            for(int j = 0;j < n ;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count == k){
                System.out.println("Element that appears exactly "+k+": "+a[i]);
                break;
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
// Element that appears exactly 2: 1