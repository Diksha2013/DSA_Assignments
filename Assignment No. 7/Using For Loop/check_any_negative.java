import java.util.Scanner;
class check_any_negative{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        boolean hasNegative = false;
        for(int i = 0; i < a.length; i++){
            if(a[i] < 0){
                hasNegative = true;
                break;
            }
        }
        System.out.println("Array contains negative element: " + hasNegative);
    }
}


// Enter number of elements of array
// 4
// Enter array elements
// 1 2 -3 4
// Array contains negative element: true