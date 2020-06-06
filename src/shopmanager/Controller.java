/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopmanager;

import com.sun.org.apache.bcel.internal.classfile.LineNumber;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JLabel;
import static jdk.nashorn.internal.objects.NativeString.indexOf;

/**
 *
 * @author حسين
 */
public class Controller {
      //-------------------------
    String FileName;
       int LineNumber;
    // filesManager f = new filesManager(FileName);
    String[] FileContent;// = new String[12];
    String[] names ;//= new String[FileContent.length/3];
    int[] TotalC; //= new int[FileContent.length/3];
    int[] CurrentC; //= new int[FileContent.length/3];
    private int indexx;
    private int maxIndex;
  
    int ind;
    //-----------------------------------
    

    //-------------------------------
   public Controller(String FileName) throws IOException
    { 
        int lineNumber=-1;
        String reader="";
        this.FileName=FileName;
        FileReader ff = new FileReader(FileName);
        BufferedReader brr = new BufferedReader(ff);
        while( (reader=brr.readLine())!=null )
        {   LineNumber++;
        }
        brr.close();
        ff.close();
        FileContent = new String[LineNumber];
        names = new String[FileContent.length/3];
         TotalC = new int[FileContent.length/3];
        CurrentC = new int[FileContent.length/3];
        FileReader f = new FileReader(FileName);
        BufferedReader br = new BufferedReader(f);
        while( (reader=br.readLine())!=null )
        {   lineNumber++;
           
            FileContent[lineNumber]=reader;
        }
        br.close();
        f.close();
    }
   
   //-----------------------------------    

   
    
     //---------------------------
 
    public void getFileContnet()
    {
               for (int i = 0; i < FileContent.length; i++) {
            System.out.println("index"+i+"="+FileContent[i]);
        }
    }
    //-----------------------------------
    
    public void proccesFile()
    {int j=0;
        for (int i = 0; i < FileContent.length; i++)
        { 
            names[j]=FileContent[i];
            TotalC[j]=Integer.parseInt(FileContent[i+1]);
            CurrentC[j]=Integer.parseInt(FileContent[i+2]);
            i+=2;
            j++;
        }
    }
    //-----------------------------------
    public void GetNames()
    {
        for (int i = 0; i < names.length; i++) {
            System.out.println("name:"+i+"="+names[i]);
        }
    }
    //-----------------------------------
    public void GetTotalCost()
    {
        
        for (int i = 0; i < TotalC.length; i++) {
            System.out.println("Total Cost:"+i+"="+TotalC[i]);
        }
    }
    //-----------------------------------
    public void GetCurrentCost()
    {
        
        for (int i = 0; i < CurrentC.length; i++) {
            System.out.println("Current Cost"+i+"="+CurrentC[i]);
        }
    }
    //-----------------------------------
    public void getFileInfo()
    {
        System.out.println("Names"+"||"+"Total Cost"+"||"+"Current Cost");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+"||||||"+TotalC[i]+"||||||"+CurrentC[i]+"||||||");
            System.out.println("");
        }
    }
    //-----------------------------------
   
    public void AcceptStudent(Student std)
    {
        
        
    }
    public void shopInfoArr(String arr[][])
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i][0]=names[i];
            arr[i][1]=Integer.toString(TotalC[i]);
            arr[i][2]=Integer.toString(CurrentC[i]);
        }
    }
    //-----------------------------------
}
