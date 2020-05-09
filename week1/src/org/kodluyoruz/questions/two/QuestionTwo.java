package org.kodluyoruz.questions.two;

import java.util.Scanner;

public class QuestionTwo {
	/*
	 * 
	 * Kullanıcının konsol ekrandan 4 temel matematiksel işlemi yapabildiği bir
	 * program yazmanız bekleniyor. Program aşağıdaki özellikleri sağlamalıdır.
	 * 
	 * Yapılabilecek temel işlemler: Toplama, Çıkarma, Çarpma, Bölme Kullanıcıya 4
	 * işlemden birini seçeceği menüyü konsol ekrana yazdırın. Örneğin: 1-Toplama,
	 * 2-Çıkarma vb... Ardından kullanıcıdan 2 adet tamsayı tipinde sayı girmesini
	 * isteyin. Bu girilen iki sayıyı değişkenlerde saklayın. Seçilen işlem tipine
	 * göre matematiksel işlemi yapın ve konsol ekranına yazdırın.
	 * 
	 * 
	 */
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.err.print("Tam sayı girin :");
		int numberOne = scanner.nextInt();
		System.err.print("Tam sayı girin :");
		int numberTwo = scanner.nextInt();
		System.err.println("Toplama işlemi = 1");
		System.err.println("Çıkartma işlemi = 2");
		System.err.println("Çarpma işlemi = 3");
		System.err.println("Bölme işlemi = 4");

		System.err.print("Oparator belirtin :");
		byte operation = scanner.nextByte();

		switch (operation) {
		case 1:
			System.err.println("Resut : " + addition(numberOne, numberTwo));
			break;
		case 2:
			System.err.println("Resut : " + multiplication(numberOne, numberTwo));
			break;
		case 3:
			System.err.println("Resut : " + extraction(numberOne, numberTwo));
			break;
		case 4:
			System.err.println("Resut : " + division(numberOne, numberTwo));
			break;
		default:
			System.err.println("Invalid operator");
			break;
		}
	}

	static void fourAlternativeProcedures() {
		System.err.print("Tam sayı girin :");
		int numberOne = scanner.nextInt();
		System.err.print("Tam sayı girin :");
		int numberTwo = scanner.nextInt();

		System.err.print("Oparator belirtin :");
		String operation = scanner.nextLine();

		// + - * / yi okuyup ona göre işlem seçer
		switch (operation) {
		case "+":
			System.err.println("Resut : " + addition(numberOne, numberTwo));
			break;
		case "-":
			System.err.println("Resut : " + multiplication(numberOne, numberTwo));
			break;
		case "x":
			System.err.println("Resut : " + extraction(numberOne, numberTwo));
			break;
		case "/":
			System.err.println("Resut : " + division(numberOne, numberTwo));
			break;
		default:
			System.err.println("Invalid operator");
			break;
		}
	}

	/*
	 * dışarıdan gelen 2 tam sayıyı toplar
	 */
	static int addition(int numberOne, int numberTwo) {
		return numberOne + numberTwo;
	}

	/*
	 * dışarıdan gelen 2 tam sayıyı cıkartır
	 */
	static int multiplication(int numberOne, int numberTwo) {
		return numberOne - numberTwo;
	}

	/*
	 * dışarıdan gelen 2 tam sayıyı çarpar
	 */
	static int extraction(int numberOne, int numberTwo) {
		return numberOne * numberTwo;
	}

	/*
	 * dışarıdan gelen 2 tam sayıyı böler
	 * 
	 */
	static Double division(int numberOne, int numberTwo) {
		return (double) (numberOne / numberTwo);
	}

}
