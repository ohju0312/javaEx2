package TestJava;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("근무시간:");
	int time = sc.nextInt();
	int pay;
	
	if (time  <12) {
		pay = time * 9620;
	
	} else {
		pay = time*12000;
		
	}
	//System.out.println("주휴수당은 " + 12000 + " 입니다");
	System.out.println("시급은"+pay);
	
	sc.close();
	
}
}