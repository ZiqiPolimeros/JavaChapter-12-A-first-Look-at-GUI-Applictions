import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import java.util.ArrayList;
import java.util.Random;

public class DiceSimulator extends Application
{
   public static void main(String[]args)
   {  
      //Launch the application
      launch(args); 
   }
   
   public void start(Stage primaryStage)
   {
      //Load the dice images
      //the purpose of the image class: load the images
      Image d1Image = new Image("Die1.png");
      Image d2Image = new Image("Die2.png");
      Image d3Image = new Image("Die3.png");
      Image d4Image = new Image("Die4.png");
      Image d5Image = new Image("Die5.png");
      Image d6Image = new Image("Die6.png");
      
      //create an ArrayList to hold the images. 
      //<Image> the data type of the array list, also accept sub class of Image class. imageList is the reference 
      ArrayList<Image> imageList = new ArrayList<Image>();
      
      //add the images to the list
      imageList.add(d1Image);
      imageList.add(d2Image);
      imageList.add(d3Image);
      imageList.add(d4Image);
      imageList.add(d5Image);
      imageList.add(d6Image);
      
      //create the ImageView controls
      ImageView leftDieIV = new ImageView();
      ImageView rightDieIV = new ImageView();
      leftDieIV.setFitWidth(200);
      leftDieIV.setFitHeight(200);
      rightDieIV.setFitWidth(200);
      rightDieIV.setFitHeight(200);
      
      HBox ivHBox = new HBox(10,leftDieIV, rightDieIV);
      
      //create the tossButton control
      Button tossButton = new Button("Toss");
      
      //register the event handler
      tossButton.setOnAction(e->
      {
        //create a random object
        Random rand = new Random();
        
        //get an image at the int position
        leftDieIV.setImage(imageList.get(rand.nextInt(imageList.size())));
        rightDieIV.setImage(imageList.get(rand.nextInt(imageList.size())));
      });
      
      //put everything into a VBox
      VBox mainVBox = new VBox(10,ivHBox,tossButton);
      mainVBox.setAlignment(Pos.CENTER);
      mainVBox.setPadding(new Insets(10));
      
      // add the main VBox to a scene
      Scene scene = new Scene(mainVBox);
      
      //set the scene to the stage and display it
      primaryStage.setScene(scene);
      primaryStage.show();
      
   }


}