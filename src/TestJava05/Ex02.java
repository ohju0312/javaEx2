package TestJava05;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		//초기화 조건식 증각
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단:");
		
		int dan=sc.nextInt();
		
		int i =0;
		int time=1;
		
		while(i<9) {
			//System.out.println( dan+"*"+i+"="+dan*i);  
			System.out.println(  dan + "*" + time + "=" + dan*time  );
			time++;
			
			i++;
		}
		
		sc.close();
		
	}

}
