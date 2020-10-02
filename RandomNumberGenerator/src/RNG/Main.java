package RNG;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    //START METHOD
    public void start(Stage primaryStage) throws  Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("../RNG/RandomNumberGenerator.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    //MAIN
    public static void main(String[] args) {launch(args);}
}
