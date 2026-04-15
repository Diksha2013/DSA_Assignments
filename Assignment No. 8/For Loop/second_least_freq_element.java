import java.util.*;
class most_freq_char_in_string{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int minFreq = a.length;
        int secondMinFreq = a.length;
        int secondMinFreqElement = -1;
        int minFreqElement = -1;
        for(int i = 0; i < n ; i++){
            int count = 0;
            for(int j = 0;j < n ;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count < minFreq){
                secondMinFreq = minFreq;
                secondMinFreqElement = minFreqElement;
                minFreq = count;
                minFreqElement = a[i];
            } else if(count < secondMinFreq && count != minFreq){
                secondMinFreq = count;
                secondMinFreqElement = a[i];
            }
        }
        System.out.println("Second least frequent element: " + secondMinFreqElement);

    }
}


// Enter a number of elements of array
// 6
// Enter array elements
// 1 1 2 2 2 3
// Second least frequent element: 1