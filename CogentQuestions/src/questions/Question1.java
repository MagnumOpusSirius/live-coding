package questions;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
    - given an array of integers:
    - write a method which can return the k most frequent elements
    [1,1,1,2,2,3] => [1,2]
 */
public class Question1 {
    public int[] kMostFrequentElement(int[] arr, int k){
        //get the freq of each elem
        Map<Integer, Integer> getFreq= new HashMap<>();

        //store elem as key and freq as val:
        for(int i=0; i< arr.length; i++){
            getFreq.put(arr[i], getFreq.getOrDefault(arr[i], 0)+1);
        }

        //store in descending order:
        PriorityQueue<Integer> maxHeap= new PriorityQueue<>((a,b)-> getFreq.get(b)-getFreq.get(a));

        //add the key values in PQ from Map:
        maxHeap.addAll(getFreq.keySet());

        int i=0;
        int[] output= new int[k];

        //get the k most frequent elements:
        while(i<k){
            output[i]= maxHeap.poll();
            i++;
        }
        return output;
    }

    public static void main(String[] args) {
        Question1 q1= new Question1();
        int[] arr= {1,1,1,2,2,3,3,3};
        int k=2;
        int[] output= q1.kMostFrequentElement(arr, k);
        for(int i=0; i<output.length; i++){
            System.out.println(output[i]);
        }
    }
}
