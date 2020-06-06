/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopmanager;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author حسين
 */
public class CreateNewShop  {
    public String ShopName;
    
    public CreateNewShop(String ShopName,int val) throws IOException 
    { 
this.ShopName=ShopName;
        FileWriter f = new FileWriter(ShopName,true);
        BufferedWriter b = new BufferedWriter(f);
       // b.write(FileName+System.lineSeparator());
        b.close();
        f.close();    
    }
    public CreateNewShop(String ShopName) throws IOException
    { this.ShopName=ShopName;
        FileWriter f = new FileWriter(ShopName);
        BufferedWriter b = new BufferedWriter(f);
       // b.write(FileName+System.lineSeparator());
        b.close();
        f.close();
    }
   
    public void ADDStudent( Student std ) throws IOException
    { 
        FileWriter file = new FileWriter(ShopName,true);
       
        String STotalCost = Integer.toString(std.totalCost);
        String SCurrentCost = Integer.toString(std.CurrentCost);
        file.write(std.name  +System.lineSeparator());
        file.write(STotalCost  +System.lineSeparator());
        file.write(SCurrentCost + System.lineSeparator());
        file.close();
    
    }

    public String arr(String[] array,int index)
    { array = new String[10];
            array[index]="ali";
        
        return array[index];
    }
 
}
