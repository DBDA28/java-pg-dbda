package com.generic;

//generic class example
public class Holder<T> {
	private T ref;
	
	public Holder(T ref) {
		this.ref=ref;
	}//end of ctor

	public T getRef() {
		return ref;
	}//end of getter

	public void setRef(T ref) {
		this.ref = ref;
	}//end of setter
	
	

}
