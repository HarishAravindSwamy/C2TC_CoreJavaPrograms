package com.tnsif.multithreading;

public class ThreadDemo {
     public static void main(String[] args) {
    	 ChildThread Threadone = new ChildThread(5,"First");
    	 ChildThread Threadtwo = new ChildThread(10,"second");
    	 
    	 Threadone.start();
    	 Threadtwo.start();
    	 
    	 System.out.println("------end------");
     }
}
