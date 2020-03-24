package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	
	
	ArrayList<T> arrLst = new ArrayList<T>(); 

	public ArrayList() {
		
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return arrLst.get(loc);
	}
	
	public void add(T val) {
		arrLst.add(val);
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		arrLst.insert(loc, val);
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		arrLst.set(loc, val);
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		arrLst.remove(loc);
	}
	
	public boolean contains(T val) {
		return arrLst.contains(val);
	}
}