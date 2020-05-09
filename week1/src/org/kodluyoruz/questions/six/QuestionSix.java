package org.kodluyoruz.questions.six;

public class QuestionSix {
	public static void main(String[] args) {
		Printer.print(new PDFDocument("Pdf Documents"));
		Printer.print(new WordDocument("Word Documents"));
	}
}
