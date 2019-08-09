package com.fundebug;

/**
 * @author xushuanglu
 */
public class Test {
	
	public static void main(String[] args) {
		Fundebug fundebug = new Fundebug("5cdb836744074efd6338baa87a651379c3dc081e09d5ea9800ef544c9086035a");
		fundebug.notify("TEST", "Hello, Fundebug!");
		System.out.println("Hello, World");
	}
}
