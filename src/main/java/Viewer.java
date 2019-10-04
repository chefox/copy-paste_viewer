import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Viewer extends Application {
    List<String> formats= Arrays.asList("JPG", "PEG", "GIF", "PNG", "JPS", "IFF");
    File dir;
    int i=0;

    public ImageView view = new ImageView();

    public static void main(String[] args) {
        launch(args);
    }
    final DirectoryChooser dChoser = new DirectoryChooser();
    StackPane vbox;

    }


    }

