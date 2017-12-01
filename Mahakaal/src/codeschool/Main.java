package codeschool;

import algo.Kadane;
import algo.PrefixArrayOfStrings;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[] = {-1,2,-3,4,-5,6,7,8,-9};
    
    String strs[] = {"abcdef","abcd","abc"};
	
   /* BubbleSort s = new BubbleSort();
     s.bubbleSort(a, a.length);
 
    QuickSort m = new QuickSort();
    m.quickSort(a, 0, a.length-1);

    for(int i=0;i<a.length;i++){
    	System.out.print(a[i]+ " ");
    }
    
    BinarySearch b = new BinarySearch();
    System.out.println(b.binarySearch(a,3));
    
    ListWithDuplicates lwd = new ListWithDuplicates();
    System.out.println(lwd.lastOccurence(a, 0, a.length-1, 6));
    
    
    //System.out.println();
    RotatedArray r = new RotatedArray();
    r.rotateArray(a, 3);
    for(int i=0;i<a.length;i++){
    	System.out.print(a[i]+ " ");
    }
    //System.out.println( r.searchRotated(a, 3));
    
    Kadane k = new Kadane();
    System.out.println(k.maxSum(a));*/
    
    PrefixArrayOfStrings p = new PrefixArrayOfStrings();
    System.out.println(p.prefixArrayOfString(strs));
   
}
}
