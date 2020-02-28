package layoutBorder;

import java.awt.*;
import javax.swing.*;

public class layoutBorderTest
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() -> {
            JFrame frame = new layoutBorder();
            frame.setTitle("Bruce's Test");
            frame.setLocation(400,100);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
