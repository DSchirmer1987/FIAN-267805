/**
 * Daniel Schirmer
 *
 * 18.12.2020
 * Project : Tag_18
 * ©2020
 *
 */

package fileDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Random;

public class WriteAndRead {

	public static void main(String[] args) throws IOException {
		int start = 33;
		int end = 127;
		int length = 10;
		byte[] zeichen = new byte[length];
		int[] buchstaben = new int[length];
		String generated = "";
	
		Random random = new Random();
		random.nextBytes(zeichen);
		
		for (int i = 0; i < buchstaben.length; i++) {
			buchstaben[i] = random.nextInt(end - start) + start;
			generated = generated + (char)buchstaben[i];
		}
		
		String randomString = new String(zeichen, Charset.forName("UTF-8"));
		
		System.out.println(randomString);
		System.out.println("----");
		System.out.println(generated);
		
		
		File newFile = new File("D:\\Demo\\WriteNow.txt");
		OutputStream os = null;
		os = new FileOutputStream(newFile);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		PrintWriter pw = new PrintWriter(osw);
		for (int i = 0; i < 25; i++) {
			pw.println(randomString());
		}
		pw.close();
		osw.close();
		os.close();
	}
	
	public static String randomString() {
		int start = 33;
		int end = 127;
		Random random = new Random();
		int[] buchstaben = new int[10];
		String randomString = "";
		for (int i = 0; i < buchstaben.length; i++) {
			buchstaben[i] = random.nextInt(end - start) + start;
			randomString = randomString + (char)buchstaben[i];
		}
		return randomString;
	}

}
