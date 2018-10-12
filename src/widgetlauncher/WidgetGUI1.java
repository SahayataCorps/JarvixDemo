package widgetlauncher;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Mayur (IamTeknik)
 */

public class WidgetGUI1 extends javax.swing.JDialog 
{    int width = (Toolkit.getDefaultToolkit().getScreenSize().width/2) - 140;
   int xMouse;
   int yMouse;
   LaunchBrowser lb = new LaunchBrowser();
   Main GIF = new Main();
public WidgetGUI1(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        this.setLocation(width, 20);
         this.getRootPane().setOpaque(false);
                    this.getContentPane().setBackground(new Color (0,0,0,0));
                    this.setBackground(new Color (0,0,0,0));
                   
                   
    }

 

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        irctc = new javax.swing.JLabel();
        facebook = new javax.swing.JLabel();
        youtube = new javax.swing.JLabel();
        twitter = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Widget");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        irctc.setBackground(new java.awt.Color(0, 0, 0));
        irctc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        irctc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                irctcMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                irctcMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                irctcMouseReleased(evt);
            }
        });
        getContentPane().add(irctc, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 15, 60, 52));

        facebook.setBackground(new java.awt.Color(0, 0, 0));
        facebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facebookMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                facebookMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                facebookMouseReleased(evt);
            }
        });
        getContentPane().add(facebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 15, 60, 54));

        youtube.setBackground(new java.awt.Color(0, 0, 0));
        youtube.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        youtube.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                youtubeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                youtubeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                youtubeMouseReleased(evt);
            }
        });
        getContentPane().add(youtube, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 15, 60, 50));

        twitter.setBackground(new java.awt.Color(0, 0, 0));
        twitter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        twitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twitterMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                twitterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                twitterMouseReleased(evt);
            }
        });
        getContentPane().add(twitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 60, 50));

        Background.setBackground(new java.awt.Color(0, 0, 0));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/widgetlauncher/widgetGui.PNG"))); // NOI18N
        Background.setOpaque(true);
        Background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackgroundMousePressed(evt);
            }
        });
        Background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BackgroundMouseDragged(evt);
            }
        });
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 80));
        Background.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMousePressed
    xMouse = evt.getX();
    yMouse = evt.getY();
    }//GEN-LAST:event_BackgroundMousePressed

    private void BackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMouseDragged
     int x = evt.getXOnScreen();
     int y = evt.getYOnScreen();
     
     this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BackgroundMouseDragged

    private void twitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_twitterMouseClicked

    private void twitterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterMousePressed
        twitter.setOpaque(true);
        ImageIcon gif = new ImageIcon(getClass().getResource("twitterPressed.PNG"));
               twitter.setIcon(gif);
    }//GEN-LAST:event_twitterMousePressed

    private void twitterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterMouseReleased
        twitter.setOpaque(false);
        ImageIcon gif = new ImageIcon(getClass().getResource(""));
               twitter.setIcon(gif);
               lb.TwitterLaunch();
    }//GEN-LAST:event_twitterMouseReleased

    private void youtubeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_youtubeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_youtubeMouseClicked

    private void youtubeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_youtubeMousePressed
        youtube.setOpaque(true);
        ImageIcon gif = new ImageIcon(getClass().getResource("youtubePressed.PNG"));
               youtube.setIcon(gif);
    }//GEN-LAST:event_youtubeMousePressed

    private void youtubeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_youtubeMouseReleased
         youtube.setOpaque(false);
        ImageIcon gif = new ImageIcon(getClass().getResource(""));
               youtube.setIcon(gif);
               lb.YoutubeLaunch();
    }//GEN-LAST:event_youtubeMouseReleased

    private void facebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_facebookMouseClicked

    private void facebookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookMousePressed
     facebook.setOpaque(true);
        ImageIcon gif = new ImageIcon(getClass().getResource("facebookPressed.PNG"));
               facebook.setIcon(gif);
    }//GEN-LAST:event_facebookMousePressed

    private void facebookMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookMouseReleased
        facebook.setOpaque(false);
        ImageIcon gif = new ImageIcon(getClass().getResource(""));
               facebook.setIcon(gif);
               lb.FacebookLaunch();
    }//GEN-LAST:event_facebookMouseReleased

    private void irctcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_irctcMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_irctcMouseClicked

    private void irctcMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_irctcMousePressed
          irctc.setOpaque(true);
        ImageIcon gif = new ImageIcon(getClass().getResource("irctcPressed.PNG"));
               irctc.setIcon(gif);
    }//GEN-LAST:event_irctcMousePressed

    private void irctcMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_irctcMouseReleased
          irctc.setOpaque(false);
        ImageIcon gif = new ImageIcon(getClass().getResource(""));
               irctc.setIcon(gif);
               lb.IrctcLaunch();
    }//GEN-LAST:event_irctcMouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         GIF.runGoogleSearch();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
             
    }//GEN-LAST:event_formWindowActivated

    public static void main(String args[]) 
    {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WidgetGUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WidgetGUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WidgetGUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WidgetGUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run() {
                WidgetGUI1 dialog = new WidgetGUI1(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel Background;
    private javax.swing.JLabel facebook;
    private javax.swing.JLabel irctc;
    private javax.swing.JLabel twitter;
    private javax.swing.JLabel youtube;
    // End of variables declaration//GEN-END:variables
}