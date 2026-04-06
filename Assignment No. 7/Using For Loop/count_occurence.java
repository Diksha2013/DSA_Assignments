import java.util.*;
class count_occurence{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to count its occurrences");
        int target = sc.nextInt();
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == target){
                count++;
            }
        }
        System.out.println("Number of occurrences of " + target + " is: " + count);
    }
}


// Enter number of elements of array
// 5
// Enter array elements
// 1 2 2 3 2
// Enter the element to count its occurrences
// 2
// Number of occurrences of 2 is: 3