/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package widgetlauncher;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

/**
 *
 * @author Guest
 */
public class GoogleSearch extends javax.swing.JDialog {

     int width = (Toolkit.getDefaultToolkit().getScreenSize().width) - 335;
    Main GIF = new Main();
    int xMouse;
    int yMouse;
    public GoogleSearch(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocation(width,70);
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
        search = new javax.swing.JLabel();
        searchBar = new javax.swing.JTextField();
        heading = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(289, 165));
        setMinimumSize(new java.awt.Dimension(289, 165));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(235, 83));
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
        getContentPane().add(degree1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 20, -1));

        search.setFont(new java.awt.Font("Laserian", 0, 10)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("  SEARCH..........");
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 230, 70));

        searchBar.setBackground(new java.awt.Color(0, 0, 0));
        searchBar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        searchBar.setForeground(new java.awt.Color(204, 204, 204));
        searchBar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchBar.setBorder(null);
        searchBar.setMaximumSize(new java.awt.Dimension(253, 70));
        searchBar.setMinimumSize(new java.awt.Dimension(253, 70));
        searchBar.setName(""); // NOI18N
        searchBar.setOpaque(false);
        searchBar.setPreferredSize(new java.awt.Dimension(253, 70));
        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchBarKeyPressed(evt);
            }
        });
        getContentPane().add(searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 38, 253, 70));

        heading.setFont(new java.awt.Font("Arial Narrow", 3, 14)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 255, 255));
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setText("GOOGLE SEARCH");
        heading.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                headingMouseClicked(evt);
            }
        });
        getContentPane().add(heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 40));

        background.setBackground(new java.awt.Color(51, 51, 51));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/widgetlauncher/googleSearch.png"))); // NOI18N
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
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -40, 290, 240));

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
                searchBar.setVisible(false);
                GIF.runSaveLinks();
    }//GEN-LAST:event_formWindowOpened

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
             searchBar.setVisible(true);
             search.setVisible(false);
    }//GEN-LAST:event_searchMouseClicked

    private void searchBarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {String gif = searchBar.getText().replaceAll(" ","+");
            LaunchBrowser lb = new LaunchBrowser();
            lb.GoogleLaunch(gif);
            searchBar.setVisible(false);
            search.setVisible(true);
        } else { 
        }
    }//GEN-LAST:event_searchBarKeyPressed

    private void headingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headingMouseClicked
               searchBar.setVisible(false);
            search.setVisible(true);
    }//GEN-LAST:event_headingMouseClicked

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
               searchBar.setVisible(false);
               search.setVisible(true);
    }//GEN-LAST:event_formWindowLostFocus

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
            java.util.logging.Logger.getLogger(GoogleSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GoogleSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GoogleSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GoogleSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GoogleSearch dialog = new GoogleSearch(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel background;
    private javax.swing.JLabel degree1;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel search;
    private javax.swing.JTextField searchBar;
    // End of variables declaration//GEN-END:variables
}
