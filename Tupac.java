package tests;

import java.util.Scanner;

public class Tupac {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index");
		
		int lim = sc.nextInt() , dig , itw , rem , len;
		String num = "1", newt = "";
		
		for(int i = 1 ; i <= lim ; i++){
			
			newt = "";
			num = "0" + num;
			len = num.length() -1 ;
			rem = 0;
			
			while(len >= 0){
				dig = Integer.parseInt(num.substring(len, len+1));
				itw = dig * 2;
				newt = (itw % 10+ rem) + newt;
				len--;

				rem = itw / 10;
			}
			
			if(newt.charAt(0)=='0')
				num = newt.substring(1);																	
			else
				num = newt;
			System.out.println(i+"\t\t\t:\t\t\t\t"+num);
		}
		
		
		System.out.println(num);

		Tupac.main(null);
	}


}
