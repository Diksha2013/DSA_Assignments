import java.util.Scanner;
class check_all_are_unique{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        boolean result = f(a,0);
        System.out.println("All elements are unique: " + result);
    }
    static boolean f(int a[],int index){
        if(index == a.length){
            return true;
        }
        for(int i = index + 1; i < a.length; i++){
            if(a[index] == a[i]){
                return false;
            }
        }
        return f(a,index+1);
    }
}


// Enter number of elements of array
// 4
// Enter array elements
// 1 2 3 4
// All elements are unique: true