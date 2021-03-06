///////////////////////////////////////////////////////////////////////////////
//                
// Title:            (MyStringBuilder.java)
// Semester:         (CS8B) Fall 2018
//
// Author:           (Matthew Roth)
// Email:            (mrroth@ucsd.edu)
// CS Login:         (cs8bfds)
// Lecturer's Name:  (Prof. Paul Cao; TA's - Grace Chen, Alberto, Cheng, Emily,
//                     Godwin, Henry, Hensen, Hilda, Lavanya, Nishil, Sneha)
// 
// Class Desc:      The MyStringBuilder class will create a word or string
//                  of characters that will act similar 
//                  to a StringBuilder object or a String. The core design
//                  is to have inner class objects hold a char value as a
//                  letter and point each character to another character 
//                  object in sequence as to appear as a string of letters
//                  in a word. This class will also be implemented with 
//                  the Turtle class to design letters and unique designs
//                  on a canvas on screen.     
//                    
///////////////////////////////////////////////////////////////////////////////
import turtleClasses.World; //import the turtle class World
import java.util.ArrayList;  //import the ArrayList class

/**
 * The MyStringBuilder class will create a word or string
 * of characters that will act similar 
 * to a StringBuilder object or a String. The core design
 * is to have inner class objects hold a char value as a
 * letter and point each character to another character 
 * object in sequence as to appear as a string of letters
 * in a word. This class will also be implemented with 
 * the Turtle class to design letters and unique designs
 * on a canvas on screen.
 * */
public class MyStringBuilder {
  // Do NOT add any additional instance variables.
  // Only the pointer to the first node is allowed to be used.

  public static final int WORLD_WIDTH = 800;
  public static final int WORLD_HEIGHT = 400;
  public static final int DELAY = 800;
  public final static int CHAR_WIDTH = 40;
  public final static int LINE_PADDING = 40;
  public final static int CHAR_SPACE = CHAR_WIDTH + LINE_PADDING;

  //private instance variable to hold the first CharacterNode in MyStringBuilder
  private CharacterNode firstNode;
 
  /**
   * the drawWordMT method will draw a word with the 
   * turtles from the TurtleMT class
   * no parameters or return value
   *
   * */
  public void drawWordMT() {

    //iterations to add turtle objects 
    final int QUAD = 4;
    //create a World object draw letters on screen with turtles
    World world = new World( WORLD_WIDTH, WORLD_HEIGHT );
    //create an ArrayList of turtles to keep track of each turtle object 
    ArrayList<Runnable> turtles = new ArrayList<Runnable>();
    //create an index node 
    CharacterNode index = firstNode;
    //iterate through and add a new Turtle to the ArrayList 
    for(int i = 0; i<this.length(); i++){
     char letter = index.getLetter();
     turtles.add(new TurtleMT(letter, (i+1)*CHAR_SPACE, CHAR_SPACE, world, DELAY));
     index = index.nextNode;
    }

    final int DOUBLE = 2;
    //create a CreativeTurtle object to design a unique drawing on the world canvas 
    CreativeTurtle creative = new CreativeTurtle( CHAR_SPACE / DOUBLE,
        DOUBLE*CHAR_SPACE,world,DELAY );

    //create an arraylist to hold threads for multithreading 
    ArrayList<Thread> threads = new ArrayList<Thread>();
    //iterate through the arraylist and create new threads to add to the list 
    //that contain the TurtleMT objects  
    for( int i = 0; i<this.length(); i++ ){
      Thread worker = new Thread( turtles.get(i) );
      threads.add( worker );
    }
    //keeping track of the threads with each turtle, start all the 
    //letter threads, and then join() the last thread and let all the
    //letter threads finish before allowing the call to run the 
    //creative turtle 
    try{
      for( int i =0;i<this.length();i++ ){
        threads.get(i).start();
        if( i == this.length()-1 ){
          threads.get(i).join();
          creative.draw();
        }
      }
    }catch ( InterruptedException ex ){
    }

  }


  /**
   * the toString method is no args with no parameters
   * and returns a String reppresentation of the 
   * MyStringBuilder Object
   * @return string the letters concatenated
   *
   **/
  public String toString(){
    //String to initialize the return value for the msb object 
    String str = "";
    if( firstNode == null )
      return str;
    //get the first character in the objects and concat to the string 
    str += firstNode.getLetter();
    //create an indexing pointer node as characternode object 
    CharacterNode pointer = firstNode;
    //loop through and continue until nextnode is null
    while( pointer.nextNode != null ) {
      //concat each character from the nextNode to the String 
      str += pointer.nextNode.getLetter();
      //reset the pointer to the nextNode 
      pointer = pointer.nextNode;

    }

    return str;

  }

  /**
   * taking an argument in the form of a char
   * as a paramter, and will create new CharacterNode
   * objects and set the onbjects ton hold a char value
   * @param addingChar the char letter
   * */
  public void append( char addingChar ) {
    //create an index CharacterNode to point at the firstNode 
    CharacterNode index = firstNode;
    //create a current pointer node to keep track of the location in the
    //iteration
    CharacterNode currNode = new CharacterNode( addingChar );
    //if the firstNode is null value then point the firstNode at the currNode 
    if( this.firstNode == null ) {

      firstNode = currNode;

    }

    else{
      //while the nextNode is not null pointer, set the index to the nextNode
      //in the indexed node
      while( index.nextNode != null ) {

        index = index.nextNode;

      }
      //set the nextNode in the index node to point at the currNode
      index.nextNode = currNode;

    }

  }

  /**
   * the length method will return the length 
   * of the data structure as an int value 
   * @return count the length of MyStringBuilder
   *
   * */
  public int length() {
    //create a CharacterNode index object
    CharacterNode index = firstNode;
    //set a counter for each CharacterNode object in iteration
    int count = 0;
    //if the MyStringBuilder object is null pointer, return 0
    if( index == null )
      return count;
    //else increment the counter for the first Pointer, and enter 
    //a while loop to iterate through the consecutive nodes and increment
    //count each time until the nextNode is pointing null
    else{
      count++;
      while( index.nextNode != null ){
        index = index.nextNode;
        count++;
      }
    }
    return count;
  }

  /**
   * the delete method will take in two arguments as int values 
   * and remove letters from the MyStringBuilder object at 
   * the specified location on the sequence of chars provided
   * by the ints
   * @param start the intial char to start at
   * @param end the ending char 
   * */
  public void delete ( int start, int end ) throws StringIndexOutOfBoundsException {
    //if the start equals the end then return doing nothing 
    if( start == end )
      return;
    //if the start is less thasn zero or greater than end of greater than length()
    //throw an Exception
    if( start < 0 || start > end || start > length() )
      throw new StringIndexOutOfBoundsException("Invalid start");
    //if start equals zero enter this if block
    if (start == 0 ){
      //create a CharacterNode index pointer set to intialize at firstNode
      CharacterNode index = firstNode;
      //iterate through the MyStringBuilder and set the Index to nextNode each 
      //iteration 
      for( int i = 0; i<end; i++ ){
        if( i >= length() )
          break;
        index = index.nextNode;
      }
      firstNode = index;

    }else {
      //set holding pointers for CharacterNodes to index the pointer
      CharacterNode temp = null;
      CharacterNode index = firstNode;
      CharacterNode index2 = index;
      //create a CharacterNode to be inserted into the MyStringBuilder object
      for( int j = 0; j<end; j++ ){
        index2 = index2.nextNode; 
      }

      for( int i = 0; i<(start-1); i++ ){
        index = index.nextNode;
      }

      index.nextNode = index2;   
    }

  }
  /**
   * the insert method will take two arguments as int and
   * as char, and add the char to the MyStringBuilder at the 
   * designated position given by the int 
   * @param offset the position of letter
   * @param insertChar the letter to insert
   *
   * */
  public void insert ( int offset, char insertChar ) throws IndexOutOfBoundsException {

    //if the offset parameter is less than zero or greater than or eaqual 
    //to the length, throw an Exception
    if ( offset < 0 || offset >= length() ) {
      throw new IndexOutOfBoundsException("Invalid offset");
    }
    //set holding pointers for CharacterNodes to index the pointer
    CharacterNode temp = null;
    CharacterNode index = firstNode;
    //create a CharacterNode to be inserted into the MyStringBuilder object
    CharacterNode letter = new CharacterNode( insertChar );
    //if the offset is zero, then shift the firstNode pointer
    if( offset == 0 ){
      firstNode = letter;
      firstNode.nextNode = index;
      //if the offset is 1, then have tje firstNodes next node point to 
      //the new CharacterNode and then point the new CharNode to the preceeding
      //nodes
    }else if( offset == 1 ){
      temp = index.nextNode;
      firstNode.nextNode = letter;
      letter.nextNode = temp;
    }else{
      //iterate through the nodes and shift the index if the node previous to
      //the letter in question, to point its nextNode at the new CharacterNode
      //and then point the new ChracterNode with the replacement letter at the 
      //index nextNode. This will act as a replacement in the MyStringBuilder
      for( int i = 0;i<offset-1; i++ ){
        index = index.nextNode;
      }
      //let the new CharacterNode letters nextNode point at the index nextNode
      letter.nextNode = index.nextNode;
      //let the index nextNode point at the letter 
      index.nextNode = letter;
    }   
  }

  /**
   * the equals method will compare MyStringBuilder with 
   * another MyStringBuilder or a String and return true or 
   * false
   * @param other the object 
   * @return true/false
   * */
  public boolean equals( Object other ){
    //create the boolean variable to start false 
    boolean result = false;
    //if the object is an instanceof MyStringBuilder enter if block
    if( other instanceof MyStringBuilder ){
      //create a MyStringBuilder object and cast the other into MSB to use 
      //in testing for equality
      MyStringBuilder msb = ( MyStringBuilder )other;
      //if the length of the parameter is not equal to the length of this return false
      if( msb.length() != this.length() )
        return result;
      //if the first letter of the other object doesnt equal the first letter of 
      //this return false 
      if( msb.firstNode.getLetter() != this.firstNode.getLetter() )
        return result;
      //create two CharacterNode object to act as an index pointer
      CharacterNode indexMsb = msb.firstNode;
      CharacterNode indexThis = this.firstNode;
      //iterate through the remaining objects and rest for equality
      for( int i = 0; i<msb.length()-1; i++ ){

        indexMsb = indexMsb.nextNode;
        indexThis = indexThis.nextNode;
        //if the letter in the other object doesnt equal the letter in this return
        //false 
        if( indexMsb.getLetter() != indexThis.getLetter() )
          return result;
      }
      //return true if all cases are passed
      result = true;
      //if the other object is an instanceof String object enter this if block      
    }else if( other instanceof String ){
      //create a string and cast other object to String to use for testing 
      String str = (String)other;
      //if the string length is not equal to the lenght of this object 
      if( str.length() != this.length() )
        return result;
      //create an index pointer CharacterNode object set to point at firstNode
      //initially
      CharacterNode index = firstNode;
      //if the character at the first index doesnt equal to the character at 
      //the firstNode in this, return false 
      if( str.charAt(0) != firstNode.getLetter() )
        return result;
      //create a char array using the string from other 
      char[] word = str.toCharArray();
      //iterate through the this objects and the array of chars and test equality
      for( int j = 1; j<word.length; j++ ){

        index = index.nextNode;
        //if the char array element doesnt equal the letter at the corresponding
        //index return false
        if( word[j] != index.getLetter() )
          return result;
      }
      //if all the test cases pass then set the result to true 
      result = true;
      //if the other object is not an instanceof string or MyStringBuilder return
      //false 
    }else 
      return result;  
    //return the final result variable true or false 
    return result;
  }

  /**
   * private inner class the create an object CharacterNode
   * that will be a placeholder for a letter as a char that 
   * can be pointed to from a MyStringBuilder object
   * */
  class CharacterNode {
    //private instance variable to be the letter 
    private final char letter;
    //public CharacterNode that will point to the next node or null
    public CharacterNode nextNode;
    /**
     * constructor taking in an argument as a char 
     * and initializing the letter to the char
     * @param c the letter
     *
     * */
    public CharacterNode ( char c ){

      this.letter = c;

    }

    /**
     * get the letter char and return the 
     * char
     * @return char the letter
     *
     * */
    public char getLetter () {

      return this.letter;

    }
  }  
}

