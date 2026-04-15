import java.util.*;
class element_appear_only_once{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        HashMap <Integer, Integer> hm = new HashMap<>();
        for(int num : a){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            int element = entry.getKey();
            int freq = entry.getValue();
            if(freq == 1){
                System.out.println("Unique element: " + element);
            }
        }
    }
}


// Enter number of elements of array
// 6
// Enter array elements
// 1 1 2 2 2 3
// Unique element: 3