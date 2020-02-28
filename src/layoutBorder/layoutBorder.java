package layoutBorder;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class layoutBorder extends JFrame
{
    private JPanel buttonPanelNorth;
    private JPanel buttonPanelWest;
    private JPanel buttonPanelCenter;
    private static final int DEFAULT_WIDTH = 500;
    private static final int DEFAULT_HEIGHT = 300;

    public layoutBorder()
    {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // create buttons
        JButton yellowButton = new JButton("Yellow");
        JButton blueButton = new JButton("Blue");
        JButton redButton = new JButton("Red");
        JButton greenButton = new JButton("Green");

        buttonPanelNorth = new JPanel();
        buttonPanelWest = new JPanel();
        buttonPanelCenter = new JPanel();

        // add buttons to panels
        buttonPanelNorth.add(yellowButton);
        buttonPanelNorth.add(blueButton);
        buttonPanelNorth.add(redButton);
        buttonPanelWest.add(greenButton);

        // add panels to frame
        add(buttonPanelNorth, BorderLayout.NORTH);
        add(buttonPanelWest, BorderLayout.WEST);
        add(buttonPanelCenter, BorderLayout.CENTER);

        // create button actions
        ColorAction yellowAction = new ColorAction(Color.YELLOW);
        ColorAction blueAction = new ColorAction(Color.BLUE);
        ColorAction redAction = new ColorAction(Color.RED);
        ColorAction greenAction = new ColorAction(Color.GREEN);

        // associate actions with buttons
        yellowButton.addActionListener(yellowAction);
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);
        greenButton.addActionListener(greenAction);
    }

    /**
     * An action listener that sets the panel's background color.
     */
    private class ColorAction implements ActionListener
    {
        private Color backgroundColor;

        public ColorAction(Color c)
        {
            backgroundColor = c;
        }

        public void actionPerformed(ActionEvent event)
        {
            buttonPanelCenter.setBackground(backgroundColor);
        }
    }
}