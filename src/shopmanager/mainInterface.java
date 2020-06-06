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
import java.awt.LayoutManager;
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
public class mainInterface extends JFrame {
    JPanel p;
    JPanel p2;
    Font newFont = new Font("Serif", Font.BOLD, 40);    
    Font createBtnFont = new Font(Font.DIALOG, Font.BOLD,25);    
    Font shopsList = new Font("Optima", Font.LAYOUT_NO_LIMIT_CONTEXT,80);
    JButton creatFileBtn ;          
    JButton ProccsShopbtn;
    JButton UpdateNameBtn ;          
    JButton UpdateTotalCBtn;
    JFrame frame;
    
    public mainInterface()
    {
        frame = new JFrame("كشاف الإخاء");               
        frame.setSize(1200, 700);                                
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        frame.setLayout(new FlowLayout());       
        frame.setLayout(null);
        
        //-------------------------
//        p = new JPanel();
//        p.setBackground(Color.black);                        
//        p.setBounds(0, 0, 1200, 570);
        //-------------------------
//        p2 = new JPanel();
//        p2.setBackground(Color.black);                        
//        p2.setBounds(0, 600, 1200, 570);
        //-------------------------
        JLabel mainText = new JLabel("كشاف الإخاء");
        mainText.setFont(newFont);
        
        UpPanel();
        ShowShops();
        DownPanel();
        ProccesShopButton();
        CreateFileButton();
      //  CreatShopAction();
       // EnterShopAction();
        frame.add(p2);
        frame.add(p);
        frame.add(mainText);
        frame.setVisible(true);                                 
    } 
    public void UpPanel()
    { 
        p = new JPanel();
        
        p.setBackground(new Color(0, 51, 153));                        
        p.setBounds(0, 0, 1200, 570);
        JLabel l = new JLabel("كشاف الإخاء");
         l.setFont(shopsList);
         l.setForeground(new Color(153, 187, 255));    
         
          p.add(l);
          
        frame.add(p);
    }
    public void DownPanel()
    {
        p2 = new JPanel();
        p2.setBackground(new Color(0, 51, 153));                        
        p2.setBounds(0, 600, 1200, 570);
        frame.add(p2);
        JLabel versonL = new JLabel("version:1.0.1");
        
        versonL.setForeground(Color.white);
        
        p2.add(versonL);
       
    }
    public void ShowShops()
    {   
        ImageIcon iconLogo = new ImageIcon("C:\\Users\\حسين\\Documents\\NetBeansProjects\\ShopManager\\src\\images\\mainimage.jpg");
         JLabel mainL = new JLabel(iconLogo);
         JPanel shopsP = new JPanel();
         shopsP.setBackground(Color.white);
         shopsP.add(mainL);
         shopsP.setBounds(0, 100, 1200, 500);
         frame.add(shopsP);
        
    }
    
    public void CreateFileButton()
    { 
        creatFileBtn = new JButton("إنشاء محل جديد");
        creatFileBtn.setLocation(0, 0);
        creatFileBtn.setFont(createBtnFont);
        creatFileBtn.setBackground(new Color(153, 187, 255));
         creatFileBtn.addActionListener(new ActionListener() {        
            @Override
            public void actionPerformed(ActionEvent e) {
                    frame.setVisible(false);
                    newShopInterface n = new newShopInterface(1);
                                                     }});
        p2.add(creatFileBtn);
    }
    public void ProccesShopButton()
    {
        ProccsShopbtn = new JButton("فتح محل للتعديل ");
        
        ProccsShopbtn.setLocation(0, 0);
        ProccsShopbtn.setFont(createBtnFont);
        ProccsShopbtn.setBackground(new Color(153, 187, 255));
        ProccsShopbtn.addActionListener(new ActionListener() {        
            @Override
            public void actionPerformed(ActionEvent e) {
                      frame.setVisible(false);
                      shopmanagerInterface m = new shopmanagerInterface();
                      
            }

           
        });
            p2.add(ProccsShopbtn);
    
    }
//    public void CreatShopAction()
//    { createShopAccept.addActionListener(new ActionListener() {        
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                newShopInterface n = new newShopInterface();
//                frame.setVisible(false);
//                    }});}
      
    

}
