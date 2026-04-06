import java.util.*;
class second_max{
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
        int secondMax = Integer.MIN_VALUE;
        for(int i = 1; i < a.length; i++){
            if(a[i] > max){
                secondMax = max;
                max = a[i];
            } else if(a[i] > secondMax && a[i] != max){
                secondMax = a[i];
            }
        }
        if(secondMax == Integer.MIN_VALUE){
            System.out.println("There is no second maximum element in the array.");
        } else {
            System.out.println("Second maximum element in the array is: " + secondMax);
        }
    }
}


// Enter number of elements of array
// 5
// Enter array elements
// 10 5 8 20 15
// Second maximum element in the array is: 15