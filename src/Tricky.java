/*
  	ISYS 320
  	Name(s):Alfurhud Solomon
  	Date: March 3, 2018
*/

// 1. Your predicted output 
 

public class Tricky {
    public static void main(String[] args) {
        message1();
        message2();
        System.out.println("Done with main.");
    }
    
    public static void message1() {
        System.out.println("This is message1.");
    }
    
    public static void message2() {
        System.out.println("This is message2.");
        message1();
        System.out.println("Done with message 2.");
    }
}

// 3. Were you correct? Explain any differences
 
 

