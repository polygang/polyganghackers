import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CubiChat extends Application {

    @Override
    public void start(Stage stage) {
        //Creates gridpane named pane
        GridPane pane = new GridPane();
        //Creates stage and adds a scene with pane and launches GUI
        Scene scene = new Scene(pane, 500, 500);
        //Adds stylesheet
        scene.getStylesheets().add("src/stylesheet.css");
        //Creates buttons
        ChatList chatLst = new ChatList();
        RadioButton chat1 = new RadioButton("chat1");
        RadioButton chat2 = new RadioButton("chat2");
        RadioButton chat3 = new RadioButton("chat3");
        chat1.setMinSize(50,5);
        chat2.setMinSize(50,5);
        chat3.setMinSize(50,5);
        chatLst.addChat(chat1);
        chatLst.addChat(chat2);
        chatLst.addChat(chat3);
        //Makes label for text log
        Pane chatLog = new Pane();
        chatLog.setMaxSize(300, 300);
        chatLog.setMinSize(300, 300);
        //chatLog.
        Label textLog = new Label("This is an example");
        textLog.setMaxSize(300, 300);
        textLog.setMinSize(300, 300);
        //textLog.setStyle("-fx-background-color: white");
        textLog.setAlignment(Pos.TOP_LEFT);
        //Makes textfield
        TextField inputTxt = new TextField();
        Button btnSend = new Button("Send");
        //Adds elements to pane
        pane.add(chat1, 0, 0);
        pane.add(chat2, 0, 1);
        pane.add(chat3, 0, 2);
        pane.add(textLog, 1, 1);
        pane.add(inputTxt, 1, 3);
        pane.add(btnSend, 3, 3);

        stage.setScene(scene);
        stage.setTitle("CubiChat");
        stage.show();
    }
}
