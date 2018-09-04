package form;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class UserForm {
   @FXML
    Button btn1;
   @FXML
    TextField tf_email;

   public void one(){
       System.out.println(tf_email.getText());
   }
    public void two(){
        System.out.println("two");
    }
}
