import controller.brokenheartsController;
import javafx.application.Application;
import javafx.stage.Stage;
import view.brokenheartsView;

public class Main extends Application{
    private brokenheartsView view;
    private brokenheartsController controller;

    public Main(){
        view = new brokenheartsView();
        controller = new brokenheartsController(view);
    }

    @Override
    public void start(Stage primaryStage){
        primaryStage.setScene(view.getMainScene());
        primaryStage.setTitle("Broken Hearts ... ❤️💔❤️‍🔥");
        primaryStage.setWidth(3000);
        primaryStage.setHeight(300);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
