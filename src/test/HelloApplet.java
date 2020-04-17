package test;

import java.applet.Applet;
import java.awt.*;

public class HelloApplet extends Applet {
    @Override
    public void print(Graphics g) {
       g.drawString("Hello,word",20,20);
    }
}
