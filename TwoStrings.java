package com.strings;

public class TwoStrings {

	public static void main(String[] args) {
		
		System.out.println("isSumEqual "+isSumEqual1("acb","cba","zdb"));
	}
	
	 public static boolean isSumEqual1(String firstWord, String secondWord, String targetWord) {
	        int firstSum=0, secondSum=0, targetSum=0;
	        for(int i=firstWord.length()-1; i>=0; i--){
	            firstSum+=((int)firstWord.charAt(i)-'a');
	        }
	        System.out.println(firstSum);
	        for(int i=secondWord.length()-1;i>=0; i--){
	            secondSum+=((int)secondWord.charAt(i)-'a');
	        }
	        for(int i=targetWord.length()-1; i>=0; i--){
	            targetSum+=((int)targetWord.charAt(i)-'a');
	        }
	        return targetSum==(firstSum+secondSum);
	    }

	public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
		int carry = 0;
		for (int first = firstWord.length() -1, second = secondWord.length() - 1, target = targetWord.length() - 1; target >= 0; 
			 first--, second--, target--) {
			int sum = 0;
			if (first >= 0) {
					sum += firstWord.charAt(first) -'a';
			}
			if (second >= 0) {
				sum += secondWord.charAt(second)-'a';
				System.out.print("#");
				System.out.print(sum);
			}
			sum = sum + carry;
			carry = sum / 10;
			
			if (targetWord.charAt(target)-'a' != sum % 10) {
				return false;
			}
		}
		return carry == 0;
	}
}
