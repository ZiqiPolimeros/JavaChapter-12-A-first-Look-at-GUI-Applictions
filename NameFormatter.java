/*
chapter 15 programming challenge q3
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

public class NameFormatter extends Application
{
   public static void main(String[]args)
   {
     launch(args);
   }
   public void start(Stage primaryStage)
   {
      Label prompt1 = new Label("First name:");
      TextField TextField1 = new TextField();
      HBox hbox1 = new HBox(10,prompt1,TextField1);
      hbox1.setAlignment(Pos.CENTER);
      
      Label prompt2 = new Label("Middle name:");
      TextField TextField2 = new TextField();
      HBox hbox2 = new HBox(10,prompt2,TextField2);
      hbox2.setAlignment(Pos.CENTER);
      
      Label prompt3 = new Label("Last name:");
      TextField TextField3 = new TextField();
      HBox hbox3 = new HBox(10,prompt3,TextField3);
      hbox3.setAlignment(Pos.CENTER);
      
      //create the controls for the title
      Label prompt4 = new Label("Title:");
      TextField TextField4 = new TextField();
      HBox hbox4 = new HBox(10,prompt4,TextField4);
      hbox4.setAlignment(Pos.CENTER);
      
      //create the button controls
      Button button1 = new Button("Format 1");
      Button button2 = new Button("Format 2");
      Button button3 = new Button("Format 3");
      Button button4 = new Button("Format 4");
      Button button5 = new Button("Format 5");
      Button button6 = new Button("Format 6");
      
      //layout the 6 button at same line
      HBox hbox5 = new HBox(10,button1,button2,button3,button4,button5,button6);
      
      hbox5.setAlignment(Pos.CENTER);
      
      // Create the output label. A label is a class
      Label outputLabel = new Label();
      HBox outputHBox = new HBox(outputLabel);
      
      //register event handlers
      button1.setOnAction(e ->
      {
         if(TextField1.getText().length() == 0)
         {
           System.out.println("Enter your first name.");
         }else{
               outputLabel.setText(TextField4.getText()+" "
                                    +TextField1.getText()+" "
                                    +TextField2.getText()+" "
                                    +TextField3.getText());
          }
      });
      
      button2.setOnAction(e ->
      {
         outputLabel.setText(TextField1.getText()+" "
                           +TextField2.getText()+" "
                           +TextField3.getText());
      });
      
      button3.setOnAction(e ->
      {
         outputLabel.setText(
                           TextField1.getText()+" "
                           +TextField3.getText());
      });
      
      button4.setOnAction(e ->
      {
         outputLabel.setText(
                           TextField3.getText()+", "
                           +TextField1.getText()+" "
                           +TextField2.getText()+", "
                           +TextField4.getText()+".");
      });
      
      button5.setOnAction(e ->
      {
         outputLabel.setText(TextField3.getText()+", "
                           +TextField1.getText()+" "
                           +TextField2.getText()+" ");
      });
      button6.setOnAction(e ->
      {
         outputLabel.setText(TextField3.getText()+", "
                           +TextField1.getText()+" ");
      });
      
      //create a master VBox.
      VBox masterVBox = new VBox(10,hbox1,hbox2,hbox3,hbox4,hbox5,outputHBox);
      masterVBox.setPadding(new Insets(10));
      
      //add the master VBox to a scene.
      Scene scene = new Scene(masterVBox);
      
      //Set the scene to the stage and display it
      primaryStage.setScene(scene);
      primaryStage.show();  
      
   }
}

