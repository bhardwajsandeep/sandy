package general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class Test {
	  public static void main (String[] args) {
	    System.out.println(Integer.valueOf(5000) == Integer.valueOf(5000));
	    System.out.println(Integer.valueOf(5000) == new Integer(5000));
	    System.out.println(Integer.valueOf(5000) == 5000);
	    System.out.println(new Integer(5000) == Integer.valueOf(5000));
	    System.out.println(new Integer(5000) == new Integer(5000));
	    System.out.println(new Integer(5000) == 5000);
	    System.out.println(5000 == Integer.valueOf(5000));
	    System.out.println(5000 == new Integer(5000));
	    System.out.println(5000 == 5000);
	    System.out.println("=====");
	    System.out.println(Integer.valueOf(5) == Integer.valueOf(5));
	    System.out.println(Integer.valueOf(5) == new Integer(5));
	    System.out.println(Integer.valueOf(5) == 5);
	    System.out.println(new Integer(5) == Integer.valueOf(5));
	    System.out.println(new Integer(5) == new Integer(5));
	    System.out.println(new Integer(5) == 5);
	    System.out.println(5 == Integer.valueOf(5));
	    System.out.println(5 == new Integer(5));
	    System.out.println(5 == 5);
	    System.out.println("=====");
	    test(5000, 5000);
	    test(5, 5);
	    Collections.synchronizedList(new ArrayList<String>());
	    AtomicInteger ai = new AtomicInteger();
	    ArrayList<String> s = null;
	    LinkedList<String> s1 = null;
	  }
	  public static void test (Integer a, Integer b) {
	    System.out.println(a == b);
	  }
	}
