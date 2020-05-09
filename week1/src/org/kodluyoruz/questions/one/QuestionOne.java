package org.kodluyoruz.questions.one;

import java.util.Scanner;

public class QuestionOne {
	/*
	 * Question One
	 * 
	 * String tipinde sabit bir şifre değişkeni oluşturun. Örneğin: String password
	 * = "12345"; gibi. Ardından, kullanıcıdan klavyeden bir şifre girmesini
	 * isteyin. Girilen şifre ile değişkende tuttuğunuz değeri kıyaslayın. Eğer, iki
	 * değer birbirine eşitse ekrana "Giriş Başarılı!", değilse "Giriş Başarısız"
	 * yazdırın.
	 * 
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.print("Enter Password :");
		String password = scanner.nextLine();
		// boş olup olmadıgının kontrolu
		if (validatePassword(password)) {
			// şifrenin aynı olup olmadıgının kontrolu
			if (checkPassword(password)) {
				System.err.println("Login Succesful !");
			} else {
				System.err.println("Password Incorrect");
			}
		} else {
			System.err.println("Password cannot be empty !");
		}
	}

	/*
	 * @param password
	 * 
	 * dışarıdan sifrenin boş olma ihtimalini kontrol eder
	 */
	static boolean validatePassword(String password) {
		if (password == null || " ".equals(password)) {
			return false;
		} else
			return true;
	}

	/*
	 * @param password
	 * 
	 * dışarıdan verilen şifrenin aynı olup olmadıgını kontrol eder
	 * 
	 * not : String tipte equals -> ( == ) tanımıyla aynı işi yapar
	 */
	static boolean checkPassword(String password) {
		String defaultPassword = "12345";
		if (defaultPassword.equals(password))
			return true;
		else
			return false;
	}

}
