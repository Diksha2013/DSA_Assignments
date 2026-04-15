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
        for(int i = 0; i < n ; i++){
            int count = 0;
            for(int j = 0;j < n ;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.print("Unique element : "+a[i]+" ");
                break;
            }
        }
    }
}


// Enter number of elements of array
// 6
// Enter array elements
// 1 1 2 2 2 3
// Unique element : 3