/**
 * Daniel Schirmer
 *
 * 16.12.2020
 * Project : Tag_16
 * ©2020
 *
 */

package threads;

import java.util.stream.IntStream;

public class CounterThread implements Runnable{
	@Override
	public void run() {
		IntStream.range(0, 20).forEach(System.out::println);
	}
}
