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
        GridPane pane = new GridPane();
        Label chatLbl = new Label("Chat");
        TextField inputTxt = new TextField();
        Button btnSend = new Button("Send");
        pane.add(chatLbl, 0, 0);
        pane.add(inputTxt, 1, 0);
        pane.add(btnSend, 1, 1);
        stage.setScene(new Scene(pane, 500, 500));
        stage.setTitle("CubiChat");
        stage.show();
    }
}
