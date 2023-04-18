/*
 * File: MainController.java
 * Created Date: 2020-09-15
 * Author: Nagy János
 * Github: https://github.com/andteki
 * Copyright (c) 2020-2022 Nagy János
 * A programot módosította: Szabó Brigitta
 * Szoft II/N 2023-02-17
 * 
 * GNU GPL v2
 */
package controllers;
import models.FileHandler;
import views.MainWindow;

public class MainController {

    MainWindow mainWindow;

    public MainController() 
    {
        this.mainWindow = new MainWindow();
        this.mainWindow.calcButton.addActionListener(event -> {
            this.onClickCalcButton();
        });
    }
    //TODO: névjegy megcsinálása: action listener hozzárendelése a névjegyhez
    //TODO: új adatok action: tegye alapértelmezettre a bemeneti értékeket

    public void onClickCalcButton() 
    {
        double aSite = Double.parseDouble(this.mainWindow.asideField.getText());
        double bSite = Double.parseDouble(this.mainWindow.bsideField.getText());
        Double perimeter = CalcController.calcPerimeter(aSite, bSite);
        Double area = CalcController.calcArea(aSite, bSite);

        this.mainWindow.perimeterField.setText(perimeter.toString());
        this.mainWindow.areaField.setText(area.toString());

        String line = perimeter.toString() + " : " + area.toString();
        FileHandler handler = new FileHandler();
        handler.writeFile(line);

        //TODO: adatbázisba írás
        
    }
    
}

