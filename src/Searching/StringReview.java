package Searching;


public class StringReview {

  
    public static void main(String[] args) {
        String x = "The quick bown fox";
        //index of finds the location of something returns int
        int loc = x.indexOf("q"); 
            System.out.println("q is at " + loc);
            loc= x.indexOf("o",13);
            System.out.println("Starting at 13, o is at " + loc);
            loc = x.indexOf("q",13); 
            System.out.println("Starting at 13 q is at " + loc);
            
            char c = x.charAt(13);
                System.out.println("The character at 13 is " + c);
                
                int len = x.length(); 
                System.out.println(x + " is " + len + " character long.");
                
                String y = x.substring(10,13); 
                System.out.println(y);
                y = x.substring(16); 
                System.out.println(y);
                
                System.out.println(x.toUpperCase());
                x  = x.toLowerCase();
                
                y = "jumped over the lazy dog"; 
                int z = x.compareTo(y); 
                System.out.println("x compared to y is " + z);
                z = x.compareTo(y); 
                System.out.println("x compared to y is " + z);
                //"t"he vs "j"umped is 10 letters away
                System.out.println("Bob vs Andy: " + "Bob".compareTo("Andy"));//1
                System.out.println("Bob vs Andy: " + "Bob".compareTo("Bob"));
                System.out.println("Tim vs Tom: " + "Tim".compareTo("Tom"));
                //compareTo = 0 means you got exact match
            
    }
    
}
