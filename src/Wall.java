import org.newdawn.slick.*;

public class Wall extends Block {
	public Wall(String img_src, float x, float y) throws SlickException { 
		super(img_src, x, y);
		
		setBlocked(true);
	}
}
