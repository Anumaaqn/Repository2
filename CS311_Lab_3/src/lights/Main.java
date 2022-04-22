package lights;

public class Main {
	
	public static void main(String[]  args) {

		// Create HolidayLights
		HolidayLights hl = new RunningHolidayLights(12);
		//HolidayLights hl = new MyHolidayLights(12);
		// Create and show HolidayLightsWindow
		HolidayLightsWindow frame = new HolidayLightsWindow(hl);
		//MyHolidayLightsTest frame= new MyHolidayLightsTest(hl);
		frame.pack();
		frame.setVisible(true);
	}
} 