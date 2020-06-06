/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author حسين
 */
public class filesManager 
{ 
    String fileName;
    int LineNumber;
    public filesManager(String fileName) throws  IOException {
    
        this.fileName=fileName;
        String reader="";
        FileReader fi = new FileReader(fileName);
        BufferedReader bri = new BufferedReader(fi);
        while( (reader=bri.readLine())!=null )
        {   LineNumber++;
        }
         bri.close();
        fi.close();
        
    }
    
    
}
