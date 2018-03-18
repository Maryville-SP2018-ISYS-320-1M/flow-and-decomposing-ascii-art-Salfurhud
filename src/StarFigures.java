/*
  	ISYS 320
  	Name(s):AlfurhudSolomon
  	Date: March18,2018
*/

// 4. Your pseudocode algorithm for how to break down the figure
/*
 1. Create a an array of integers containing number of stars in each line
 
 2. Loop through the array and call drawStars function to draw the stars in that line 
 	drawStars(numberOfStars);
 	
 3. Using if Else, Print the number of stars in the correct position inside the drawStars method
 	if(stars==5) {
 	draw five stars
 	}
 	
 */


public class StarFigures {

	public static void main(String[] args) {
int[] starMap =  {5,5,2,1,2, 0, 0, 5,5,2,1,2,5,5,0,0,1,1,1,5,5,2,1,2};

		
		for(int x = 0; x<  starMap.length; x++) {
			drawStars(starMap[x]);
		}

	}

	
	public static void drawStars(int starCount) {

		
		if(starCount == 5) {
			System.out.println("*****");
		} else if (starCount == 2) {
			System.out.println(" * * ");
		} else if (starCount == 1) {
			System.out.println("  *  ");
		} else {
			System.out.println("     ");
		}
	}

}