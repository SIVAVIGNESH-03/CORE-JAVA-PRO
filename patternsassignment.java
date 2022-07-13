package com.besant.assingments;

public class patternsassignment {
	public static void main(String[] args) {
		//prymid pattern//
		int n = 5;
	    for (int i = 0; i < n; i++) {
	      for (int j = 0; j < n - i - 1; j++) {
	        System.out.print(" ");
	      }
	      for (int k = 0; k < 2 * i + 1; k++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	    
	    //reverse prymid pattern//
	    int n1 = 5;
	    for (int i = 0; i < n1; i++) {
	      for (int j = 0; j < i; j++) {
	        System.out.print(" ");
	      }
	      for (int k = 0; k < 2 * (n1 - i) - 1; k++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
		
	    //dimond pattern//
	    int n2 = 5;
	    // upward pyramid
	    for (int i = 1; i <= n2; i++) {
	      for (int j = n2; j > i; j--) {
	        System.out.print(" ");
	      }
	      for (int k = 0; k < i * 2 - 1; k++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	    // downward pyramid
	    for (int i = 1; i <= n2 - 1; i++) {
	      for (int j = 0; j < i; j++) {
	        System.out.print(" ");
	      }
	      for (int k = (n2 - i) * 2 - 1; k > 0; k--) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	    
	    //hourglass pattern//
	    int size = 5;
	    //downward prymid 
	    for (int i = 0; i < size; i++) {
	      for (int j = 0; j < i; j++) {
	        System.out.print(" ");
	      }
	      for (int k = 0; k < (size - i) * 2 - 1; k++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	    //upward pyramid
	    for (int i = 2; i <= size; i++) {
	      for (int j = size; j > i; j--) {
	        System.out.print(" ");
	      }
	      for (int k = 0; k < i * 2 - 1; k++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	}
	
	}

