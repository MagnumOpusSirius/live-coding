package questions.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Question1 {
    /*
    -> arr= [1,1,1,2,2,3,3,3,3] and k=2
    -> ans = [1,2]
    -> better than nlogn
     */
    public int[] mostFrequent(int[] arr, int k){
        //(key: element
        // value: freqcount)
        Map<Integer, Integer> newMap= new HashMap<>(); //O(n)

        for(int i=0; i< arr.length; i++){
            //loop through the array:
            //map.put(key,value)
            //map(1,get(1))
            newMap.put(arr[i], newMap.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(newMap);
        //we already have a key value stored in this map:
        //maxHeap to be in descending order

        PriorityQueue<Integer> pq = new PriorityQueue<>((x,y) -> newMap.get(y).compareTo(newMap.get(x))); //space:nlogn
        pq.addAll(newMap.keySet());

//        int i=0;
        int[] newArr= new int[k]; //time: nlog(k)
//
        for(int i=0; i<k; i++){
            newArr[i]= pq.poll();
        }
//        System.out.println(Arrays.toString(newArr));
        return newArr;
    }

    public static void main(String[] args) {
        Question1 q= new Question1();
        int[] arr= {1,1,1,2,3,3};
        int k= 2;
        System.out.println(Arrays.toString(q.mostFrequent(arr, k)));

    }
}
