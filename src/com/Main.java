package com;

import java.util.Scanner;

import com.service.Encoder;
import com.service.encoderImpl;

public class Main{



    public static void main(String[] args) 
    { 
    	encoderImpl encoderimpl = new encoderImpl();
    	Scanner leer = new Scanner(System.in);
    	System.out.println("Ingrese palabra: ");
    	String palabra=leer.nextLine();
    	encoderimpl.encode(palabra);
    		
    } 
  

} 


