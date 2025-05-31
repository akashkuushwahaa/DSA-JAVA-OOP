import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleStudentForm extends Application {
    public void start(Stage stage) {
        TextField name = new TextField();
        name.setPromptText("Enter Name");

        TextField age = new TextField();
        age.setPromptText("Enter Age");

        Button register = new Button("Register");
        Label msg = new Label();

        register.setOnAction(e -> {
            msg.setText("Name: " + name.getText() + ", Age: " + age.getText());
        });

        VBox layout = new VBox(10, name, age, register, msg);
        layout.setStyle("-fx-padding: 20");

        stage.setScene(new Scene(layout, 250, 150));
        stage.setTitle("Student Registration");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
