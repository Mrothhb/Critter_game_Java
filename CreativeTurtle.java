///////////////////////////////////////////////////////////////////////////////
//                
// Title:            (CreativeTurtle.java)
// Semester:         (CS8B) Fall 2018
//
// Author:           (Matthew Roth)
// Email:            (mrroth@ucsd.edu)
// CS Login:         (cs8bfds)
// Lecturer's Name:  (Prof. Paul Cao; TA's - Grace Chen, Alberto, Cheng, Emily,
//                     Godwin, Henry, Hensen, Hilda, Lavanya, Nishil, Sneha)
// 
// Class Desc:      The Creative Turtle class will extend the DrawingTurtle 
//                  class and utilize the methods, overriding the draw method with a unique 
//                  design on the world canvas using turtles
//                    
///////////////////////////////////////////////////////////////////////////////
import turtleClasses.Turtle;
import turtleClasses.World;
import java.awt.*;
import java.util.*;

/**
 * the creative turtle class will draw a unique 
 * design with turtles on the world canvas
 * using the draw() method 
 * */
public class CreativeTurtle extends DrawingTurtle {
  //private instance variables magic numbers
  private final int PEN_WIDTH = 10;
  private final int PEN_WIDTH_CREATIVE = 20;
  //private instance variables to initialize the world and turtle 
  private int x;
  private int y;
  private World w;
  public CreativeTurtle(int x, int y, World world, int delay){
    super(world, delay);
    this.x = x;
    this.y = y;
    setPenWidth(PEN_WIDTH_CREATIVE); //Feel free to change pen width here or in draw method
  }
  /**
   * the draw method will draw a unique design on 
   * the screen with turtles
   * */
  public void draw() {
    final int XPOS_START = 40;
    final int YPOS_START = 20;
    final int XPOS_END = 400;
    penUp();
    moveTo(XPOS_START,YPOS_START );
    penDown();
    moveTo(YPOS_START, YPOS_START);
    penDown();


  }

}

