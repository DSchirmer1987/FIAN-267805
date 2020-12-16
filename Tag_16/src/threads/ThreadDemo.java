/**
 * Daniel Schirmer
 *
 * 16.12.2020
 * Project : Tag_16
 * ©2020
 *
 */

package threads;

import java.time.LocalDateTime;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.swing.JFrame;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread t1 = new Thread(new CounterThread());
		Thread t2 = new Thread(new DateThread());
		
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				sagen();
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	public static void sagen() {
		System.out.println("Hallo!");
	}

}
