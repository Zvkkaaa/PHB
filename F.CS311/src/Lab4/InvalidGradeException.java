package Lab4;

import java.io.IOException;

/**
 * Exception that should be thrown if an invalid grade is passed in.
 *
 */
@SuppressWarnings({ "unused", "serial" })
public class InvalidGradeException extends Exception {
	public InvalidGradeException() {
		super();
	}
}