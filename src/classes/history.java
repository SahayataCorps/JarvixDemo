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
public class history {
    String name,time_date,query,value,query_2,value_2;
    
   public history(String frameName)
    {name = frameName;
    
    }
    public void addHistory()
    {
        try{
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) 
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/abd","root","root");
        Statement stmt = (Statement)con.createStatement();
        time_date= "Select Sysdate() time_date;";
        ResultSet rs = stmt.executeQuery(time_date);
        while(rs.next())
        value = rs.getString("time_date");
   
    query = "Insert into history values('"+name+"','"+value+"');";
            int rs2 = stmt.executeUpdate(query);
        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null, e);
        }
        }
  
     
    
           
    
    }
    

