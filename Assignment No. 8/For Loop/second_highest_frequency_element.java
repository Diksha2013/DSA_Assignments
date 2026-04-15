import java.util.*;
class second_highest_frequency_element{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int maxFreq = 0;
        int secondMaxFreq = 0;
        int maxFreqElement = a[0];
        int secondMaxFreqElement = a[0];
        for(int i = 0; i < a.length; i++){
            int freq = 1;
            for(int j = i + 1; j < a.length; j++){
                if(a[i] == a[j]){
                    freq++;
                }
            }
            if(freq > maxFreq){
                secondMaxFreq = maxFreq;
                secondMaxFreqElement = maxFreqElement;
                maxFreq = freq;
                maxFreqElement = a[i];
            } else if(freq > secondMaxFreq && freq != maxFreq){
                secondMaxFreq = freq;
                secondMaxFreqElement = a[i];
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