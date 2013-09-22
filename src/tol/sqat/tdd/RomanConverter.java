package tol.sqat.tdd;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class RomanConverter {
	private LinkedHashMap<String, Integer> table;
	public RomanConverter () {
		this.table= new LinkedHashMap<String, Integer>();
		table.put("X",10);
		table.put("IX",9);
		table.put("V",5);
		table.put("IV",4);
		table.put("I",1);
	}
	//private static final int[] VALUES = {1000, 900, 500, 400, 100, 90, 50, 40,10,9,5,4,1};
	//private static final String[] SYMBOLS = {"M", "CM", "D", "CD", "C", "XC", "X", "IX", "V", "IV", "I"};

	public String toRoman(int arab) {

		StringBuilder roman = new StringBuilder();
		int left = arab;
//		left = appendRoman(left, 10, "X", roman);
//		left = appendRoman(left, 9, "IX", roman);
//		left = appendRoman(left, 5, "V", roman);
//		left = appendRoman(left, 4, "IV", roman);
		for (Entry<String, Integer> entry : table.entrySet()) {
			left = appendRoman(left, entry.getValue(), entry.getKey(), roman);
		}
		return roman.toString();
	}
	//abstract the behaviour of the ifs conditionals in a general function appendRoman
	//change roman from String to StringBuilder in order to avoid the problem of passing parameter by reference in Java
	//call the appendRoman function over all the symbol-value pairs. It can be done using two paired array, an hashmap or other solutions.
	//The line 100 can be re-written as a while loop, as well as line 77 for loop. the two are the same so we can eliminate the latter and introduce 
	//the I symbol and 1 value in the table hashmap.

	//if(arab>10){
	//roman += "X";
	//arab-=10;
	//}
	
	
	//if(arab==9){
	//roman += "XIII";
	//arab-=13;
	//}
	//if(arab==9){
	//roman += "XII";
	//arab-=12;
	//}
	//if(arab==9){
	//roman += "XI";
	//arab-=11;
	//}
	//if(arab==10){
	//roman += "X";
	//arab-=10;
	//}

	//if(arab==9){
	//roman += "IX";
	//arab-=9;
	//}

	//if(arab>=5){
	//roman+="VI";
	//arab-=5;
	//}	

	//if(arab==8) roman = "VIII";
	//else if(arab==7) roman = "VII"
	//else if(arab==6) roman = "VI"
	//if(arab==5) roman = "V"	
	// else
	//if(arab==4) roman ="IV";	
	//else {
	//	for (int i = 0; i < arab; i++) {
	//	roman+="I"; 
	//}	
	//}	


	// if(arab == 3) roman == "III";	
	//	else if(arab==2) roman="II";
	//	else roman="I";
	//	return roman;

	//	String roman = "";
	//	if(arab==2) roman="II";
	//	else roman="I";
	//	return roman;


	//	if(arab==1) return "I";
	//	else return "II";

	//	return "I";
	private static int appendRoman(int arab, int arabValue, String romanValue, StringBuilder roman) {
		int result= arab;
//		if(result>=arabValue)
		while(result>=arabValue) {
			roman.append(romanValue);
			result-=arabValue;
		}
		return result;

	}

}
