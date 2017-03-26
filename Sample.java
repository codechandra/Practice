import java.applet.*;
import java.awt.*;
/*<applet code=Sample.class width=1000 height=1000>
</applet>*/
public class Sample extends Applet
{
	String msg="";
		public void init()
		{
			setBackground(Color.orange);
			msg+="Hai";
		}
		public void paint(Graphics g)
		{
			g.drawString(msg,100,100);
		}
}