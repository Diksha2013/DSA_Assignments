import java.util.*;
class missing_elements_btw_two_arrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of first array");
        int n1 = sc.nextInt();
        int a[] = new int[n1];
        System.out.println("Enter first array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter number of elements of second array");
        int n2 = sc.nextInt();
        int b[] = new int[n2];
        System.out.println("Enter second array elements");
        for(int i =0;i<b.length;i++){
            b[i] = sc.nextInt();
        }
        int max1 = 0;
        for(int i = 0; i < n1; i++){
            if(a[i] > max1){
                max1 = a[i];
            }
        }
        int max2 = 0;
        for(int i = 0; i < n2; i++){
            if(b[i] > max2){
                max2 = b[i];
            }
        }
        int freq[] = new int[Math.max(max1, max2) + 1];
        for(int i = 0; i < n1; i++){
            freq[a[i]]++;
        }
        for(int i = 0; i < n2; i++){
            freq[b[i]]--;
        }
        System.out.println("Missing elements in second array:");
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 0){
                System.out.print(i + " ");
            }
        }

    }
}


// Enter number of elements of first array
// 7
// Enter first array elements
// 1 1 2 2 2 3 7
// Enter number of elements of second array
// 6
// Enter second array elements
// 1 1 2 2 2 3
// Missing elements in second array:
// 7