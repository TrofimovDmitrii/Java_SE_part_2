package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExp {
	public static void main(String[] args) throws IOException {
		String rubai = "Много лет размышлял я над жизнью земной.\n" +
				"Непонятного нет для меня под луной.\n" +
				"Мне известно, что мне ничего не известно!\n" +
				"Вот последняя правда, открытая мной.\n";
		String s = "Hello";

//		FileWriter writer = null;
		try (FileWriter writer = new FileWriter("C:\\Users\\Дмитрий\\Desktop\\text1.txt", true)) {
//			writer = new FileWriter("C:\\Users\\Дмитрий\\Desktop\\text1.txt", true);
//			for (int i = 0; i < rubai.length(); i++) {
//				writer.write(rubai.charAt(i));
//			}
//			writer.write(rubai);
			writer.write(s);
			System.out.println("Done!");
		} catch (IOException e) {
			e.printStackTrace();
//		} finally {
//			writer.close();
		}
	}
}
