package org.kodluyoruz.questionFour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class QuestionFour {
    /*
        N boyutunda 0-10 arası rastgele sayilardan oluşan bir dizi tanımlayınız. Bu dizi içinde mükerrer olan elemanları ekrana yazdıran algoritmayı tasarlayınız.
        Örnek: { 2, 4, 5, 11, 33, 2, 5, 55, 100, 1 }
        Örnek çıktı: 2 5
     */


    public static void main(String[] args) {
        int[] array = fillTheArray();
        writeArrayElements(array);
        System.out.println("----------------");
        List<Integer> tempArray = new ArrayList<Integer>();
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                }
            }
            if (counter >= 1) {
                if (!tempArray.contains(array[i])) {
                    tempArray.add(array[i]);
                }
            }
            counter = 0;
        }
        writeArrayList(tempArray);
    }

    public static void writeArrayList(List<Integer> arrayList) {
        arrayList.forEach(System.out::println);
    }

    public static void writeArrayElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] fillTheArray() {
        int[] fillArray = new int[10];
        for (int i = 0; i < fillArray.length; i++) {
            fillArray[i] = (int) (Math.random() * 10);
        }
        return fillArray;
    }

}
