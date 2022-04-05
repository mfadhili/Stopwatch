/*
* Creating a GUI based stop watch
* */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Stopwatch extends JFrame {

    public static void main(String args[]){
        // construct the frame
        new Stopwatch().show();
    }

    public Stopwatch(){
        // Frame constructor
        setTitle("Stopwatch Application");
        setSize(300,100);

    }
}
