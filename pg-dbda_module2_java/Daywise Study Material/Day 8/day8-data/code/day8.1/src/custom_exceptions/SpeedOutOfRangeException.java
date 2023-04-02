package custom_exceptions;

//checked exc class
@SuppressWarnings("serial") // compile time annotation , to tell javac to
//suppress warnings
public class SpeedOutOfRangeException extends Exception {

	public SpeedOutOfRangeException(String message) {
		super(message);// invokes super cls (Exception) ctor to 
		//create the Exc with err message
	}

}
