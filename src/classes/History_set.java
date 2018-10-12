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
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Guest
 */
public class History_set {
    
            public void setHistory(JLabel doit,JLabel doit_2,JLabel doit_3)
        {String let;
        
           try
        {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) 
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/abd","root","root");
        Statement stmt = (Statement)con.createStatement();
        String time = "Select * from history order by date_time desc ;";
     
           ResultSet rs = stmt.executeQuery(time);
     while(rs.next())
        {String first,  second, third;
        int count = 0;
        switch(count)
        {case 0 :first = rs.getString("date_time");
                count++;System.out.println(first + "" + rs.getString("name")); doit.setText(rs.getString("name"));
            rs.next();
        case 1:second= rs.getString("date_time");
  count++; System.out.println(second+""+ rs.getString("name"));doit_2.setText(rs.getString("name"));
         rs.next();
        case 2: third = rs.getString("date_time");
     System.out.println(third+""+rs.getString("name"));doit_3.setText(rs.getString("name"));   
         break;
        
     }break;
    }
     }
           
           catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
           
        }
      
}
    

