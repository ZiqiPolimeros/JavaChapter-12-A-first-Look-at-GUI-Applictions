//1.create class that extends Application
//2.add all imports (Application, stage, scene,etc..)
//3.create main method and call launch method
//4.create start method and do the following in start
//  a. create all controls
//  b. register event handlers for controls
//  c. add controls to Vbox or Hbox
//  d. create scene object
//  e. call setscene method from primaryStage object
//  f. call show method from primaryStage object

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

/**
   Latin Translator
*/

public class LatinTranslator extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create the buttons.
      Button sinisterButton = new Button("Sinister");
      Button dexterButton = new Button("Dexter");
      Button mediumButton = new Button("Medium");
      
      // Create the output label.
      Label outputLabel = new Label();
      
      // Register event handlers for the butttons. a lamda expression
      sinisterButton.setOnAction(e ->
      {
         outputLabel.setText("Left");
      });
      
      dexterButton.setOnAction(e ->
      {
         outputLabel.setText("Right");
      });
      
      mediumButton.setOnAction(e ->
      {
         outputLabel.setText("Center");
      });
      
      // Put the controls in a VBox.
      VBox vbox = new VBox(10, sinisterButton, dexterButton, mediumButton, outputLabel);
      
      // Set the VBox's alignment to center.
      vbox.setAlignment(Pos.CENTER);

      // Set the VBox's padding to 10 pixels.
      vbox.setPadding(new Insets(10));

      // Add the VBox to a scene.
      Scene scene = new Scene(vbox);
      
      // Set the scene to the stage and display it.
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}