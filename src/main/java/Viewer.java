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



    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("window.fxml"));
        vbox = loader.<StackPane>load();


        Scene scene = new Scene(vbox);
        scene.getStylesheets().add("style.css");
        primaryStage.setScene(scene);

        view.setFitHeight(vbox.getHeight());
        view.setFitWidth(vbox.getWidth());
        view.setPreserveRatio(true);

        primaryStage.show();
    }
    public TextArea indicate = null;

    @FXML
    public void gonext(Event e){
        i+=1;
        opnImg();
        indicate.setText(indicate.getText()+" next");

    }
    @FXML
    public void goprev(Event e){
        i-=1;
        opnImg();
        indicate.setText(indicate.getText()+" previous");

    }
    @FXML
    public void opnFldr(Event e) {
        dir = dChoser.showDialog(null);
        if (dir != null) {
            indicate.setText(indicate.getText()+dir.getAbsolutePath());
            indicate.setText(indicate.getText()+"\n======================");
            i=0;
            opnImg();
            for (File f: dir.listFiles()) {
                indicate.setText(indicate.getText() + "\n" + f.getName());
            }


            indicate.setText(indicate.getText()+"\n======================\n");
        } else {
            indicate.setText(indicate.getText()+null);

        }
    }
    public void opnImg(){
        if(dir!=null) {
            if (i < 0) {
                i += dir.listFiles().length;

            }
            if (i >= dir.listFiles().length) {
                i -= dir.listFiles().length;
            }
            if(dir.listFiles()[i].getName().length()>3 && formats.contains(dir.listFiles()[i].getName().substring(dir.listFiles()[i].getName().length()-3,dir.listFiles()[i].getName().length()).toUpperCase())) {
                Image img = new Image("file:///"+dir.listFiles()[i].getPath());
                view.setImage(img);
            }
        }

    }


    }

