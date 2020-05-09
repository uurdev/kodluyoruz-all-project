package org.kodluyoruz.questionThree;

public class QuestionThree {
    /*
    TODO : N x M ile M x T boyutlarında 0-10 arası rastgele sayılardan
      oluşan iki matris tanımlayınız. Bu iki matrisin çarpımını yapan fonksiyonu yazın. Çarpım sonucu oluşan matrisi ekrana yazdırın.
     */

    public static void main(String[] args) {

        int[][] firstMatrix = {{3, -2, 5}, {3, 0, 4}};
        int[][] secondMatrix = {{2, 3}, {-9, 0}, {0, 4}};

        // multiply Two matrices
        int[][] resultArray = multiplyMatrices(firstMatrix, secondMatrix);

        // Displaying the result
        displayResultMatrix(resultArray);

    }


    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int[][] resultArray = new int[firstMatrix.length][secondMatrix[0].length];
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[0].length; j++) {
                for (int k = 0; k < firstMatrix[0].length; k++) {
                    resultArray[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        return resultArray;
    }

    public static void displayResultMatrix(int[][] result) {
        System.out.println("Result Matrix Values : ");
        for (int[] row : result) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }


}
