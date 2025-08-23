package tasks1;

//Logger interface
interface Logger {
 // Default method
 default void logInfo() {
     System.out.println("INFO: Logging information from default method.");
 }

 // Static method
 static void logError() {
     System.out.println("ERROR: Logging error from static method.");
 }
}

//AppLogger class implementing Logger
class AppLogger implements Logger {
 // No need to override logInfo() unless custom behavior is desired
}

//Main class to test
public class LoggerTest {
 public static void main(String[] args) {
     // Using default method via object
     AppLogger logger = new AppLogger();
     logger.logInfo();

     // Using static method via interface name
     Logger.logError();
 }
}

