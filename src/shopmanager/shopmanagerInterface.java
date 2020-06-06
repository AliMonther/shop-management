/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopmanager;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
/**
 *
 * @author حسين
 */
public class shopmanagerInterface {
    Font shopsList = new Font("Optima", Font.LAYOUT_NO_LIMIT_CONTEXT,80);
    JFrame fman= new JFrame("كشاف الإخاء");
     JPanel buttom;
    JPanel p;
    JPanel optionPan;
    JButton backBtn;
    JButton loginShopBtn;
    JTextField loginShopName;
     JPanel mainpanel ;
     JButton addStdName;
     JTextField addStdTC;
     Controller c;
     JPanel stdPanel;
     JButton AddStd ;
     JButton AcceptAddStd ;
     JButton UpDateStdName;
     JButton UpDateStdTC;
     JButton bayOperation;
     JButton AcceptUpName;
     JButton AcceptUpTC;
     JButton AcceptOperation;
     JTextField UpName;
     JTextField UpTC;
     JTextField newName;
     JLabel oldName;
     JLabel newname;
     JLabel stdName;
     JLabel stdTC;
     JTextField newTC;
      JLabel CostL;
      JTextField CC;
      ManagePurchases m ;
      JLabel Lname;
      JLabel LTC;
      Student std;
      CreateNewShop shop;
      
    //------------------------------
    public shopmanagerInterface() {
        fman.setSize(1200, 700);                                
        fman.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        fman.setLayout(new FlowLayout());       
        fman.setLayout(null);
        fman.setVisible(true); 
         backButton();
         UpPanel();
         mainPanle();
         EnterShopAction();
         
         //  EnterShopAction();
}
    //------------------------------
      public void UpPanel()
    {
        p = new JPanel();
        p.setBackground(new Color(0, 51, 153));    
        JButton totalCost = new JButton("click");
        p.setBounds(0, 0, 1200, 200);
        JLabel l = new JLabel("كشاف الإخاء");
         l.setFont(shopsList);
         l.setForeground(new Color(153, 187, 255));    
         p.add(l);
        fman.add(p);
    }
      //------------------------------
    
     
      
      public void mainPanle()
        {  
            mainpanel = new JPanel();
            mainpanel.setBackground(new Color(204, 220, 255));                        
            mainpanel.setBounds(0, 200, 1200, 500);
            fman.add(mainpanel);
            loginShopBtn = new JButton("اسم المحل");
            loginShopName = new JTextField(15);
            mainpanel.add(loginShopBtn);
            mainpanel.add(loginShopName);
            addStdName = new JButton("اسم الطالب");
            addStdTC = new JTextField(15);
            addStdName.setVisible(false);
            addStdTC.setVisible(false);
            mainpanel.add(addStdName);
            mainpanel.add(addStdTC);
            
            
            
        }
        //------------------------------
         public void backButton()
     {
         backBtn =new JButton("رجوع");
         backBtn.setBounds(150,100,95,30);
         
         backBtn.setBounds(150,100,95,30);
         backBtn.addActionListener(new ActionListener() {        
            @Override
            public void actionPerformed(ActionEvent e) {
                fman.setVisible(false);
                 mainInterface m =new mainInterface();
                                                     }});
          fman.add(backBtn);
          
     }
     //------------------------------
         public void StudentPanel()
         { 
               stdPanel = new JPanel(new GridLayout(100, 3));
               mainpanel.setBackground(Color.LIGHT_GRAY);                        
               mainpanel.setBounds(10, 200, 800, 700);
               mainpanel.add(stdPanel);
               String columns[] = {"اسم الطالب","المبلغ الكلي للطالب","المبلغ المتبقي"};   
               String ShopInfo[][]= new String[c.names.length][3];
               c.shopInfoArr(ShopInfo);
               DefaultTableModel model = new DefaultTableModel();      
               model.setDataVector(ShopInfo, columns);    
               JTable table;   
               table = new JTable(model);
               JScrollPane tableScroller= new JScrollPane(table);       
               tableScroller.setBounds(60, 40, 370, 140); 
               stdPanel.add(tableScroller);
          }
        
         //-------------------------
         public void OptionMinu()
         {   Lname = new JLabel("اسم الطالب");
             LTC = new JLabel("المبلغ الكلي");
             JLabel l0 = new JLabel("___________________________");
             JLabel l1 = new JLabel("___________________________");
             JLabel l2 = new JLabel("___________________________");
             newTC = new JTextField(15);
             oldName = new JLabel("الاسم القديم");
             newname = new JLabel("الاسم الجديد");
             optionPan = new JPanel();
             optionPan.setBounds(1000,200,190,500);
             AddStd = new JButton("إضافة طالب جديد");
             UpDateStdName = new JButton("تعديل اسم طالب");
             UpDateStdTC = new  JButton("تعديل السعر الكلي");
             bayOperation = new JButton("إضافة عملية شراء");
             AcceptAddStd = new JButton("إضافة");
             UpName = new JTextField(15);
             newName = new JTextField(15);
             AcceptUpName = new JButton("تعديل الاسم");
             UpTC = new JTextField(15);
             AcceptUpTC = new JButton("تعديل السعر الكلي");
             AcceptOperation = new JButton("شراء");
             stdName = new JLabel("اسم الطالب");
             stdTC = new JLabel("السعر المضاف");
             CostL = new JLabel("كمية الشراء");
             CC = new JTextField(15);
             optionPan.add(UpDateStdName);
             optionPan.add(UpDateStdTC);
             optionPan.add(AddStd);
             optionPan.add(bayOperation);
             optionPan.add(l0);
             optionPan.add(oldName);
             optionPan.add(stdName);
             optionPan.add(Lname);
             optionPan.add(UpName);
             optionPan.add(newname);
             optionPan.add(newName);
             optionPan.add(stdTC);
             optionPan.add(newTC);
             optionPan.add(AcceptUpName);
             optionPan.add(l1);
             optionPan.add(LTC);
             optionPan.add(UpTC);
             optionPan.add(AcceptAddStd);
             optionPan.add(AcceptUpTC);
             optionPan.add(l2);
             optionPan.add(CostL);
             optionPan.add(CC);
             optionPan.add(AcceptOperation);
             
             Lname.setVisible(false);
             UpName.setVisible(false);
             newName.setVisible(false);
             AcceptUpName.setVisible(false);
             LTC.setVisible(false);
             UpTC.setVisible(false);
             AcceptUpTC.setVisible(false);
             AcceptOperation.setVisible(false);
             oldName.setVisible(false);
             newname.setVisible(false);
             newTC.setVisible(false);
             stdName.setVisible(false);
             stdTC.setVisible(false);
             CostL.setVisible(false);
             CC.setVisible(false); 
             AcceptAddStd.setVisible(false);
             fman.add(optionPan);
            //-------------------------
            AddStd.addActionListener(new ActionListener() {        
            @Override
            public void actionPerformed(ActionEvent e) {
              System.out.println("ALi ");
               AcceptAddStd.setVisible(true);
               UpName.setVisible(true);
                l1.setVisible(true);
                UpTC.setVisible(true);
                LTC.setVisible(true);
                Lname.setVisible(true);
                newName.setVisible(false);
                AcceptUpName.setVisible(false);
                oldName.setVisible(false);
                newname.setVisible(false);
                AcceptUpTC.setVisible(false);
                AcceptOperation.setVisible(false);
                newTC.setVisible(false);
                stdName.setVisible(false);
                stdTC.setVisible(false);
                CostL.setVisible(false);
                CC.setVisible(false); 
               }});
                //------------------------------------
            UpDateStdName.addActionListener(new ActionListener() {        
            @Override
            public void actionPerformed(ActionEvent e) {
            UpName.setVisible(true);
            newName.setVisible(true);
            AcceptUpName.setVisible(true);
            oldName.setVisible(true);
            newname.setVisible(true);
            UpTC.setVisible(false);
            AcceptUpTC.setVisible(false);
            AcceptOperation.setVisible(false);
            newTC.setVisible(false);
            stdName.setVisible(false);
            stdTC.setVisible(false);
            CostL.setVisible(false);
            CC.setVisible(false); 
            AcceptAddStd.setVisible(false);
            LTC.setVisible(false);
            Lname.setVisible(false);
            }});
                //-------------------------
                
            UpDateStdTC.addActionListener(new ActionListener() {        
            @Override
            public void actionPerformed(ActionEvent e) {
            UpName.setVisible(true);
            newTC.setVisible(true);
            AcceptUpTC.setVisible(true);
            stdName.setVisible(true);
            stdTC.setVisible(true);
            newName.setVisible(false);
            AcceptUpName.setVisible(false);
            UpTC.setVisible(false);
            AcceptOperation.setVisible(false);
            oldName.setVisible(false);
            newname.setVisible(false);
            CostL.setVisible(false);
            CC.setVisible(false); 
            AcceptAddStd.setVisible(false);
            LTC.setVisible(false);
            Lname.setVisible(false);
            }});
          //-------------------------
            bayOperation.addActionListener(new ActionListener() {        
            @Override
            public void actionPerformed(ActionEvent e) {
           
            UpName.setVisible(true);
            stdName.setVisible(true);
            CostL.setVisible(true);
            CC.setVisible(true); 
            AcceptOperation.setVisible(true);
            l1.setVisible(false);
            newName.setVisible(false);
            AcceptUpName.setVisible(false);
            UpTC.setVisible(false);
            AcceptUpTC.setVisible(false);
            oldName.setVisible(false);
            newname.setVisible(false);
            newTC.setVisible(false);
            stdTC.setVisible(false);
            AcceptAddStd.setVisible(false);
            LTC.setVisible(false);
            Lname.setVisible(false);
            }});
            //----------------------------------
            //Accept add student
            AcceptAddStd.addActionListener(new ActionListener() {        
            @Override
            public void actionPerformed(ActionEvent e) {
            System.out.println("name added");
            std = new Student(UpName.getText(), Integer.parseInt(UpTC.getText()), Integer.parseInt(UpTC.getText()), 0);
            try {
                shop = new CreateNewShop(loginShopName.getText(),1);
                shop.ADDStudent(std);
                JOptionPane.showMessageDialog(fman, "تمت الاضافة");
                 } catch (IOException ex) {
                    Logger.getLogger(shopmanagerInterface.class.getName()).log(Level.SEVERE, null, ex);
                }}}); 
            //----------------------------------
            //AcceptUpName
            AcceptUpName.addActionListener(new ActionListener() {        
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("AcceptUpName");
                 m = new ManagePurchases();
                try {
                    if(m.TestName(UpName.getText(), c) != -1){
                         m.UpDateName(c, UpName.getText(), newName.getText());
                         JOptionPane.showMessageDialog(fman, " تم تعديل الاسم بنجاح");}
                    else
                    {
                        JOptionPane.showMessageDialog(fman,  "الاسم غير موجود يرجى إدخال اسم صحيح");
                    }} catch (IOException ex) {
                    JOptionPane.showMessageDialog(fman, " يرجى اعادة المحاولة");
                    Logger.getLogger(shopmanagerInterface.class.getName()).log(Level.SEVERE, null, ex);
                    }}}); 
            //----------------------------------------
            //AcceptUpTC
            AcceptUpTC.addActionListener(new ActionListener() {        
            @Override
            public void actionPerformed(ActionEvent e) {
                 m = new ManagePurchases();
                try {
                     if(m.TestName(UpName.getText(), c) != -1){
                      m.UpDateTotalCost(c, UpName.getText(), Integer.parseInt(newTC.getText()));
                      JOptionPane.showMessageDialog(fman,  "تم تعديل المبلغ الكلي");}
                    else
                     {
                        JOptionPane.showMessageDialog(fman,  "الاسم غير موجود يرجى إدخال اسم صحيح");
                     }
                    } catch (IOException ex) {
                    JOptionPane.showMessageDialog(fman, " يرجى اعادة المحاولة");
                    Logger.getLogger(shopmanagerInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("AcceptUpTC");
              }}); 
            //AcceptOperation
           AcceptOperation.addActionListener(new ActionListener() {        
            @Override
            public void actionPerformed(ActionEvent e) {
                 
                try {
                  //  m = new ManagePurchases(c,UpName.getText(), Integer.parseInt( CC.getText()));
                    m = new ManagePurchases();
                    if(m.TestName(UpName.getText(), c) != -1 && c.CurrentC[m.TestName(UpName.getText(), c)]>0 )
                    {
                         m = new ManagePurchases(c,UpName.getText(), Integer.parseInt( CC.getText()));
                        JOptionPane.showMessageDialog(fman,  "تمت العملية بنجاح");
                    
                    }
                        else if (m.TestName(UpName.getText(), c) == -1)
                                 JOptionPane.showMessageDialog(fman,  "الاسم غير موجود يرجى إدخال اسم صحيح");
                    else if (c.CurrentC[m.TestName(UpName.getText(), c)]<=0)
                            {
                                 JOptionPane.showMessageDialog(fman,  "لايوجد رصيد لدى الطالب الحالي");
                            }
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(fman, " يرجى اعادة المحاولة");
                    Logger.getLogger(shopmanagerInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                System.out.println("AcceptOperation");
            }}); 
          }
         
          public void EnterShopAction()
        { 
        
        loginShopBtn.addActionListener(new ActionListener() {        
            @Override
            public void actionPerformed(ActionEvent e) {
                loginShopBtn.setVisible(false);
                loginShopName.setVisible(false);
                System.out.println("Enter");
                String text2 = loginShopName.getText();
                try {
                    c = new Controller(text2);
                    c.getFileContnet();
                    c.proccesFile();
                    c.getFileInfo();
                    StudentPanel();
                    OptionMinu();
                } catch (IOException ex) {
                   
                    System.out.println("File not Found");
                      JOptionPane.showMessageDialog(fman, "اسم المحل غير موجود الرجاء ادراج اسم صحيح");
                      loginShopBtn.setVisible(true);
                      loginShopName.setVisible(true);
                }
                                                     }});
    }
    //------------------------------
    }
