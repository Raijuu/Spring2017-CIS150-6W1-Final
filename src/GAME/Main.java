package GAME;

import GAME.model.Player;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    private ObservableList<Player> playerData = FXCollections.observableArrayList();


    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Weaverling's Wizards, Warriors, and Wanton Rouge's Warfare!");

        initializeRootLayout();

    }



    public void initializeRootLayout() {
        try {
        //    FXMLLoader loader = new FXMLLoader();
        //    loader.setLocation(Main.class.getResource("TitleScreen.fxml"));
        //    rootLayout = (BorderPane) loader.load();

            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

            //Scene scene = new Scene(rootLayout);
            //primaryStage.setScene(scene);
            primaryStage.setScene(new Scene(root, 800, 600));


            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


















    public static void main(String[] args) {
        launch(args);
    }
}
