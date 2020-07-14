import org.newdawn.slick.*;

public class Sprite {	
	private float x;
	private float y;
	private Image sprite;
	private String img_src;
	
	public Sprite(String image, float x, float y) throws SlickException { 
		this.img_src = image;
		this.x = x;
		this.y = y;
		sprite = new Image(this.img_src);
	}
	
	public void update(Input input, int delta) {
		
	}
	
	public void render(Graphics g) {
		sprite.draw(x * App.TILE_SIZE, y * App.TILE_SIZE);
	}
	
	public void movePlayer(int dir) {
		switch(dir) {
		case 0: 
			y -= 1;
			break;
		case 1: 
			y += 1;
			break;
		case 2: 
			x -= 1;
			break;
		case 3: 
			x += 1;
			break;
		}
	}
		
	public float getX() {
		return this.x;
	}
	
	public float getY() { 
		return this.y;
	}
	
//	public getPos() { 
//		return position;
//	}
}