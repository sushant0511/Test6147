import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.JFrame;

public class ImageSection extends Frame
{
	public ImageSection() {
	super("Hi ");
	setSize(200,300);
	setVisible(true);
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.darkGray);
		Graphics2D graphics2d=(Graphics2D) g;
		g.drawString("Graphics ", 50, 50);
		 graphics2d.scale(1.0,-1.0);
		    g.drawString("Graphics ", 100, 100);
	
		
		AffineTransform transform=graphics2d.getTransform();
        AffineTransform transform2=new AffineTransform();
        transform2.rotate(-Math.PI/2);
      
	    graphics2d.setTransform(transform2);
	    g.drawString("Graphics ", -150, 50);
	    
	   AffineTransform transform3=AffineTransform.getQuadrantRotateInstance(1);
	   
	   graphics2d.setTransform(transform3);
	   g.drawString("Graphics ", 100, -150);

	   AffineTransform transform4=new AffineTransform();
       transform4.rotate(-Math.PI/4);
	    graphics2d.setTransform(transform4);
	    g.drawString("Graphics ", 100, -150);
	   
	}	
	
	public static void main(String[] args) {
       new ImageSection();	
		

	}

}
