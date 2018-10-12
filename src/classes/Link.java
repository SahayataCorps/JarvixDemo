/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package widgetlauncher;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Link {
    public void saveLink( String title, String link) throws ClassNotFoundException, SQLException
    {  try{
    Class.forName("java.sql.DriverManager");
            Connection con = (Connection) 
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/abd","root","root");
        Statement stmt = (Statement)con.createStatement();
        String savingLink = "Insert into links values ( '" + title.trim() + "','" + link.trim() +"');" ;
        int rs = stmt.executeUpdate(savingLink);
      
  
    }
    catch(Exception e)
    {JOptionPane.showMessageDialog(null, e);
    }
    }
    public void loadLink(String title, JLabel value)
    {LaunchBrowser lb = new LaunchBrowser();
        try{int count = 0;value.setText("");
    Class.forName("java.sql.DriverManager");
            Connection con = (Connection) 
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/abd","root","root");
        Statement stmt = (Statement)con.createStatement();
        String loadingLink = "Select * from links where title = '"+title + "';";
        ResultSet rs = stmt.executeQuery(loadingLink);
        while(rs.next())
        {String val = rs.getString("link");
        value.setText(value.getText()+ "  ;   " + val);
        lb.LinkLaunch(val);
        count++;
        if(count>2)
        {JOptionPane.showMessageDialog(null,"More than 2 links found with same title." +"\n" +"Displaying latest 2");
        break;
        }
        }
        if(count ==0)
        {JOptionPane.showMessageDialog(null,"No record Found");
        }
    }
    catch(Exception e)
    {JOptionPane.showMessageDialog(null, e);
    }
    }
    
    
    
    
    
    
}
