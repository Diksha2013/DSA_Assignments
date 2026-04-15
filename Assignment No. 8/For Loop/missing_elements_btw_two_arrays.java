import java.util.*;
class missing_elements_btw_two_arrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array1");
        int n1 = sc.nextInt();
        int a[] = new int[n1];
        System.out.println("Enter array1 elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter number of elements of array2");
        int n2 = sc.nextInt();
        int b[] = new int[n2];
        System.out.println("Enter array2 elements");
        for(int i =0;i<b.length;i++){
            b[i] = sc.nextInt();
        }
        System.out.println("Missing elements in array2:");
        for(int i = 0; i < n1 ; i++){
            int count = 0;
            for(int j = 0; j < n1 ; j++){
                if(a[i] == a[j]){
                    count++;
                }
            }
            for(int k = 0; k < n2 ; k++){
                if(a[i] == b[k]){
                    count--;
                }
            }
            if(count > 0){
                System.out.print(a[i]+" ");
            }
        }
    }
}


// Enter number of elements of array1
// 7
// Enter array1 elements
// 1 1 2 2 2 3 7
// Enter number of elements of array2
// 6
// Enter array2 elements
// 1 1 2 2 2 3
// Missing elements in array2:
// 7