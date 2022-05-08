package Lab3lights;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create HolidayLights
				HolidayLights hl = new RunningHolidayLights(12);
				HolidayLights mhl = new MyHolidayLights(12); 				// holidaylight  
				
				// Create and show HolidayLightsWindow
				HolidayLightsWindow frame = new HolidayLightsWindow(hl);
				HolidayLightsWindow frame2 = new HolidayLightsWindow(mhl); 	// Myholidaylight  
				frame.pack();
				frame2.pack();
				frame.setVisible(true);
				frame2.setVisible(true);
	}

}
