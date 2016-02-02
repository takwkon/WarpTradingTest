package warptrading.java.game;

import javax.swing.*;
import java.util.EnumMap;

public class GameView extends JFrame implements Runnable
{
    private JButton scissorButton;
    private JButton rockButton;
    private JButton paperButton;
    private JButton lizardButton;
    private JButton spockButton;

    private JLabel playerChoiceLabel;
    private JLabel computerChoiceLabel;
    private JLabel playGameLabel;
    private JLabel resultLabel;
    private JPanel jPanel1;
    private JPanel choicePanel;
    private JPanel gamePlayPanel;
    private JPanel upPlayerChoicePanel;
    private JPanel downPlayerChoicePanel;
    private JPanel playerChoicePanel;
    private JPanel computerChoicePanel;

    private final EnumMap<GameModel.CHOICE, ImageIcon> iconEnumMap =
            new EnumMap<GameModel.CHOICE, ImageIcon>(GameModel.CHOICE.class);

    public GameView()
    {
        ClassLoader classLoader = getClass().getClassLoader();

        iconEnumMap.put(GameModel.CHOICE.PAPER, new ImageIcon(classLoader.getResource("paper.png")));
        iconEnumMap.put(GameModel.CHOICE.SCISSORS, new ImageIcon(classLoader.getResource("scissor.png")));
        iconEnumMap.put(GameModel.CHOICE.ROCK, new ImageIcon(classLoader.getResource("rock.png")));
        iconEnumMap.put(GameModel.CHOICE.SPOCK, new ImageIcon(classLoader.getResource("spock.png")));
        iconEnumMap.put(GameModel.CHOICE.LIZARD, new ImageIcon(classLoader.getResource("lizard.png")));

        initComponents();
    }

    @Override
    public void run()
    {
        setVisible(true);
    }

    private void initComponents()
    {
        jPanel1 = new javax.swing.JPanel();
        playerChoicePanel = new javax.swing.JPanel();
        computerChoicePanel = new javax.swing.JPanel();
        resultLabel = new javax.swing.JLabel();
        choicePanel = new javax.swing.JPanel();
        playerChoiceLabel = new javax.swing.JLabel();
        computerChoiceLabel = new javax.swing.JLabel();
        gamePlayPanel = new javax.swing.JPanel();
        playGameLabel = new javax.swing.JLabel();
        upPlayerChoicePanel = new javax.swing.JPanel();
        scissorButton = new javax.swing.JButton();
        rockButton = new javax.swing.JButton();
        paperButton = new javax.swing.JButton();
        downPlayerChoicePanel = new javax.swing.JPanel();
        lizardButton = new javax.swing.JButton();
        spockButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PaperScissorRockSpockLizard");
        setResizable(false);

        paperButton.setIcon(iconEnumMap.get(GameModel.CHOICE.PAPER)); // NOI18N
        rockButton.setIcon(iconEnumMap.get(GameModel.CHOICE.ROCK)); // NOI18N
        scissorButton.setIcon(iconEnumMap.get(GameModel.CHOICE.SCISSORS)); // NOI18N
        spockButton.setIcon(iconEnumMap.get(GameModel.CHOICE.SPOCK)); // NOI18N
        lizardButton.setIcon(iconEnumMap.get(GameModel.CHOICE.LIZARD)); // NOI18N

        org.jdesktop.layout.GroupLayout playerChoicePanelLayout = new org.jdesktop.layout.GroupLayout(playerChoicePanel);
        playerChoicePanel.setLayout(playerChoicePanelLayout);
        playerChoicePanelLayout.setHorizontalGroup(
                playerChoicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(0, 168, Short.MAX_VALUE)
        );
        playerChoicePanelLayout.setVerticalGroup(
                playerChoicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(0, 0, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout computerChoicePanelLayout = new org.jdesktop.layout.GroupLayout(computerChoicePanel);
        computerChoicePanel.setLayout(computerChoicePanelLayout);
        computerChoicePanelLayout.setHorizontalGroup(
                computerChoicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(0, 156, Short.MAX_VALUE)
        );
        computerChoicePanelLayout.setVerticalGroup(
                computerChoicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(0, 0, Short.MAX_VALUE)
        );

        resultLabel.setFont(new java.awt.Font("Consolas", 3, 24)); // NOI18N
        resultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .add(playerChoicePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(27, 27, 27)
                                .add(resultLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 187, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 32, Short.MAX_VALUE)
                                .add(computerChoicePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(computerChoicePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(playerChoicePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .add(jPanel1Layout.createSequentialGroup()
                                .add(15, 15, 15)
                                .add(resultLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                .addContainerGap())
        );

        playerChoiceLabel.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        playerChoiceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerChoiceLabel.setText("Player Choice");

        computerChoiceLabel.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        computerChoiceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerChoiceLabel.setText("Computer Choice");

        org.jdesktop.layout.GroupLayout choicePanelLayout = new org.jdesktop.layout.GroupLayout(choicePanel);
        choicePanel.setLayout(choicePanelLayout);
        choicePanelLayout.setHorizontalGroup(
                choicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(choicePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .add(playerChoiceLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 146, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(computerChoiceLabel)
                                .addContainerGap())
        );
        choicePanelLayout.setVerticalGroup(
                choicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(choicePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .add(choicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                        .add(playerChoiceLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                        .add(computerChoiceLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        playGameLabel.setFont(new java.awt.Font("Consolas", 3, 24)); // NOI18N
        playGameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playGameLabel.setText("Let's Play A Game !");

        org.jdesktop.layout.GroupLayout gamePlayPanelLayout = new org.jdesktop.layout.GroupLayout(gamePlayPanel);
        gamePlayPanel.setLayout(gamePlayPanelLayout);
        gamePlayPanelLayout.setHorizontalGroup(
                gamePlayPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(gamePlayPanelLayout.createSequentialGroup()
                                .add(132, 132, 132)
                                .add(playGameLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 276, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gamePlayPanelLayout.setVerticalGroup(
                gamePlayPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(org.jdesktop.layout.GroupLayout.TRAILING, gamePlayPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .add(playGameLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout upPlayerChoicePanelLayout = new org.jdesktop.layout.GroupLayout(upPlayerChoicePanel);
        upPlayerChoicePanel.setLayout(upPlayerChoicePanelLayout);
        upPlayerChoicePanelLayout.setHorizontalGroup(
                upPlayerChoicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(upPlayerChoicePanelLayout.createSequentialGroup()
                                .add(214, 214, 214)
                                .add(scissorButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(rockButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(upPlayerChoicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(upPlayerChoicePanelLayout.createSequentialGroup()
                                        .add(85, 85, 85)
                                        .add(paperButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(385, Short.MAX_VALUE)))
        );
        upPlayerChoicePanelLayout.setVerticalGroup(
                upPlayerChoicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(upPlayerChoicePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .add(upPlayerChoicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(rockButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                        .add(scissorButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .add(upPlayerChoicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(upPlayerChoicePanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .add(paperButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                        .addContainerGap()))
        );

        org.jdesktop.layout.GroupLayout downPlayerChoicePanelLayout = new org.jdesktop.layout.GroupLayout(downPlayerChoicePanel);
        downPlayerChoicePanel.setLayout(downPlayerChoicePanelLayout);
        downPlayerChoicePanelLayout.setHorizontalGroup(
                downPlayerChoicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(org.jdesktop.layout.GroupLayout.TRAILING, downPlayerChoicePanelLayout.createSequentialGroup()
                                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(spockButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(36, 36, 36)
                                .add(lizardButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(182, 182, 182))
        );
        downPlayerChoicePanelLayout.setVerticalGroup(
                downPlayerChoicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(downPlayerChoicePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .add(downPlayerChoicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                        .add(lizardButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                        .add(spockButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                                .addContainerGap()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(choicePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(gamePlayPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(org.jdesktop.layout.GroupLayout.TRAILING, upPlayerChoicePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(downPlayerChoicePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                                .add(choicePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(gamePlayPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(upPlayerChoicePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(downPlayerChoicePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }

}
