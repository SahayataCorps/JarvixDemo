/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package widgetlauncher;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Guest
 */
public class SavingLink extends javax.swing.JDialog {
           String gif,gif1;
           
     int width = (Toolkit.getDefaultToolkit().getScreenSize().width) - 350;
   Main GIFs = new Main();
  
    int xMouse;
    int yMouse;
    Link GIF = new Link();
    public SavingLink(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocation(width,150);
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

        degree1 = new javax.swing.JLabel();
        TITLE = new javax.swing.JLabel();
        link = new javax.swing.JLabel();
        titleTf = new javax.swing.JTextField();
        linkTf = new javax.swing.JTextField();
        heading = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(295, 285));
        setMinimumSize(new java.awt.Dimension(295, 285));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(235, 285));
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
        getContentPane().add(degree1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 20, -1));

        TITLE.setFont(new java.awt.Font("Laserian", 0, 10)); // NOI18N
        TITLE.setForeground(new java.awt.Color(255, 255, 255));
        TITLE.setText("ENTER TITLE.............");
        TITLE.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TITLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TITLEMouseClicked(evt);
            }
        });
        getContentPane().add(TITLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 40));

        link.setFont(new java.awt.Font("Laserian", 0, 10)); // NOI18N
        link.setForeground(new java.awt.Color(255, 255, 255));
        link.setText("ENTER LINK.............");
        link.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        link.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkMouseClicked(evt);
            }
        });
        getContentPane().add(link, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 230, 40));

        titleTf.setBackground(new java.awt.Color(0, 0, 0));
        titleTf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titleTf.setForeground(new java.awt.Color(204, 204, 204));
        titleTf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        titleTf.setBorder(null);
        titleTf.setMaximumSize(new java.awt.Dimension(253, 65));
        titleTf.setMinimumSize(new java.awt.Dimension(253, 65));
        titleTf.setName(""); // NOI18N
        titleTf.setOpaque(false);
        titleTf.setPreferredSize(new java.awt.Dimension(253, 70));
        titleTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                titleTfKeyPressed(evt);
            }
        });
        getContentPane().add(titleTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 67, 253, 65));

        linkTf.setBackground(new java.awt.Color(0, 0, 0));
        linkTf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        linkTf.setForeground(new java.awt.Color(204, 204, 204));
        linkTf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        linkTf.setBorder(null);
        linkTf.setMaximumSize(new java.awt.Dimension(253, 65));
        linkTf.setMinimumSize(new java.awt.Dimension(253, 65));
        linkTf.setName(""); // NOI18N
        linkTf.setOpaque(false);
        linkTf.setPreferredSize(new java.awt.Dimension(253, 70));
        linkTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                linkTfKeyPressed(evt);
            }
        });
        getContentPane().add(linkTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 130, 253, 65));

        heading.setFont(new java.awt.Font("Arial Narrow", 3, 14)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 255, 255));
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setText("SAVE LINKS");
        heading.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                headingMouseClicked(evt);
            }
        });
        getContentPane().add(heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 250, 40));

        background.setBackground(new java.awt.Color(51, 51, 51));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/widgetlauncher/saveLink.png"))); // NOI18N
        background.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backgroundMousePressed(evt);
            }
        });
        background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                backgroundMouseDragged(evt);
            }
        });
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 290, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMousePressed
         xMouse = evt.getX();
         yMouse = evt.getY();
    }//GEN-LAST:event_backgroundMousePressed

    private void backgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseDragged
             int x = evt.getXOnScreen();
             int y =evt.getYOnScreen();
             
             this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_backgroundMouseDragged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                linkTf.setVisible(false);
                titleTf.setVisible(false);
                GIFs.runClock();
    }//GEN-LAST:event_formWindowOpened

    private void linkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkMouseClicked
             linkTf.setVisible(true);
             link.setVisible(false);
           
             
            
    }//GEN-LAST:event_linkMouseClicked

    private void linkTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_linkTfKeyPressed
       try {  if(evt.getKeyCode() == KeyEvent.VK_ENTER )
        { gif = titleTf.getText();
            gif1 = linkTf.getText();
      GIF.saveLink(gif, gif1);
           
            linkTf.setVisible(false);
            link.setVisible(true);
            titleTf.setVisible(false);
            TITLE.setVisible(true);
            titleTf.setText("");
            linkTf.setText("");
        } 
        }
       catch(Exception e)
       {
       }
    }//GEN-LAST:event_linkTfKeyPressed

    private void headingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headingMouseClicked
               linkTf.setVisible(false);
            link.setVisible(true);
               titleTf.setVisible(false);
            TITLE.setVisible(true);
             titleTf.setText("");
            linkTf.setText("");
            
            
    }//GEN-LAST:event_headingMouseClicked

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
               linkTf.setVisible(false);
               link.setVisible(true);  titleTf.setVisible(false);
            TITLE.setVisible(true);
             titleTf.setText("");
            linkTf.setText("");
               
    }//GEN-LAST:event_formWindowLostFocus

    private void titleTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_titleTfKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_DOWN)
        {link.setVisible(false);
        linkTf.setVisible(true);
        titleTf.lostFocus(null, evt);
        linkTf.setFocusable(true);
        
        } 
        
    }//GEN-LAST:event_titleTfKeyPressed

    private void TITLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TITLEMouseClicked
                titleTf.setVisible(true);
                TITLE.setVisible(false);
    }//GEN-LAST:event_TITLEMouseClicked

    private void degree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_degree1MouseClicked
        this.hide();
    }//GEN-LAST:event_degree1MouseClicked

    private void degree1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_degree1MouseEntered
        degree1.setForeground(Color.red);
    }//GEN-LAST:event_degree1MouseEntered

    private void degree1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_degree1MouseExited
        degree1.setForeground(Color.WHITE);
    }//GEN-LAST:event_degree1MouseExited

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
            java.util.logging.Logger.getLogger(SavingLink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SavingLink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SavingLink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SavingLink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                SavingLink dialog = new SavingLink(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel TITLE;
    private javax.swing.JLabel background;
    private javax.swing.JLabel degree1;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel link;
    private javax.swing.JTextField linkTf;
    private javax.swing.JTextField titleTf;
    // End of variables declaration//GEN-END:variables
}
