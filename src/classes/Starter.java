
package classes;

import Home_package.LockscreenGUI;
import Home_package.keyProduct;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import widgetlauncher.Main;


public class Starter {
 
public void starter() 
{try{
 Class.forName("java.sql.DriverManager");
            Connection con = (Connection) 
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/abd","root","root");
        Statement stmt = (Statement)con.createStatement();
        String sleep = "select sleep(3);";
String start= " Select * from keyProduct;";
stmt.executeQuery(sleep);
ResultSet rs= stmt.executeQuery(start);
while(rs.next())
{
    if(rs.getString("status").equalsIgnoreCase("No"))
{
keyProduct obj = new keyProduct();
obj.show();


}
else
    if(rs.getString("status").equalsIgnoreCase("yes"))
    {
    LockscreenGUI lock = new LockscreenGUI();
    lock.show();

    
    }
}}
catch(Exception e)
{JOptionPane.showMessageDialog(null, e);
}

}    
public void updateStatus() 
{try{
 Class.forName("java.sql.DriverManager");
            Connection con = (Connection) 
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/abd","root","root");
        Statement stmt = (Statement)con.createStatement();

String start= "update keyProduct set Status ='yes'   where Status ='No'; ";
int rs= stmt.executeUpdate(start);

}
catch(Exception e)
{JOptionPane.showMessageDialog(null, e);
}

}    
public void updatePWD(String Pwd) 
{try{
 Class.forName("java.sql.DriverManager");
            Connection con = (Connection) 
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/abd","root","root");
        Statement stmt = (Statement)con.createStatement();

String start= "update password set pwd ='"+Pwd+"';";
int rs= stmt.executeUpdate(start);

}
catch(Exception e)
{JOptionPane.showMessageDialog(null, e);
}

}    
public String getPWD() 
{ String getPWD = "";
    try{
 Class.forName("java.sql.DriverManager");
            Connection con = (Connection) 
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/abd","root","root");
        Statement stmt = (Statement)con.createStatement();

String start= "select * from password;";
ResultSet rs = stmt.executeQuery(start);
while(rs.next())
{getPWD = rs.getString("pwd");



}

}
catch(Exception e)
{JOptionPane.showMessageDialog(null, e);
}

    
return getPWD;
    }}
    
    

