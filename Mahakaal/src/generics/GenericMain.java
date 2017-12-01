package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericMain {

	
	public static void main(String [] args){
		Cat c = new Cat();
		Dog d = new Dog();
		Animal ac = new Cat();
		Animal ad = new Dog();
		
		List<Animal> la = new ArrayList<Animal>();
		la.add(ad);
		la.add(ac);
		la.add(c);
		la.add(d);
		
		List<Cat> lc = new ArrayList<Cat>();
		lc.add(c);
		method1(la);
		//method2(lc);
	}
	
	
	
	private  static void method1(List<Animal> la){
		 la.get(0).breathe();
	}
	
	private static void method1(Collection<?> lc){
		lc.clear();
		System.out.println("collection called");
	}
}
