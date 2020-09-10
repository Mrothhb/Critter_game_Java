///////////////////////////////////////////////////////////////////////////////
//                
// Title:            (TurtleMT.java)
// Semester:         (CS8B) Fall 2018
//
// Author:           (Matthew Roth)
// Email:            (mrroth@ucsd.edu)
// CS Login:         (cs8bfds)
// Lecturer's Name:  (Prof. Paul Cao; TA's - Grace Chen, Alberto, Cheng, Emily,
//                     Godwin, Henry, Hensen, Hilda, Lavanya, Nishil, Sneha)
// 
// Class Desc:       this class the TrutleMT class will extend the DrawingTurtle class and
//                   implement the Runnable interface for multithreading
//                   the class will create turtles that will call on the run() method 
//                   to draw turtles on the gui screen
///////////////////////////////////////////////////////////////////////////////
import turtleClasses.Turtle;
import turtleClasses.World;
import java.awt.*;
import java.util.*;

/**
 * this class the TrutleMT class will extend the DrawingTurtle class and
 * implement the Runnable interface for multithreading
 * the class will create turtles that will call on the run() method 
 * to draw turtles on the gui screen 
 * */
public class TurtleMT extends DrawingTurtle implements Runnable {

  private final int PEN_WIDTH = 10;
  //private instance variables to initialize the turtles in their location
  //on the world and character to draw
  private char ch;
  private int x;
  private int y;
  private World w;
  /**
   * the args constructor to take in five arguments as parameters
   * for the character to be drawn, the x and y location on the screen
   * the world object and the delay count
   * @param c the char letter
   * @param x the x coordinate
   * @param y the y coordinate
   * @param world the canvas 
   * @param delay the time to delay drawing
   * */
  public TurtleMT(char c, int x, int y, World world, int delay){
    super(world, delay);
    this.ch = c;
    this.x = x;
    this.y = y;
    setPenWidth(PEN_WIDTH);
  }
  /**
   * the run method will be an overriden method on the 
   * Runnable class for use in Multithreading turtles
   * to be drawn simultaneously on screen
   * no args and no return value
   * */
  public void run(){
    //call the draw method from the DrawTurtle class with the arguments
    //from char, x, and y used from the instance variables in TurtleMT class
    draw(this.ch, this.x, this.y);    

  }
}
