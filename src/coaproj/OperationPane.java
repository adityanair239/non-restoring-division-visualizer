/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coaproj;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.Timer;

/**
 *
 * @author there
 */
public class OperationPane extends javax.swing.JPanel implements ActionListener{

    /**
     * Creates new form OperationPane
     */
   // DrawPane d = new DrawPane();
       static volatile int a=0;
    static int k =0;
    static volatile boolean z =false;
    static int[] arr1 = new int[50];
    static int[] arr2 = new int[50];
    static int[] arr3 = new int[50];
    static int[] arr4 = new int[50];
    static String s1 = "";
    static String s2 = "";
    static String s3 = "";
     Font f  = new Font("TimesRoman", Font.BOLD, 14);
    
    public OperationPane() {
        initComponents();
        this.setBackground(Color.DARK_GRAY);
        this.setSize(308,308);
      // jPanel1.add(d);
        
    }
    
  Timer t = new Timer(1,this);
    //static String a; 
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        g.setColor(Color.white);
        g2.setStroke(new BasicStroke(5));
        jLabel20.setText(CoaProj.l);
        jLabel26.setText(CoaProj.m);
      //  g.drawLine(0,0,10,10);
      //  g.drawLine(0,0,308/2,308/2);
      if(CoaProj.q==1)
      {     //Graphics2D g2 = (Graphics2D)g;
            g2.setStroke(new BasicStroke(3));
               jLabel25.setVisible(false);
               jLabel23.setVisible(false);
               jLabel19.setVisible(false);
               jLabel17.setVisible(false);
               jLabel21.setVisible(false);
               jLabel22.setVisible(false);
               jSeparator6.setVisible(false);
               jLabel18.setVisible(false);
            g.setFont(new Font("TimesRoman", Font.BOLD, 18));
            g.drawString("QUOTIENT = "+CoaProj.dq,100,490); //a
            g.drawString("REMAINDER = "+CoaProj.da,100,580);
            
      }
      if(CoaProj.left==1)
      {  square(g,CoaProj.no_bits);
         arrow(g,CoaProj.no_bits);

            // g.drawSring()
      //   g.drawString("hfhgfh",10,10);
       //  g.drawString("hfhgfh",120,120);
      }
      if(CoaProj.addf==1)
      {
          jLabel23.setText("M =");
          jLabel17.setText("A+M =");
          if(CoaProj.subf==1)
          {
              jLabel23.setText("-M =");
              jLabel17.setText("A-M =");
          }
          sum(g,CoaProj.no_bits);
      }
      else
      {
               jLabel25.setVisible(false);
               jLabel23.setVisible(false);
               jLabel19.setVisible(false);
               jLabel17.setVisible(false);
                jLabel21.setVisible(false);
               jLabel22.setVisible(false);
               jSeparator6.setVisible(false);
               jLabel18.setVisible(false);

      }

        if(a==1)
        {
         //g.drawLine(0,0,100,100);
        // g.drawString("hfhgfh",12,12);
        }
        t.start();
        repaint();
    }
    public void square(Graphics g,int x)
    {
        int i;
        x=x-1;
        int p=250/2-25;
        int q=308/2-80+400;
        Graphics2D g2 = (Graphics2D)g;
        g2.setStroke(new BasicStroke(3));
        if(x<6)
        {
        for(i=1;i<=x;i++)
        {
           
           {
                p=250/2-(25*i);
                g.drawLine(p,q,p+50,q);
                g.drawLine(p,q,p,q+40);
                g.drawLine(p+50,q+40,p+50,q);
                g.drawLine(p,q+40,p+50,q+40);
            }
       
            {
                p=560/2-(25*i);
            
                g.drawLine(p,q,p+50,q);
                g.drawLine(p,q,p,q+40);
                g.drawLine(p+50,q+40,p+50,q);
                g.drawLine(p,q+40,p+50,q+40);
            }
            
        
            
         //   g.drawLine(308/2+15,308/2-15,308/2+15,308/2+15);       
        //    g.drawLine(308/2-15,308/2+15,308/2+15,308/2+15);
        }
       // g.drawLine(250/2-(25*0)+15, q+80, 0, q+40);
       // 560/2+(25*x)+10
        
        
            for(i=CoaProj.no_bits-1;i>=0;i--)
            {
           //     Graphics2D g2 = (Graphics2D)g;
                g2.setStroke(new BasicStroke(3));
                g2.setFont(f);          
                g.drawString(""+arr1[i],560/2-i*25+5,q+10+10+5);
                g.drawString(""+arr3[i],250/2-(25*i)+5,q+10+10+5);
                g.drawString(""+arr2[i],560/2-i*25+5,q+10+10+5+100);
                g.drawString(""+arr4[i],250/2-(25*i)+5,q+10+10+5+100);
                
            
            }
            g.drawString(" A",250/2-25 ,q-40);
            g.drawString(" Q",250/2+100+30 ,q-40);

        }
        else
        {
            for(i=1;i<=x;i++)
        {
           
           {
                p=250/2-(20*i);
                g.drawLine(p,q,p+40,q);
                g.drawLine(p,q,p,q+40);
                g.drawLine(p+40,q+40,p+40,q);
                g.drawLine(p,q+40,p+40,q+40);
            }
       
            {
                p=560/2-(20*i);
                
                g.drawLine(p,q,p+40,q);
                g.drawLine(p,q,p,q+40);
                g.drawLine(p+40,q+40,p+40,q);
                g.drawLine(p,q+40,p+40,q+40);
            }
         //   g.drawLine(308/2+15,308/2-15,308/2+15,308/2+15);       
        //    g.drawLine(308/2-15,308/2+15,308/2+15,308/2+15);
        }
            for(i=CoaProj.no_bits-1;i>=0;i--)
            {
           //     Graphics2D g2 = (Graphics2D)g;
                g2.setStroke(new BasicStroke(3));
                g2.setFont(f);
  
                g.drawString(""+arr1[i],560/2-i*20+5,q+10+10+5);
                g.drawString(""+arr3[i],250/2-(20*i)+5,q+10+10+5);
                g.drawString(""+arr2[i],560/2-i*20+5,q+10+10+5+100);
                g.drawString(""+arr4[i],250/2-(20*i)+5,q+10+10+5+100);
            
            }
             g.drawString(" A",250/2-25 ,q-40);
             g.drawString(" Q",250/2+100+30 ,q-40);
     
  
        }
    }
    public void arrow(Graphics g,int x)
    {
        int i;
        x=x-1;
        int p=250/2-20;
        int q=308/2+20+400;
        Graphics2D g2 = (Graphics2D)g;
        g2.setStroke(new BasicStroke(3));
        if(x<6)
        {
        for(i=1;i<=x;i++)
        {
           
           {
                p=250/2-(25*i);
                g.drawLine(p,q,p+50,q);
                g.drawLine(p,q,p,q+40);
                g.drawLine(p+50,q+40,p+50,q);
                g.drawLine(p,q+40,p+50,q+40);
            }
       
            {
                p=560/2-(25*i);
            
                g.drawLine(p,q,p+50,q);
                g.drawLine(p,q,p,q+40);
                g.drawLine(p+50,q+40,p+50,q);
                g.drawLine(p,q+40,p+50,q+40);
            }
         //   g.drawLine(308/2+15,308/2-15,308/2+15,308/2+15);       
        //    g.drawLine(308/2-15,308/2+15,308/2+15,308/2+15);
        }
        g.drawLine(250/2+(25*1)-10, q-10+5, 560/2-(25*x), q-50-5);
       // g.drawLine(250/2+(25*1)-10,q-10,250/2+(25*1)+5,q-14-10);
       // g.drawLine(250/2+(25*1)-10,q-10,250/2+(25*1)-10+12+10,q-1-10 );
        for(i=1;i<=x;i++)
        {
           {
                p=250/2-(20*i)+30-(5*(i-1));
                g.drawLine(p-20,q-10,p,q-20-30);
               g.drawLine(p-20,q-10,p-20+12,q-4-10 );
                g.drawLine(p-20,q-10,p-14-6,q-14-10);
               // g.drawLine(p,q,p,q+40);
               // g.drawLine(p+40,q+40,p+40,q);
              //  g.drawLine(p,q+40,p+40,q+40);
            }
        }
        for(i=1;i<=x;i++)
        {
           {
                 p=560/2-(20*i)+30-((i-1)*5);
                g.drawLine(p-20,q-10,p,q-20-30);
                g.drawLine(p-20,q-10,p-20+12,q-4-10);
                g.drawLine(p-20,q-10,p-14-6,q-14-10);
               // g.drawLine(p,q,p,q+40);
               // g.drawLine(p+40,q+40,p+40,q);
              //  g.drawLine(p,q+40,p+40,q+40);
            }
        }
      }
      else
      {
          
           for(i=1;i<=x;i++)
        {
           
           {
                p=250/2-(20*i);
                g.drawLine(p,q,p+40,q);
                g.drawLine(p,q,p,q+40);
                g.drawLine(p+40,q+40,p+40,q);
                g.drawLine(p,q+40,p+40,q+40);
            }
       
            {
                p=560/2-(20*i);
            
                g.drawLine(p,q,p+40,q);
                g.drawLine(p,q,p,q+40);
                g.drawLine(p+40,q+40,p+40,q);
                g.drawLine(p,q+40,p+40,q+40);
            }
          
        } 

        for(i=1;i<=x;i++)
        {
           {
                p=250/2-(20*i)+30-(1*(i-1));
                g.drawLine(p-20,q-10,p,q-20-30);
               g.drawLine(p-20,q-10,p-20+12,q-4-10 );
                g.drawLine(p-20,q-10,p-14-6,q-14-10);
               // g.drawLine(p,q,p,q+40);
               // g.drawLine(p+40,q+40,p+40,q);
              //  g.drawLine(p,q+40,p+40,q+40);
            }
        }
        for(i=1;i<=x;i++)
        {
           {
                p=560/2-(20*i)+30-((i-1)*1);
                g.drawLine(p-20,q-10,p,q-20-30);
                g.drawLine(p-20,q-10,p-20+12,q-4-10);
                g.drawLine(p-20,q-10,p-14-6,q-14-10);
               // g.drawLine(p,q,p,q+40);
               // g.drawLine(p+40,q+40,p+40,q);
              //  g.drawLine(p,q+40,p+40,q+40);
            }
        }
         g.drawLine(250/2+(20*1)-10, q-10+5, 560/2-(20*x), q-50-5);
      
      
      
      
      
      }

    }
    
 public void sum(Graphics g,int x)    
 {
     int i=0;
     int p=250/2-(20*i)+30-(1*(i-1));
     int q=308/2+20+600;
      Graphics2D g2 = (Graphics2D)g;
                g2.setStroke(new BasicStroke(3));
                g2.setFont(f);

      g.drawString("A   =  ",560/2-260,q-50); //a
      g.drawString("M   =  ",560/2-260,q-20); //a
      g.drawLine(560/2+30,q+5,250/2-(20*x)+30-(1*(x-1)),q+5);
      g.drawString("A  + M  =  ",560/2-260,q+35); //a
      
      for(i=0;i<x;i++)
      {
     
              s1=arr1[i]+s1;
     //            System.out.print(s1);
              //  g.drawString("M   =  ",560/2-i*20-60-60,q-20); //a
                //g.drawString(""+arr3[i],560/2-i*20-60,q-20);
                s2=arr3[i]+s2;
                s3=arr2[i]+s3;
            //   g.drawString(""+arr4[i],250/2-(20*i)+5,q+10+10+5+100        

     }
               if(CoaProj.q!=1)
               {jLabel21.setText(s1);
               jLabel22.setText(s3);
               jLabel18.setText(s2);
               s1="";
               s2="";
               s3="";
            //   System.out.print(s1);
               
               jLabel25.setVisible(true);
               jLabel23.setVisible(true);
               jLabel19.setVisible(true);
               jLabel17.setVisible(true);
               jLabel21.setVisible(true);
               jLabel22.setVisible(true);
               jSeparator6.setVisible(true);
               jLabel18.setVisible(true);
               }
 }

    
    
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/3.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" A = ");
        jLabel1.setToolTipText("");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Q = ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 90, 60));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 310, -1));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 10, 300));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 122, 310, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 178, 310, -1));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 310, 10));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, -1, 300));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 10));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 310, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("A+M =");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 80, 34));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("A =");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 210, 34));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("+");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 64, 34));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("A =");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 210, 34));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("A =");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 210, 34));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("M =");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 64, 34));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 170, 10));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("A =");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 65, 64, 34));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Qo = 0");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 130, 34));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("A =");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 290, 34));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/black-wallpaper-10.jpg"))); // NOI18N
        jLabel24.setText("jLabel24");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 290));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 10));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 310, 310));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("M = ");
        jLabel3.setToolTipText("");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 80, 60));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("STEPS = ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 80, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TOTAL");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 70, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("STEPS");
        jLabel6.setToolTipText("");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 80, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("LEFT =");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 80, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("PROCESS =");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 90, 60));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("jLabel9");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 190, 60));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("jLabel12");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 230, 60));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("jLabel13");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 230, 60));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("jLabel14");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 230, 60));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("jLabel15");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 230, 60));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("jLabel16");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 230, 60));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/black-wallpaper-10.jpg"))); // NOI18N
        jLabel11.setText("PROCESS = ");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 310, 700));
    }// </editor-fold>//GEN-END:initComponents
 @Override
    public void actionPerformed(ActionEvent e) {
       // a=1;
        //z=false;
        a=a+1;  
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    public static volatile javax.swing.JLabel jLabel12;
    public static volatile javax.swing.JLabel jLabel13;
    public static volatile javax.swing.JLabel jLabel14;
    public static volatile javax.swing.JLabel jLabel15;
    public static volatile javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static volatile javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}

