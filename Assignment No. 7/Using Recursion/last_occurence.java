import java.util.*;
class last_occurence{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter target");
        int target = sc.nextInt();
        int index = f(a,0,target);
        System.out.println("Last occurence of "+target+": "+index);
    }
    static int f(int a[],int index,int target){
        if(index == a.length){
            return -1;
        }
        int right = f(a,index+1,target);
        if(right!=-1){
            return right;
        }
        if(a[index] == target){
            return index;
        }
        return -1;
    }
}


// Enter number of elements of array
// 5
// Enter array elements
// 5 2 3 2 4
// Enter target
// 2
// Last occurence of 2: 3