

import java.io.IOException;
import java.io.ObjectOutputStream;

import algo.CoinChange;
import algo.Kadane;
import algo.MinimumCostPath;
import algo.SubArraySum;
import codeschool.ListWithDuplicates;
import general.HCF;
import general.RemoveDuplicateArray;
import general.SegregateZeroAndOne;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   // int a[] = { 1,2,3,4,4,6,7 };
	
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
    System.out.println(k.maxSum(a));
    
    HCF hcf = new HCF();
    System.out.println(hcf.hcf(12l, 18l));
    
 
    
    SubArraySum sum = new SubArraySum();
    sum.subArraySum_1(a, 55);
    
    RemoveDuplicateArray rda = new RemoveDuplicateArray();
    rda.removeDuplicate(a);
    
		int[][] a = { { 1, 7, 9, 2 }, { 8, 6, 3, 2 }, { 1, 6, 7, 8 },
				{ 2, 9, 8, 2 } };
   MinimumCostPath mcp = new MinimumCostPath();
   System.out.println(mcp.minimumCostPath(a));
		int a[] = {1,0,0,1,0,1,0,1,0};
		SegregateZeroAndOne s  = new SegregateZeroAndOne();
		s.segregateZeroAndOne(a);
		
		int a[] = { 1,2,2,2,4,6,7 };
		ListWithDuplicates l = new ListWithDuplicates();
		System.out.println(l.firstOccurence(a, 0, a.length-1,2));*/
		int[] a = new int[] { 1, 3, 5, 7 };
		int val = 10;
		   CoinChange c = new CoinChange();
		    System.out.println(c.minCoinChange(a,val));
   
}
}
