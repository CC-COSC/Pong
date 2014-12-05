/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Jordan, Garfield, Jacob
 */
public class PongClient extends JFrame
{
    private Container contents;
    private JLabel score1, score2;
    private JButton start = new JButton("START");
    private Integer player1Score, player2Score;
    private Pong pong;
    private Graphics g;
    
    // Constructor: ball starts at the origin of the canvas with
    //   an initial speed of 10 pixels per second
    public PongClient()
    {
        // Set Visibility
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        PongClient p = new PongClient();
        PongGUI pgui = new PongGUI();
        pgui.setVisible(true);
    }
}
