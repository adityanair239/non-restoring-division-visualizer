package coaproj;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class CoaProj
{
    public volatile static int left = 0,addf=0,subf = 0;
    public volatile static boolean flag = true;
    static int tick = 0;
    static int z=0;
    static int da=0,dq=0;
    static int vv=0;
    static int no_bits = 0;
    static int dec_Q,dec_M,dec_A;
    static volatile int q=0;
    String st_q="",st_m="",st_a="";
    static volatile String l="",m="",n="";
    static String process="";
    ArrayList<Integer> Q = new ArrayList<Integer>();
    ArrayList<Integer> M = new ArrayList<Integer>();
    ArrayList<Integer> A = new ArrayList<Integer>();
    ArrayList<Integer> minM = new ArrayList<Integer>();
    ArrayList<Integer> temp = new ArrayList<Integer>();
    static public JFrame f ;
    static public JPanel card = new JPanel(new CardLayout());
    public CoaProj() // throws InterruptedException
    {   Dimension d =new Dimension(0,60);
        no_bits = 0;
        no_bits = 0;
        //JPanel card = new JPanel(new CardLayout());
        st_q="";st_m="";st_a="";
        l="";m="";n="";
        process="";
        dec_Q=0;dec_M=0;dec_A=0;
        f = new JFrame("Non-Restoring Division ");
       // JPanel card = new JPanel(new CardLayout());
       //JPanel card = new JPanel(new CardLayout());
        card.add(new NewJPanel2());
        left = 0;addf=0;subf = 0;
        flag = true;
          f.add(card,BorderLayout.CENTER);
          f.add(new BorderImg_Hor(),BorderLayout.NORTH);
          f.add(new BorderImg_Hor(),BorderLayout.SOUTH);
          f.add(new BorderImg_Vert(),BorderLayout.EAST);
          f.add(new BorderImg_Vert(),BorderLayout.WEST);
          f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
          f.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    public static void main(String[] args) throws InterruptedException
    {
        CoaProj c = new CoaProj();
        int i;
        c.f.setVisible(true);
        while(flag)
        {
        }
        
        //System.out.println(" "+dec_Q);
        c.BinaryConvert(dec_Q,'Q');
        c.BinaryConvert(dec_M,'M');
        c.initA();
        Dimension d1 = new Dimension(679,662+81+81+81+1000+100);
        StepPanel s = new StepPanel();
        
        s.jLabel1.setText("  No.");
        s.jLabel2.setText("A");
        s.jLabel3.setText("Q");
        s.jLabel5.setText("M");
        s.jLabel6.setText("I.V.");
        
        c.strupdate();
        StepPanel s1 = new StepPanel();
  
        s1.jLabel1.setText("-");
        s1.jLabel2.setText("   "+c.st_a);
        s1.jLabel3.setText("    "+c.st_q);
        s1.jLabel5.setText("    "+c.st_m);
        s1.jLabel6.setText("   "+c.process);
        c.upd(0);
       // Thread.sleep(000);
        for(i=0;i<no_bits;i++)  
        {  
           CalcPanel.jPanel2.setPreferredSize(d1);
           if(i==0)
           {   c.upd(i);
               CalcPanel.jPanel2.add(s);
               CalcPanel.jPanel2.revalidate();
               CalcPanel.jScrollPane1.revalidate();
              // Thread.sleep(2000);
               CalcPanel.jPanel2.add(s1);
               CalcPanel.jPanel2.revalidate();
               CalcPanel.jScrollPane1.revalidate();
              Thread.sleep(2000);
               
           }
           StepPane k = new StepPane();
           CalcPanel.jPanel2.add(k);
           c.ls();
           c.upd(i);
          // Thread.sleep(1000);
           
           c.strupdate();
           c.upd(i);
           c.proupd(k, 1);
          // StepPane.jLabel12.setText(process);
           Thread.sleep(2000);
           left=0;
          
           c.textupdate1(k, i+1);
           c.upd(i);
           c.msbCheck1();
           c.upd(i);
         
         //  Thread.sleep(2000);
           
           c.strupdate();
           c.upd(i);
           c.proupd(k, 2);
           addf=1;
           if(process=="A <- A - M")
           {    subf=1;
           }
         //  k.jLabel13.setText(process);
           Thread.sleep(2000);
           addf=0;
           subf=0;
           c.textupdate2(k);
           c.upd(i);
           c.msbCheck2();
           c.upd(i);
           c.strupdate();
           c.upd(i);
           c.proupd(k, 3);
           Thread.sleep(2000);
           l="";
           m="";
         
           c.textupdate3(k);
           c.upd(i);
           //CalcPanel.jPanel2.add(new StepPanel());
          // CalcPanel.jPanel2.add(new StepPane());
           
           
           
           
           CalcPanel.jPanel2.revalidate();
           CalcPanel.jScrollPane1.revalidate();
           Thread.sleep(2000);
           //this.revalidate();
           
        }
         OperationPane.jLabel12.setText(""+0);
         c.disp();
         //getchar();  
         c.last();
         if(vv==1)
         {
            StepPanel m = new StepPanel();
            c.strupdate();
            m.jLabel2.setText("   "+c.st_a);
            m.jLabel3.setText("    "+c.st_q);
            m.jLabel5.setText("    "+c.st_m);
            m.jLabel6.setText("   "+"A <- A + M ");
            m.jLabel1.setText("-");  
           // m.jLabel6.setText("A <- A + M ");
            CalcPanel.jPanel2.add(m);      
         }
         Thread.sleep(2000);
         c.bintodec();
         q=1;
         
        
       //  CardLayout cl = (CardLayout) (CoaProj.card.getLayout());
        // CoaProj.card.add(new EndPanel());
       //  cl.next(CoaProj.card);
         
    }

    public void BinaryConvert(int N,char C)
    {
        if(C=='Q')
        {
             while(N>0)
             {
                 Q.add(N%2);
                 N = N/2;
                 no_bits = no_bits + 1;
             }    
        }
        else if(C=='M')
        {
            while(N>0)
            {
                M.add(N%2);
                N = N/2;
            }
            if(no_bits>M.size())
            {
                while(no_bits-M.size()!=0)
                {
                    M.add(0);
                }
            }
        }
    }
    public void initA()
    {
        int i;
        for(i=0;i<no_bits;i++)
        {
            A.add(0);
            minM.add(0);
        }
    }
    public void disp()
    {
        int i;
        for(i=0;i<no_bits;i++)
        {
            System.out.println(Q.get(i));
        }
    }
    public void strupdate()
    {
        int i;
        st_q="";
        st_a="";
        st_m="";
        for(i=no_bits-1;i>=0;i--)
        {
            st_q =  st_q+" "+Q.get(i);
            st_a = st_a+" "+A.get(i);
            st_m = st_m+" "+M.get(i);
        }
    }
    void textupdate1(StepPane k,int i)
    {
           k.jLabel1.setText(""+i);
           k.jLabel2.setText(st_a);
           k.jLabel5.setText(st_q);
           k.jLabel9.setText(st_m);
           k.jLabel12.setText(process);
    }
    void proupd(StepPane k,int i)
    {
        if(i==1)
        {
            k.jLabel12.setText(process);
        }
        else if(i==2)
        {
             k.jLabel13.setText(process);
        }
        else if(i==3)
        {
             k.jLabel14.setText(process);
        }
    }
    
    
    
    void textupdate2(StepPane k)
    {
           k.jLabel3.setText(st_a);
           k.jLabel6.setText(st_q);
           k.jLabel10.setText(st_m);
           k.jLabel13.setText(process);
    }
    void textupdate3(StepPane k)
    {
           k.jLabel4.setText(st_a);
           k.jLabel7.setText(st_q);
           k.jLabel11.setText(st_m);
           k.jLabel14.setText(process);
    }
    void bitadd()
    {
        int i,carry=0;
        for(i=0;i<no_bits;i++)
        {
            OperationPane.arr1[i]=A.get(i);
            OperationPane.arr2[i]=M.get(i);
        }   
        for(i=0;i<no_bits;i++)        
        {
             addf = 1;  
            switch(carry+M.get(i)+A.get(i))
            {
                case 0 : A.set(i, 0);
                         carry=0;
                         break;
                case 1:  A.set(i, 1);
                         carry=0;
                         break;
                case 2:  A.set(i, 0);
                         carry=1;
                         break;
                case 3:  A.set(i, 1);
                         carry=1;
                         break;
            }
        }
        for(i=0;i<no_bits;i++)
        {
            OperationPane.arr3[i]=A.get(i);  
        }   
          
    }
    void twocomp()
    {
        
        int i,carry=1;
        for(i=0;i<no_bits;i++)
        {
            if(M.get(i)==0)
            {
                minM.set(i, 1);
            }
            else if(M.get(i)==1)
            {
                minM.set(i, 0);
            }
        }
        for(i=0;i<no_bits;i++)
        {   
            temp.add(i,0);
        }
        temp.set(0,1);
        carry=0;
        for(i=0;i<no_bits;i++)
        {
            switch(carry+minM.get(i)+temp.get(i))
            {
                case 0 : temp.set(i, 0);
                         carry=0;
                         break;
                case 1:  temp.set(i, 1);
                         carry=0;
                         break;
                case 2:  temp.set(i, 0);
                         carry=1;
                         break;
                case 3:  temp.set(i, 1);
                         carry=1;
                         break;
            }           
        }

        for(i=0;i<no_bits;i++)
        {
            OperationPane.arr1[i]=A.get(i);
            OperationPane.arr2[i]=temp.get(i);
            
        }  
        
       
        carry=1;
        for(i=0;i<no_bits;i++)
        {
            subf = 1;  
            switch(carry+minM.get(i)+A.get(i))
            {
                case 0 : A.set(i, 0);
                         carry=0;
                         break;
                case 1:  A.set(i, 1);
                         carry=0;
                         break;
                case 2:  A.set(i, 0);
                         carry=1;
                         break;
                case 3:  A.set(i, 1);
                         carry=1;
                         break;
            }
        }
        
        for(i=0;i<no_bits;i++)
        {
            OperationPane.arr3[i]=A.get(i);  
        }
        
    }
    void msbCheck1()
    {  
        if(A.get(no_bits-1)==1)
        {
            bitadd();
            process="A <- A + M";
           // addf=0;
        }
        else if(A.get(no_bits-1)==0)
        {
            twocomp();
            process="A <- A - M";
        }
    }
    void msbCheck2()
    {
        if(A.get(no_bits-1)==1)
        {
            Q.set(0, 0);
            process="Qo <- 0";
            l = "MSB OF A IS 1";
            m = "Qo <- 0";
        }
        else
        {
            Q.set(0, 1);
            process="Qo <- 1";
            l = "MSB OF A IS O";
            m = "Qo <- 1";
        }
    }
    void ls()
    {
        left = 1;
        int i,tmp;
        tmp = Q.get(no_bits-1);
        for(i=no_bits-1;i>=0;i--)
        {
           OperationPane.arr1[i]=Q.get(i);
           OperationPane.arr3[i]=A.get(i);
        }
        for(i=no_bits-1;i>0;i--)
        {      
           Q.set(i,Q.get(i-1));
        } 
        for(i=no_bits-1;i>0;i--)
        {
            A.set(i,A.get(i-1));
        }
        A.set(0, tmp);
        Q.set(0,0);
        process="LEFT SHIFT";
          for(i=no_bits-1;i>=0;i--)
        {
           OperationPane.arr2[i]=Q.get(i);
           OperationPane.arr4[i]=A.get(i);
        }
        
        
     }
    void bitodec(ArrayList<Integer> x)
    {
	int d=0,m=1;
	Collections.reverse(x);
	for(int i=0;i<x.size();i++)
	{
            d+=A.get(i)*m;
            m=2*m;
	}
        System.out.println(d);
	}
    void bintodec()
    {
        int i,ma=1,mq=1;
        for(i=0;i<no_bits;i++)
        {
            da=da+A.get(i)*ma;
            ma=2*ma;
        }
        for(i=0;i<no_bits;i++)
        {
            dq=dq+Q.get(i)*mq;
            mq=2*mq;
        }
        System.out.println(""+dq);
        System.out.println(""+da);
    }
    
    
    
    
    
    
    
    void upd(int i)
    {
        OperationPane.jLabel13.setText(st_a);
        OperationPane.jLabel14.setText(st_q);
        OperationPane.jLabel15.setText(st_m);
        OperationPane.jLabel16.setText(""+no_bits);
        OperationPane.jLabel12.setText(""+(no_bits-i));
        OperationPane.jLabel9.setText(process);
        
    }
    void summ()
    {    int i,carry=0;
         for(i=0;i<no_bits;i++)
         {
            if(i==0)
            {
                temp.set(i,1);
            }
            else
            {
                temp.set(i,0);
            }
         }

         for(i=0;i<no_bits;i++)        
        {  
            switch(carry+minM.get(i)+temp.get(i))
            {
                case 0 : 
                         //OperationPane.arr2[i]=0;
                         temp.set(i,0);
                         carry=0;
                         break;
                case 1:  
                         //OperationPane.arr2[i]=1;
                         temp.set(i,1);
                         carry=0;
                         break;
                case 2:  
                         //OperationPane.arr2[i]=0;
                         temp.set(i,0);
                         carry=1;
                         break;
                case 3:  
                         //OperationPane.arr2[i]=1;
                         temp.set(i,1);
                         carry=1;
                         break;
            }
        } 
    }
    void last()
    {
        if(A.get(no_bits-1)==1)
        {
            bitadd();
            vv=1;

        }
    }
            
    
    
    
    
}



























































































































































































































































































