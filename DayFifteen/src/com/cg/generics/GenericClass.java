package com.cg.generics;

public class GenericClass<T> {
	private T t;

	void set(T t) {
		this.t = t;
	}

	T get() {
		return t;
	}
}
