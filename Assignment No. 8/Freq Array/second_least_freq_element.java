import java.util.*;
class second_least_freq_element{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int max = 0;
        for(int i = 0; i < n ; i++){
            max = Math.max(max, a[i]);
        }
        int freq[] = new int[max + 1];
        for(int i = 0; i < n ; i++){
            freq[a[i]]++;
        }
        
        int minFreq = a.length;
        int secondMinFreq = a.length;
        int secondMinFreqElement = -1;
        int minFreqElement = -1;
        for(int i = 0; i <= max; i++){
            if(freq[i] > 0){
                if(freq[i] < minFreq){
                    secondMinFreq = minFreq;
                    secondMinFreqElement = minFreqElement;
                    minFreq = freq[i];
                    minFreqElement = i;
                } else if(freq[i] < secondMinFreq && freq[i] != minFreq){
                    secondMinFreq = freq[i];
                    secondMinFreqElement = i;
                }
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