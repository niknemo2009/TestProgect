package form;


import eentity.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.function.Predicate;

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
    ObservableList<User> modelUser = FXCollections.observableArrayList(User.getListUser());
    @FXML
    RadioButton rBut1Email;
    @FXML
    RadioButton rBut2Birth;
    @FXML
    TextField search;
    @FXML
    ListView filtrUser;


    @FXML
    public void initialize() {
        UserSpisok.setItems(modelUser);
        filtrUser.setItems(modelUser);
    }


    public void one() {
        User user = new User(tf_email.getText(), textPass.getText(), dateBirthdey.getValue());
        user.printUser();
        modelUser.add(user);
        tf_email.setText("");
        textPass.setText("");
        dateBirthdey.setValue(null);

    }

    public void searchUser() {
        ObservableList<User>  temp=modelUser.filtered(new Predicate<User>() {
            @Override
            public boolean test(User user) {
                return user.email.startsWith(search.getText());
            }
        });

        filtrUser.setItems(temp);
        System.out.println(search.getText());
    }

    public void two() {
        User us = ((User) UserSpisok.getValue());
        tf_email.setText(us.email);
        textPass.setText(us.password);
        dateBirthdey.setValue(us.birhday);
    }
}
