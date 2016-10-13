import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Hugo Correia
 * Question 2
 */
public class PermutationsDiv8 {
	
	public void permutation(int a) {	
		int mod, x, y, z, result;
		boolean indicator = false;
		
		if (a == 8)
			indicator = true;
		
		List<Integer> list = new ArrayList<Integer>();
		while (a >= 1) {
			mod = a%10;
			a = (a - mod)/10;
			list.add(mod);
		}
		if(list.size() < 3)
			list.add(0);
		
		for (int j = 0; j< list.size(); j++) {
			for (int k = 0; k+2 < list.size(); k++){
				
				x = list.get(0);
				y = list.get(k+1);
				z = list.get(k+2);
				
				for (int i = 0; i < 3; i++) {
					result = x*100 + y*10 + z;
					if (result%8 == 0) {
						indicator = true;
						break;
					}else{
						a = y;
						y = z;
						z = a;
					}result = x*100 + y*10 + z;
					if (result%8 == 0) {
						indicator = true;
						break;
					}else{
						a = z;
						z = x;
						x = a;
					}
				}
							
			}
			list.remove(0);
	
		}
		if (indicator == true) {
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}


}
