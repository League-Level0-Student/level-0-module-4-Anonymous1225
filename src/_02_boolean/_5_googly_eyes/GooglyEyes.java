package _02_boolean._5_googly_eyes;

import processing.core.PApplet;

import processing.core.PImage;

/*
 * Goal: Put googly eyes on a face!
 * 
 * Instructions:
 * 1. Find an image on the Internet and drop it into the /images folder at the
 *    top level of this module. It can be anything as long as it has large eyes!
 * 
 * 2. Declare a variable for the image:
 *    PImage face;
 * 
 * 3. In your setup() method, import your image using the following code:
 *    face = loadImage("face.jpg");
 * 
 * 4. Resize your face image to the size of the window using the resize() method.
 * 
 * 5. In the draw() method, place a white ellipse over the left eye of your image.
      HINT: To find out where to put it, add code to print the mouseX and
      mouseY where you click the mouse.
 *
 * 6. Now add a pupil (the black part) to the left eye.
 * 
 * 7. Use mouseX and mouseY to move the left pupil where the mouse moves.
 * 
 * 8. Repeat the same steps for the right eye.
 * 
 * 9. Add a right pupil and make it move by using
 *    mouseX + [distance from left eye] and mouseY + [distance from left eye].
 * 
 * 10.Here’s the tricky part: stop the pupils from going outside of the white
 *    circles! To do this, imagine a rectangle that the pupil should stay
 *    within. When mouseX and mouseY goes outside of these bounds, set it back
 *    to the boundary. Put this code before you draw the pupils.
 */
public class GooglyEyes extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;

	PImage face;

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {

		face = loadImage("/Users/league/git/level-0-module-4-Anonymous1225/src/_02_boolean/_5_googly_eyes/face.png");
		size(800, 600);
		face.resize(800, 600);
	}

	@Override
	public void draw() {
		image(face, 0, 0);
		noStroke();
		fill(255, 255, 255);
		ellipse(400, 270, 140, 140);
		fill(0, 0, 0);

		fill(255, 255, 255);
		ellipse(300, 270, 140, 140);
		fill(0, 0, 0);
		//pythagorean theorem
		if (mouseX>435) {
			mouseX=435;
		}
		if (mouseX<365) {
			mouseX=365;
		}
		if (mouseY<235) {
			mouseY=235;
		}
		if (mouseY>305) {
			mouseY=305;
		}
		

//		if (dist >= 70) {
//			while (dist > 70) {
//				xdis = mouseX - 400;
//				ydis = mouseY - 270;
//				line1 = xdis * xdis;
//				liney = ydis * ydis;
//				dis = line1 + liney;
//				dist = Math.pow(dis, 0.5);
//				double idk = xdis / ydis;
//
//				double idkk = xdis * idk;
//				double dkkk = idkk;
//				int inte = 0;
//				while (dkkk > 1) {
//					inte += 1;
//					dkkk -= 1;
//				}
//				mouseY = inte;
//				if (mouseX < 400) {
//					mouseX -= 1;
//				}
//				if (mouseX > 400) {
//					mouseX += 1;
//				}
//			}

			// mousex should be equal
		

		ellipse(mouseX, mouseY, 70, 70);
		ellipse(mouseX - 100, mouseY, 70, 70);
		}
	

	static public void main(String[] args) {
		PApplet.main(GooglyEyes.class.getName());
	}
}
