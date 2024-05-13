package EnumConstants;

import java.awt.Color;


public enum Colors {
    // Define color constants
	BLACK(new Color(26,26,26)),          // Used for black color
	WHITE(new Color(0, 51, 102)),          // Used for white color
	BLUE(new Color(51, 102, 0 )),              // Used for red color
	ORANGE(new Color(92, 138, 185 )),// Player 1 color
	PURPLE(new Color(0,204,102)),// Used for purple color
	YELLOW(new Color(0,76,153));        // Used for yellow color
	
	
	//properties
	private Color color;
	
	//Constructor
	Colors(Color color){
		this.color = color;
	}
	
	// Get the color value
	public Color getColor(){
		return this.color;
	}
	
	// Get the default color for a player based on their ID
	public static Color getMyDefaultColor(int ID){
		if(ID==1){
			return BLUE.getColor();    // Return RED color for player ID 1
		}
		else if(ID==2){
			return ORANGE.getColor(); // Return ORANGE color for player ID 2
		}
		
		return null;
	}
	
	// Get the focused color for a player based on their ID
	public static Color getFocusedColor(int ID){
		if(ID==1){
			return PURPLE.getColor(); // Return PURPLE color for player ID 1
		}
		else if(ID==2){
			return YELLOW.getColor(); // Return YELLOW color for player ID 2
		}		
		return null;
	}
}