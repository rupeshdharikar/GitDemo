import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Nestedforloop {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hp = new HashMap<Integer, String>();
		hp.put(0, "Ramu");
		hp.put(1, "Shyam");
		hp.put(2, "Pawan");
		hp.put(3, "Rahul");
		System.out.println(hp.get(1));
		System.out.println(hp.get(2));	
		System.out.println(hp.get(3));	
		int [] a= {4,6,4,5,9,5,4,6,5};
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i = 0; i<a.length; i++) {
			int k= 0;
			if(!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				for(int j=i+1; j<a.length; j++) {
					if(a[i]==a[j]) {
					k++;
					}
				}
				System.out.println("The value of "+a[i]+ " is repeated: "+ k +" times" );
			}
			
		}
		}
}
//3
//6 9 
//12 15 18 

