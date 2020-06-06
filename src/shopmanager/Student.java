/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopmanager;

/**
 *
 * @author حسين
 */
public class Student {
    public String name;
    public int totalCost;
    public int CurrentCost;
    public int TempCost;
    
    Student( String name,int totalCost,int CurrentCost,int TempCost)
    {
        this.name=name;
        this.totalCost = totalCost;
        this.CurrentCost = CurrentCost;
        this.TempCost = TempCost;
    }
    
   
}
