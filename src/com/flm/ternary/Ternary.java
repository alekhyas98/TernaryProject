package com.flm.ternary;



public class Ternary {
	public static void main(String[] args) {
		int marks=95;
		String grade=marks>90?"Grade A":
			marks>70 && marks<=90?"Grade B":
				marks>50 && marks<=70 ? "Grade C":"Fail";
		System.out.println("Input:"+marks+"->"+"Output:"+grade);
		
	}
}
