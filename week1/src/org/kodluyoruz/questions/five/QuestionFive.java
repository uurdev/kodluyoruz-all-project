package org.kodluyoruz.questions.five;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionFive {
	/*
	 * Rastgele sayılardan oluşan 100 elemanlık tamsayı dizisi oluşturun. Ardından
	 * tek ve çift sayıları bulan bir program yazın.
	 */
	static Random rnd = new Random();

	public static void main(String[] args) {
		int[] array = fillArray(100);
		// cift sayi dizisi
		List<Integer> doubleArray = new ArrayList<>();
		// tek sayi dizisi
		List<Integer> singleArray = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			// tek cift kontrolu
			if (singleAndDoubleControl(array[i])) {
				// cift ise cift dizisine ekler
				doubleArray.add(array[i]);
			} else {
				// tek ise tek dizisine ekler
				singleArray.add(array[i]);
			}
		}
		System.err.println(
				"Tek sayıların sayısı :" + singleArray.size() + " Çift sayıların sayısı : " + doubleArray.size());
		printArray(doubleArray, singleArray);
	}

	static void printArray(List<Integer> doubleArray, List<Integer> singleArray) {
		if (doubleArray.size() != 0) {
			System.err.println(" ---------------Çift Sayılar Başlangıç---------------- ");
			for (Integer doubleNumber : doubleArray) {
				System.err.println(doubleNumber);
			}
			System.err.println(" ---------------Çift Sayılar Bitiş---------------- ");

		}

		if (singleArray.size() != 0) {
			System.err.println(" ---------------Tek Sayılar Başlangıç---------------- ");
			for (Integer singleNumber : singleArray) {
				System.err.println(singleNumber);
			}
			System.err.println(" ---------------Tek Sayılar Bitiş---------------- ");

		}

	}

	/*
	 * @param array_Length bu metod dışarıdan dizi uzunluğu alır ve aldıgı uzunluk
	 * kadar 0-100 arasında rastgeke sayı üretir ve diziyi doldurur
	 */
	static int[] fillArray(int array_Length) {
		// istenen uzunluk kadar dizi olusturur
		int[] array = new int[array_Length];
		for (int i = 0; i < array_Length; i++) {
			// rastgele sayı üretir 0-100 arası
			array[i] = rnd.nextInt(101);
		}
		return array;
	}

	/*
	 * @param number dısarıdan gelen sayıyı 2'ye böler kalan sonuc cift ise true /
	 * tek ise false döner
	 */
	static boolean singleAndDoubleControl(int number) {
		// sayının tek cift kontrolunu yapar
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
