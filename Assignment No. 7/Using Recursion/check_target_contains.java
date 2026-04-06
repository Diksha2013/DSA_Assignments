import java.util.Scanner;
class check_target_contains{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter element of array");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter target element");
        int target = sc.nextInt();
        boolean contains = f(a,0,target);
        System.out.println("Does array contain target element: "+contains);
    }
    static boolean f(int a[],int index,int target){
        if(index == a.length){
            return false;
        }
        if(a[index] == target){
            return true;
        }
        return f(a,index+1,target);
    }
}

// Enter number of elements of array
// 5
// Enter element of array
// 1 2 3 4 5
// Enter target element
// 3
// Does array contain target element: true


