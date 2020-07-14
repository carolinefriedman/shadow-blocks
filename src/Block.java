import org.newdawn.slick.*;

public class Block extends Sprite {
	private boolean blocked; 
	
	public Block(String img_src, float x, float y) throws SlickException {
		super(img_src, x, y);
		blocked = false;
	}
	
	public boolean isBlocked() { 
		return blocked;
	}
	
	public void setBlocked(boolean blocked) { 
		this.blocked = true;
	}
}
