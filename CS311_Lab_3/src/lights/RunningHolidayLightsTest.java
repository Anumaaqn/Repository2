package lights;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.Timer;

import org.junit.Assert;
import org.junit.Test;
public class RunningHolidayLightsTest{
	
		
		@Test public void lengthOfList() {
			RunningHolidayLights Light = new RunningHolidayLights(12);
			
			Assert.assertNotNull(Light.getLength());
		}
		
		@Test public void listOfnext() {
			RunningHolidayLights Light = new RunningHolidayLights(12);
			
			Assert.assertEquals(Light.next().size(), Light.getLength());
		}
		@Test public void turnonLights() {
			RunningHolidayLights Light = new RunningHolidayLights(12);
				
			Assert.assertTrue(Light.next().get(0).isOn());
		}

		}


