import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class ChatList extends ToggleGroup{
    //Function adds button to ChatList
    public void addChat(RadioButton rBtn){
        rBtn.setToggleGroup(this);
    }

}
