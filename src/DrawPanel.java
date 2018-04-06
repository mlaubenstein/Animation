import javax.swing.*;
import java.awt.*;
/*
* DrawPanel generate the moving object as an JPanel
* with the changing coordinates of the AnimationsInterface
* */
public class DrawPanel extends JPanel  {

    public void paintComponent(Graphics graphics, AnimationsInterface animationsInterface){

            graphics.setColor ( Color.red );
            graphics.fillOval ( animationsInterface.x (), animationsInterface.y (), 10, 10 );
    }


}
