package pkg.turnitin;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

public class CountFrequency {

	public static void main(String[] args) {
		
		String st = "the cat is in the bag";
        String [] arrOfStrings = st.split(" ");
        Map<String,Integer> map = new HashMap<>();
        
        PriorityQueue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arrOfStrings.length;i++){
            
            if(map.containsKey(arrOfStrings[i])){
                map.put(arrOfStrings[i], map.get(arrOfStrings[i])+1);
                queue.remove(map.get(arrOfStrings[i])+" "+arrOfStrings[i]);
            }else{
                map.put(arrOfStrings[i], 1);
            }
            queue.add(map.get(arrOfStrings[i])+" "+arrOfStrings[i]);
        }
        
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
}
