
  /*** Go to the recipe to run the demonstration before starting this program ***/

void setup() {
  /* Set the size of your sketch to be a rectangle like in the recipe demonstration */
  size(500,500);
  
  /* Call the noFill() command so all the ellipses will be transparent */
  noFill();
}
int X1 = 150;
int X2 = 350;
void draw() {
background (#C7A4FA);
        /* Use a for loop to make the first set of rings that will start in the left half of the window
        (you can use the code from your Bullseye program).*/          
//left side
for(int i = 10; i >= 1; i--){
  ellipse(X1, 100, (i * 20), (i * 20));
  }
//right side  
  for(int i = 10; i >= 1; i--){
  ellipse(X2, 100, (i * 20), (i * 20));
  }
X1 =  X1 + 1;
X2 = X2 - 1;
        /*Make this set of rings move across the sketch to the right 
        Hint: make two variables, one for x and another for the speed. 
        Then increase x by the amount in speed */
 
        
        /*When the rings reach the right side of the sketch, reverse the direction so they move
        Hint: speed = -speed */
if (X1 > 500) {
  X1 = 0;
}

if (X2 < 0) {
  X2 = 500;
}
         
        /*When the rings reach the left side of the sketch, reverse the direction again */
        
         
 //CHALLENGE - to finish the Amazing Rings 
 
        /*Add another for loop to draw the second set of rings that will start in the right half of the window */
        
        
        /*Make this set of rings move in the opposite direction to the other rings 
        These rings must also "bounce" off the sides of the window.*/
        
}
