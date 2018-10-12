
package widgetlauncher;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;


public class LaunchBrowser {
   
    public void FacebookLaunch()
    {  try
    {
        Desktop.getDesktop().browse(URI.create("www.facebook.com"));
    }
    catch(Exception e)
    {
    }
    }    
     public void GoogleLaunch( String url)
    {  try
    {
        Desktop.getDesktop().browse(URI.create("http://www.google.com/search?hl=en&q=" + url + "&btnG=Google+Search" ));
    }
    catch(Exception e)
    {JOptionPane.showMessageDialog(null, e);
    }
    }    
      public void TwitterLaunch()
    {  try
    {
        Desktop.getDesktop().browse(URI.create("www.Twitter.com"));
    }
    catch(Exception e)
    {
    }
    }    
       public void YoutubeLaunch()
    {  try
    {
        Desktop.getDesktop().browse(URI.create("www.Youtube.com"));
    }
    catch(Exception e)
    {
    }
    }    
       public void IrctcLaunch()
    {  try
    {
        Desktop.getDesktop().browse(URI.create("www.irctc.co.in"));
    }
    catch(Exception e)
    {String srl = "";
    }
    }    
       public void LinkLaunch(String link)
    {  try
    {
        Desktop.getDesktop().browse(URI.create(link));
    }
    catch(Exception e)
    {
    }
    }    
        public void GMailLaunch()
    {  try
    {
        Desktop.getDesktop().browse(URI.create("www.GMail.com"));
    }
    catch(Exception e)
    {
    }
    }   
}
