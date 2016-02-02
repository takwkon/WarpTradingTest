package warptrading.java.game;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameModelTest
{
    GameModel testGame;
    GameModel.CHOICE[] choices;
    GameModel.GAMESTATE[][] verifiedGameResult;

    @Before
    public void setUp()
    {
        testGame = new GameModel();
        choices =  new GameModel.CHOICE[] {
                GameModel.CHOICE.PAPER, GameModel.CHOICE.SCISSORS, GameModel.CHOICE.ROCK,
                GameModel.CHOICE.SPOCK, GameModel.CHOICE.LIZARD };

        verifiedGameResult =
                new GameModel.GAMESTATE[][] {
                        {GameModel.GAMESTATE.DRAW, GameModel.GAMESTATE.LOST, GameModel.GAMESTATE.WIN, GameModel.GAMESTATE.WIN, GameModel.GAMESTATE.LOST},
                        {GameModel.GAMESTATE.WIN, GameModel.GAMESTATE.DRAW, GameModel.GAMESTATE.LOST, GameModel.GAMESTATE.LOST, GameModel.GAMESTATE.WIN},
                        {GameModel.GAMESTATE.LOST, GameModel.GAMESTATE.WIN, GameModel.GAMESTATE.DRAW, GameModel.GAMESTATE.LOST, GameModel.GAMESTATE.WIN},
                        {GameModel.GAMESTATE.LOST, GameModel.GAMESTATE.WIN, GameModel.GAMESTATE.WIN, GameModel.GAMESTATE.DRAW, GameModel.GAMESTATE.LOST},
                        {GameModel.GAMESTATE.WIN, GameModel.GAMESTATE.LOST, GameModel.GAMESTATE.LOST, GameModel.GAMESTATE.WIN, GameModel.GAMESTATE.DRAW}};
    }

    @Test
    public void testAllCasesForTwoPlayers()
    {
        for(int i = 0;i < GameModel.NUMBER_OF_CHOICE;i++)
            for(int j = 0;j < GameModel.NUMBER_OF_CHOICE;j++)
            {
                testGame.setUserChoice(choices[i]);
                testGame.setComputerChoice(choices[j]);
                assertEquals(verifiedGameResult[i][j], testGame.judgeResult());
            }

    }
}
