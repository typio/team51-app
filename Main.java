import java.io.IOException;

import javafx.application.Application;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage mainStage;

    @Override
    public void start(Stage stage) throws Exception {
        mainStage = stage;
        Scene scene = new Scene(FXMLLoader.load((getClass().getResource("resources/fxml/welcome-splashscreen.fxml"))));
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void gotoWelcomeSplashscreen(Event e) throws IOException {
        Scene scene = new Scene(FXMLLoader.load((getClass().getResource("resources/fxml/welcome-splashscreen.fxml"))));
        mainStage.setScene(scene);
        mainStage.show();
    }

    public void gotoPatientPortal(Event e) throws IOException {
        Scene scene = new Scene(FXMLLoader.load((getClass().getResource("resources/fxml/patient-portal.fxml"))));
        mainStage.setScene(scene);
        mainStage.show();
    }

    public void gotoPatientRegistration(Event e) throws IOException {
        Scene scene = new Scene(FXMLLoader.load((getClass().getResource("resources/fxml/patient-registration.fxml"))));
        mainStage.setScene(scene);
        mainStage.show();
    }

    public void gotoPatientSignin(Event e) throws IOException {
        Scene scene = new Scene(FXMLLoader.load((getClass().getResource("resources/fxml/patient-signin.fxml"))));
        mainStage.setScene(scene);
        mainStage.show();
    }

    public void gotoPatientProfile(Event e) throws IOException {
        Scene scene = new Scene(FXMLLoader.load((getClass().getResource("resources/fxml/patient-profile.fxml"))));
        mainStage.setScene(scene);
        mainStage.show();
    }

    public void gotoPatientUpdateProfile(Event e) throws IOException {
        Scene scene = new Scene(FXMLLoader.load((getClass().getResource("resources/fxml/patient-updateprofile.fxml"))));
        mainStage.setScene(scene);
        mainStage.show();
    }
    
    public void gotoPatientMessage(Event e) throws IOException {
        Scene scene = new Scene(FXMLLoader.load((getClass().getResource("resources/fxml/patient-message.fxml"))));
        mainStage.setScene(scene);
        mainStage.show();
    }
}