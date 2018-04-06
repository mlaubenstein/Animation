class Coordinates implements AnimationsInterface {
/*
* initialization of the coordinates in x- and y-direction
 **/
    int x = 0;
    int y = 0;
/*
* Method that sets the x-coordinate and the y-coordinate
* values and change them so the object is moving
* */
    public void Set_XY() {

        DrawPanel drawPanel = new DrawPanel ();
        /*
        * for-loop to move the object downwards
        * */
        for (int i = 0; i < 600; i++) {
            x++;y++;
            x();y();

            drawPanel.repaint( );

            try { Thread.sleep ( 5 ); }
            catch (Exception e) { }
        }
        /*
         * for-loop to move the object downwards
         * */            for (int i = 600; i > 0; i--) {
            x--;y--;
            x();y();

            drawPanel.repaint ();

            try { Thread.sleep ( 5 ); }
            catch (Exception e) { }

        }

    }
    //writing the current x value in the interface AnimationsInterface
    @Override
    public int x() { return x; }
    //writing the current y value in the interface AnimationsInterface
    @Override
    public int y() { return y; }



}
