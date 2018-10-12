/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home_package;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Guest
 */
public class timer {
  int hrs;
  int mint;
  int secd;
    timer(final JComboBox hour,final JComboBox min,final JComboBox sec)
   {hrs = hour.getSelectedIndex() ;
   mint = min.getSelectedIndex() ;
   secd = sec.getSelectedIndex() ;
   }
    public void timer(final JLabel hour,final JLabel min,final JLabel sec)
    {new Thread()
    {         public void run()
    {
              while(true)
              {hour.setText(""+hrs);
                  min.setText(""+ mint);
              
                  while(secd!=0)
              {   try {
                  Thread.sleep(1000);
                  } catch (InterruptedException ex) {
                                                       }
                 --secd;
                 sec.setText(""  +  secd);
              }
              secd=60;
              if(mint!=0)
              {--mint;
              min.setText(""+ mint);}
              else
                 if(mint==0 && hrs!=0 )
              {mint=59;
              --hrs;
              min.setText(""+ mint);
              hour.setText(""+hrs);}
              else
              if(hrs==0 && mint==0)
              {JOptionPane.showMessageDialog(null, "Time over");
              break;
              }
              
              }
    }
             
    }.start();
    
    
    
    }
    
}
