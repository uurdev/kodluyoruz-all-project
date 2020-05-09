package org.kodluyoruz.questions.six;

public class Printer {

	/*
	 * PDFDocument isminde bir sınıf yaratın. Ardından, WordDocument isminde bir
	 * sınıf tasarlayın. Bu iki sınıf içinde String body = ""; isminde bir tane
	 * nesne değişkeni tanımlayın. Tanımlanan bu "body" isimli değişkeninin tutacağı
	 * veriyi kurucu metot vasıtasıyla gönderin. Sınıfın içinde "body" değişkenine
	 * ait değeri dışarıya döndürecek "getBody" isimli bir metot yazın.
	 * 
	 * Yukarıdaki işlemlerin ardından Printer isminde bir sınıf tanımlayın.
	 * "printPDFDocument" isminde PDF dokümanına ait "body" bilgisini konsol ekrana
	 * yazdıran bir metot tanımlayın. Aynı şekilde "printWordDocument" isminde Word
	 * dokümanını konsol ekrana yazdıran bir metot tanımlayın. Bu metotları "static"
	 * tanımlamanız gerekmektedir.
	 * 
	 * Ardından main fonksiyonu içinde PDFDocument ve WordDocument nesneleri
	 * oluşturun. Bu nesnelere ait body bilgisini ekrana yazdırmak için "Printer"
	 * sınıfının metotlarını kullanın.
	 * 
	 * Not: Print sınıfı içinde niçin statik metot kullandığımızı kısaca açıklayın.
	 */

	/*
	 * not : main methodu static oldugu için çağırdıgı metodlarında static olması
	 * gerekir bu sebepden main methoduna bağlı diğer tüm methodlar static
	 * tanımlandı
	 */

	static void print(DocumentInterface documentInterface) {
		System.out.println(documentInterface.getBody());
	}
}
