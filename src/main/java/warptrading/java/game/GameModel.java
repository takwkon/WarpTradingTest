package warptrading.java.game;

public class GameModel
{
    public static final int NUMBER_OF_CHOICE = CHOICE.LIZARD.getValue() + 1;

    /**
     * Player Choice
     */
    public static enum CHOICE
    {
        PAPER(0),
        SCISSORS(1),
        ROCK(2),
        SPOCK(3),
        LIZARD(4);

        private final int value;

        CHOICE(final int value)
        {
            this.value = value;
        }

        public int getValue() { return value; }
    }

    /**
     * Game State
     */
    public static enum GAMESTATE
    {
        WIN,
        DRAW,
        LOST
    }

    private CHOICE userChoice, computerChoice;
    private final CHOICE [] choices =
            new CHOICE[] { CHOICE.PAPER, CHOICE.ROCK, CHOICE.SCISSORS,
                    CHOICE.SPOCK, CHOICE.LIZARD };

    /**
     * Table for result lookup
     * indexing refer to Choice enum, 0 represent PAPER
     */
    private final GAMESTATE[][] RESULTSTABLE =
            new GAMESTATE[][] {
                    {GAMESTATE.DRAW, GAMESTATE.LOST, GAMESTATE.WIN, GAMESTATE.WIN, GAMESTATE.LOST},
                    {GAMESTATE.WIN, GAMESTATE.DRAW, GAMESTATE.LOST, GAMESTATE.LOST, GAMESTATE.WIN},
                    {GAMESTATE.LOST, GAMESTATE.WIN, GAMESTATE.DRAW, GAMESTATE.LOST, GAMESTATE.WIN},
                    {GAMESTATE.LOST, GAMESTATE.WIN, GAMESTATE.WIN, GAMESTATE.DRAW, GAMESTATE.LOST},
                    {GAMESTATE.WIN, GAMESTATE.LOST, GAMESTATE.LOST, GAMESTATE.WIN, GAMESTATE.DRAW}};

    /**
     * Judge and return game result
     * @return GameState
     */
    public GAMESTATE judgeResult()
    {
        return RESULTSTABLE[userChoice.getValue()][computerChoice.getValue()];
    }

    /**
     * Set user choice in model
     * @param
     */
    public void setUserChoice(CHOICE choice)
    {
        userChoice = choice;
    }

    /**
     * Randomly generate computer hand
     * @return Computer Choice
     */
    public CHOICE computerThink()
    {
        return choices[(int)(Math.random()*5)];
    }

    /**
     * set computer choice in model
     * @param choice
     */
    public void setComputerChoice(CHOICE choice)
    {
        computerChoice = choice;
    }

    /**
     * get user choice
     * @return User Choice
     */
    public CHOICE getUserChoice(){ return userChoice; }

    /**
     * get computer choice
     * @return Computer Choice
     */
    public CHOICE getComputerChoice(){ return computerChoice; }

}
