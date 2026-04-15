import java.util.*;
class element_with_freq_greater_than_k{
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
        for(int i = 0; i < a.length; i++){
            int count = 1;
            for(int j = i + 1; j < a.length; j++){
                if(a[i] == a[j]){
                    count++;
                }
            }
            if(count > k){
                System.out.println("Element with frequency greater than " + k + ": " + a[i]);
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
// Element with frequency greater than 2: 2