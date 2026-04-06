import java.util.Scanner;
class max_element{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Maximum element in the array is: " + max);
    }
}


// Enter number of elements of array
// 4
// Enter array elements
// 3 9 1 7
// Maximum element in the array is: 9