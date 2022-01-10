
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.Stroke;



public class TestData extends Panel
{
	

	public void paint(Graphics graphics)
	{
		Graphics2D graphics2=(Graphics2D)graphics;
//graphics2.drawRect(20, 30, 200, 200);
//graphics2.drawArc(30,60,100,60,30,360);
//graphics2.drawArc(60,75,20,20,30,360);
//graphics2.drawArc(90,75,20,20,30,360);
//
//	graphics2.drawRoundRect(40, 40,200,150,20,20);
//	graphics2.drawRoundRect(50, 50,180,120,40,40);
//	graphics2.setColor(Color.YELLOW);
//	graphics2.draw3DRect(30,40,200,150,true);
	
		
		graphics2.setColor(Color.LIGHT_GRAY);
		//graphics2.setStroke(stroke);
		//graphics2.drawRect(20,20,150,151);
		graphics2.drawLine(50,50,100,50);
	float[] dotpattern= {4f};
	Stroke stroke=new BasicStroke(4f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER,1f,dotpattern,2f);   
	graphics2.setStroke(stroke);

	graphics2.drawLine(70,70,120,70);
		
	Stroke stroke1=new BasicStroke(4f,BasicStroke.CAP_ROUND,BasicStroke.JOIN_MITER,1f,dotpattern,2f);
	graphics2.setStroke(stroke1);

graphics2.drawLine(90,90,150,90);
	
	}
	

	public static void main(String[] args) {
System.out.println("1 deployed");
     TestData data =new TestData();
      Frame f =new Frame("Test Dot with Extra");
      f.add(data);
      f.setSize(300,300);
     f.setVisible(true);
     
     
	}

}
