import java.util.*;
class second_highest_Frequency_element{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int max = 0;
        for(int i = 0; i < a.length; i++){
            max = Math.max(max, a[i]);
        }
        int freq[] = new int[max + 1];
        for(int i = 0; i < a.length; i++){
            freq[a[i]]++;
        }
        int maxFreq = 0;
        int secondMaxFreq = 0;
        int maxFreqElement = 0;
        int secondMaxFreqElement = 0;
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > maxFreq){
                secondMaxFreq = maxFreq;
                secondMaxFreqElement = maxFreqElement;
                maxFreq = freq[i];
                maxFreqElement = i;
            } else if(freq[i] > secondMaxFreq && freq[i] != maxFreq){
                secondMaxFreq = freq[i];
                secondMaxFreqElement = i;
            }
        }
        System.out.println("Second highest frequency element: " + secondMaxFreqElement);
    }
}


// Enter number of elements of array
// 8
// Enter array elements
// 1 2 2 3 3 3 4 4
// Second highest frequency element: 2