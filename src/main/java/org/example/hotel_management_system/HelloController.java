//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example.hotel_management_system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloController implements Initializable {
    @FXML
    private StackPane stack_form;
    @FXML
    private AnchorPane main_form;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button loginBtn;
    @FXML
    private Hyperlink forgotPassword;
    @FXML
    private Hyperlink createAccount;
    @FXML
    private AnchorPane signup_form;
    @FXML
    private TextField signup_username;
    @FXML
    private PasswordField signup_password;
    @FXML
    private PasswordField signup_password2;
    @FXML
    private Button signupBtn;
    @FXML
    private Hyperlink signup_forgot;
    @FXML
    private Hyperlink signup_login;
    @FXML
    private AnchorPane forgot_form;
    @FXML
    private Hyperlink forgot_login;
    @FXML
    private Hyperlink forgot_signup;

    public HelloController() {
    }

    public void exit() {
        System.exit(0);
    }

    public void minimize() {
        Stage stage = (Stage)this.main_form.getScene().getWindow();
        stage.setIconified(true);
    }

    public void switchForm(ActionEvent event) {
        if (event.getSource() == this.createAccount) {
            this.main_form.setVisible(false);
            this.forgot_form.setVisible(false);
            this.signup_form.setVisible(true);
        } else if (event.getSource() == this.forgotPassword) {
            this.main_form.setVisible(false);
            this.signup_form.setVisible(false);
            this.forgot_form.setVisible(true);
        } else if (event.getSource() == this.signup_login) {
            this.signup_form.setVisible(false);
            this.forgot_form.setVisible(false);
            this.main_form.setVisible(true);
        } else if (event.getSource() == this.signup_forgot) {
            this.signup_form.setVisible(false);
            this.main_form.setVisible(false);
            this.forgot_form.setVisible(true);
        } else if (event.getSource() == this.forgot_login) {
            this.forgot_form.setVisible(false);
            this.signup_form.setVisible(false);
            this.main_form.setVisible(true);
        } else if (event.getSource() == this.forgot_signup) {
            this.forgot_form.setVisible(false);
            this.main_form.setVisible(false);
            this.signup_form.setVisible(true);
        }

    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
