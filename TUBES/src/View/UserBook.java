/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Controller.ControllerUserBook;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
import javax.swing.JComboBox;
import com.toedter.calendar.JTextFieldDateEditor;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author darre
 */
public class UserBook extends javax.swing.JFrame {

    /**
     * Creates new form userBook
     */
    ControllerUserBook con =new ControllerUserBook(this);
    public UserBook() {
        initComponents();
        this.getJamSelesaiField().setEnabled(false);
        
        con.setMetodePembayaran();
        this.getJamSelesaiField().setSelectedItem(0);
        this.getUangMukaButton().setEnabled(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lapanganField = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        calenderField = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jamMulaiField = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jamSelesaiField = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        hargaPesanField = new javax.swing.JLabel();
        uangMukaField = new javax.swing.JLabel();
        UangMukaButton = new javax.swing.JButton();
        BayarLunasButton = new javax.swing.JButton();
        kembaliButton = new javax.swing.JButton();
        PembayaranField = new javax.swing.JComboBox<>();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Form Pemesanan Lapangan");

        jLabel2.setText("Lapangan :");

        lapanganField.setModel(con.menuLapangan());
        lapanganField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapanganFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Tanggal :");

        Date now = new Date();
        calenderField.setDate(now);
        calenderField.setDateFormatString("dd MMMM yyyy");
        JTextFieldDateEditor editor = (JTextFieldDateEditor) calenderField.getDateEditor();
        editor.setEditable(false);
        calenderField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calenderFieldPropertyChange(evt);
            }
        });

        jLabel4.setText("Jam Mulai :");

        jamMulaiField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jamMulaiField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jamMulaiFieldActionPerformed(evt);
            }
        });
        jamMulaiField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jamMulaiFieldPropertyChange(evt);
            }
        });

        jLabel5.setText("Jam Selesai :");

        jamSelesaiField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jamSelesaiField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jamSelesaiFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Pembayaran");

        jLabel8.setText("Harga Pemesanan :");

        jLabel9.setText("Uang Muka            :");

        hargaPesanField.setText("0");

        uangMukaField.setText("0");

        UangMukaButton.setText("Bayar Uang Muka");
        UangMukaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UangMukaButtonActionPerformed(evt);
            }
        });

        BayarLunasButton.setText("Bayar Lunas");
        BayarLunasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BayarLunasButtonActionPerformed(evt);
            }
        });

        kembaliButton.setText("Kembali");
        kembaliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliButtonActionPerformed(evt);
            }
        });

        PembayaranField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        PembayaranField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PembayaranFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jamMulaiField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(PembayaranField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uangMukaField, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                            .addComponent(hargaPesanField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(kembaliButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UangMukaButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BayarLunasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jamSelesaiField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(47, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lapanganField, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calenderField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(261, 261, 261))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calenderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lapanganField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jamMulaiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jamSelesaiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PembayaranField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(hargaPesanField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(uangMukaField))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kembaliButton)
                    .addComponent(UangMukaButton)
                    .addComponent(BayarLunasButton))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UangMukaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UangMukaButtonActionPerformed
        // TODO add your handling code here:
        con.uangMukaButton();
    }//GEN-LAST:event_UangMukaButtonActionPerformed

    private void BayarLunasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BayarLunasButtonActionPerformed
        // TODO add your handling code here:
        con.LunasButton();
    }//GEN-LAST:event_BayarLunasButtonActionPerformed

    private void kembaliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliButtonActionPerformed
        // TODO add your handling code here:
        con.kembaliGUI();
    }//GEN-LAST:event_kembaliButtonActionPerformed

    private void jamMulaiFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jamMulaiFieldActionPerformed
        // TODO add your handling code here:
        con.menuJamSelesai();
        con.menuJamSelesai();
        con.updateHargaPesan();
        
    }//GEN-LAST:event_jamMulaiFieldActionPerformed

    private void jamMulaiFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jamMulaiFieldPropertyChange
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jamMulaiFieldPropertyChange

    private void jamSelesaiFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jamSelesaiFieldActionPerformed
        // TODO add your handling code here:
        con.updateHargaPesan();
    }//GEN-LAST:event_jamSelesaiFieldActionPerformed

    private void PembayaranFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PembayaranFieldActionPerformed
        // TODO add your handling code here:
        con.checkPembayaran();
    }//GEN-LAST:event_PembayaranFieldActionPerformed

    private void calenderFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calenderFieldPropertyChange
        // TODO add your handling code here:
        con.menuJamMulai();
        con.menuJamSelesai();
        con.updateHargaPesan();
    }//GEN-LAST:event_calenderFieldPropertyChange

    private void lapanganFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapanganFieldActionPerformed
        // TODO add your handling code here:
        con.menuJamMulai();
        con.menuJamSelesai();
        con.updateHargaPesan();
    }//GEN-LAST:event_lapanganFieldActionPerformed

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
            java.util.logging.Logger.getLogger(UserBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BayarLunasButton;
    private javax.swing.JComboBox<String> PembayaranField;
    private javax.swing.JButton UangMukaButton;
    private com.toedter.calendar.JDateChooser calenderField;
    private javax.swing.JLabel hargaPesanField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jamMulaiField;
    private javax.swing.JComboBox<String> jamSelesaiField;
    private javax.swing.JButton kembaliButton;
    private javax.swing.JComboBox<String> lapanganField;
    private javax.swing.JLabel uangMukaField;
    // End of variables declaration//GEN-END:variables

    public JComboBox<String> getJamMulaiField() {
        return jamMulaiField;
    }

    public void setJamMulaiField(JComboBox<String> jamMulaiField) {
        this.jamMulaiField = jamMulaiField;
    }

    public JComboBox<String> getJamSelesaiField() {
        return jamSelesaiField;
    }

    public void setJamSelesaiField(JComboBox<String> jamSelesaiField) {
        this.jamSelesaiField = jamSelesaiField;
    }

    public JDateChooser getCalendarField() {
        return calenderField;
    }

    public void setCalendarField(JDateChooser calendarField) {
        this.calenderField = calendarField;
    }

    public JDateChooser getDateChooserView() {
        return calenderField;
    }

    public void setDateChooserView(JDateChooser DateChooserView) {
        this.calenderField = DateChooserView;
    }

    public JComboBox<String> getLapanganField() {
        return lapanganField;
    }

    public void setLapanganField(JComboBox<String> LapanganListView) {
        this.lapanganField = LapanganListView;
    }

    public JLabel getHargaPesanField() {
        return hargaPesanField;
    }

    public void setHargaPesanField(JLabel hargaPesanField) {
        this.hargaPesanField = hargaPesanField;
    }

    public JLabel getUangMukaField() {
        return uangMukaField;
    }

    public void setUangMukaField(JLabel uangMukaField) {
        this.uangMukaField = uangMukaField;
    }

    public JComboBox<String> getPembayaranField() {
        return PembayaranField;
    }

    public void setPembayaranField(JComboBox<String> PembayaranField) {
        this.PembayaranField = PembayaranField;
    }

    public JButton getBayarLunasButton() {
        return BayarLunasButton;
    }

    public void setBayarLunasButton(JButton BayarLunasButton) {
        this.BayarLunasButton = BayarLunasButton;
    }

    public JButton getUangMukaButton() {
        return UangMukaButton;
    }

    public void setUangMukaButton(JButton UangMukaButton) {
        this.UangMukaButton = UangMukaButton;
    }





    
   
}