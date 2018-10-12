/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home_package;

import java.awt.Color;

/**
 *
 * @author Guest
 */
public class dialog extends javax.swing.JFrame {

   int xMouse;
    int yMouse;
    int go;
    
    public dialog() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        no = new javax.swing.JLabel();
        rsb = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        bb = new javax.swing.JLabel();
        lsb = new javax.swing.JLabel();
        head = new javax.swing.JLabel();
        yes = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 181));
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        no.setBackground(new java.awt.Color(0, 0, 0));
        no.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        no.setForeground(new java.awt.Color(0, 168, 255));
        no.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        no.setText("no");
        no.setOpaque(true);
        no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                noMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                noMouseExited(evt);
            }
        });
        getContentPane().add(no);
        no.setBounds(300, 110, 50, 40);

        rsb.setBackground(new java.awt.Color(51, 51, 51));
        rsb.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        rsb.setForeground(new java.awt.Color(0, 168, 255));
        rsb.setOpaque(true);
        getContentPane().add(rsb);
        rsb.setBounds(490, 20, 10, 140);

        header.setBackground(new java.awt.Color(51, 51, 51));
        header.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        header.setForeground(new java.awt.Color(0, 168, 255));
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Confirmation  Message");
        header.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        header.setOpaque(true);
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        getContentPane().add(header);
        header.setBounds(0, 0, 500, 29);

        bb.setBackground(new java.awt.Color(51, 51, 51));
        bb.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        bb.setForeground(new java.awt.Color(0, 168, 255));
        bb.setOpaque(true);
        getContentPane().add(bb);
        bb.setBounds(0, 160, 500, 20);

        lsb.setBackground(new java.awt.Color(51, 51, 51));
        lsb.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        lsb.setForeground(new java.awt.Color(0, 168, 255));
        lsb.setOpaque(true);
        getContentPane().add(lsb);
        lsb.setBounds(0, 20, 10, 140);

        head.setBackground(new java.awt.Color(0, 0, 0));
        head.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        head.setForeground(new java.awt.Color(0, 168, 255));
        head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head.setText("do you want to Exit?");
        head.setOpaque(true);
        getContentPane().add(head);
        head.setBounds(50, 40, 380, 50);

        yes.setBackground(new java.awt.Color(0, 0, 0));
        yes.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        yes.setForeground(new java.awt.Color(0, 168, 255));
        yes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yes.setText("yes");
        yes.setOpaque(true);
        yes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                yesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                yesMouseExited(evt);
            }
        });
        getContentPane().add(yes);
        yes.setBounds(140, 110, 50, 40);

        background.setBackground(new java.awt.Color(0, 0, 0));
        background.setOpaque(true);
        getContentPane().add(background);
        background.setBounds(0, 0, 500, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yesMouseEntered
   yes.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_yesMouseEntered

    private void yesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yesMouseExited
          yes.setBackground(Color.BLACK);
    }//GEN-LAST:event_yesMouseExited

    private void noMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noMouseEntered
                  no.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_noMouseEntered

    private void noMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noMouseExited
            no.setBackground(Color.BLACK);
    }//GEN-LAST:event_noMouseExited

    private void noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noMouseClicked
                this.hide();
    }//GEN-LAST:event_noMouseClicked

    private void yesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yesMouseClicked
             go =1;
             this.hide();
    }//GEN-LAST:event_yesMouseClicked

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
           xMouse = evt.getX();
           yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
            int x = evt.getXOnScreen();
            int y = evt.getYOnScreen();
            
            this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
           
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel bb;
    public static javax.swing.JLabel head;
    private javax.swing.JLabel header;
    private javax.swing.JLabel lsb;
    public static javax.swing.JLabel no;
    private javax.swing.JLabel rsb;
    public static javax.swing.JLabel yes;
    // End of variables declaration//GEN-END:variables
}
