import java.util.*;
class check_all_are_even{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        boolean isEven = true;
        for(int i = 0; i < a.length; i++){
            if(a[i]%2!=0){
                isEven = false;
                break;
            }
        }
        System.out.println("All elements are even: " + isEven);
    }
}



// Enter number of elements of array
// 3
// Enter array elements
// 2 4 6
// All elements are even: true