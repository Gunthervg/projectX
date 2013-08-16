package com.projectx;


import javax.swing.*;
import java.awt.*;

/**
 * @author steve
 * @since 8/9/13
 */
public class MainScreen extends JFrame {
    private static final long  serialVersionUID=1L;
    private MapShower mapViewer=new MapShower();
    private MenuBar menu =new MenuBar();
    private StatusBar statusBar=new StatusBar();

    public MainScreen(){
        /**
         * Balk initailiseren, maximizen,exiten als hem geclosed wordt,layout zetten
         */
        super("Odysseus");
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        //JPanel jp = new JPanel();
        //add(jp,BorderLayout.NORTH);
        //jp.setEnabled(true);
        //jp.setBorder(BorderFactory.createTitledBorder("Coordinates"));
        //LocationTracker locationbar=new LocationTracker(jp,mapViewer);


        /**
         * maptekenen
         */
        JPanel jp2 = new JPanel();
        jp2.setLayout(new BorderLayout());
        jp2.setBorder(BorderFactory.createTitledBorder("Map"));
        add(jp2);
        jp2.setEnabled(true);
        jp2.add(mapViewer.Viewer());
        /**
         * statusbar toevoegen
         */
        add(statusBar.getStatusBar(),BorderLayout.SOUTH);
        /**
         * Menubar aansluiten
         */
        menu.AddTabItems(menu.file,menu.exit);
        menu.LoadPictureLauncher(mapViewer,statusBar);
        setJMenuBar(menu);
    }
}
