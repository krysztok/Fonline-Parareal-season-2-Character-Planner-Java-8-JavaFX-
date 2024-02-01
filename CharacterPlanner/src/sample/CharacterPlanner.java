package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CharacterPlanner extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("character-planer.fxml"));
        primaryStage.setTitle("Fonline Parareal Character Planner");
        primaryStage.setScene(new Scene(root, 885, 755));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
