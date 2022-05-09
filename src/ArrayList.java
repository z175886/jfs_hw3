/**
 * @author Chuyang Zhong
 *
 * @param <T> the type of elements in this list
 */
public class ArrayList<T> implements List<T> {
	private static final int DEFAULT_INITIAL_CAPACITY = 11;//default capacity.
	private T[] data;//This stores the items added to the List
	private int size;//This keeps track of how many items have been added to the List
	//data = (T[]) new Object[length]; //instantiate a generic array

	/**
	 * Constructs an ArrayList using the default capacity
	 */
	public ArrayList() {
	
		size=0;
		data = (T[]) new Object[DEFAULT_INITIAL_CAPACITY];
	}

	/**
	 * Constructs an ArrayList with an 'initialCapacity'
	 * 
	 * If 'initalCapacity' is non-positive use the default capacity
	 * 
	 * @param initialCapacity
	 */
	public ArrayList(int initialCapacity) {
		if(initialCapacity<=0) {
			data = (T[]) new Object[DEFAULT_INITIAL_CAPACITY];}
		else {
			data = (T[]) new Object[initialCapacity];
			}
		}

	@Override
	public void add(T item, int index) {
		if(index>=0 && index<=size) {
		if(size+1>data.length) {//case exceed capacity
			regrow();
		}
		if(index<size) {//case need shifting
			shift(index);
			
		}
		data[index]=item;
		size+=1;
		}

	}

	@Override
	public void clear() {//Removes all of the elements from this list.
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++) {
			data[i]=null;
		}
		size=0;
		
	}

	@Override
	public boolean contains(Object item) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++) {
			if(data[i]==item) {
				return true;
			}
		}
		return false;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		if(data[index]!=null) {
			return data[index];
		}
		return null;
	}

	@Override
	public int indexOf(Object item) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++) {
			if(data[i]==item) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean isEmpty() {
		for(int i=0;i<size;i++) {
			if(data[i]!=null) 
				return false;
		}
		return true;
		}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;

	}
	/**
	 * 
	 */
	private void regrow() {
		T[] temp = (T[]) new Object[size*2];
		for (int i = 0 ;i<size;i++) {
			temp[i]=data[i];
	}
		data=temp;
}
	/**
	 * shift down part of the array that after the given index by one
	 * @param index where new element will insert to
	 */
	private void shift(int index) {
		for (int i = size ;i>index;i--) {
			 data[i]=data[i-1];
		}
	}
	}

