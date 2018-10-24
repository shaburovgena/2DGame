import java.awt.*;


public class BackGround {
	//Field
	private Color color;
	//Function
	
	public BackGround () {
		 color =  Color.BLUE;
	}
	public void update () {
		
		}
	
	public void draw (Graphics2D g) {
		g.setColor(color.darker());
		g.fillRect(0, 0, FrameStart.width, FrameStart.height);
		}
}
