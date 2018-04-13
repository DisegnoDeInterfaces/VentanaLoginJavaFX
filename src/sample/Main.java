package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");
        // Layout GridPane
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);

        scene.getStylesheets().add
                (Main.class.getResource("/css/Login.css").toExternalForm());

      // Añadir Texto , etiquetas y cajas de texto
        Text scenetitle = new Text("Bienvenido");
        // añadimos ID
        scenetitle.setId("welcome-text");

        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("Usuario:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Contraseña:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        // Añadir botón

        Button btn = new Button("Logueo");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        // texto para el mensaje al pulsar el botón

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        // añadimos ID
        actiontarget.setId("actiontarget");
        // evento del botón
        btn.setOnAction(e -> {
            actiontarget.setFill(Color.FIREBRICK);
            actiontarget.setText("Botón de logueo pulsado");
        });

        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
