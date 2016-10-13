import java.util.ArrayList;
import java.util.List;

/**
 * @author Hugo Correia
 * Question 3
 */
public class FourthBit {
	
	public static void fourthBit(int num){
		int mod = 0;
		List<Integer> list = new ArrayList<Integer>();
		while(num > 0){
			mod = num%2;
			num = num/2;
			list.add(0, mod);
		}
		if(mod==0)
			list.add(0, mod);
		
		System.out.println(list.get(3));	
	}

}
