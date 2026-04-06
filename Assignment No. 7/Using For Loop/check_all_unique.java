import java.util.*;
class check_all_unique{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        boolean isUnique = true;
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i] == a[j]){
                    isUnique = false;
                    break;
                }
            }
            if(!isUnique){
                break;
            }
        }
        System.out.println("Array contains all unique elements: " + isUnique);
    }
}


// Enter number of elements of array
// 4
// Enter array elements
// 1 2 3 4
// Array contains all unique elements: true