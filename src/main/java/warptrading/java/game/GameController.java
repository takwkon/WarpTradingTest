package warptrading.java.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameController
{
    GameModel model;
    GameView view;

    public GameController (GameModel model, GameView view)
    {
        this.model = model;
        this.view = view;

        // add listener
        this.view.addPaperController(new PaperButtonController());
        this.view.addScissorsController(new ScissorsButtonController());
        this.view.addRockController(new RockButtonController());
        this.view.addSpockController(new SpockButtonController());
        this.view.addLizardController(new LizardButtonController());
    }

    /**
     * update GUI base on result and choice
     */
    private void changeView()
    {
        view.changeShownChoices(view.getUserChoicePanel(), model.getUserChoice());
        view.changeShownChoices(view.getComputerChoicePanel(), model.getComputerChoice());

        if (model.judgeResult() == GameModel.GAMESTATE.WIN)
        {
            view.setResultLabel("Player Win !!");
        }
        else if (model.judgeResult()==GameModel.GAMESTATE.LOST)
        {
            view.setResultLabel("Player Lost !!");
        }
        else
        {
            view.setResultLabel("Draw Game ");
        }

        view.repaint();
    }

    /**
     * "Play Game" by setting Player and Computer Choice in Model
     * @param model is our Game Logic
     * @param playerChoice is player choice
     */
    private void playGame(GameModel model, GameModel.CHOICE playerChoice)
    {
        model.setUserChoice(playerChoice);
        model.setComputerChoice(model.computerThink());
    }

    // listen to paper button
    class PaperButtonController implements ActionListener {
        /* (non-Javadoc)
         * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
         * Play Game and Change GUI base on result
         */
        @Override
        public void actionPerformed(ActionEvent ac)
        {
            playGame(model,GameModel.CHOICE.PAPER);
            changeView();
        }
    }

    // listen to scissor button
    class ScissorsButtonController implements ActionListener{
        /* (non-Javadoc)
         * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
         * Play Game and Change GUI base on result
         */
        @Override
        public void actionPerformed(ActionEvent ac)
        {
            playGame(model,GameModel.CHOICE.SCISSORS);
            changeView();
        }
    }

    //listen to rock button
    class RockButtonController implements ActionListener {
        /* (non-Javadoc)
         * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
         * Play Game and Change GUI base on result
         */
        @Override
        public void actionPerformed(ActionEvent ac)
        {
            playGame(model,GameModel.CHOICE.ROCK);
            changeView();
        }
    }

    //listen to spock button
    class SpockButtonController implements ActionListener {
        /* (non-Javadoc)
         * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
         * Play Game and Change GUI base on result
         */
        @Override
        public void actionPerformed(ActionEvent ac)
        {
            playGame(model,GameModel.CHOICE.SPOCK);
            changeView();
        }
    }

    //listen to lizard button
    class LizardButtonController implements ActionListener {
        /* (non-Javadoc)
         * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
         * Play Game and Change GUI base on result
         */
        @Override
        public void actionPerformed(ActionEvent ac)
        {
            playGame(model,GameModel.CHOICE.LIZARD);
            changeView();
        }
    }


}
