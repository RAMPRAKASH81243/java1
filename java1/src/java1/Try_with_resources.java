package java1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Try_with_resources{
    public static void main(String[] args) throws NumberFormatException ,IOException{   
    	
//    	int i=0;
//    	int j=0;
//    	try
//    	{
//    		j=18/i;
//    		
//    	}
//    	catch(Exception e)
//    	{
//    		System.out.println("Someting went wrong.");
//    		System.out.println("Bye");
//    	}
//    	finally
//    	{
//    		System.out.println("Bye");
//    		
//    	}
    	
    	
    	int num=0;
    	System.out.println("Enter the number");
    	//BufferedReader br=null;
    	try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
    	{
//    		InputStreamReader in =new InputStreamReader(System.in);
//    		BufferedReader br=new BufferedReader(in);
    		num=Integer.parseInt(br.readLine());
    		System.out.println(num);
    	}
    	finally
    	{
    		System.out.println("Bye");
    	}
    }
    
}
