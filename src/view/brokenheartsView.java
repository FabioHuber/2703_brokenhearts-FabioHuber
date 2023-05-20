package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class brokenheartsView {

    private final String BROKENHEART = "\u200D\uD83D\uDC94";
    private final String HEALEDHEART = "❤\uFE0F\u200D\uD83E\uDE79";
    Button restart;
    Button[] heartsButtons;
    Label heading;
    private Scene mainScene;

    public brokenheartsView() {
        restart = new Button();
        heartsButtons = new Button[10];
        for (int i = 0; i < heartsButtons.length; i++) {
            heartsButtons[i] = new Button(BROKENHEART);
            heartsButtons[i].setFont(new Font("Arial", 40));

            //make text in button as big as the button
            heartsButtons[i].setMinSize(100, 100);

            //make button and Heart bigger
            heartsButtons[i].setStyle("-fx-padding: 10px;");
            //center text in button
            heartsButtons[i].setAlignment(Pos.CENTER);
        }

        heading = new Label("Heal the broken Hearts!");
        restart.setText("Restart");
        heading.setFont(new Font("Arial", 25));
        heading.setStyle("-fx-padding: 10px;");

        createMainScene();
    }

    private void createMainScene(){
        VBox root = new VBox(20);
        HBox hearts = new HBox(20);
        root.getChildren().add(heading);
        root.getChildren().add(hearts);
        hearts.getChildren().addAll(heartsButtons);
        root.getChildren().add(restart);

        root.setAlignment(Pos.TOP_CENTER);
        hearts.setAlignment(Pos.CENTER);

        mainScene = new Scene(root);
    }

    public void setHeart(int i, boolean isBroken){
        if(isBroken){
            heartsButtons[i].setText(BROKENHEART);
        }else{
            heartsButtons[i].setText(HEALEDHEART);
        }
    }

    public Button getRestart() {
        return restart;
    }

    public Button getHeart(int i){
        return heartsButtons[i];
    }

    public Label getHeading() {
        return heading;
    }

    public Scene getMainScene() {
        return mainScene;
    }
}
