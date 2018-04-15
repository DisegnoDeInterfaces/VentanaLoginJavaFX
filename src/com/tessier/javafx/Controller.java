package com.tessier.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Controller {
    @FXML private Text actiontarget;

    @FXML protected void manejadorAcciónBotón(ActionEvent event) {
        actiontarget.setText("Botón de logueo pulsado");
    }

}