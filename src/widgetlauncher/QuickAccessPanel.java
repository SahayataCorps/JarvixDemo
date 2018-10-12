/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package widgetlauncher;

import Home_package.Apps;
import Home_package.Home_page;
import WeatherWidget.WeatherReport;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Guest
 */
public class QuickAccessPanel extends javax.swing.JDialog {
 
     int width = (Toolkit.getDefaultToolkit().getScreenSize().width) - 338;
    Main GIF = new Main();
    int xMouse;
    int yMouse;
    public QuickAccessPanel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocation(width,363);
        this.getRootPane().setOpaque(false);
                    this.getContentPane().setBackground(new Color (0,0,0,0));
                    this.setBackground(new Color (0,0,0,0));
   
   
    }

    

    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        heading = new javax.swing.JLabel();
        closeWidgets = new javax.swing.JLabel();
        closeLauncher = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        help = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        widgets = new javax.swing.JLabel();
        gmail = new javax.swing.JLabel();
        weather = new javax.swing.JLabel();
        mp3 = new javax.swing.JLabel();
        load = new javax.swing.JLabel();
        apps = new javax.swing.JLabel();
        homePage = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(289, 165));
        setUndecorated(true);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        heading.setFont(new java.awt.Font("Arial Narrow", 3, 14)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 255, 255));
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setText("QUICK ACCESS PANEL");
        heading.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                headingMouseClicked(evt);
            }
        });
        getContentPane().add(heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 250, 40));

        closeWidgets.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        closeWidgets.setForeground(new java.awt.Color(255, 255, 255));
        closeWidgets.setText("All widgets");
        closeWidgets.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeWidgets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeWidgetsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeWidgetsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeWidgetsMouseExited(evt);
            }
        });
        getContentPane().add(closeWidgets, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 230, 40));

        closeLauncher.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        closeLauncher.setForeground(new java.awt.Color(255, 255, 255));
        closeLauncher.setText("Launcher");
        closeLauncher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeLauncher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLauncherMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeLauncherMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeLauncherMouseExited(evt);
            }
        });
        getContentPane().add(closeLauncher, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 230, 40));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 0));
        jLabel13.setText("CLOSE");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, 50));

        help.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        help.setForeground(new java.awt.Color(255, 255, 255));
        help.setText("Help");
        help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                helpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                helpMouseExited(evt);
            }
        });
        getContentPane().add(help, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 230, 40));

        settings.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        settings.setForeground(new java.awt.Color(255, 255, 255));
        settings.setText("Settings");
        settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsMouseExited(evt);
            }
        });
        getContentPane().add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 230, 40));

        widgets.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        widgets.setForeground(new java.awt.Color(255, 255, 255));
        widgets.setText("Widgets");
        widgets.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        widgets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                widgetsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                widgetsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                widgetsMouseExited(evt);
            }
        });
        getContentPane().add(widgets, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 230, 40));

        gmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        gmail.setForeground(new java.awt.Color(255, 255, 255));
        gmail.setText("GMail");
        gmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gmailMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gmailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gmailMouseExited(evt);
            }
        });
        getContentPane().add(gmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, 40));

        weather.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        weather.setForeground(new java.awt.Color(255, 255, 255));
        weather.setText("Weather Report");
        weather.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        weather.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                weatherMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                weatherMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                weatherMouseExited(evt);
            }
        });
        getContentPane().add(weather, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 230, 40));

        mp3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mp3.setForeground(new java.awt.Color(255, 255, 255));
        mp3.setText("Mp3 Player");
        mp3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mp3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mp3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mp3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mp3MouseExited(evt);
            }
        });
        getContentPane().add(mp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 121, 230, 40));

        load.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        load.setForeground(new java.awt.Color(255, 255, 255));
        load.setText("Load Links");
        load.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        load.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loadMouseExited(evt);
            }
        });
        getContentPane().add(load, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 101, 230, 40));

        apps.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        apps.setForeground(new java.awt.Color(255, 255, 255));
        apps.setText("Applications");
        apps.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        apps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                appsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                appsMouseExited(evt);
            }
        });
        getContentPane().add(apps, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 40));

        homePage.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        homePage.setForeground(new java.awt.Color(255, 255, 255));
        homePage.setText("Home Page");
        homePage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homePageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homePageMouseExited(evt);
            }
        });
        getContentPane().add(homePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 230, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("LAUNCH");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/widgetlauncher/panel2.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 290, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       Main GIF = new Main();
    GIF.runWidgetGUI();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
               
    }//GEN-LAST:event_formWindowLostFocus

    private void homePageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePageMouseEntered
          homePage.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_homePageMouseEntered

    private void homePageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePageMouseExited
              homePage.setForeground(Color.WHITE);
    }//GEN-LAST:event_homePageMouseExited

    private void appsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appsMouseEntered
       apps.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_appsMouseEntered

    private void appsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appsMouseExited
         apps.setForeground(Color.WHITE);
    }//GEN-LAST:event_appsMouseExited

    private void loadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadMouseEntered
         load.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_loadMouseEntered

    private void loadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadMouseExited
      load.setForeground(Color.WHITE);
    }//GEN-LAST:event_loadMouseExited

    private void mp3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mp3MouseEntered
         mp3.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_mp3MouseEntered

    private void mp3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mp3MouseExited
         mp3.setForeground(Color.WHITE);
    }//GEN-LAST:event_mp3MouseExited

    private void weatherMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weatherMouseEntered
         weather.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_weatherMouseEntered

    private void weatherMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weatherMouseExited
          weather.setForeground(Color.WHITE);
    }//GEN-LAST:event_weatherMouseExited

    private void gmailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gmailMouseEntered
        gmail.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_gmailMouseEntered

    private void gmailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gmailMouseExited
      gmail.setForeground(Color.WHITE);
    }//GEN-LAST:event_gmailMouseExited

    private void widgetsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_widgetsMouseEntered
        widgets.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_widgetsMouseEntered

    private void widgetsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_widgetsMouseExited
       widgets.setForeground(Color.WHITE);
    }//GEN-LAST:event_widgetsMouseExited

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
         settings.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
       settings.setForeground(Color.WHITE);
    }//GEN-LAST:event_settingsMouseExited

    private void helpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseEntered
         help.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_helpMouseEntered

    private void helpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseExited
        help.setForeground(Color.WHITE);
    }//GEN-LAST:event_helpMouseExited

    private void closeLauncherMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLauncherMouseEntered
        closeLauncher.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_closeLauncherMouseEntered

    private void closeLauncherMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLauncherMouseExited
       closeLauncher.setForeground(Color.WHITE);
    }//GEN-LAST:event_closeLauncherMouseExited

    private void closeWidgetsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeWidgetsMouseEntered
       closeWidgets.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_closeWidgetsMouseEntered

    private void closeWidgetsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeWidgetsMouseExited
        closeWidgets.setForeground(Color.WHITE);
    }//GEN-LAST:event_closeWidgetsMouseExited

    private void homePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePageMouseClicked
               Home_page home = new Home_page();
               home.show();
    }//GEN-LAST:event_homePageMouseClicked

    private void appsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appsMouseClicked
             Apps app = new Apps();
             app.show();
    }//GEN-LAST:event_appsMouseClicked

    private void loadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadMouseClicked
              
               GIF.runLoadLink();
    }//GEN-LAST:event_loadMouseClicked

    private void mp3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mp3MouseClicked
          GIF.runMP3Player();
    }//GEN-LAST:event_mp3MouseClicked

    private void weatherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weatherMouseClicked
            WeatherReport wea = new WeatherReport();
            wea.show();
    }//GEN-LAST:event_weatherMouseClicked

    private void closeLauncherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLauncherMouseClicked
           System.exit(0);
    }//GEN-LAST:event_closeLauncherMouseClicked

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
           xMouse = evt.getX();
           yMouse = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
           int x = evt.getXOnScreen();
           int y= evt.getYOnScreen();
           
           this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void headingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headingMouseClicked
       

    }//GEN-LAST:event_headingMouseClicked

    private void gmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gmailMouseClicked
             LaunchBrowser GIF = new LaunchBrowser();
             GIF.GMailLaunch();
    }//GEN-LAST:event_gmailMouseClicked

    private void widgetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_widgetsMouseClicked
    
  Main GIF = new Main();
    GIF.runWidgetGUI();
           
            
    }//GEN-LAST:event_widgetsMouseClicked

    private void closeWidgetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeWidgetsMouseClicked
          
    }//GEN-LAST:event_closeWidgetsMouseClicked

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
           Main GIF = new Main();
           GIF.runSettings();
    }//GEN-LAST:event_settingsMouseClicked

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        JOptionPane.showMessageDialog(null,"Check The Manuals");
    }//GEN-LAST:event_helpMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuickAccessPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuickAccessPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuickAccessPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuickAccessPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuickAccessPanel dialog = new QuickAccessPanel(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() 
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) 
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apps;
    private javax.swing.JLabel closeLauncher;
    private javax.swing.JLabel closeWidgets;
    private javax.swing.JLabel gmail;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel help;
    private javax.swing.JLabel homePage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel load;
    private javax.swing.JLabel mp3;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel weather;
    private javax.swing.JLabel widgets;
    // End of variables declaration//GEN-END:variables
}