package dataStructures;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args)
	{


		HashSet<String> hashBrownCasserole = new HashSet<String>();
		
		hashBrownCasserole.add("cheese");
		hashBrownCasserole.add("scallions");
		hashBrownCasserole.add("salt");
		hashBrownCasserole.add("pepper");
		hashBrownCasserole.add("mushrooms");
		
		
		int num = 0; 
		for(String item: hashBrownCasserole) {
			System.out.println( ++num + ". " + item.toUpperCase());
		}
		
		
	}
	

}
