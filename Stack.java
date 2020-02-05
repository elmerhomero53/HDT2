/* 
 * Daniela Batz 19214
 * Jose Ramos 
 */

import java.util.Vector;

public abstract class Stack <T>{
	private Vector<T> vector = new Vector<T>();
	
	public void push(T element) { //apila cada uno de los elemntos
		 vector.add(element);
	}
	   
	 public T pop() {
		 T lastValue = vector.lastElement(); //retira el elemento que esta encima
		 vector.remove(vector.size()-1);
		 return lastValue;
	 }
    }
