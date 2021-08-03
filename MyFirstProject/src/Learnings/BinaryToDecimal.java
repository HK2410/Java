package Learnings;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int bin = 1000;
		double dec = 0;
		int i = 0;
		while(bin>0) {
		int rem = bin%10;
		dec = dec +(rem*Math.pow(2,i));
		bin = bin/10;
		i++;

	}
System.out.println(dec);
}}
