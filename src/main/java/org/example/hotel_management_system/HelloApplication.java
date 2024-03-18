//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example.hotel_management_system;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class HelloApplication extends Application {
    private double x = 0.0;
    private double y = 0.0;

    public HelloApplication() {
    }

    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("login.fxml"));
        Parent root = (Parent)loader.load();
        primaryStage.setTitle("NVDEV - Hotel Management System");
        primaryStage.setScene(new Scene(root, 592.0, 410.0));
        root.setOnMousePressed((event) -> {
            this.x = event.getSceneX();
            this.y = event.getSceneY();
        });
        root.setOnMouseDragged((event) -> {
            primaryStage.setX(event.getScreenX() - this.x);
            primaryStage.setY(event.getScreenY() - this.y);
            primaryStage.setOpacity(0.8);
        });
        root.setOnMouseReleased((event) -> {
            primaryStage.setOpacity(1.0);
        });
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(new String[0]);
    }
}
