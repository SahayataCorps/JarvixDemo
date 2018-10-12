/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home_package;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DisplayTrayIcon {
  public static TrayIcon trayIcon;
    public DisplayTrayIcon()
    {
    ShowTrayIcon();
    }
public static void ShowTrayIcon()
{
    if(!SystemTray.isSupported())
    {
    System.out.println("Error I am going to down");
    System.exit(0);
    return;
    
    }
    
final PopupMenu popup = new PopupMenu();
    trayIcon = new TrayIcon(CreateIcon("/Images/Icon.png","Tray Icon"));
final SystemTray tray = SystemTray.getSystemTray();
trayIcon.setToolTip("JARVIX");
Menu display = new Menu("Menu");

MenuItem AboutItem = new MenuItem("About");
MenuItem  ExitItem = new MenuItem("Exit");

MenuItem ErrorItem = new MenuItem("Error Trigger");
MenuItem  WarningItem = new MenuItem("Warning Trigger");
MenuItem NormalItem = new MenuItem("Normal Trigger");
MenuItem  InfoItem = new MenuItem("Info Trigger");


popup.add(AboutItem);
popup.addSeparator();
popup.add(ExitItem);
display.add(ErrorItem);

trayIcon.setPopupMenu(popup);
AboutItem.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
           JOptionPane.showMessageDialog(null,"Made By Adarsh Agarwal");
        }
    });
ExitItem.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
          tray.remove(trayIcon);
            System.exit(0);
        }
    });
try
{
    tray.add(trayIcon);
}
catch(AWTException e)
{
}

}


protected static Image CreateIcon(String path, String desc)
{
URL ImageURL = DisplayTrayIcon.class.getResource(path);
return(new ImageIcon(ImageURL, desc)).getImage();
}
}
