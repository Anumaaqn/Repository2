package lights;


import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
import java.awt.color.*;

public class RunningHolidayLights implements HolidayLights {
	Light gerel;
	int len;
	int s=0;
	
	//private static final List<Light> Light = null;
	/**
	 * Creates new running holiday lights.
	 * @param length - length of this set of lights.
	 */
	
	
	public RunningHolidayLights(int length) {
		len=length;
	}
	
	public List<Light> next() {
		List<Light> lightlist = new ArrayList<Light>();
		for(int i=0; i<len; i++) {
			gerel = new ColoredLight(Color.yellow);
			gerel.randomChange();
			lightlist.add(gerel);
			
		}
		lightlist.get(s).setOn(true);
		s =s+1;
		if(s>=len) {
		s=0;
		}
		return lightlist;
		//throw new RuntimeException("RunningHolidayLights.next() not yet implemented!");
	}
	/**
	 * Returns the length of this
	 * @return length of this
	 */
	public int getLength() {
		// TODO
		
		//throw new RuntimeException("RunningHolidayLights.getLength() not yet implemented!");
		return len;
	}
						
}