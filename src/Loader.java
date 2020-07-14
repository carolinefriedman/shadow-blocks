import java.util.*;
import java.io.*;
import org.newdawn.slick.*;

/**
 * 
 * @author carolinefriedman
 * Loader is a static class with functions to load the map from the CSV file.
 */

public class Loader {	
	public static int xPos;
	public static int yPos;
	
	/**
	 * Loads sprites from file into an array list
	 * @param filename
	 * @return sprites
	 */
	public static ArrayList<Sprite> loadSprites(String filename) { 
		ArrayList<Sprite> sprites = new ArrayList<>();
		
		try (Scanner scanner = new Scanner(new FileReader(filename))) {
			String line = scanner.nextLine();
			String[] dim = line.split(",");
			
			while (scanner.hasNextLine()) {
				String type;
				float xPos, yPos;
				
				line = scanner.nextLine();
				dim = line.split(",");
				type = dim[0];
				xPos = Integer.parseInt(dim[1]);
				yPos = Integer.parseInt(dim[2]);
				
				sprites.add(createSprite(type, xPos, yPos));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return sprites;
	}
	
	/**
	 * Creates sprite based on type and x and y positions
	 * @param type
	 * @param x
	 * @param y
	 * @return
	 * @throws SlickException
	 */
	
	public static Sprite createSprite(String type, float x, float y) throws SlickException {
		switch(type) { 
		case "floor" : 
			return new Floor("res/" + type + ".png", x, y);
		case "wall" : 
			return new Wall("res/" + type + ".png", x, y);
		case "stone" : 
			return new Stone("res/" + type + ".png", x, y);
		case "target" : 
			return new Target("res/" + type + ".png", x, y);
		case "player" : 
			return new Player("res/" + type + "_left.png", x, y);		
		}
		return null;
	}
}