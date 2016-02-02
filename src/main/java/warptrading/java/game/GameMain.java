package warptrading.java.game;

public class GameMain
{
    public static void main(String[] args)
    {
        GameModel model = new GameModel();
        GameView view = new GameView();
        GameController controller = new GameController(model, view);

        //start GUI thread
        java.awt.EventQueue.invokeLater(view);
    }
}
