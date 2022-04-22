package lights;

<<<<<<< HEAD
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class RunningHolidayLights implements HolidayLights {
	
	Light my_light ;
	int size;
	int count=0;
	/**
	 * Creates new running holiday lights.
	 * @param length - length of this set of lights.
	 */
	public RunningHolidayLights(int length) {
		size = length;
		//throw new RuntimeException("RunningHolidayLights(length) not yet implemented!");
	}
	
	public List<Light> next() {
		List<Light> light_list = new ArrayList<Light>();
		for(int i=0; i<size; i++) {
			my_light = new ColoredLight(null);
			my_light.randomChange();
			light_list.add(my_light);
			
		}
		light_list.get(count).setOn(true);
		light_list.get(size-count-1).setOn(true);
		count =count+1;
		if(count>=size) {
			count=0;
		}
		return light_list;
		//throw new RuntimeException("RunningHolidayLights.next() not yet implemented!");
}
	
	/**
	 * Returns the length of this
	 * @return length of this
	 */
	public int getLength() {
		return size;
		//throw new RuntimeException("RunningHolidayLights.getLength() not yet implemented!");
=======

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
>>>>>>> branch 'master' of https://github.com/Anumaaqn/Repository2.git
	}
						
}