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
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int i = 0; i < n ; i++){
            freqMap.put(a[i], freqMap.getOrDefault(a[i], 0) + 1);
        }
        int minFreq = a.length;
        int secondMinFreq = a.length;
        int secondMinFreqElement = -1;
        int minFreqElement = -1;
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            int element = entry.getKey();
            int freq = entry.getValue();
            if(freq < minFreq){
                secondMinFreq = minFreq;
                secondMinFreqElement = minFreqElement;
                minFreq = freq;
                minFreqElement = element;
            } else if(freq < secondMinFreq && freq != minFreq){
                secondMinFreq = freq;
                secondMinFreqElement = element;
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