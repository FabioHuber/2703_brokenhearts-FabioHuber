package controller;

import model.brokenheartsManager;
import view.brokenheartsView;

public class brokenheartsController {
    private brokenheartsManager manager;
    private brokenheartsView view;

    public brokenheartsController(brokenheartsView view){
        manager = new brokenheartsManager();
        this.view = view;
        randomGenerator();

        for (int i = 0; i < manager.getHearts().length; i++) {
            int finalI = i;
            view.getHeart(i).setOnAction(event -> onButtonClick(finalI));
        }
        view.getRestart().setOnAction(event -> randomGenerator());
    }

    public void onButtonClick(int i){
        manager.toggle(i);
        view.setHeart(i, manager.isBroken(i));
        setHeading();
    }

    public void setHeading(){
        if(manager.checkifAllHeartsAreHealed()){
            view.getHeading().setText("You are a true Heart Healer!");
        }else{
            view.getHeading().setText("Heal the broken Hearts!");
        }
    }

    public void randomGenerator(){
        manager.randomToggle();

        for (int i = 0; i < manager.getHearts().length; i++) {
            view.setHeart(i, manager.isBroken(i));
        }
        setHeading();
    }
}
