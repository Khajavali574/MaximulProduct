/*
  This class is used to find maximal product of a set of positive integers whose sum is N.
  For example: Given 8, the result is 18 8 can be written as 2+2+2+2 whose product is 16. However, it can also be written as 3+3+2 whose product is 18.
  Author : Shaik Khajavali
*/
public class MaximalProduct {
	
	public static void main(String[] args) {
		MaximalProduct mp = new MaximalProduct();;
		System.out.println("Result : "+mp.maximalProduct(8));
	}
	
	public int maximalProduct(int n) {
		int ans = 1;
		if(n==2)return 1;
		else if(n==3)return 2;
		while(n>4) {
			ans*=3;
			n -=3;
		}
		return ans*n;
	}

}

