package com.Arrays;

import java.util.Arrays;

import org.apache.poi.hpsf.Array;

public class SingleDimensional {

	
public static void main(String[] args) {
	
	//char Array
char[] ch= {'R','E','D','D','Y'};
	
	char [] Char= new char[5];
	
	Char[0]='P';
	Char[1]='R';
	Char[2]='A';
	Char[3]='N';
	Char[4]='E';
	
	
	for(int i=0;i<ch.length;i++) {
	//	System.out.println(ch[i]);
	}
	


String [] str=new String[3];

str[0]="K";
str[1]="Praneeth";
str[2]="Reddy";

for(int j=0;j<str.length;j++) {
	//System.out.println(str[j]);
}

System.out.println(Char);
Arrays.sort(Char);
//Arrays.asList(Char);

System.out.println(Arrays.compare(ch, Char));
System.out.println(Char);
String a=Arrays.toString(str);
System.out.println(a);
Arrays.equals(Char, ch);
System.out.println(Arrays.equals(Char, ch));
}



}