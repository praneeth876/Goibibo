package com.PracticeSelenium;

import org.testng.annotations.Test;

public class Method1 {

	@Test
	public static void main1() {
		eliminate();
	}
	
	public static void eliminate() {
		String name1 = "aabbccdd";
		String newName = "";
		String name=name1+" ";
		for (int i = 0; i < name.length() - 1; i++) {
			int count = 0;
			for (int j = i + 1; j < name.length() -1; j++) {
				if ((name.charAt(i) == name.charAt(j))) {
					count++;
				}
			}
			if (!(count > 0)) {
				newName = newName + name.charAt(i);
			}
					}
		System.out.println(newName+"------------------------------------");
		}
		
	
}
	
	

