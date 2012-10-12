import processing.core.*; 
import processing.xml.*; 

import java.applet.*; 
import java.awt.Dimension; 
import java.awt.Frame; 
import java.awt.event.MouseEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.FocusEvent; 
import java.awt.Image; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class ArrayCupcakes2 extends PApplet {

ArrayList cupcakes; 
float oscillation;
float rad;
float xPos;
float YPos;

public void setup() {
  size(500, 500);
  cupcakes = new ArrayList();
//  cupcakes.add(new Cupcake());
}

public void draw() {
  background(118, 231, 241);
  for (int i = 0; i < cupcakes.size(); i++) {
    println(cupcakes.size());
    Cupcake myCake = (Cupcake) cupcakes.get(i);
    myCake.display();
    myCake.rotateCake();
  //  map(value, originallow, originalhigh, 
 //   float oscMapped = map(oscillation, );

    
  }
}

public void keyPressed() {
  Cupcake cup = new Cupcake();
  cupcakes.add(cup);
}
class Cupcake { 
  PImage img;
  float xPos;
  float yPos;
  float xSpeed;
  float ySpeed;
  int timer;


  Cupcake(){
    img = loadImage("cupcake.png");
  }
    
  public void display() {
    
    timer++;
  }
  
  public void rotateCake() {
    noStroke();
    rad =(frameCount * 0.25f);
    oscillation = sin(rad);
    //background(92, 240, 221);
    
    pushMatrix();
    translate(width/2, height/2);
    rotate(radians(timer * 2 % 360));
    image(img, xPos, yPos);
    popMatrix();
    
  }
}
  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#FFFFFF", "ArrayCupcakes2" });
  }
}
