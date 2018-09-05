package form;


import eentity.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class UserForm {
    @FXML
    Button btn1;
    @FXML
    TextField tf_email;
    @FXML
    PasswordField textPass;
    @FXML
    DatePicker dateBirthdey;
    @FXML
    ComboBox UserSpisok;
    ObservableList<User>  modelUser=FXCollections.observableArrayList(User.getListUser());

    @FXML
    public void initialize(){
      UserSpisok.setItems(modelUser);
    }


    public void one() {
        User user = new User(tf_email.getText(), textPass.getText(), dateBirthdey.getValue());
        user.printUser();
        modelUser.add(user);
        tf_email.setText("");
        textPass.setText("");
        dateBirthdey.setValue(null);

    }


    public void two() {

        User us=((User)UserSpisok.getValue());

        tf_email.setText(us.email);
        textPass.setText(us.password);
        dateBirthdey.setValue(us.birhday);
    }
}
