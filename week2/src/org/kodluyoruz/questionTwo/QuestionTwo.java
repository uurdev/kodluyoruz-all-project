package org.kodluyoruz.questionTwo;

public class QuestionTwo {
    public static void main(String[] args) {
        int[][] spiral =new int[5][5];
        fillMatrixArray(spiral);
        writeArrayElements(spiral);
        writeSprintArray(spiral.length, spiral.length, spiral);
    }
    /*
    TODO : https://leetcode.com/problems/spiral-matrix/ 'daki yapıyla aynı farklı olarak matrix'i fonksiyonla doldurma denenebilir

     */

    public static int[][] fillMatrixArray(int[][] array) {
        int[][] spiral = array;

        int value = 1;

        int minCol = 0;

        int maxCol = array.length - 1;

        int minRow = 0;

        int maxRow = array.length - 1;

        while (value <= array.length * array.length) {
            for (int i = minCol; i <= maxCol; i++) {
                spiral[minRow][i] = value;

                value++;
            }

            for (int i = minRow + 1; i <= maxRow; i++) {
                spiral[i][maxCol] = value;

                value++;
            }

            for (int i = maxCol - 1; i >= minCol; i--) {
                spiral[maxRow][i] = value;

                value++;
            }

            for (int i = maxRow - 1; i >= minRow + 1; i--) {
                spiral[i][minCol] = value;

                value++;
            }

            minCol++;

            minRow++;

            maxCol--;

            maxRow--;
        }
        return spiral;
    }

    public static void writeArrayElements(int[][] spiral) {
        //dışarıdan gelen diziyi 5x5 matrix seklinde ekrana yazdırır
        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral.length; j++) {
                System.out.print(spiral[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static void writeSprintArray(int m, int n, int a[][]) {
        int i, k = 0, l = 0;

        while (k < m && l < n) {
            for (i = l; i < n; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;
            for (i = k; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
    }

}
