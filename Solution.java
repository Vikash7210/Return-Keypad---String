package com.java.problem;

public class Solution {
	static String []mapping={"","","abc","def","ghi","jkl","mno","prqs","tuv","wxyz"};
	public static String[] keypad(int n){
		
		if(n==0||n==1){
			return new String[0];
		}else if (n==7) {
			String [] str= {mapping[n].substring(0, 1),mapping[n].substring(1, 2),mapping[n].substring(2,3 ),mapping[n].substring(3,4)} ;
			return str;
		}else if (n==9){
			String [] str= {mapping[n].substring(0, 1),mapping[n].substring(1, 2),mapping[n].substring(2,3 ),mapping[n].substring(3,4)} ;
			return str;
		}
		else if (n<10) {
			String [] str= {mapping[n].substring(0, 1),mapping[n].substring(1, 2),mapping[n].substring(2,3 )} ;
			return str;
		}

		 String [] smallOutput=keypad(n/10);
		 
		String last[]=keypad(n%10);
		String ans[]=new String[smallOutput.length*last.length];
		int k=0;
		for (int i=0;i<smallOutput.length;i++){
			for (int j=0;j<last.length;j++){
		    ans[k]=smallOutput[i]+last[j];
			k++;
		}

		}
		return ans;
		}
}