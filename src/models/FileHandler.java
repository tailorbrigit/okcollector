/*
 * File: FileHandler.java
 * Created Date: 2020-09-15
 * Author: Nagy János
 * Github: https://github.com/andteki
 * Copyright (c) 2020-2022 Nagy János
 * A programot módosította: Szabó Brigitta
 * Szoft II/N 2023-02-17
 * 
 * GNU GPL v2
 */

package models;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandler {
    String fileName;
    public FileHandler() 
    {this.fileName = "adat.txt";}

    public void writeFile(String line) {
        try 
        {
            FileWriter filewr = new FileWriter(this.fileName, true);
            PrintWriter printer = new PrintWriter(filewr);
            printer.println(line);
            printer.close();
        } 
        catch (IOException e) {System.err.println("Hiba! A fájlbaírás sikertelen!");}
    }
}
