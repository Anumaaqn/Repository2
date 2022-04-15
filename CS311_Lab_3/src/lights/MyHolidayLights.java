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
             gerel = new ColoredLight(Color.white);
                        lightlist.add(gerel);
            Timer timer = new Timer(300, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    lightlist.get(s).setOn(false);

                }
            });
            timer.setRepeats(true);
            timer.setCoalesce(true);
            timer.start();
            
        }
        
        lightlist.get(s).setOn(true);
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
