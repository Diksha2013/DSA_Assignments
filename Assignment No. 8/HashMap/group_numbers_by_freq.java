import java.util.*;
class group_number_by_freq{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            System.out.println(entry.getKey() + "," + entry.getValue());    
        }
    }
}

// Enter number of elements of array
// 7
// Enter array elements
// 1 2 2 2 3 1 4
// 1,2
// 2,3
// 3,1
// 4,1