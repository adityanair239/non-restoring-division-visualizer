/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coaproj;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;
import java.awt.*;

public class CenterPanel extends JPanel
{
    JPanel j = new JPanel();
  
    public CenterPanel() throws InterruptedException
    {      
          this.add(new OperationPane(),BorderLayout.EAST);
          this.add(new CalcPanel(),BorderLayout.CENTER);  
          this.add(new FlowChart(), BorderLayout.WEST);
       
     //    this.add(new FlowChart(), BorderLayout.CENTER);
         this.add(new BorderImg_Hor(),BorderLayout.SOUTH);
         this.add(new BorderImg_Vert(),BorderLayout.EAST);
         this.add(new BorderImg_Vert(),BorderLayout.WEST);
         //  d = this.getSize();
        
    
    }
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.red);
        this.setBackground(Color.BLACK);
    }
}
































