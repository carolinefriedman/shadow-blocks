import org.newdawn.slick.*;

public class Player extends Sprite {
	public Player(String img_src, float x, float y) throws SlickException { 
		super(img_src, x, y);
	}
	
	@Override
	public void update(Input input, int delta) {
		if (input.isKeyPressed(Input.KEY_UP)) {
			movePlayer(0);
		}
		if (input.isKeyPressed(Input.KEY_DOWN)) { 
			movePlayer(1);
		}
		if (input.isKeyPressed(Input.KEY_LEFT)) {
			movePlayer(2);
		}
		if (input.isKeyPressed(Input.KEY_RIGHT)) {
			movePlayer(3);
		}
	}
}
