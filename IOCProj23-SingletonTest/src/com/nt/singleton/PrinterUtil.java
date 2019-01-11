package com.nt.singleton;

public  class PrinterUtil extends Clona implements Cloneable{
	  private static PrinterUtil  instance;
	   private PrinterUtil(){
		   System.out.println("PrinterUtil:0-param constructor");
	     }

	  public static  PrinterUtil  getInstance(){
	         if(instance==null) {
	        	 synchronized(PrinterUtil.class) {
	        		 if(instance==null) {
	        			 instance=new PrinterUtil();
	        		 }
	        	 }
	         }
			return instance;
	    }
	  }


