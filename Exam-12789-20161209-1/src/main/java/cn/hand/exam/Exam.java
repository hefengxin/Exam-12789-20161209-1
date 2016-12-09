package cn.hand.exam;

public class Exam {
	
	
	 public static void main(String[] args) {
		  int count=0;
		  for(int j = 101; j <= 200; j++) {
			   if(Exam.isPrime(j)) {
			    count++;
			   }
		  } 
		  System.out.print("101~200间总共有"+count+"个素数   分别为：  ");
		  for(int j = 101; j <= 200; j++) {
			   if(Exam.isPrime(j)) {
				   System.out.print(j+",");
			   }
		  }
	 }
	 public static boolean isPrime(int j) { 
		  for(int i = 2; i <= Math.sqrt(j); i++) {
			   if(j % i == 0) {
			    return false;
			   }
		  	}
		  return true;
		 }
	}
