package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		System.out.println("출력되는 내용을 입력하세요.");
		System.out.print("기호 : ");
		
		Scanner sc = new Scanner(System.in);
		String sign = sc.nextLine();
		
		
		System.out.print("숫자1 : ");
		double x  = sc.nextDouble();
		
		sc.nextLine();
		System.out.print("숫자2 : ");
		double y  = sc.nextDouble();
		sc.close();
		
		
		switch (sign) {
		case "+":
			System.out.println("결과는 : " + (x + y));
			break;
		case "-":
			System.out.println("결과는 : " + (x - y));
			break;
		case "*":
			System.out.println("결과는 : " + (x * y));
			break;
		case "/":
			if(x == 0 || y == 0) {
				System.out.println("계산할 수 없습니다.");
				break;
			}else {
				/*
				 * if(x > y) { System.out.println("결과는 : " + (x / y));
				 * }else{
				 * System.out.println("결과는 : " + (y / x)); }
				 *///작은 값에서 큰값을 나눌수도 있으므로.
				System.out.println("결과는 : " + (x / y));
				break;
			}
			
		default:
			System.out.println("계산할 수 없는 기호입니다.");
			break;
		}
		
		
		
		
	}
}
