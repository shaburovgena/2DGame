import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class MoveStart implements MouseMotionListener{
	public static int posx, posy;
	
	

	public void mouseDragged(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent me) {
		// TODO Auto-generated method stub
		posx = me.getX();
		posy = me.getY();
	}
	
}
