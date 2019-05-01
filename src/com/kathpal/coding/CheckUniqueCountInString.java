package com.kathpal.coding;

public class CheckUniqueCountInString {
	public static void main(String[] args) {
		System.out.println(IsUniqueCount("LISBISO", "IISOSLB"));
	}

	private static boolean IsUniqueCount(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}

		int uniqueCharInA = 0;
		int uniqueCharsInB = 0;

		int[] arrayToHoldCountOfUniChars = new int[256];
		for (char charA : a.toCharArray()) {
			if (arrayToHoldCountOfUniChars[charA] == 0) {
				uniqueCharInA++;
			}
			arrayToHoldCountOfUniChars[charA]++;
		}

			int i = 0;
			for (char charB : b.toCharArray()) {
				i++;
				if (arrayToHoldCountOfUniChars[charB] == 0) {
					return false;
				}
				arrayToHoldCountOfUniChars[charB]--;
				if (arrayToHoldCountOfUniChars[charB] == 0) {
					uniqueCharsInB++;
				}
				if (uniqueCharInA == uniqueCharsInB) {
					return i == b.length();
				}
			}
		
		return false;
	}
}
