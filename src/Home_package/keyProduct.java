
package Home_package;

import classes.Starter;
import java.awt.Color;
import java.awt.TrayIcon;

/**
 *
 * @author ADARSH
 */
public class keyProduct extends javax.swing.JFrame {
DisplayTrayIcon dwt = new DisplayTrayIcon();
    
           int  xMouse;
           int yMouse;
public keyProduct() {
        initComponents();
        keyP();
    }
public void keyP()
{ 
    new Thread()
    {public void run()
    {try{
        while(true)
{String kp1 = inp1.getText();
String kp2 = inp2.getText();
String kp3 = inp3.getText();
System.out.print("fine");
    if(kp1.length()==4)
{overhead1.setVisible(true);
inp2.setVisible(true);

inp2.setFocusable(true);
inp1.setFocusable(false);
}
    if(kp2.length()==4)
    {overhead2.setVisible(true);
inp3.setVisible(true);
inp3.setFocusable(true);
inp2.setFocusable(false);
    }
    if(kp3.length()==4)
    {inp3.setFocusable(false);
    
    }}
     
}   catch(Exception e)
    {
           System.out.print(e);     }
        
    
    }
    }.start();

}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inp3 = new javax.swing.JTextField();
        overhead2 = new javax.swing.JLabel();
        inp2 = new javax.swing.JTextField();
        overhead1 = new javax.swing.JLabel();
        inp1 = new javax.swing.JTextField();
        overhead = new javax.swing.JLabel();
        mlb = new javax.swing.JLabel();
        rlb = new javax.swing.JLabel();
        rsb = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        bb = new javax.swing.JLabel();
        lsb = new javax.swing.JLabel();
        llb = new javax.swing.JLabel();
        head = new javax.swing.JLabel();
        head1 = new javax.swing.JLabel();
        head2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 308));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 308));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        inp3.setBackground(new java.awt.Color(40, 40, 40));
        inp3.setFont(new java.awt.Font("DS-Digital", 1, 14)); // NOI18N
        inp3.setForeground(new java.awt.Color(0, 168, 255));
        inp3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inp3.setBorder(null);
        inp3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inp3KeyPressed(evt);
            }
        });
        getContentPane().add(inp3);
        inp3.setBounds(370, 130, 70, 30);

        overhead2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kp1.PNG"))); // NOI18N
        getContentPane().add(overhead2);
        overhead2.setBounds(330, 120, 150, 50);

        inp2.setBackground(new java.awt.Color(40, 40, 40));
        inp2.setFont(new java.awt.Font("DS-Digital", 1, 14)); // NOI18N
        inp2.setForeground(new java.awt.Color(0, 168, 255));
        inp2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inp2.setBorder(null);
        getContentPane().add(inp2);
        inp2.setBounds(220, 130, 70, 30);

        overhead1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kp1.PNG"))); // NOI18N
        getContentPane().add(overhead1);
        overhead1.setBounds(180, 120, 150, 50);

        inp1.setBackground(new java.awt.Color(40, 40, 40));
        inp1.setFont(new java.awt.Font("DS-Digital", 1, 14)); // NOI18N
        inp1.setForeground(new java.awt.Color(0, 168, 255));
        inp1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inp1.setBorder(null);
        getContentPane().add(inp1);
        inp1.setBounds(80, 130, 70, 30);

        overhead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kp1.PNG"))); // NOI18N
        overhead.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(overhead);
        overhead.setBounds(40, 120, 150, 50);

        mlb.setBackground(new java.awt.Color(0, 0, 0));
        mlb.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        mlb.setForeground(new java.awt.Color(0, 168, 255));
        mlb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlb.setText("clear all");
        mlb.setOpaque(true);
        mlb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mlbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mlbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mlbMouseExited(evt);
            }
        });
        getContentPane().add(mlb);
        mlb.setBounds(210, 220, 90, 40);

        rlb.setBackground(new java.awt.Color(0, 0, 0));
        rlb.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        rlb.setForeground(new java.awt.Color(0, 168, 255));
        rlb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rlb.setText("exit");
        rlb.setOpaque(true);
        rlb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rlbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rlbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rlbMouseExited(evt);
            }
        });
        getContentPane().add(rlb);
        rlb.setBounds(390, 220, 50, 40);

        rsb.setBackground(new java.awt.Color(51, 51, 51));
        rsb.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        rsb.setForeground(new java.awt.Color(0, 168, 255));
        rsb.setOpaque(true);
        getContentPane().add(rsb);
        rsb.setBounds(490, 20, 10, 270);

        header.setBackground(new java.awt.Color(51, 51, 51));
        header.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        header.setForeground(new java.awt.Color(0, 168, 255));
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Enter  product  key");
        header.setOpaque(true);
        getContentPane().add(header);
        header.setBounds(0, 0, 500, 29);

        bb.setBackground(new java.awt.Color(51, 51, 51));
        bb.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        bb.setForeground(new java.awt.Color(0, 168, 255));
        bb.setOpaque(true);
        getContentPane().add(bb);
        bb.setBounds(0, 290, 500, 20);

        lsb.setBackground(new java.awt.Color(51, 51, 51));
        lsb.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        lsb.setForeground(new java.awt.Color(0, 168, 255));
        lsb.setOpaque(true);
        getContentPane().add(lsb);
        lsb.setBounds(0, 20, 10, 270);

        llb.setBackground(new java.awt.Color(0, 0, 0));
        llb.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        llb.setForeground(new java.awt.Color(0, 168, 255));
        llb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        llb.setText("activate");
        llb.setOpaque(true);
        llb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                llbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                llbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                llbMouseExited(evt);
            }
        });
        getContentPane().add(llb);
        llb.setBounds(50, 220, 80, 40);

        head.setBackground(new java.awt.Color(0, 0, 0));
        head.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        head.setForeground(new java.awt.Color(0, 168, 255));
        head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head.setOpaque(true);
        head.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                headMouseClicked(evt);
            }
        });
        getContentPane().add(head);
        head.setBounds(50, 110, 140, 70);

        head1.setBackground(new java.awt.Color(0, 0, 0));
        head1.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        head1.setForeground(new java.awt.Color(0, 168, 255));
        head1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head1.setOpaque(true);
        head1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                head1MouseClicked(evt);
            }
        });
        getContentPane().add(head1);
        head1.setBounds(180, 110, 140, 70);

        head2.setBackground(new java.awt.Color(0, 0, 0));
        head2.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        head2.setForeground(new java.awt.Color(0, 168, 255));
        head2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head2.setOpaque(true);
        getContentPane().add(head2);
        head2.setBounds(310, 110, 140, 70);

        background.setBackground(new java.awt.Color(0, 0, 0));
        background.setOpaque(true);
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backgroundMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backgroundMousePressed(evt);
            }
        });
        background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                backgroundMouseDragged(evt);
            }
        });
        getContentPane().add(background);
        background.setBounds(0, 0, 500, 310);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void llbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_llbMouseEntered
llb.setBackground(Color.DARK_GRAY);   
    }//GEN-LAST:event_llbMouseEntered

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 
 
 overhead1.setVisible(false);
inp2.setVisible(false);
 overhead2.setVisible(false);
inp3.setVisible(false);

// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void llbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_llbMouseExited
llb.setBackground(Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_llbMouseExited

    private void mlbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlbMouseEntered
mlb.setBackground(Color.DARK_GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_mlbMouseEntered

    private void mlbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlbMouseExited
 mlb.setBackground(Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_mlbMouseExited

    private void rlbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rlbMouseEntered
 rlb.setBackground(Color.DARK_GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_rlbMouseEntered

    private void rlbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rlbMouseExited
 rlb.setBackground(Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_rlbMouseExited

    private void rlbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rlbMouseClicked
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_rlbMouseClicked

    private void headMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMouseClicked

 
// TODO add your handling code here:
    }//GEN-LAST:event_headMouseClicked

    private void backgroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseClicked
       overhead.setVisible(false);
inp1.setVisible(false);
inp1.setText("");
overhead1.setVisible(false);
inp2.setVisible(false);
inp2.setText("");
 overhead2.setVisible(false);
inp3.setVisible(false);
inp3.setText("");
    }//GEN-LAST:event_backgroundMouseClicked

    private void head1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_head1MouseClicked
     
    }//GEN-LAST:event_head1MouseClicked

    private void llbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_llbMouseClicked
    String kp1 = inp1.getText().toUpperCase();
    String kp2 = inp2.getText().toUpperCase();
String kp3 = inp3.getText().toUpperCase();
if(kp1.equals("ABD1") && kp2.equals("7119") && kp3.equals("7NIM"))
{DisplayTrayIcon .trayIcon.displayMessage("ACTIVATED", "Your Demo Version Of My Pad Is Activated", TrayIcon.MessageType.INFO);
 EnterPassword pwd = new EnterPassword();
 Starter start = new Starter();
 start.updateStatus();
 pwd.show();
 this.hide();
}
else
{DisplayTrayIcon .trayIcon.displayMessage("ERROR", "Product Key  Not  Matched", TrayIcon.MessageType.ERROR);
    
    inp1.setText("");
inp2.setText("");
inp3.setText("");
 overhead1.setVisible(false);
inp2.setVisible(false);
 overhead2.setVisible(false);
inp3.setVisible(false);
inp1.setFocusable(true);

}
    }//GEN-LAST:event_llbMouseClicked

    private void mlbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlbMouseClicked
        inp1.setText("");
inp2.setText("");
inp3.setText("");
 overhead1.setVisible(false);
inp2.setVisible(false);
 overhead2.setVisible(false);
inp3.setVisible(false);
inp1.setFocusable(true);
    }//GEN-LAST:event_mlbMouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
       
    }//GEN-LAST:event_formKeyPressed

    private void inp3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inp3KeyPressed
  
    }//GEN-LAST:event_inp3KeyPressed

    private void backgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMousePressed
             xMouse = evt.getX();
             yMouse = evt.getY();
             
    }//GEN-LAST:event_backgroundMousePressed

    private void backgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseDragged
               int x = evt.getXOnScreen();
               int y = evt.getYOnScreen();
               this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_backgroundMouseDragged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new keyProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel bb;
    private javax.swing.JLabel head;
    private javax.swing.JLabel head1;
    private javax.swing.JLabel head2;
    private javax.swing.JLabel header;
    private javax.swing.JTextField inp1;
    private javax.swing.JTextField inp2;
    private javax.swing.JTextField inp3;
    private javax.swing.JLabel llb;
    private javax.swing.JLabel lsb;
    private javax.swing.JLabel mlb;
    private javax.swing.JLabel overhead;
    private javax.swing.JLabel overhead1;
    private javax.swing.JLabel overhead2;
    private javax.swing.JLabel rlb;
    private javax.swing.JLabel rsb;
    // End of variables declaration//GEN-END:variables
}
