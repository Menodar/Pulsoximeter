
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jens
 */
public class Setlimitstartup extends javax.swing.JFrame {
    private JTextField startupfield = new JTextField();     
    /**
     * Creates new form Setlimits
     */
    public Setlimitstartup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        lower_value = new javax.swing.JTextField();
        lower_label1 = new javax.swing.JLabel();
        return_lowerHR = new javax.swing.JButton();
        cancel_lowerHR = new javax.swing.JButton();
        upper_label = new javax.swing.JLabel();
        upper_value = new javax.swing.JTextField();
        upper_value1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lower_value1 = new javax.swing.JTextField();
        lower_label2 = new javax.swing.JLabel();
        setlimits = new javax.swing.JButton();
        setdefault = new javax.swing.JButton();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lower_value.setBackground(new java.awt.Color(245, 245, 245));
        lower_value.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        lower_value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lower_value.setText("50");
        lower_value.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lower_value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lower_valueActionPerformed(evt);
            }
        });

        lower_label1.setText("Insert lower Pulse alarm Limit");

        return_lowerHR.setText("Save");
        return_lowerHR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_lowerHRActionPerformed(evt);
            }
        });

        cancel_lowerHR.setText("cancel");
        cancel_lowerHR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_lowerHRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(return_lowerHR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancel_lowerHR))
                    .addComponent(lower_value, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lower_label1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lower_label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lower_value, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel_lowerHR)
                    .addComponent(return_lowerHR))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        upper_label.setText("Insert upper Pulse alarm Limit");

        upper_value.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        upper_value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        upper_value.setText("180");
        upper_value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upper_valueActionPerformed(evt);
            }
        });

        upper_value1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        upper_value1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        upper_value1.setText("90");
        upper_value1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upper_value1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Insert SpO2 alarm Limit");

        lower_value1.setBackground(new java.awt.Color(245, 245, 245));
        lower_value1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        lower_value1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lower_value1.setText("50");
        lower_value1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lower_value1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lower_value1ActionPerformed(evt);
            }
        });

        lower_label2.setText("Insert lower Pulse alarm Limit");

        setlimits.setText("save limits");
        setlimits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setlimitsActionPerformed(evt);
            }
        });

        setdefault.setText("set default limits");
        setdefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setdefaultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(upper_value1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lower_value1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(lower_label2))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upper_value, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(upper_label)))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(setdefault)
                            .addComponent(setlimits, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(upper_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(upper_value, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lower_label2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lower_value1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(upper_value1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(setlimits)
                        .addGap(37, 37, 37)
                        .addComponent(setdefault)
                        .addGap(25, 25, 25)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void upper_valueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upper_valueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upper_valueActionPerformed

    private void lower_valueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lower_valueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lower_valueActionPerformed

    private void return_lowerHRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_lowerHRActionPerformed
        String lowerfiledvalue = lower_value.getText();
        checkdata(lowerfiledvalue);
        // return value
        // TODO add your handling code here:
    }//GEN-LAST:event_return_lowerHRActionPerformed

    private void cancel_lowerHRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_lowerHRActionPerformed
        close();
    }//GEN-LAST:event_cancel_lowerHRActionPerformed

    private void upper_value1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upper_value1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upper_value1ActionPerformed

    private void lower_value1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lower_value1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lower_value1ActionPerformed

    private void setlimitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setlimitsActionPerformed
        // return values
        close();
    }//GEN-LAST:event_setlimitsActionPerformed

    private void setdefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setdefaultActionPerformed
        // return default values
        close();
    }//GEN-LAST:event_setdefaultActionPerformed

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
            java.util.logging.Logger.getLogger(Setlimitstartup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Setlimitstartup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Setlimitstartup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Setlimitstartup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Setlimitstartup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_lowerHR;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lower_label1;
    private javax.swing.JLabel lower_label2;
    private javax.swing.JTextField lower_value;
    private javax.swing.JTextField lower_value1;
    private javax.swing.JButton return_lowerHR;
    private javax.swing.JButton setdefault;
    private javax.swing.JButton setlimits;
    private javax.swing.JLabel upper_label;
    private javax.swing.JTextField upper_value;
    private javax.swing.JTextField upper_value1;
    // End of variables declaration//GEN-END:variables

    private void close()
    {
        WindowEvent winCloseing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winCloseing);
    }
    
    public  boolean checkdata(String spo2_value){               
            
        try {
            int spo2_int = Integer.parseInt( spo2_value );
            if (spo2_int < 70 || spo2_int >= 100) {
                JOptionPane.showMessageDialog(new JFrame(), "Nur Werte zwischen 70 und 100 sind gültig","Warnung",JOptionPane.ERROR_MESSAGE);
                return true;
            }
        }
        catch( Exception e )
        {
            JOptionPane.showMessageDialog(new JFrame(), "Eingegebener Wert ist keine gültige Zahl","Warnung",JOptionPane.ERROR_MESSAGE);
            return false;
        }        
        return false;
    }
}
