package org.kodluyoruz.questionOne;

import java.util.Arrays;

public class QuestionOne {
    public static void main(String[] args) {

        int array[][] = fillArray(new int[5][5], 2);
        matrixElementWrite(array);
        System.out.println("--");
        //matrixElementWrite(convertMatrix(array));
        matrixElementWrite(convertMatrix(array));
    }

    /*
        TODO : liste sıfır ve birlerden olusturdum fakat soruyu tam anlayamadım okuyup tekrar deneyeceğim
     */
    public static int[][] fillArray(int array[][], int number) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ((int) (Math.random() * number));
            }
        }
        return array;
    }

    public static void matrixElementWrite(int array[][]) {
        for (int[] row : array)
            System.out.println(Arrays.toString(row));
    }


    public static int[][] convertMatrix(int[][] array) {
        /*
            Aktif olarak secilen row'un sagı solu ustu ve altını bulmak ıcın bu degıskenler eklendı
            5 vermemin sebebi tamamen keyfi içeride tamamı 1 yada 0 olucak
         */
        int current = 5, bottom = 5, top = 5, right = 5, left = 5;

        int[][] tempArray = array; //dışarıdan gelen dizi boş bir diziye atandı
        int size = tempArray.length;//size bottom ve right ozellıgı ıcın eklendi
        for (int i = 0; i < tempArray.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int aliveRow = 0;//her bir current yanı aktıf eleman ıcın bu canlı hücre sayısı sıfırdan baslıyor
                current = tempArray[i][j];

                if (i > 0) {//eğer i sıfırdan buyukse demekkı üstte değer olabilir
                    top = array[i - 1][j];
                    if (top == 1) {
                        aliveRow++;
                    }
                }
                if (i < size - 1) {//eğer i dizi eleman sayısından kucuksede altında eleman vardır
                    bottom = array[i + 1][j];
                    if (bottom == 1) {
                        aliveRow++;
                    }
                }
                if (j > 0) {//eğer j sıfırdan büyükse demekki solunda deger var
                    left = tempArray[i][j - 1];
                    if (left == 1) {
                        aliveRow++;
                    }
                }
                if (j < size - 1) {//eger j arrayin uzunlugundan kucukse demekki sagda deger olabilir
                    right = array[i][j + 1];
                    if (right == 1) {
                        aliveRow++;
                    }
                }
                if (current == 1) {//eger aktif hücre 1'se kontrolu
                    if (aliveRow < 2) {
                        current = 0;
                    } else if (aliveRow >= 2 || aliveRow <= 3) {
                        current = 1;
                    } else if (aliveRow > 3) {
                        current = 0;
                    }
                } else {//aktif hücre 1 degilse 0'dır
                    if (aliveRow == 3) {
                        current = 1;
                    }
                }
                tempArray[i][j] = current;//eğer aktif hücrede degisiklik varsa yeni değeriyle aktif oldugu satıra bırakıldı
            }
        }
        return tempArray;
    }


}
