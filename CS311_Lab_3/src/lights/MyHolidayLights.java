package lights;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.Color;
import java.awt.color.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyHolidayLights implements HolidayLights {
    Light gerel;
    int len;
    int s=0;
   
    public MyHolidayLights(int length) {
        len=length;
    }
   
    public List<Light> next() {
        List<Light> lightlist = new ArrayList<Light>();
        for(int i=0; i<len; i++) {
             gerel = new ColoredLight(Color.black);
                        lightlist.add(gerel);
    		if (Math.random() < .5) {
    			lightlist.get(i).setOn(true);
    		} else {
    			lightlist.get(i).setOn(false);
    		}}
        
        
        s =s+1;
        if(s>=len) {
        s=0;
        
        }
         return lightlist;
        }

    public int getLength() {
      return len;
    }
}    