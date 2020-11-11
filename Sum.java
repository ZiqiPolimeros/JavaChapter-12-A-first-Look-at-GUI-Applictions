/*
Create a JavaFX application that has three label, two textfields and one button. 
This application allows the user to enter two numbers in the textfields. 
When the user clicks the button, the sum of the two numbers it dsiplayed.

*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import java.util.ArrayList;
import java.util.Random;

public class Sum extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {

      
      Label n1 = new Label("First number:");
      TextField n1TextField = new TextField();
      Hbox n1hbox = new HBox(10,n1,n1Field);
      n1hbox.setAlignment(Pos.CENTER);
      
      Label n2 = new Label("Second number:");
      TextField n2TextField = new TextField();
      Hbox n2hbox = new HBox(10,n2,n2TextField);
      n2hbox.setAlignment(Pos.CENTER);
      
       //create the controls for the title
      Label title = new Label("Title:");
      TextField tTextField = new TextField();
      Hbox thbox = new HBox(10,title,tTextField);
      fnhbox.setAlignment(Pos.CENTER);
      
      // Create the buttons.
      Button button = new Button("Sum");
      
      //layout the button 
      HBox bhbox = new HBox(10,button);      
      bhbox.setAlignment(Pos.CENTER);
      
      // Create the output label. A label is a class
      Label outputLabel = new Label();
      HBox outputHBox = new HBox(outputLabel);
 
      button.setOnAction(e ->
      {
         int sum = Integer.parseInt(n1TextField.getText())+ Integer.parseInt(n2TextField.getText());
         outputLabel.setText(sum);
      });
      
 
      
      //create a master VBox.
      VBox masterVBox = new VBox(10,n1,n2,n1hbox,n2hbox,thbox,outputHBox);
      masterVBox.setPadding(new Insets(10));
      
      //add the master VBox to a scene.
      Scene scene = new Scene(masterVBox);
      
      //Set the scene to the stage and display it
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}