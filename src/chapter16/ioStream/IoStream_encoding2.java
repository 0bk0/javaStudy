package chapter16.ioStream;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class IoStream_encoding2 {
	/*구분잘짓기(트랜스포머 원본에 기능 추가하는 개념?확장?)
	 *기반스트림			입력					출력
		byte		InputStream			OutputStream
					FileInputStream		FileOutputStream
					
		문자			Reader				Writer
					FileReader			FileWriter
					
	 *보조스트림		InputStreamReader	InputStreamWriter
	 */
	

	public static void main(String[] args) throws Exception {
		FileInputStream fi = new FileInputStream("애국가.txt");
		InputStreamReader in = new InputStreamReader(fi, "euc-kr");
		char[] text = new char[1000];
		int num = in.read(text);
		System.out.println(text);
		in.close();
	}

}
