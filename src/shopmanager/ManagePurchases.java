/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopmanager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author حسين
 */
public class ManagePurchases {
   Scanner reader = new Scanner(System.in);
   String FileName;
   Student std;
   int ValuePurchased;
   int finalCost;
   public ManagePurchases()
   {
       
   }
    public ManagePurchases(Controller c,String stdName, int ValuePurchased) throws IOException
    {
       this.ValuePurchased=ValuePurchased;
       int valueTest=TestName(stdName,c); 
       if(valueTest ==-1)
         System.out.println("Student not found");
        else
        {
            System.out.println("student founded"+"___index="+valueTest);
            if(c.CurrentC[valueTest]-ValuePurchased>=0)
            {   String reader="";
                int lineN=0;
                int lineCurrentC=0;
            System.out.println("Sucssefuly");
             // ubdate CurrentC array and file
                c.CurrentC[valueTest]=c.CurrentC[valueTest]-ValuePurchased;
                System.out.println("your Current cost"+c.CurrentC[valueTest]);
                int lineToChange = 2+(2*valueTest)+valueTest;
            FileWriter file = new FileWriter(c.FileName);
                for (int i = 0; i < c.names.length; i++) {
            file.write(c.names[i]+System.lineSeparator());
            file.write(Integer.toString(c.TotalC[i])+System.lineSeparator());
            file.write(Integer.toString(c.CurrentC[i]) + System.lineSeparator());
            }
            file.close();
              
            }
            else
            {
                System.out.println("Current Cost for "+c.names[valueTest]+"under zero");
                System.out.println("you can not buy");
                
            }
        } 
    }
    public int TestName(String stdName,Controller ctr)
    { 
        for (int i = 0; i < ctr.names.length; i++) 
            if(ctr.names[i].equals(stdName))
                return i;
        
            return -1;
    }
    public void UpDateName(Controller c,String oldName,String newName)throws IOException
    {
        int valueTest=TestName(oldName,c);
        if(valueTest ==-1)
         System.out.println("Student not found");
        else
        {
            System.out.println("student founded"+"___index="+valueTest);
            c.names[valueTest]=newName;
            FileWriter file = new FileWriter(c.FileName);
                for (int i = 0; i < c.names.length; i++) {
            file.write(c.names[i]+System.lineSeparator());
            file.write(Integer.toString(c.TotalC[i])+System.lineSeparator());
            file.write(Integer.toString(c.CurrentC[i]) + System.lineSeparator());
            }
            file.close();
              
            System.out.println("name changed");
           
        } 
    }
        
        public void UpDateTotalCost(Controller c,String stdName,int newCost)throws IOException
    {
        int valueTest=TestName(stdName,c);
        if(valueTest ==-1)
         System.out.println("Student not found");
        else
        {
            System.out.println("student founded"+"___index="+valueTest);
            c.TotalC[valueTest]+=newCost;
            c.CurrentC[valueTest]+=newCost;
            FileWriter file = new FileWriter(c.FileName);
                for (int i = 0; i < c.names.length; i++) {
            file.write(c.names[i]+System.lineSeparator());
            file.write(Integer.toString(c.TotalC[i])+System.lineSeparator());
            file.write(Integer.toString(c.CurrentC[i]) + System.lineSeparator());
            }
            file.close();
              
            System.out.println("Total cost changed");
           
        } 
    }
    

}
