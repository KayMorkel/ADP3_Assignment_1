package za.ca.cput.kaylinmorkelassignment1;

import javax.swing.*;

public class RunGui
{
    public static void main(String[] args)
    {
        Gui way = new Gui();
        way.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        way.setSize(550,380);
        way.setVisible(true);
    }
}
