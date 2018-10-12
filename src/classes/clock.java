/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home_package;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Guest
 */
public class clock {
    public void time(final JLabel clock_D,final JLabel clock_w)
    { new Thread()
        {
            public void run()
        { 
          
           try
        {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) 
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/abd","root","root");
        Statement stmt = (Statement)con.createStatement();
Statement stmt1 = (Statement)con.createStatement();
        String clock = "Select curtime();";
  String clock1 = "Select left(curtime(),5) ;";
       while(true){ 
            
          
          ResultSet rs = stmt.executeQuery(clock);
      ResultSet rs2 = stmt1.executeQuery(clock1);
      
      while(rs.next())
        {String val = rs.getString("curtime()");
     clock_D.setText(val);
  }
      while(rs2.next())
        {String val = rs2.getString("left(curtime(),5)");
     clock_w.setText(val);
  }
      //Finaly I done it.....
       }
    }
           catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
           
        }
        }.start();
    }
    
    
    public void date( final JLabel dayDate)
    { new Thread()
        {
            public void run()
        { 
           try
        {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) 
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/abd","root","root");
        Statement stmt = (Statement)con.createStatement();
      
        String daydate = "Select  concat(dayname(curdate()),': ', date(curdate())) dayDate ;";
       while(true){ 
         ResultSet rs1 = stmt.executeQuery(daydate);
     while(rs1.next())
        {
      String val2 = rs1.getString("dayDate");
     dayDate.setText(val2);
       }//Finaly I done it.....
       }
  }
           catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
           
        }
        }.start();
    }
    
    public void dateWidget( final JLabel day, final JLabel mon , final JLabel dayName)
    { new Thread()
        {
            public void run()
        { 
           try
        {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) 
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/abd","root","root");
        Statement stmt = (Statement)con.createStatement();
      
        String daydate = "Select day(curdate()) day, left(monthname(curdate()),3) monthName, left(dayname(curdate()),3) dayName ;";
       while(true){ 
         ResultSet rs1 = stmt.executeQuery(daydate);
     while(rs1.next())
        {
      String val2 = rs1.getString("day");
      day.setText(val2);
      String val3 = rs1.getString("monthName");
      mon.setText(val3.toUpperCase());
      String val4 = rs1.getString("dayName");
      dayName.setText(val4.toUpperCase());
      
    
       }//Finaly I done it.....
       }
  }
           catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
           
        }
        }.start();
    }
}



