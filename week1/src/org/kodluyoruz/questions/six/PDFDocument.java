package org.kodluyoruz.questions.six;

public class PDFDocument implements DocumentInterface {
	String body = "";

	public PDFDocument(String body) {
		this.body = body;
	}

	@Override
	public String getBody() {
		return this.body;
	}

}
