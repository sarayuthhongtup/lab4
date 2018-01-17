package rmuti.lab4;

import java.util.ArrayList;

public class ArrayListStack {

	private ArrayList lst;
	
	public ArraylistStack() {
		lst = new ArrayList();
	}
	
	public void push(Object e) {
		lst.add(e);
		
	}
	
	public Object pop() {
		Object obj = peek();
		lst.remove(lst.size()-1);
		return obj;
	}
	
	@Override
	public String toString() {
		return lst.toString();
	    }
	}