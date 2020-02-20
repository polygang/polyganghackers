import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CubiChat extends Application {

    @Override
    public void start(Stage stage) {
        //Creates gridpane named pane
        GridPane pane = new GridPane();
        //Creates elements
        Label chatLbl = new Label("Chat");
        TextField inputTxt = new TextField();
        Button btnSend = new Button("Send");
        //Adds elements to pane
        pane.add(chatLbl, 0, 0);
        pane.add(inputTxt, 1, 0);
        pane.add(btnSend, 1, 1);
        //Creates stage and adds a scene with pane and launches GUI
        stage.setScene(new Scene(pane, 500, 500));
        stage.setTitle("CubiChat");
        stage.show();
    }
}
