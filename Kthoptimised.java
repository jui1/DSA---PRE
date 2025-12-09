import java.util.PriorityQueue;

public class Kthoptimised {
    public static void main(String[] args) {
        int nums[] = {56 , 78 09, -9};
        int k = 2;
      
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num : nums){
            minHeap.add(num);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }


  System.out.println(minHeap.peek());



      
    }
}
   