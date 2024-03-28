package com.PracticeSelenium;

public class SandhyaTask1 {

	public static void main(String[] args) {

		text();
		value();
	}

	public static void text() {

		String temp = "a*#b*%_z*c$"; // c z b a
		String temp1 = "";
		String temp2 = "";
		String temp3 = "";
		String temp4 = "";

		for (int i = 0; i < temp.length(); i++) {

			if (temp.charAt(i) == 'a') {
				temp1 = temp.replace(temp.charAt(i), 'l');
			}
			if (temp.charAt(i) == 'b') {
				temp2 = temp1.replace(temp.charAt(i), 'm');
			}
			if (temp.charAt(i) == 'z') {
				temp3 = temp2.replace(temp.charAt(i), 'n');
			}
			if (temp.charAt(i) == 'c') {
				temp4 = temp3.replace(temp.charAt(i), 'o');
			}

		}

		String res = "";
		for (int i = 0; i < temp4.length(); i++) {

			if (temp4.charAt(i) == 'l') {
				temp1 = temp4.replace(temp4.charAt(i), 'c');
			}
			if (temp4.charAt(i) == 'm') {
				temp2 = temp1.replace(temp4.charAt(i), 'z');
			}
			if (temp4.charAt(i) == 'n') {
				temp3 = temp2.replace(temp4.charAt(i), 'b');
			}
			if (temp4.charAt(i) == 'o') {
				res = temp3.replace(temp4.charAt(i), 'a');
			}

		}
		System.out.println("Input : " + temp);
		System.out.println("Output : " + res);
	}

	public static void value() {
		String s = "a*#b*%_z*c$";
		char[] ch = s.toCharArray();
		int left = 0;
		int right = s.length() - 1;
		for (int i = 0; i < ch.length; i++) {
			if (ch[left] >= 'a' && ch[left] <= 'z') {
				if (ch[right] >= 'a' && ch[right] <= 'z') {
					if (left < right) {
						char temp = ch[left];
						ch[left] = ch[right];
						ch[right] = temp;
						left++;
						right--;
					}
				} else {
					right--;
				}
			}

			else {
				left++;
			}
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}

}
