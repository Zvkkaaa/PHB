package Lab3lights;

import org.junit.Assert;
import org.junit.Test;
import java.awt.color.*;

public class RunningHolidayTest {
	
	@Test public void checkLength() {
	RunningHolidayLights hl = new RunningHolidayLights(10);
	int length= 10; 
	boolean b = (length==hl.getLength() )? true: false; 
	Assert.assertTrue(b);
	}
	
	@Test public void testRandomChange() {
		RunningHolidayLights hl = new RunningHolidayLights(10);
	 
		boolean b= false; 
		for (int i = 0; i < hl.list.size(); i++) { 
			hl.list.get(i).randomChange();
			if(hl.list.get(i).isOn()!= false)
				b=true;
		} 
		Assert.assertTrue(b);
	}
}