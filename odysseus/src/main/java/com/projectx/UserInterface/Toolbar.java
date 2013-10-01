package com.projectx.UserInterface;

import javax.swing.*;

/**
 * @author Steve De Clercq
 */
public class Toolbar extends JToolBar{

    public Toolbar(JFrame parent){
        this.setOrientation(JToolBar.HORIZONTAL);
        setFloatable(false);
        setBorderPainted(false);
        addButton();
    }
    private void addButton(){
    }
}
