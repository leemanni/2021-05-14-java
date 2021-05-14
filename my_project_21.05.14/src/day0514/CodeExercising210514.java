package day0514;

import java.util.Scanner;

public class CodeExercising210514 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
	System.out.println("<계산기 만들기>");
	System.out.print("연산자를 입력하세요 :");
	String cla = sc.next();
	System.out.print("첫번째 숫자를 입력하세요 : ");
	double i1 = sc.nextDouble();
	System.out.print("두번째 숫자를 입력하세요 : ");
	double i2 = sc.nextDouble();
	
	
	
	if(cla.equals("+")) {
		System.out.println(i1 + "+"+  i2+ "= " + (i1+i2));
	}else
	if(cla.equals("-")) {
		System.out.println(i1 + "-"+  i2+ "= " + (i1-i2));
	}else
	if(cla.equals("*")) {
		System.out.println(i1 + "*"+  i2+ "= " + (i1*2));
	}else
	if(cla.equals("/")) {
		if(i2 ==0) {
			System.out.println("0은 나눌 수 없습니다");
		}else {
			System.out.println(i1+  i2+ "= " + (i1*i2));
		}
	}
	
	sc.close();
	
}
}



