import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DuplicateArray {

	
	public void findAndPrint(){
		int [] arr = {1,1,12,13,14,14,13,19,8,8};
		int count = 10;
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<count;i++){
		  if(!set.add(arr[i])){
			  list.add(arr[i]);
		  }
		}
		Collections.sort(list);
		
		for(Integer num:list){
			System.out.println(num);
		}
	}
	
	
	public static void main(String args[]){
		DuplicateArray d = new DuplicateArray();
		d.findAndPrint();
	}
	
	
	
}
