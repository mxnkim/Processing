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
    
  void display() {
    
    timer++;
  }
  
  void rotateCake() {
    noStroke();
    rad =(frameCount * 0.25);
    oscillation = sin(rad);
    //background(92, 240, 221);
    
    pushMatrix();
    translate(width/2, height/2);
    rotate(radians(timer * 2 % 360));
    image(img, xPos, yPos);
    popMatrix();
    
  }
}
