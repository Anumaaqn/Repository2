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

/**
 * JFrame that contains a display of holiday lights and an 'Exit' button.
 * @author uuu
 *
 */
public class HolidayLightsWindow extends JFrame {
	
	private static final long serialVersionUID = -722257469624438083L;
	private HolidayLights hl;
	private static final int millsPerFrame = 500;
	
	public HolidayLightsWindow(HolidayLights hl) {
		// Sets up the title bar
		super("Lab 0: Holiday Lights");
		
		this.hl = hl;
		this.setup();
	}
	
	private void setup() {
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		contentPane.setPreferredSize(new Dimension(12*55,110));

		LightWindow lw = new LightWindow(hl);
		JScrollPane jsp = new JScrollPane(lw);
		contentPane.add(jsp, BorderLayout.CENTER);
		
		Button but = new Button("Exit");
		but.addActionListener(new ActionListener() {
			                    public void actionPerformed(ActionEvent e) {
			                        System.exit(0);
			                    }
			                });
		contentPane.add(but, BorderLayout.EAST);
		
		// makes clicking 'x' actually close on macs
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(contentPane);
	}
	
	private static class LightWindow extends JComponent {
		
		private static final long serialVersionUID = 9104734488769833572L;

		private HolidayLights hl;
		private Timer timer;
		private List<Light> lightState;
		
		public LightWindow(HolidayLights hl) {
			this.hl = hl;
			this.timer = new Timer(HolidayLightsWindow.millsPerFrame, new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					update();
				}
			});
			this.lightState = hl.next();
			timer.start();
		}
				
		@Override public void paintComponent(Graphics g) {
			Graphics2D g2d = (Graphics2D) g;
			int curX = 10;
			int curY = 30;

			for (int i = 0; i < this.lightState.size(); i++) {
				Light l = this.lightState.get(i);
				if (l.isOn()) {
					g2d.setColor(Color.YELLOW);
					if (l instanceof ColoredLight) {
						ColoredLight cl = (ColoredLight) l;
						g2d.setColor(cl.getColor());
					}
					g2d.fillOval(curX, curY, 26, 60);
					g2d.setColor(Color.BLACK);
					g2d.drawOval(curX, curY, 26, 60);
				} else {
					g2d.setColor(Color.BLACK);
					g2d.drawOval(curX, curY, 26, 60);
				}
				
				// draw line across the top
				if (i < this.lightState.size() - 1) {
				g2d.setColor(new Color(0,100,0));
				Stroke oldStroke = g2d.getStroke();
				g2d.setStroke(new BasicStroke(6.0f));
				g2d.drawArc(curX+13, curY-15, 50, 25, 0, 180);
				g2d.setStroke(oldStroke);
				}
				
				curX += 50;
			}
			
		}
		
		private void update() {
			this.lightState = this.hl.next();
			repaint();
		}	
}
}