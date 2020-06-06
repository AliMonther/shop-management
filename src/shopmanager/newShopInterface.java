/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopmanager;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
/**
 *
 * @author حسين
 */
public class newShopInterface {
   
    CreateNewShop newShop;
        Font shopsList = new Font("Optima", Font.LAYOUT_NO_LIMIT_CONTEXT,80);
        JFrame f= new JFrame("كشاف الإخاء");
        JPanel p;
        JButton backBtn;
        JPanel pan ;
        JButton addStdBtn;
        JTextField StdName;
        JTextField StdTotalC;
        JTextField CreateShopName;
        JButton ShopName;
        JPanel p2;
         //-----------------------
       
    public newShopInterface(){}
    public newShopInterface(int val) {
      
        f.setSize(1200, 700);                                
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        f.setLayout(new FlowLayout());       
        f.setLayout(null);
        f.setVisible(true); 
        
        UpPanel();
        backButton();
         mainPanle();
         DownPanel();
           AddShopName();
    }
    public void AddShopName()
    {
        CreateShopName = new JTextField(15); 
        ShopName = new JButton("أضافة محل جديد");
        pan.add(ShopName);
        pan.add(CreateShopName);
        ShopName.addActionListener(new ActionListener() {        
            @Override
            public void actionPerformed(ActionEvent e) {
                    CreateShopName.setVisible(false);
                    ShopName.setVisible(false);
                try {
                    newShop = new CreateNewShop(CreateShopName.getText());
                } catch (IOException ex) {
                    System.out.println("ERROR");
                 JOptionPane.showMessageDialog(f, "لايمكن ترك اسم المحل فارغ الرجاء أدراج اسم ");
                 CreateShopName.setVisible(true);
                    ShopName.setVisible(true);
                    Logger.getLogger(newShopInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

           
        });
        
    }
     public void UpPanel()
    {
        p = new JPanel();
        p.setBackground(new Color(0, 51, 153));                        
        p.setBounds(0, 0, 1200, 200);
        JLabel l = new JLabel("كشاف الإخاء");
         l.setFont(shopsList);
         l.setForeground(new Color(153, 187, 255));    
     
          p.add(l);
        f.add(p);
    }
     public void backButton()
     {
         backBtn =new JButton("رجوع");
         backBtn.setBounds(150,100,95,30);
         
         backBtn.setBounds(150,100,95,30);
         backBtn.addActionListener(new ActionListener() {        
            @Override
            public void actionPerformed(ActionEvent e) {
                 f.setVisible(false);
                 mainInterface m =new mainInterface();
                                                     }});
         
         f.add(backBtn);
          
     }
     public void DownPanel()
    {
        p2 = new JPanel();
        p2.setBackground(new Color(0, 51, 153));                        
        p2.setBounds(0, 600, 1200, 570);
        f.add(p2);
        JLabel versonL = new JLabel("develped by Ali Monther");
        
        versonL.setForeground(Color.white);
        
        p2.add(versonL);
       
    }
     public void mainPanle()
     {
          pan = new JPanel();
         pan.setBackground(new Color(204, 220, 255));                        
         pan.setBounds(0, 200, 1200, 500);
         addStdBtn = new JButton("إضافة طالب جديد ");
           StdName = new JTextField(15);
      StdTotalC = new JTextField(15);
       
       
          pan.add(StdName);
            pan.add(StdTotalC);
         f.add(pan);
        addStdBtn.addActionListener(new ActionListener() {        
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("alimonther");
               int  TotalCost = Integer.parseInt(StdTotalC.getText());
                Student std = new Student(StdName.getText(),TotalCost ,TotalCost, 0);
                try {
                    newShop.ADDStudent(std);
                } catch (IOException ex) {
                    System.out.println("ERROR");
                     JOptionPane.showMessageDialog(f, "لايمكن ترك اسم الطالب فارغ الرجاء أدراج اسم ");
                     // insert two label for user understund how to use the fields
                     
                     
                    }
                
            
            }});
        
            pan.add(addStdBtn);
           
           
     }
    }
