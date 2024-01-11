package com.javaex.ex03;

import java.util.Iterator;

public class SoundApp {

    public static void main(String[] args) {
        printSound( new Cat() );
        printSound( new Dog() );
        printSound( new Sparrow() );
        printSound( new Duck() );
    }

    public static void printSound( Soundable soundable ) {
    	
    	//구현
    	System.out.println(soundable.sound());
    	
            	
    	/*Soundable C = new Cat();
    	Soundable Dg = new Dog();
    	Soundable S = new Sparrow();
    	Soundable DK = new Duck();
    	
    	
    	Soundable[] sArray = new Soundable[4];  
    	
    	sArray[0]= C ;
    	sArray[1]= Dg ;
    	sArray[2]= S ;
    	sArray[3]= DK ;
    	
    	for (int i = 0; i < sArray.length; i++) {
    		if (sArray[i]instanceof Soundable) {
    			System.out.println(((Soundable)sArray[i]).sound());
			}*/
			
		}
    	
    	
    }
    



