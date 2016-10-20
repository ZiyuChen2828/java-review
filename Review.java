
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Review {
	
	public int solution(){
		return 0;
		
	}
	
	public static void main(String[] args){
		
		// array，use length
		System.out.println("int array ****************");
		int count[] = {34, 22,10,60,30,22};
		int count2[] = new int[3]; // ini to 0
		int count3[] = new int[] {40,50,60,71,80,90,9};
		int numString[] = {'a', 's', 'i'};
		System.out.println(numString.length);
		System.out.println(numString[0]);
		System.out.println(count2.length);
		System.out.println(count2[0]);
		System.out.println(count3.length);
		System.out.println("char and string array ****************");
		char charArray[] = {'a', 's', 'i'};
		String strArray[] = {"a", "s", "i"};
		String strArray2[] = new String[3];
		String strArray3[] = new String[] {"aasd", "s112", "i.asd,a."};
		System.out.println(charArray);
		System.out.println(strArray.toString());
		System.out.println(strArray2[0]); // initialize to null
		System.out.println(strArray3[2]);
		
		// set
		System.out.println("set ****************");
		Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < 5; i++) {
            set.add(count[i]);
        }
        set.add(1);
        System.out.println(set.contains(1));
        Set<Integer> set2 = new HashSet<Integer>(set);
		System.out.println(set2);
		TreeSet sortedSet = new TreeSet<Integer>(set); // sorted
		System.out.println(sortedSet);
		
		// string
		System.out.println("string ****************");
		int num = 67123461;
		String str = "ddd12sada";
		str = str.replaceAll("[a-zA-z]", "");
		System.out.println(str.length());
		// string to int
		System.out.println(Integer.parseInt(str));
		System.out.println(Integer.valueOf(str));
		// int to string
		
		
	}
}


//length --- arrays (int[], double[], String[]) ---- to know the length of the arrays.
//length() --- String related Object (String, StringBuilder etc)to know the length of the String
//size() --- Collection Object (ArrayList, Set etc)to know the size of the Collection

// A Set is a Collection that cannot contain duplicate elements. It models the mathematical set abstraction. 
//Set<Integer> set = new HashSet<Integer>(); TreeSet sortedSet = new TreeSet<Integer>(set);