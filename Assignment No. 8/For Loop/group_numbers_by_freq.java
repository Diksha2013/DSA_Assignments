import java.util.*;
class group_number_by_freq{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i<n ;i++){
            int count = 0;
            for(int j =0;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            System.out.println(a[i] + "," + count);
        }
    }
}


// Enter number of elements of array
// 7
// Enter array elements
// 1 1 2 2 3 4 4
// 1,2
// 1,2
// 2,2
// 2,2
// 3,1
// 4,2
// 4,2