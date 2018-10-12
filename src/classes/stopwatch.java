/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home_package;

import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author Guest
 */
public class stopwatch {
    int start_stop ;
  stopwatch()
  {
  }
  
    public void startStopwatch(final JLabel start,final JLabel stop)
   {
   new Thread()
        {
            public void run()
        {
          
       int hr=0, min=00, sec=00, ms=01;
       while(stop.isVisible()==false)
        {try{
        Thread.sleep(1);
        ++ms;
        if(ms%700==0)
        {++sec;ms=0;}
        if(sec%60==0 && sec!=0)
        {   ++min; sec=0;}
        if(min%60==0 && min!= 0)
        {++hr;min=0;}
        start.setText((hr%60)+":"+ (min) + ":" + (sec) + ":" + (ms));
        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null,e);
        }
        }
           
        }
        }.start();
   
}
    public void stopStopwatch()
    {
    
    
    }
}
