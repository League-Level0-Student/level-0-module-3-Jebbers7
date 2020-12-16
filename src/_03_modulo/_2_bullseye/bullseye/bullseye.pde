
void setup() {
 
  // set the size of your sketch
  size(500,500);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
 for(int count = 8; count > 0; count -= 1){
  if(count % 2 == 0){
   fill(#0319FF); 
  }
  else{
    fill(#FF1803);
  }
   ellipse(250,250, count*25,count*25);
  
 }
   //Use an if statement and modulo to alternate the color of your rings.
  
  
}
