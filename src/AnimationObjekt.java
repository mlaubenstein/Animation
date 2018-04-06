import javax.swing.*;
/*
* creates the JFrame and add the JPanel
* which represented the object that will move
* */
public class AnimationObjekt {

    public void los (){
        DrawPanel drawPanel = new DrawPanel ();
        Coordinates coordinates = new Coordinates ();

        JFrame frame = new JFrame (  );
        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane ().add ( drawPanel );
        frame.setSize ( 600, 600);
        frame.setVisible ( true );
        coordinates.Set_XY ();

    }
}
