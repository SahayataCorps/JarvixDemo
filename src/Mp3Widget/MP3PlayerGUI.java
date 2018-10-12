package Mp3Widget;

//All code is added to create the widget. Follow the "Create a Widget" tutorial if you want to know how I did it.

import Home_package.history;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MP3PlayerGUI extends javax.swing.JDialog 
{MainClass MC = new MainClass();
public static int count;
String path;
    int xMouse;
    int yMouse;
    
    int width = (Toolkit.getDefaultToolkit().getScreenSize().width / 2) - 185;
    int height = Toolkit.getDefaultToolkit().getScreenSize().height - 180;
    history obj = new history("MP3 Player");
    public MP3PlayerGUI(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        obj.addHistory();
        this.setLocation(width, height);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        degree1 = new javax.swing.JLabel();
        display = new javax.swing.JLabel();
        Play = new javax.swing.JLabel();
        SelectFile = new javax.swing.JLabel();
        Pause = new javax.swing.JLabel();
        Stop = new javax.swing.JLabel();
        Loop = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MP3 Player");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        degree1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        degree1.setForeground(new java.awt.Color(255, 255, 255));
        degree1.setText("X");
        degree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                degree1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                degree1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                degree1MouseExited(evt);
            }
        });
        getContentPane().add(degree1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        display.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        display.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 330, 20));

        Play.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PlayMouseReleased(evt);
            }
        });
        getContentPane().add(Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 90, 83));

        SelectFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SelectFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SelectFileMouseReleased(evt);
            }
        });
        getContentPane().add(SelectFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 60, 40, 40));

        Pause.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PauseMouseReleased(evt);
            }
        });
        getContentPane().add(Pause, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 50, 60, 60));

        Stop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StopMouseClicked(evt);
            }
        });
        getContentPane().add(Stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 70, 60));

        Loop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Loop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoopMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoopMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LoopMouseReleased(evt);
            }
        });
        getContentPane().add(Loop, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 40, 40));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mp3Widget/Background.png"))); // NOI18N
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
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BackgroundMouseDragged

    private void BackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BackgroundMousePressed

    private void LoopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoopMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LoopMouseClicked

    private void LoopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoopMousePressed
    
    }//GEN-LAST:event_LoopMousePressed

    private void StopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StopMouseClicked
      MC.Stop();
   
    }//GEN-LAST:event_StopMouseClicked

    private void PlayMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayMouseReleased
       if(display.getText()!="")
       {MC.Resume();
       Pause.setVisible(true);
       Play.setVisible(false);}
       else 
       {JOptionPane.showMessageDialog(null,"Select a Song to play");
       }
    }//GEN-LAST:event_PlayMouseReleased

    private void PauseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PauseMouseReleased
          MC.Pause();   
          Play.setVisible(true);
          Pause.setVisible(false);
    }//GEN-LAST:event_PauseMouseReleased

    private void SelectFileMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelectFileMouseReleased
    FileFilter filter = new FileNameExtensionFilter("MP3 files","mp3","mpeg3");
    JFileChooser chooser = new JFileChooser(path);
    chooser.addChoosableFileFilter(filter);
    int returnVal = chooser.showOpenDialog(null);
    if(returnVal == JFileChooser.APPROVE_OPTION)
    {MC.Stop();
        File myFiles = chooser.getSelectedFile();
    String song = myFiles + "";
    path = chooser.getSelectedFile().getPath();
    String name = chooser.getSelectedFile().getName();
    display.setText(name);
    
    MC.Play(song);
    Play.setVisible(false);
    }
    }//GEN-LAST:event_SelectFileMouseReleased

    private void LoopMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoopMouseReleased
       switch(count)
       {case 0: count =1;
       System.out.print(count);
           break;
       case 1 : count = 0;
       System.out.print(count);
           break;
       }
    }//GEN-LAST:event_LoopMouseReleased

    private void degree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_degree1MouseClicked
MC.Stop();
        this.hide();
    }//GEN-LAST:event_degree1MouseClicked

    private void degree1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_degree1MouseEntered
        degree1.setForeground(Color.red);
    }//GEN-LAST:event_degree1MouseEntered

    private void degree1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_degree1MouseExited
        degree1.setForeground(Color.WHITE);
    }//GEN-LAST:event_degree1MouseExited

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
            java.util.logging.Logger.getLogger(MP3PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MP3PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MP3PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MP3PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                MP3PlayerGUI dialog = new MP3PlayerGUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel Loop;
    private javax.swing.JLabel Pause;
    private javax.swing.JLabel Play;
    private javax.swing.JLabel SelectFile;
    private javax.swing.JLabel Stop;
    private javax.swing.JLabel degree1;
    public static javax.swing.JLabel display;
    // End of variables declaration//GEN-END:variables
}
