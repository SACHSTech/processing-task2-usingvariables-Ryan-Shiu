import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  public void settings() {
    // Size of sketch board
    size(300, 300);
  }
    
  public void setup() {
    // Background Colour
    background(66, 228, 253);
  }
  
  public void draw() {
    // Drawing the square of the house
    fill(165, 22, 23);
    rect((float) (width/3.2), height/2,(float) (width/2.6),(float)     
    (height/2.6)); 

    // Drawing the chimney
    fill(198, 109, 71);
    rect((float) (width/1.7),(float) (height/4.4), width/16, height/8);

    // Drawing chimney smoke
    fill(255, 255, 255);
    ellipse((float) (width/1.6),(float) (height/7.3),(float) (width/20),
    height/8);
    
    // Drawing the top triangle of the house
    fill(165, 22, 23);
    triangle((float) (width/4.4), height/2, width/2, height/5,(float)     
    (width/1.3), height/2);

    // Drawing the Grass
    fill(0, 255, 0);
    rect(0,(float) (height/1.13), width/1,(float) (height/5.7));

    // Drawing the top window
    fill(204, 255, 255);
    ellipse(width/2,(float) (height/3.1), width/10, height/10);

    // Drawing the right window
    fill(204, 255, 255);
    rect((float) (width/1.8),(float) (height/1.9), width/10, height/10);
    // Drawing lines for the right window
    // Horizontal Line
    line((float) (width/1.8),(float) (height/1.72),(float) (width/1.52),(float)    (height/1.72));
    // Vertical Line
    line((float) (width/1.65),(float) (height/1.9),(float) (width/1.65),(float)   
    (height/1.6));
    
    // Drawing the left window
    fill(204, 255, 255);
    rect((float) (width/2.96),(float) (height/1.9), width/10, height/10);
    // Drawing lines for the left window
    // Horizontal Line
    line((float) (width/2.96),(float) (height/1.72),(float) (width/2.29),(float)    (height/1.72));
    // Vertical Line
    line((float) (width/2.58),(float) (height/1.9),(float) (width/2.58),(float)     (height/1.59));

    // Drawing the Door
    fill(204, 102, 0);
    rect((float) (width/2.2),(float) (height/1.321),(float) (width/11.4),   
    height/8);

    // Drawing the sun
    fill(255, 255, 0);
    ellipse(width/16, height/16, width/4, height/4);
  }
  
}