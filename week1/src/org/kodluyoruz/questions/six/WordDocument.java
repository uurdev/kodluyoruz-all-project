package org.kodluyoruz.questions.six;

public class WordDocument implements DocumentInterface {
	String body = "";

	public WordDocument(String body) {
		this.body = body;
	}

	@Override
	public String getBody() {
		return this.body;
	}

}
