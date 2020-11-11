/*
9. Dice Simulator 
Write a GUI application that simulates a pair of dice, 
similar to that shown in Figure 13-33. 
Each time the button is clicked, the application should roll the dice, 
using random numbers to determine the value of each die. 
(This chapter’s source code folder contains images that you can use to display the dice.)

*/

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DiceGUI extends JFrame
{
   private String images[] = {"Die1.png","Die2.png","Die3.png","Die4.png","Die5.png","Die6.png"};
   private JPanel imagePanel;
   private JPanel buttonPanel;
   private JButton rollBtn;
   private JLabel imageLabel1 = new JLabel();
   private JLabel imageLabel2 = new JLabel();
   private ImageIcon dice1;
   private ImageIcon dice2;
   private  Die dice = new Die(6); 
   //private final int WINDOW_WIDTH = 1000;  // Window width
   //private final int WINDOW_HEIGHT = 600; // Window height
   
   public DiceGUI()
   {
     setTitle("Dice Simulator");
    // setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLayout(new BorderLayout());
     buildImagePanel();
     buildButtonPanel();
     add(imagePanel,BorderLayout.CENTER);
     add(buttonPanel,BorderLayout.SOUTH);
     pack();
     setVisible(true);
   }
   private void buildButtonPanel()
   {
     buttonPanel = new JPanel();
     rollBtn = new JButton("Roll the Dice");
     rollBtn.addActionListener(new ButtonListener());
     buttonPanel.add(rollBtn);
     
   }
   private class ButtonListener implements ActionListener
   {
     public void actionPerformed(ActionEvent e)
     {
     dice.roll();
     dice1 = new ImageIcon(images[dice.getValue()]);
     dice.roll();
     dice2 = new ImageIcon(images[dice.getValue()]);
     imageLabel1.setIcon(dice1);
     imageLabel2.setIcon(dice2);
     }
   }
   private void buildImagePanel()
   {
     imagePanel = new JPanel();
     dice.roll();
     dice1 = new ImageIcon(images[dice.getValue()]);
     dice2 = new ImageIcon(images[dice.getValue()]);
     imageLabel1.setIcon(dice1);
     imageLabel2.setIcon(dice2);
     imagePanel.add(imageLabel1);
     imagePanel.add(imageLabel2); 
   }
   public static void main(String[]args)
   {
     new DiceGUI();
   }

}