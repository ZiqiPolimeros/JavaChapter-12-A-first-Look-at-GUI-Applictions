/*
1. retail price calculator 
Create a GUI application where the user enters the wholesale cost of an item and its markup percentage into text fields. 
(For example, if an item’s wholesale cost is $5 and its markup percentage is 100 percent, then its retail price is $10.) 
The application should have a button that displays the item’s retail price when clicked.
*/

import java.awt.event.*;
import javax.swing.*;

public class RetailPriceCalculator extends JFrame
{
   private JLabel jlbCost;
   private JTextField jtfCost;
   private JLabel jlbPercentage;
   private JTextField jtfPercentage;
   private JButton jbPrice;
   private JPanel jpCalculator;
   private final int MaxWidth = 320;
   private final int MaxHeight = 150;
   
   public RetailPriceCalculator()
   {
       setTitle("Retail Price Calculator");
       setSize(MaxWidth,MaxHeight);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       buildPanel();
       add(jpCalculator);
       setVisible(true);
   }
   private void buildPanel()
   {
       jlbCost = new JLabel("Wholesale price of item: $");
       jtfCost = new JTextField(10);
       
       jlbPercentage = new JLabel("Markup percentage of item: ");
       jtfPercentage = new JTextField(10);
       
       jbPrice = new JButton("Retail Price");
       jpCalculator = new JPanel();
       
       jbPrice.addActionListener(new ListenerToCalculateRetailPrice());
       
       jpCalculator.add(jlbCost);
       jpCalculator.add(jtfCost);
       jpCalculator.add(jlbPercentage);
       jpCalculator.add(jtfPercentage);
       jpCalculator.add(jbPrice);
       
   }
   
   private class ListenerToCalculateRetailPrice implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String costStr;
         String percentageStr;
         double cost;
         double percentage;
         double retailPrice;
         
         costStr = jtfCost.getText();
         cost = Double.parseDouble(costStr);
         percentageStr = jtfPercentage.getText();
         percentage = Double.parseDouble(percentageStr);
         
         retailPrice = cost*(1+percentage/100);
         
         JOptionPane.showMessageDialog(null,"The retail price of item: $"+retailPrice);
      }
   }
   public static void main(String[] args)
   {
      new RetailPriceCalculator();
   }
}