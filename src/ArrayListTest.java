
/**
 * @author Chuyang Zhong
 * For testing purpose only.
 *
 */
public class ArrayListTest {


	public static <T> void main(String[] args) {
		//create a arraylist object using constructor
		ArrayList al = new ArrayList(3);
		//add items to arraylist
		al.add(1,0);
		al.add(2,1);
		al.add(3,2);
		//Test isEmpty function
		System.out.println(al.isEmpty());
		//print arraylist
		//Test get function
		for(int i =0;i<al.size();i++) {
			System.out.print(al.get(i));
		}
		System.out.println();
		//Test insert that require regrow and shift 
		al.add(4, 3);
		//case append that not require shift
		//al.add(4,3)
		for(int i =0;i<al.size();i++) {
			System.out.print(al.get(i));
		}
		System.out.println();
		//Test contains function
		System.out.println(al.contains(4));
		//Test indexOf function
		System.out.println(al.indexOf(4));
		//Test clear function
		al.clear();
		System.out.println(al.size());
		//Test isEmpty function
		System.out.println(al.isEmpty());

		
	}
}
