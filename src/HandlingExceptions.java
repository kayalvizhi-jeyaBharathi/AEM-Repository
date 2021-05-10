import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class HandlingExceptions {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number 1:");
	int num1=sc.nextInt();
	System.out.println("Enter number 2:");
	int num2=sc.nextInt();
	
	//Arithmetic Exception
	try {
	int output=num1/num2;
	System.out.println("output:");
	System.out.println(output);
		}catch(ArithmeticException e) {
		System.out.println("If num1 divisible by 0 then arithmetic exception occurs");
	}
	//indexoutofboundException
	try{
		int number[]=new int[10];
		number[11]=20;
	}catch(IndexOutOfBoundsException e){
		System.out.println("when we try to access the index that does not exit will get a index out of bound exception");
	}finally {
		int a=6;
		int b=16;
		int c=a+b;
		System.out.println("addition output: " +c);
		System.out.println("Finally block excecuted");
	}
	//Null pointer exception
	try {
	String str=null;
	System.out.println(str.length());
	
	
	}catch (NullPointerException e) {
		System.out.println(e.getMessage());
	}
	//numberformatException
	try {
		int i=Integer.parseInt("kayal");
		System.out.println(i);
	}catch (NumberFormatException e) {
		System.out.println("When we try to convert string to an integer this exception occurs(number format exception)");
	}
	//throw exception
	try{
	      findFile();
	    } catch(IOException e){
	      System.out.println(e);
	    }
}
//throw and throws exception
	private static void findFile() throws FileNotFoundException {
		File newfile=new File("myfile.txt");
		FileInputStream Stream= new FileInputStream(newfile);
}
	
	
}

