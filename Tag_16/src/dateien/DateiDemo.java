/**
 * Daniel Schirmer
 *
 * 16.12.2020
 * Project : Tag_16
 * ©2020
 *
 */

package dateien;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class DateiDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\readmeToo.txt");
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println("--------------");
		
//		File dir = new File("D:\\");
//		System.out.println(dir.isDirectory());
//		File[] dateien = dir.listFiles();
//		for (File file2 : dateien) {
//			System.out.println(file2.isDirectory());
//		}
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println("--------------");
		
		FileReader fr = null;
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader bf = new BufferedReader(fr);
		try {
			while (bf.ready()) {
				System.out.println(bf.readLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--------------");
		
		File newFile = new File("D:\\Demo\\WriteNow.txt");
		
		OutputStream os = null;
		os = new FileOutputStream(newFile);
		
		OutputStreamWriter osw = new OutputStreamWriter(os);
		PrintWriter pw = new PrintWriter(osw);
		String tmp = "Hallo Welt";
		pw.println(tmp);
		pw.println(tmp);
		pw.close();
		osw.close();
		os.close();
	}
}
