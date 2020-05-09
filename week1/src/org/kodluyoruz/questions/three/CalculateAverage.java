package org.kodluyoruz.questions.three;

import java.util.Random;

public class CalculateAverage {
	/*
	 * Rastgele sayılardan oluşmuş 100 elemanlık tamsayı dizisindeki tüm elemanların
	 * ortalamasını alacak programı geliştirin. Programı yazarken aşağıdaki
	 * özelliklere uygun yazınız.
	 * 
	 * Rastgele oluşan 10 elemanlık sayı kümesi program yeniden her çalıştığında
	 * değişsin. Sabit elemanlı bir dizi vermeyin! Ortalama almayı sağlayacak kodu
	 * bir fonksiyon halinde tasarlayın. İçine diziyi girdi (input) olarak alsın.
	 * Ortalama alan fonksiyon ortalamayı ondalıklı sayı olarak döndürsün. (return)
	 * etsin.
	 */

	static Random rnd = new Random();

	/*
	 * @param int array_Length dışarıdan gelen uzunluk kadar dizi oluşturur ve içine
	 * 0-100 arası sayıları doldurur ve diziyi geri döner
	 */
	static int[] createMainArray(int array_Length) {
		// istenen uzunluk kadar dizi olusturur
		int[] array = new int[array_Length];
		for (int i = 0; i < array_Length; i++) {
			// rastgele sayı üretir 0-100 arası
			array[i] = rnd.nextInt(101);
		}
		return array;
	}

	/*
	 * @param int array dışarıdan gelen dizinin tüm elemanlarını toplar ve dizin
	 * uzunluguna böler bu şekilde ortalama hesaplanmış oldu
	 */
	static double calculateAverage(int[] array) {
		double average = 0;
		int sumOfNumbers = 0;
		if (array != null) {
			for (int i = 0; i < array.length; i++) {
				sumOfNumbers = array[i] + sumOfNumbers;
			}
		}
		average = sumOfNumbers / array.length;
		return average;
	}
}
