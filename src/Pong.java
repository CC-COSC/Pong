/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jordan
 */
public class Pong
{
    // Instance variables:
    private int xSpeed, ySpeed, xPos, yPos, radius;            //  variables for the ball
    private int pXPos, pYPos, pXSpeed, pYSpeed, length, width; //  variables for the paddle
    private double direction;
    
    // Constructor
    public Pong()
    {
        this.xPos = 50;
        this.yPos = 50;
        this.xSpeed = 10;
        this.ySpeed = 10;
    }
    // Accessors
    public int getXSpeed()
    {
        return xSpeed;
    }
    public int getYSpeed()
    {
        return ySpeed;
    }
    public int getXPos()
    {
        return xPos;
    }
    public int getYPos()
    {
        return yPos;
    }
    public int getRadius()
    {
        return radius;
    }
    public int getWidth()
    {
        return width;
    }
    public int getLength()
    {
        return length;
    }
    // Return the Y-Position / X-Position
    public double getDirection()
    {
        return yPos / xPos;
    }
    
    // Mutators
    public void setXSpeed(int xSpeed)
    {
        this.xSpeed = xSpeed;
    }
    public void setYSpeed(int ySpeed)
    {
        this.ySpeed = ySpeed;
    }
    public void setXPos(int xPos)
    {
        this.xPos = xPos;
    }
    public void setYPos(int yPos)
    {
        this.yPos = yPos;
    }
    public void setRadius(int radius)
    {
        this.radius = radius;
    }
    public void setWidth(int width)
    {
        this.width = width;
    }
    public void setLength(int length)
    {
        this.length = length;
    }
    
    // Utility funcionts
    @Override
    public String toString()
    {
        return "Direction: " + direction + "\n" +
               "x-position: " + xPos + "\n" +
               "y-position: " + yPos + "\n";
    }
}
