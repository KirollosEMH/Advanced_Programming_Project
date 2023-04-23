import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Library_Management_System extends Application {

    @Override
    public void start (Stage primaryStage) {
        primaryStage.setTitle("Library Management System");
        primaryStage.show();
    }
    
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }
}
