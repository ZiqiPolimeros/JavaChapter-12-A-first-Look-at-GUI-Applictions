/*
6. Joe’s Automotive 
Joe’s Automotive performs the following routine maintenance services: 
•	Oil	change—$26.00 
•	Lube	job—$18.00 
•	Radiator	flush—$30.00 
•	Transmission	flush—$80.00 
•	Inspection—$15.00 
•	Muffler	replacement—$100.00 
•	Tire	rotation—$20.00 
Joe also performs other nonroutine services and charges for parts and for labor ($20 per hour). 
Create a GUI application that displays the total for a customer’s visit to Joe’s.
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class JoesAutomotive extends Application
{
   public static void main(String[]args)
   {  
      //Launch the application
      launch(args); 
   }
   public void start(Stage primaryStage)
   {
      //create the controls for the title
      Label title = new Label("Title: ");
      TextField tTextField = new TextField();
      HBox hbox1 = new HBox(10,title,tTextField);
      hbox1.setAlignment(Pos.CENTER);
      
      //create the controls for the labor service
      Label labor = new Label("Hours of labor service: ");
      TextField lTextField = new TextField();
      HBox hbox2 = new HBox(10,labor,lTextField);
      hbox2.setAlignment(Pos.CENTER);
      
      
      //create the button controls
      Button button1 = new Button("Oil	change");
      Button button2 = new Button("Lube	job");
      Button button3 = new Button("Radiator	flush");
      Button button4 = new Button("Transmission	flush");
      Button button5 = new Button("Inspection");
      Button button6 = new Button("Muffler	replacement");
      Button button7 = new Button("Tire	rotation");
      Button button8 = new Button("Total charge");
      
      //layout the 6 button at same line
      HBox hbox3 = new HBox(10,button1,button2,button3,button4,button5,button6,button7);
      hbox3.setAlignment(Pos.CENTER);
      HBox hbox4 = new HBox(10,button8);
      hbox4.setAlignment(Pos.CENTER);
      
      // Create the output label. A label is a class
      Label outputLabel = new Label();
      HBox outputHBox = new HBox(outputLabel);
      

      
      final double Oil=26;
      final double Lube = 18;
      final double Radiator = 30;
      final double Trans = 80;
      final double Inspection = 15;
      final double Muffler = 100;
      final double Tire = 20;
      final double HourlyLabor = 20;
      
      double total = 0;
      
      //register event handlers
       button1.setOnAction(e ->
      {
         total += Oil;
         outputLabel.setText("Add Oil	chang fee $ 26.  Subtotal: $" +total);
      });
      
      button2.setOnAction(e ->
      {
         total += Lube;
         outputLabel.setText("Add Lube	job $ 18. Subtotal: $" + total);
      });
      
      button3.setOnAction(e ->
      {
         total += Radiator;
         outputLabel.setText("Add Radiator	flush $ 30. Subtotal: $"+ total);
      });
      
      button4.setOnAction(e ->
      {   
         total += Trans;
         outputLabel.setText("Add Transmission	flush $80. Subtotal: $"+total);
      });
      
      button5.setOnAction(e ->
      {
         total += Inspection;
         outputLabel.setText("Add Inspection fee $15. Subtotal: $"+ total);
      });
      button6.setOnAction(e ->
      {
         total += Muffler;
         outputLabel.setText("Add Muffler	replacement fee $100. Subtotal: $"+ total);
      });
      button7.setOnAction(e ->
      {
         total += Tire;
         outputLabel.setText("Add Tire	rotation $20. Subtotal: $"+ total);
      });
      button8.setOnAction(e ->
      {
        total += Double.parseDouble(lTextField.getText())*HourlyLabor;
         outputLabel.setText("Add other service $20/hour. Total: $"+ total);
      });

  
      //create a master VBox.
      VBox masterVBox = new VBox(10,hbox1,hbox2,hbox3,hbox4,outputHBox);
      masterVBox.setPadding(new Insets(10));
      
      //add the master VBox to a scene.
      Scene scene = new Scene(masterVBox);
      
      //Set the scene to the stage and display it
      primaryStage.setScene(scene);
      primaryStage.show();  


   
   }   
}   

