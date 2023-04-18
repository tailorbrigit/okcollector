/*
 * File: MainWindow.java
 * Created Date: 2020-09-15
 * Author: Nagy János
 * Github: https://github.com/andteki
 * Copyright (c) 2020-2022 Nagy János
 * A programot módosította: Szabó Brigitta
 * Szoft II/N 2023-02-17
 * 
 * GNU GPL v2
 */

package views;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainWindow extends JFrame {
    public JLabel titleLabel;
    public JLabel asideLabel;
    public JLabel bsideLabel;
    public JLabel perimeterLabel;
    public JLabel areaLabel;

    public JPanel asidePanel;
    public JPanel bsidePanel;
    public JPanel buttonsPanel; 
    public JPanel perimeterPanel;
    public JPanel areaPanel;

    public JTextField asideField;    
    public JTextField bsideField;
    public JTextField perimeterField;

    public JButton calcButton;
    public JButton aboutButton;

    public JTextField areaField;

    public MainWindow() 
    {
        setVisible(true);
        setComponent();
        setMainFrame();
        setLayout();
        setButtonPanel();
        setComponentPanel();
        exitPanel();
        pack();
    }

    public void setComponent()
    {
        this.titleLabel = new JLabel("Téglalap kerület, terület");

        this.asidePanel = new JPanel();
        this.asideLabel = new JLabel("a oldal");
        this.asideField = new JTextField();

        this.bsidePanel = new JPanel();
        this.bsideLabel = new JLabel("b oldal");
        this.bsideField = new JTextField();

        this.buttonsPanel = new JPanel();
        this.calcButton = new JButton("Számít");
        this.aboutButton = new JButton("Névjegy");

        this.perimeterPanel = new JPanel();
        this.perimeterLabel = new JLabel("Kerület");
        this.perimeterField = new JTextField();

        this.areaPanel = new JPanel();
        this.areaLabel = new JLabel("Terület");
        this.areaField = new JTextField();
    }

    public void setLayout()
    {
        this.asidePanel.setLayout(new BoxLayout(this.asidePanel, BoxLayout.LINE_AXIS));
        this.bsidePanel.setLayout(new BoxLayout(this.bsidePanel, BoxLayout.LINE_AXIS));
        this.perimeterPanel.setLayout(new BoxLayout(this.perimeterPanel, BoxLayout.LINE_AXIS));
        this.areaPanel.setLayout(new BoxLayout(this.areaPanel, BoxLayout.LINE_AXIS));

        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
    }

    public void setMainFrame()
    {
        this.asidePanel.add(this.asideLabel);
        this.asidePanel.add(this.asideField);
        this.bsidePanel.add(this.bsideLabel);
        this.bsidePanel.add(this.bsideField);

        this.add(this.titleLabel);
        this.add(this.asidePanel);
        this.add(this.bsidePanel);
        this.add(this.buttonsPanel);
        this.add(this.perimeterPanel);
        this.add(this.areaPanel);
        
    }

    public void setButtonPanel()
    {
        this.buttonsPanel.add(this.calcButton);
        this.buttonsPanel.add(this.aboutButton);
    }

    public void setComponentPanel()
    {
        this.perimeterPanel.add(this.perimeterLabel);
        this.perimeterPanel.add(this.perimeterField);
        this.areaPanel.add(this.areaLabel);
        this.areaPanel.add(this.areaField);
    }

    public void exitPanel()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}