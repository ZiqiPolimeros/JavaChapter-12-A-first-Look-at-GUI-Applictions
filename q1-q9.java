ImageView image = new ImageView("greendal.edu/images/Cat.png");
Hbox hbox = new Hbox(10,lable1,lable2,lable3);
Vbox.setPadding(new Insets(10));
gridPaneObject.add(button, 2, 5);
Button button = new Button("Clike Me");



/*
1.The variable myWindow references a JFrame object. 
Write a statement that sets the size of the object to 500 pixels wide and 250 pixels high.
*/
myWindow.setSize(500,250);

/*
The variable myWindow references a JFrame object. 
Write a statement that causes the application to end 
when the user clicks on the JFrame object’s close button.
*/
myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

/*
3.The variable myWindow references a JFrame object. 
Write a statement that displays the object’s window on the screen.
*/
myWindow.setVisible(true);



/*
4.The variable myButton references a JButton object. 
Write the code to set the object’s background color to white and foreground color to red.
*/
myButton,setBackground(Color,white);
myButton,setForeground(Color,red);

/*
5. Assume that a class inherits from the JFrame class. 
Write code that can appear in the class constructor, 
which gives the content pane a FlowLayout manager. 
Components added to the content pane should be aligned with the left edge of each row. 
*/
setLayout(new FlowLayout(FlowLayout.LEFT));
m_left = new Button("Left Aligned Demo");
m_left.addActionListener(this);
add(m_left);

/*
 6. Assume that a class inherits from the JFrame class. 
 Write code that can appear in the class constructor, 
 which gives the content pane a GridLayout manager with five rows and 10 columns. 
 */
 JPanel p = new JPanel();
 p.setLayout(new GridLayout(5,10));
 p.add(...);
 
 /*
  7. Assume that the variable panel references a JPanel object 
  that uses a BorderLayout manager. 
  In addition, the variable button references a JButton object. 
  Write code that adds the button object to the panel object’s west region. 
  */
 panel.add(button, BorderLayout.WEST); 
 
/*
 8. Write code that creates three radio buttons 
 with the text “Option 1”, “Option 2”, and “Option 3”. 
 The radio button that displays the text “Option 1” should be initially selected. 
 Make sure these components are grouped so that a mutually exclusive relationship exists among them. 
 */
 import java.awt.*;
import javax.swing.*;
 
 JRadioButton r1 = new JRadioButton("Option 1",true);
 JRadioButton r2 = new JRadioButton("Option 2");
 JRadioButton r3 = new JRadioButton("Option 3");
 
 ButtonGroup g = new ButtonGroup();
 
 g.add(r1):
 g.add(r2):
 g.add(r3):