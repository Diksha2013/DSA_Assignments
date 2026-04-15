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
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int i = 0; i < a.length; i++){
            freqMap.put(a[i], freqMap.getOrDefault(a[i], 0) + 1);
        }
        int maxFreq = 0;
        int secondMaxFreq = 0;
        int maxFreqElement = a[0];
        int secondMaxFreqElement = a[0];
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            int element = entry.getKey();
            int freq = entry.getValue();
            if(freq > maxFreq){
                secondMaxFreq = maxFreq;
                secondMaxFreqElement = maxFreqElement;
                maxFreq = freq;
                maxFreqElement = element;
            } else if(freq > secondMaxFreq && freq != maxFreq){
                secondMaxFreq = freq;
                secondMaxFreqElement = element;
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