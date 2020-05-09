package org.kodluyoruz.questions.four;

public class QuestionFour {
	/*
	 * 
	 **
	 ***
	 ****
	 *****
	 ******
	 *******
	 ********
	 *********
	 **********
	 * ekran cıktısı
	 */

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < i; j++) {
				System.err.print("*");

			}
			System.err.println();
		}
	}
}
