package myPack;

import java.util.Scanner;

public class TestStack {

	public static void main(String[] args) {
		int size=1;
		String puspOrPup;
		FixedStack fixedStack = new FixedStack(1);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you want to push or pop ? : push/pop");
		puspOrPup = scanner.next();
		
		
		
		
		
		System.out.println("Enter value to push:");
		fixedStack.push(scanner.nextInt());
		
		
		
		System.out.println("Do you want to pop? y/n : ");
		String popValue=scanner.next();
		if(popValue.equals("y")){
		System.out.println(fixedStack.pop());}
		else {System.out.println("Wrong Input");}
			
		}
	}


