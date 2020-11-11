/*
3. property Tax 
A county collects property taxes on the assessment value of property, 
which is 60 percent of the property’s actual value. 
If an acre of land is valued at $10,000, its assessment value is $6,000. 
The property tax is then $0.64 for each $100 of the assessment value. 
The tax for the acre assessed at $6,000 will be $38.40. 
Create a GUI application that displays the assessment value and property tax when a user enters the actual value of a property.
*/

import javax.swing.*;    // Needed for Swing classes
import java.awt.event.*; // Needed for ActionListener Interface



public class PropertyTax extends JFrame
{
   private JPanel panel;             // To reference a panel
   private JLabel messageLabel;      // To reference a label
   private JTextField taxTextField; // To reference a text field
   private JButton calcButton;       // To reference a button
   private final int WINDOW_WIDTH = 310;  // Window width
   private final int WINDOW_HEIGHT = 100; // Window height



   public PropertyTax()
   {
      // Set the window title.
      setTitle("Property Tax Calculator");

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Build the panel and add it to the frame.
      buildPanel();

      // Add the panel to the frame's content pane.
      add(panel);

      // Display the window.
      setVisible(true);
   }

   /**
      The buildPanel method adds a label, text field, and
      and a button to a panel.
   */

   private void buildPanel()
   {
      // Create a label to display instructions.
      messageLabel = new JLabel("Enter the value of your land or house in dollars");

      // Create a text field 10 characters wide.
      taxTextField = new JTextField(10);

      // Create a button with the caption "Calculate".
      calcButton = new JButton("Calculate");

      // Add an action listener to the button.
      calcButton.addActionListener(new CalcButtonListener());

      // Create a JPanel object and let the panel
      // field reference it.
      panel = new JPanel();

      // Add the label, text field, and button
      // components to the panel.
      panel.add(messageLabel);
      panel.add(taxTextField);
      panel.add(calcButton);
   }

   /**
      CalcButtonListener is an action listener class for
      the Calculate button.
   */

   private class CalcButtonListener implements ActionListener
   {
      /**
         The actionPerformed method executes when the user
         clicks on the Calculate button.
         @param e The event object.
      */

      public void actionPerformed(ActionEvent e)
      {
         final double CONVERSION = 0.64;
         String input;  // To hold the user's input
         double tax;  // The number of miles

         // Get the text entered by the user into the
         // text field.
         input = taxTextField.getText();
         
         // For debugging, display the text entered, and
         // its value converted to a double.
         System.out.println("Reading " + input +
                            " from the text field.");
         System.out.println("Calculated value: " +
                            Double.parseDouble(input));

         // Calculate the property tax
         tax = ((Double.parseDouble(input)*0.6)/100) * CONVERSION;

         // Display the result.
         JOptionPane.showMessageDialog(null, "Your property : $ "+input +
                  "\nThe property tax :  $" + tax );

         // For debugging, display a message indicating
         // the application is ready for more input.
         System.out.println("Ready for the next input.");
      }
   } // End of CalcButtonListener class



   public static void main(String[] args)
   {
      new PropertyTax();
   }
}