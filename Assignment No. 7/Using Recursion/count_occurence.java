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
        System.out.println("Enter target");
        int target = sc.nextInt();
        int count= f(a,0,target);
        System.out.println("Count occurence of "+target+": "+count);
    }
    static int f(int a[],int index,int target){
        if(index == a.length){
            return 0;
        }
        int count = 0;
        if(a[index] == target){
            count++;
        }
        return count+f(a,index+1,target);
    }
}


// Enter number of elements of array
// 5
// Enter array elements
// 1 2 2 3 2
// Enter target
// 2
// Count occurence of 2: 3