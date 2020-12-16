/**
 * Daniel Schirmer
 *
 * 16.12.2020
 * Project : Tag_16
 * ©2020
 *
 */

package myexception;

public class NegativeSaldoException extends Exception {
	
	public NegativeSaldoException(String message) {
		super(message);
	}
	public NegativeSaldoException() {
		super("Fehler aufgetreten");
	}
}
