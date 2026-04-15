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
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < a.length; i++){
            hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            int element = entry.getKey();
            int freq = entry.getValue();
            if(freq > k){
                System.out.println("Element with frequency greater than " + k + ": " + element);
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