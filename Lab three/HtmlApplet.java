import java.applet.Applet;
import java.awt.Graphics;
public class HtmlApplet extends Applet{
        @Override
        public void paint(Graphics g) {
            g.drawString("Hello from the applet!", 20, 20);
        }
    }
