package warptrading.java.game;

public class GameModel
{
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


}
