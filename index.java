int xPosition = 75;
int yPosition = 75;
int diameter = 10;
int width = 100;
int rectColor = 128;
int ellipseColor = 255;

void mousePressed(){
frameRate(30)
rectMode(CORNER)
background(255)
rect(random(500),random(500), random(250),random(250))
}


void setup() {
	size(500, 500);
}

void draw() {
// Step 1: Write code that draws the following screenshots 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 

// Step 4: Make it so when the program runs the ball slides off the screen exiting at the point (500, 500)
 
 
  stroke(0);

 fill(random(255),random(255),random(255));
  ellipse(mouseX+random(50),mouseY + random(50), diameter, diameter);
  


  

}
