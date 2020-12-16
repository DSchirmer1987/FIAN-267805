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
import java.util.stream.Stream;

public class DateThread implements Runnable{
	@Override
	public void run() {
		Stream.generate(LocalDateTime::now).limit(20).forEach(System.out::println);
	}
}
