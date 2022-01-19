package javaLogger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class javalogger {
	private static Logger LOGGER = Logger.getLogger(javalogger.class.getName());
	
	public static void main(String[] args) {
		LOGGER.log(Level.INFO, "Hello World");
	}

}
