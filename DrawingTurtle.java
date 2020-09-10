import turtleClasses.Turtle;
import turtleClasses.World;
import java.awt.*;
import java.util.*;

public class DrawingTurtle extends Turtle
{

  // A lot of random constants
  public final int HALF_CHAR_WIDTH = 20;
  public final int CHAR_WIDTH = 40;
  public final int LINE_HEIGHT = 80;
  public final int CHAR_PADDING = 40;
  public final int LINE_PADDING = 40;
  public final int LINE_SPACE = LINE_HEIGHT + CHAR_PADDING;
  public final int TURN_DEGREE_ONE = 120;
  public final int TURN_DEGREE_W_L = 86;
  public final int TURN_DEGREE_W_S = 53;
  public final int W_LONG_LEG = 80;
  public final int W_SHORT_LEG = 25;
  public final int TURN_DEGREE_Q = 45;
  public final int TURN_DEGREE_N = 63;
  public final int N_SLOPE = 89;
  public final int TURN_DEGREE_R = 45;
  public final int R_SLOPE = 56;

  // Included out of obligation
  public DrawingTurtle(World world, int delay ){
    super(world, delay);
  }

  /*
   * This method takes the char you want drawn, and the (x, y) coordinates
   * where you want the letter to be drawn.
   */
  public void draw(char ch, int x, int y)
  {
    if ((ch < 'A' || ch > 'Z') && ch != ' ') {
      System.err.println("Possibly invalid character. ");
    }
    switch(ch)
    {
      case 'A': this.drawA(x,y); break;
      case 'B': this.drawB(x,y); break;
      case 'C': this.drawC(x,y); break;
      case 'D': this.drawD(x,y); break;
      case 'E': this.drawE(x,y); break;
      case 'F': this.drawF(x,y); break;
      case 'G': this.drawG(x,y); break;
      case 'H': this.drawH(x,y); break;
      case 'I': this.drawI(x,y); break;
      case 'J': this.drawJ(x,y); break;
      case 'K': this.drawK(x,y); break;
      case 'L': this.drawL(x,y); break;
      case 'M': this.drawM(x,y); break;
      case 'N': this.drawN(x,y); break;
      case 'O': this.drawO(x,y); break;
      case 'P': this.drawP(x,y); break;
      case 'Q': this.drawQ(x,y); break;
      case 'R': this.drawR(x,y); break;
      case 'S': this.drawS(x,y); break;
      case 'T': this.drawT(x,y); break;
      case 'U': this.drawU(x,y); break;
      case 'V': this.drawV(x,y); break;
      case 'W': this.drawW(x,y); break;
      case 'X': this.drawX(x,y); break;
      case 'Y': this.drawY(x,y); break;
      case 'Z': this.drawZ(x,y); break;
      case ' ': this.drawSpace(x,y); break;

    }
  }


  /*
  * Name: drawA
  * Purpose: This method will draw letter A.
  * Parameters: Integer x is x-coordinate of upper left corner of A.
  *             Integer y is y-coordinate of upper left corner of A.
  * Return: void.
  */
  public void drawA(int x, int y)
  {
    penUp();
    moveTo(x, y);
    penDown();
    moveTo(x + CHAR_WIDTH, y);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT / 2);
    moveTo(x, y + LINE_HEIGHT / 2);
    moveTo(x, y);
    moveTo(x, y + LINE_HEIGHT);
  }

  /*
  * Name: drawB
  * Purpose: This method will draw letter B.
  * Parameters: Integer x is x-coordinate of upper left corner of B.
  *             Integer y is y-coordinate of upper left corner of B.
  * Return: void.
  */
  public void drawB(int x, int y)
  {
    penUp();
    moveTo(x, y);
    penDown();
    moveTo(x + CHAR_WIDTH, y + CHAR_WIDTH / 2);
    moveTo(x, y + CHAR_WIDTH);
    moveTo(x + CHAR_WIDTH, y + 3 * CHAR_WIDTH / 2);
    moveTo(x, y + LINE_HEIGHT);
    moveTo(x, y);
  }

  /*
  * Name: drawC
  * Purpose: This method will draw letter C.
  * Parameters: Integer x is x-coordinate of upper left corner of C.
  *             Integer y is y-coordinate of upper left corner of C.
  * Return: void.
  */
  public void drawC(int x, int y)
  {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block
    moveTo(x + CHAR_WIDTH, y);
    penDown();
    moveTo(x, y);
    moveTo(x, y + LINE_HEIGHT);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT);
  }

  /*
  * Name: drawD
  * Purpose: This method will draw letter D
  * Parameters: Integer x is x-coordinate of upper left corner of D.
  *             Integer y is y-coordinate of upper left corner of D.
  * Return: void.
  */
  public void drawD(int x, int y)
  {
    penUp();
    moveTo(x, y);
    penDown();
    moveTo(x + CHAR_WIDTH / 2, y);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT / 2);
    moveTo(x + CHAR_WIDTH / 2, y + LINE_HEIGHT);
    moveTo(x, y + LINE_HEIGHT);
    moveTo(x, y);
  }

  /*
  * Name: drawE
  * Purpose: This method will draw letter E.
  * Parameters: Integer x is x-coordinate of upper left corner of E.
  *             Integer y is y-coordinate of upper left corner of E.
  * Return: void.
  */
  public void drawE(int x, int y)
  {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block
    turnToFace(getXPos(), getYPos() + 1); // face down
    penDown();
    forward(LINE_HEIGHT);
    penUp();
    moveTo(x, y);
    turnToFace(getXPos() + 1, getYPos()); // face right
    penDown();
    forward(CHAR_WIDTH);
    penUp();
    moveTo(x, y + LINE_HEIGHT / 2);
    penDown();
    forward(CHAR_WIDTH);
    penUp();
    moveTo(x, y + LINE_HEIGHT);
    penDown();
    forward(CHAR_WIDTH);
  }

  /*
  * Name: drawF
  * Purpose: This method will draw letter F.
  * Parameters: Integer x is x-coordinate of upper left corner of F.
  *             Integer y is y-coordinate of upper left corner of F.
  * Return: void.
  */
  public void drawF(int x, int y)
  {
    penUp();
    moveTo(x, y);
    penDown();
    moveTo(x + CHAR_WIDTH, y);
    moveTo(x, y);
    moveTo(x, y + LINE_HEIGHT);
    moveTo(x, y + LINE_HEIGHT / 2);
    moveTo(x + CHAR_WIDTH / 2, y + LINE_HEIGHT / 2);
  }

  /*
  * Name: drawG
  * Purpose: This method will draw letter G.
  * Parameters: Integer x is x-coordinate of upper left corner of G.
  *             Integer y is y-coordinate of upper left corner of G.
  * Return: void.
  */
  public void drawG(int x, int y)
  {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block
    moveTo(x + CHAR_WIDTH, y);
    penDown();
    moveTo(x, y);
    moveTo(x, y + LINE_HEIGHT);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT / 2);
    moveTo(x + CHAR_WIDTH / 2, y + LINE_HEIGHT / 2);
  }

  /*
  * Name: drawH
  * Purpose: This method will draw letter H.
  * Parameters: Integer x is x-coordinate of upper left corner of H.
  *             Integer y is y-coordinate of upper left corner of H.
  * Return: void.
  */
  public void drawH(int x, int y)
  {
    penUp();
    moveTo(x, y);
    penDown();
    moveTo(x, y + LINE_HEIGHT);
    moveTo(x, y + LINE_HEIGHT / 2);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT / 2);
    moveTo(x + CHAR_WIDTH, y);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT);
  }

  /*
  * Name: drawI
  * Purpose: This method will draw letter I.
  * Parameters: Integer x is x-coordinate of upper left corner of I.
  *             Integer y is y-coordinate of upper left corner of I.
  * Return: void.
  */
  public void drawI(int x, int y)
  {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block
    penDown();
    moveTo(x + CHAR_WIDTH, y);
    moveTo(x + CHAR_WIDTH / 2, y);
    moveTo(x + CHAR_WIDTH / 2, y + LINE_HEIGHT);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT);
    moveTo(x, y + LINE_HEIGHT);
  }

  /*
  * Name: drawJ
  * Purpose: This method will draw letter J.
  * Parameters: Integer x is x-coordinate of upper left corner of J.
  *             Integer y is y-coordinate of upper left corner of J.
  * Return: void.
  */
  public void drawJ(int x, int y)
  {
    penUp();
    moveTo(x + CHAR_WIDTH, y);
    penDown();
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT);
    moveTo(x, y + LINE_HEIGHT);
    moveTo(x, y + LINE_HEIGHT / 2);
  }

  /*
  * Name: drawK
  * Purpose: This method will draw letter K.
  * Parameters: Integer x is x-coordinate of upper left corner of K.
  *             Integer y is y-coordinate of upper left corner of K.
  * Return: void.
  */
  public void drawK(int x, int y)
  {
    penUp();
    moveTo(x, y);
    penDown();
    moveTo(x, y + LINE_HEIGHT);
    moveTo(x, y + LINE_HEIGHT / 2);
    moveTo(x + CHAR_WIDTH, y);
    moveTo(x, y + LINE_HEIGHT / 2);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT);
  }

  /*
  * Name: drawL
  * Purpose: This method will draw letter L.
  * Parameters: Integer x is x-coordinate of upper left corner of L.
  *             Integer y is y-coordinate of upper left corner of L.
  * Return: void.
  */
  public void drawL(int x, int y)
  {
    penUp();
    moveTo(x, y);
    penDown();
    moveTo(x, y + LINE_HEIGHT);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT);
  }

  /*
  * Name: drawM
  * Purpose: This method will draw letter M.
  * Parameters: Integer x is x-coordinate of upper left corner of M.
  *             Integer y is y-coordinate of upper left corner of M.
  * Return: void.
  */
  public void drawM(int x, int y)
  {
    penUp();
    moveTo(x, y);
    penDown();
    moveTo(x, y + LINE_HEIGHT);
    moveTo(x, y);
    moveTo(x + CHAR_WIDTH / 2, y + LINE_HEIGHT / 2);
    moveTo(x + CHAR_WIDTH, y);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT);
  }

  /*
  * Name: drawN
  * Purpose: This method will draw letter N.
  * Parameters: Integer x is x-coordinate of lower left corner of N.
  *             Integer y is y-coordinate of lower left corner of N.
  * Return: void.
  */
  public void drawN(int x, int y)
  {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block
    penDown();
    moveTo(x, y + LINE_HEIGHT);
    moveTo(x, y);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT);
    moveTo(x + CHAR_WIDTH, y);
  }

  /*
  * Name: drawO
  * Purpose: This method will draw letter O.
  * Parameters: Integer x is x-coordinate of upper left corner of O.
  *             Integer y is y-coordinate of upper left corner of O.
  * Return: void.
  */
  public void drawO(int x, int y)
  {
    penUp();
    moveTo(x, y);
    penDown();
    moveTo(x + CHAR_WIDTH, y);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT);
    moveTo(x, y + LINE_HEIGHT);
    moveTo(x, y);
  }


  /*
  * Name: drawP
  * Purpose: This method will draw letter P.
  * Parameters: Integer x is x-coordinate of upper left corner of P.
  *             Integer y is y-coordinate of upper left corner of P.
  * Return: void.
  */
  public void drawP(int x, int y)
  {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block
    penDown();
    moveTo(x, y + LINE_HEIGHT);
    moveTo(x, y + LINE_HEIGHT / 2);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT / 2);
    moveTo(x + CHAR_WIDTH, y);
    moveTo(x, y);
  }

  /*
  * Name: drawQ
  * Purpose: This method will draw letter Q.
  * Parameters: Integer x is x-coordinate of upper left corner of Q.
  *             Integer y is y-coordinate of upper left corner of Q.
  * Return: void.
  */
  public void drawQ(int x, int y)
  {
    penUp();
    moveTo(x, y);
    penDown();
    moveTo(x + CHAR_WIDTH, y);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT);
    moveTo(x + CHAR_WIDTH / 2, y + LINE_HEIGHT / 2);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT);
    moveTo(x, y + LINE_HEIGHT);
    moveTo(x, y);
  }

  /*
  * Name: drawR
  * Purpose: This method will draw letter R.
  * Parameters: Integer x is x-coordinate of upper left corner of R.
  *             Integer y is y-coordinate of upper left corner of R.
  * Return: void.
  */
  public void drawR(int x, int y)
  {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block
    penDown();
    moveTo(x, y + LINE_HEIGHT);
    moveTo(x, y + LINE_HEIGHT / 2);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT);
    moveTo(x, y + LINE_HEIGHT / 2);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT / 2);
    moveTo(x + CHAR_WIDTH, y);
    moveTo(x, y);
  }

  /*
  * Name: drawS
  * Purpose: This method will draw letter S.
  * Parameters: Integer x is x-coordinate of upper left corner of S.
  *             Integer y is y-coordinate of upper left corner of S.
  * Return: void.
  */
  public void drawS(int x, int y)
  {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block
    penDown();
    moveTo(x + CHAR_WIDTH, y);
    moveTo(x, y);
    moveTo(x, y + LINE_HEIGHT / 2);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT / 2);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT);
    moveTo(x, y + LINE_HEIGHT);
  }

  /*
  * Name: drawT
  * Purpose: This method will draw letter T.
  * Parameters: Integer x is x-coordinate of upper left corner of T.
  *             Integer y is y-coordinate of upper left corner of T.
  * Return: void.
  */
  public void drawT(int x, int y)
  {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block
    penDown();
    moveTo(x + CHAR_WIDTH, y);
    moveTo(x + CHAR_WIDTH / 2, y);
    moveTo(x + CHAR_WIDTH / 2, y + LINE_HEIGHT);
  }

  /*
  * Name: drawU
  * Purpose: This method will draw letter U.
  * Parameters: Integer x is x-coordinate of upper left corner of U.
  *             Integer y is y-coordinate of upper left corner of U.
  * Return: void.
  */
  public void drawU(int x, int y)
  {
    penUp();
    moveTo(x, y);
    penDown();
    moveTo(x, y + LINE_HEIGHT);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT);
    moveTo(x + CHAR_WIDTH, y);
  }

  /*
  * Name: drawV
  * Purpose: This method will draw letter V.
  * Parameters: Integer x is x-coordinate of upper left corner of V.
  *             Integer y is y-coordinate of upper left corner of V.
  * Return: void.
  */
  public void drawV(int x, int y)
  {
    penUp();
    moveTo(x, y);
    penDown();
    moveTo(x + CHAR_WIDTH / 2, y + LINE_HEIGHT);
    moveTo(x + CHAR_WIDTH, y);
  }

  /*
  * Name: drawW
  * Purpose: This method will draw letter W.
  * Parameters: Integer x is x-coordinate of upper left corner of W.
  *             Integer y is y-coordinate of upper left corner of W.
  * Return: void.
  */
  public void drawW(int x, int y)
  {
    penUp();
    moveTo(x, y);
    penDown();
    moveTo(x, y + LINE_HEIGHT);
    moveTo(x + CHAR_WIDTH / 2, y + LINE_HEIGHT);
    moveTo(x + CHAR_WIDTH / 2, y);
    moveTo(x + CHAR_WIDTH / 2, y + LINE_HEIGHT);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT);
    moveTo(x + CHAR_WIDTH, y);
  }

  /*
  * Name: drawX
  * Purpose: This method will draw letter X.
  * Parameters: Integer x is x-coordinate of upper left corner of X.
  *             Integer y is y-coordinate of upper left corner of X.
  * Return: void.
  */
  public void drawX(int x, int y)
  {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block
    penDown();
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT);
    penUp();
    moveTo(x + CHAR_WIDTH, y);
    penDown();
    moveTo(x, y + LINE_HEIGHT);
  }

  /*
  * Name: drawY
  * Purpose: This method will draw letter Y.
  * Parameters: Integer x is x-coordinate of upper left corner of Y.
  *             Integer y is y-coordinate of upper left corner of Y.
  * Return: void.
  */
  public void drawY(int x, int y)
  {
    penUp();
    moveTo(x, y);
    penDown();
    moveTo(x + CHAR_WIDTH / 2, y + LINE_HEIGHT / 2);
    moveTo(x + CHAR_WIDTH / 2, y + LINE_HEIGHT);
    moveTo(x + CHAR_WIDTH / 2, y + LINE_HEIGHT / 2);
    moveTo(x + CHAR_WIDTH, y);
  }

  /*
  * Name: drawZ
  * Purpose: This method will draw letter Z.
  * Parameters: Integer x is x-coordinate of upper left corner of Z.
  *             Integer y is y-coordinate of upper left corner of Z.
  * Return: void.
  */
  public void drawZ(int x, int y)
  {
    penUp();
    moveTo(x, y);
    penDown();
    moveTo(x + CHAR_WIDTH, y);
    moveTo(x, y + LINE_HEIGHT);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT);
  }

  /*
  * Name: drawSpace
  * Purpose: This method will draw a space.
  * Parameters: Integer x is x-coordinate of upper left corner of space.
  *             Integer y is y-coordinate of upper left corner of space.
  * Return: void.
  */
  public void drawSpace(int x, int y)
  {
    penUp();
    moveTo(x, y);
    moveTo(x + CHAR_WIDTH, y + LINE_HEIGHT);
    penDown();
  }
}
