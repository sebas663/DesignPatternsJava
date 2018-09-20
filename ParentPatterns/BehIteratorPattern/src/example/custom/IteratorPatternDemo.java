package example.custom;

import example.custom.container.NameRepository;
import example.custom.iterator.CustomIterator;

public class IteratorPatternDemo {
	 public static void main(String[] args) {
	      NameRepository namesRepository = new NameRepository();

	      for(CustomIterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 	
	   }
}
