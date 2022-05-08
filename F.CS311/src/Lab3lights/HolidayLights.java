package Lab3lights;

/**
 * Represents a sequence of lights that periodically changes
 * appearence.
 */

public interface HolidayLights {

	/**
	 * Appearence of lights at next time slice.
	 * @return appearence of lights at next time slice.
	 */
	public  <C> C next();  
	//public List<Light> next();
	public int getLength();
	
}