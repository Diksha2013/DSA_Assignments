import java.util.*;
class element_appears_only_once{
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
        for(int i = 0;i < n ; i++){
            max = Math.max(max,a[i]);
        }
        int freq[] = new int[max+1];
        for(int i = 0;i < n ; i++){
            freq[a[i]]++;
        }
        for(int i = 0;i < freq.length; i++){
            if(freq[i] == 1){
                System.out.println("Unique element :"+i);
            }
        }
    }
}



// Enter number of elements of array
// 6
// Enter array elements
// 1 1 2 2 2 3
// Unique element :3

