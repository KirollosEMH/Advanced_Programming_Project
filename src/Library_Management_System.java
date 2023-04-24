import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import javafx.scene.text.TextBoundsType;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontSmoothingType;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class Library_Management_System extends Application  {
    
    @Override
    public void start(Stage primaryStage) {
        
        ImageView background = new ImageView(new Image("books.jpg"));
        StackPane startPage = new StackPane(background);
        startPage.setAlignment(Pos.CENTER);
        Rectangle rect = new Rectangle(0, 0, 600, 0);
        rect.setFill(Color.rgb(0, 0, 0, 0.7));
        double centerX = primaryStage.getWidth() / 2.0;
        double centerY = primaryStage.getHeight() / 2.0;
        rect.setLayoutX(centerX - rect.getWidth() / 2.0);
        rect.setLayoutY(centerY - rect.getHeight() / 2.0);
        startPage.getChildren().add(rect);
        
        Text header = new Text("Welcome to our Library");
        header.setFont(Font.font("Arial", FontWeight.BOLD, 40));
        header.setFill(Color.WHITE);

        Button loginButton = new Button("Login");
        loginButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;");
        loginButton.setOnMouseEntered(e -> loginButton.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;")
        );
        loginButton.setOnMouseExited(e -> loginButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;")
        );

        Button quitButton = new Button("Quit");
        quitButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;");
        quitButton.setOnMouseEntered(e -> quitButton.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;")
        );
        quitButton.setOnMouseExited(e -> quitButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;")
        );
        Button registerButton = new Button("Register");
        registerButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;");
        registerButton.setOnMouseEntered(e -> registerButton.setStyle("-fx-background-color: rgba(0, 134, 102);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;")
        );
        registerButton.setOnMouseExited(e -> registerButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
        "-fx-background-radius: 30px;" +
        "-fx-border-radius: 2px;" +
        "-fx-text-fill: white;" +
        "-fx-font-size: 30px;" +
        "-fx-pref-width: 200px;" +
        "-fx-pref-height: 50px;")
        );
        loginButton.setFont(Font.font(20));
        loginButton.setOnAction(new login(primaryStage));
        registerButton.setFont(Font.font(20));
        registerButton.setOnAction(new register(primaryStage));
        quitButton.setFont(Font.font(20));
        quitButton.setOnAction(e -> System.exit(0));

        VBox vbox = new VBox(header, loginButton, registerButton, quitButton);
        vbox.setSpacing(20);
        vbox.setAlignment(Pos.CENTER);
        vbox.setStyle("-fx-padding: 20px;");
        startPage.getChildren().add(vbox);

        Scene scene = new Scene(startPage, 800, 600);
        primaryStage.setTitle("Library Management System");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        rect.heightProperty().bind(primaryStage.heightProperty());
    }

    class login implements EventHandler<ActionEvent>{
        private Stage primaryStage;

        public login(Stage primaryStage) {
            this.primaryStage = primaryStage;
        }
        @Override
        public void handle(ActionEvent event) {
            Image backgroundImage = new Image("login.jpg");
            BackgroundImage backgroundImg = new BackgroundImage(backgroundImage,BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER, new BackgroundSize(1.0, 1.0, true, true, false, false));
            Background background = new Background(backgroundImg);
            GridPane loginPane = new GridPane();
            loginPane.setBackground(background);
            loginPane.setAlignment(Pos.CENTER);
            loginPane.setPadding(new Insets(10, 10, 10, 10));
            loginPane.setVgap(10);
            loginPane.setHgap(10);
            Label emailLabel = new Label("Email:");
            emailLabel.setFont(Font.font(20));
            TextField emailField = new TextField();
            emailField.setPromptText("Enter your email");
            emailField.setFont(Font.font(20));
            GridPane.setConstraints(emailLabel, 0, 0);
            GridPane.setConstraints(emailField, 1, 0);
            Label passwordLabel = new Label("Password:");
            passwordLabel.setFont(Font.font(20));
            PasswordField passwordField = new PasswordField();
            passwordField.setPromptText("Enter your password");
            passwordField.setFont(Font.font(20));
            GridPane.setConstraints(passwordLabel, 0, 1);
            GridPane.setConstraints(passwordField, 1, 1);
            Button loginButton = new Button("Login");
            loginButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
            "-fx-background-radius: 5px;" +
            "-fx-border-radius: 2px;" +
            "-fx-text-fill: white;" +
            "-fx-font-size: 30px;" +
            "-fx-pref-width: 300px;" +
            "-fx-pref-height: 10px;");
            loginButton.setOnMouseEntered(e -> loginButton.setStyle("-fx-background-color: rgba(0, 134, 102);" +
            "-fx-background-radius: 5px;" +
            "-fx-border-radius: 2px;" +
            "-fx-text-fill: white;" +
            "-fx-font-size: 30px;" +
            "-fx-pref-width: 300px;" +
            "-fx-pref-height: 10px;")
            );
            loginButton.setOnMouseExited(e -> loginButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
            "-fx-background-radius: 5px;" +
            "-fx-border-radius: 2px;" +
            "-fx-text-fill: white;" +
             "-fx-font-size: 30px;" +
            "-fx-pref-width: 300px;" +
            "-fx-pref-height: 10px;")
            );
            loginButton.setFont(Font.font(20));
            GridPane.setConstraints(loginButton, 1, 2);
            loginPane.getChildren().addAll(emailLabel, emailField, passwordLabel, passwordField, loginButton);
            Scene loginScene = new Scene(loginPane, 800, 600);
            primaryStage.setScene(loginScene); 
        }
    }

    class register implements EventHandler<ActionEvent> {
        private Stage primaryStage;
        

        public register(Stage primaryStage) {
            this.primaryStage = primaryStage;
        }
        @Override
        public void handle(ActionEvent event) {
            Image backgroundImage = new Image("login.jpg");
            BackgroundImage backgroundImg = new BackgroundImage(backgroundImage,BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER, new BackgroundSize(1.0, 1.0, true, true, false, false));
            Background background = new Background(backgroundImg);
            GridPane registerPane = new GridPane();
            registerPane.setBackground(background);
            registerPane.setAlignment(Pos.CENTER);
            registerPane.setPadding(new Insets(10, 10, 10, 10));
            registerPane.setVgap(10);
            registerPane.setHgap(10);
            Label emailLabel = new Label("Email:");
            emailLabel.setFont(Font.font(20));
            TextField emailField = new TextField();
            emailField.setPromptText("Enter your email");
            emailField.setFont(Font.font(20));
            GridPane.setConstraints(emailLabel, 0, 0);
            GridPane.setConstraints(emailField, 1, 0);
            Label passwordLabel = new Label("Password:");
            passwordLabel.setFont(Font.font(20));
            PasswordField passwordField = new PasswordField();
            passwordField.setPromptText("Enter your password");
            passwordField.setFont(Font.font(20));
            GridPane.setConstraints(passwordLabel, 0, 1);
            GridPane.setConstraints(passwordField, 1, 1);

            Label confirmPasswordLabel = new Label("Confirm Password:");
            confirmPasswordLabel.setFont(Font.font(20));
            PasswordField confirmPasswordField = new PasswordField();
            confirmPasswordField.setPromptText("Confirm your password");
            confirmPasswordField.setFont(Font.font(20));
            GridPane.setConstraints(confirmPasswordLabel, 0, 2);
            GridPane.setConstraints(confirmPasswordField, 1, 2);

            Label firstNameLabel = new Label("First Name:");
            firstNameLabel.setFont(Font.font(20));
            TextField firstNameField = new TextField();
            firstNameField.setPromptText("Enter your first name");
            firstNameField.setFont(Font.font(20));
            GridPane.setConstraints(firstNameLabel, 0, 3);
            GridPane.setConstraints(firstNameField, 1, 3);
            Label lastNameLabel = new Label("Last Name:");
            lastNameLabel.setFont(Font.font(20));
            TextField lastNameField = new TextField();
            lastNameField.setPromptText("Enter your last name");
            lastNameField.setFont(Font.font(20));
            GridPane.setConstraints(lastNameLabel, 0, 4);
            GridPane.setConstraints(lastNameField, 1, 4);
            Label phoneNumberLabel = new Label("Phone Number:");
            phoneNumberLabel.setFont(Font.font(20));
            TextField phoneNumberField = new TextField();
            phoneNumberField.setPromptText("Enter your phone number");
            phoneNumberField.setFont(Font.font(20));
            GridPane.setConstraints(phoneNumberLabel, 0, 5);
            GridPane.setConstraints(phoneNumberField, 1, 5);
            Label addressLabel = new Label("Address:");
            addressLabel.setFont(Font.font(20));
            TextField addressField = new TextField();
            addressField.setPromptText("Enter your address");
            addressField.setFont(Font.font(20));
            GridPane.setConstraints(addressLabel, 0, 6);
            GridPane.setConstraints(addressField, 1, 6);

            Button registerButton = new Button("Register");
            registerButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
            "-fx-background-radius: 5px;" +
            "-fx-border-radius: 2px;" +
            "-fx-text-fill: white;" +
            "-fx-font-size: 30px;" +
            "-fx-pref-width: 300px;" +
            "-fx-pref-height: 10px;");
            registerButton.setOnMouseEntered(e -> registerButton.setStyle("-fx-background-color: rgba(0, 134, 102);" +
            "-fx-background-radius: 5px;" +
            "-fx-border-radius: 2px;" +
            "-fx-text-fill: white;" +
            "-fx-font-size: 30px;" +
            "-fx-pref-width: 300px;" +
            "-fx-pref-height: 10px;")
            );
            registerButton.setOnMouseExited(e -> registerButton.setStyle("-fx-background-color: rgba(0, 197, 149);" +
            "-fx-background-radius: 5px;" +
            "-fx-border-radius: 2px;" +
            "-fx-text-fill: white;" +
            "-fx-font-size: 30px;" +
            "-fx-pref-width: 300px;" +
            "-fx-pref-height: 10px;")
            );
            registerButton.setFont(Font.font(20));
            GridPane.setConstraints(registerButton, 1, 7);
            registerButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    String email = emailField.getText();
                    String password = passwordField.getText();
                    String confirmPassword = confirmPasswordField.getText();
                    String firstName = firstNameField.getText();
                    String lastName = lastNameField.getText();
                    String phoneNumber = phoneNumberField.getText();
                    String address = addressField.getText();
                    if (email.equals("") || password.equals("") || confirmPassword.equals("") || firstName.equals("") || lastName.equals("") || phoneNumber.equals("") || address.equals("")) {
                        Alert alert = new Alert(AlertType.ERROR);
                        alert.setTitle("Error");
                        alert.setHeaderText("Error");
                        alert.setContentText("Please fill in all the fields");
                        alert.showAndWait();
                    } else if (!password.equals(confirmPassword)) {
                        Alert alert = new Alert(AlertType.ERROR);
                        alert.setTitle("Error");
                        alert.setHeaderText("Error");
                        alert.setContentText("Passwords do not match");
                        alert.showAndWait();
                    } else if (email.contains("@") == false || email.contains(".com") == false) {
                        Alert alert = new Alert(AlertType.ERROR);
                        alert.setTitle("Error");
                        alert.setHeaderText("Error");
                        alert.setContentText("Invalid email");
                        alert.showAndWait();
                    } 
                    else {
                        Readers reader = new Readers(password, firstName, lastName, phoneNumber, address, email,false);
                        Library.readers.add(reader);
                        
                        Alert alert = new Alert(AlertType.INFORMATION);
                        alert.setTitle("Success");
                        alert.setHeaderText("Success");
                        alert.setContentText("You have successfully registered");
                        alert.showAndWait();
                    }
                    
                    ImageView background = new ImageView(new Image("books.jpg"));
                    StackPane mainMenu = new StackPane(background);
                    Rectangle rect = new Rectangle(0, 0, 600, 0);
                    rect.setFill(Color.rgb(0, 0, 0, 0.7));
                    double centerX = primaryStage.getWidth() / 2.0;
                    double centerY = primaryStage.getHeight() / 2.0;
                    rect.setLayoutX(centerX - rect.getWidth() / 2.0);
                    rect.setLayoutY(centerY - rect.getHeight() / 2.0);
                    mainMenu.getChildren().add(rect);
                    Scene mainMenuScene = new Scene(mainMenu, 800, 600);
                    primaryStage.setScene(mainMenuScene);
                    rect.heightProperty().bind(mainMenu.heightProperty());
                }
            });

            registerPane.getChildren().addAll(emailLabel, emailField, passwordLabel, passwordField, confirmPasswordLabel, confirmPasswordField, firstNameLabel, firstNameField, lastNameLabel, lastNameField, phoneNumberLabel, phoneNumberField, addressLabel, addressField, registerButton);
            Scene registerScene = new Scene(registerPane, 800, 600);
            primaryStage.setScene(registerScene);
        }
    }
    
    public static void main(String[] args) throws Exception {
        Librarians librarian = new Librarians("admin", "admin", "admin", "admin", "admin", "admin", true);
        Application.launch(args);
    }
}
