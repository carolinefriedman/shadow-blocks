import java.util.*;
import org.newdawn.slick.*;

public class World { 
	public static float offsetX;
	public static float offsetY;
	
	static ArrayList<Sprite> sprites;
	
	public World() throws SlickException { 
		sprites = Loader.loadSprites("res/levels/0.lvl");
	}
	
	public void update(Input input, int delta) { 
		for (int i = 0; i < sprites.size(); i++) {
			sprites.get(i).update(input, delta);
		}
	}
	
	public void render(Graphics g) { 
		for (int i = 0; i < sprites.size(); i++) {
			sprites.get(i).render(g);
		}
	}
}