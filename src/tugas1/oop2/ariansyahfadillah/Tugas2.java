/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1.oop2.ariansyahfadillah;

/**
 *
 * @author User
 */
public class Tugas2 extends javax.swing.JFrame {

    /**
     * Creates new form Tugas2
     */
    public Tugas2() {
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

        bAngkatan = new javax.swing.ButtonGroup();
        jBackground = new javax.swing.JPanel();
        jLabelPenentuanNpm = new javax.swing.JLabel();
        jGaris = new javax.swing.JPanel();
        jKotak1 = new javax.swing.JPanel();
        jJurusan = new javax.swing.JLabel();
        jAngkatan = new javax.swing.JLabel();
        jNoUrut = new javax.swing.JLabel();
        jComboJurusan = new javax.swing.JComboBox<>();
        j2017 = new javax.swing.JRadioButton();
        j2018 = new javax.swing.JRadioButton();
        j2019 = new javax.swing.JRadioButton();
        jTextNoUrut = new javax.swing.JTextField();
        jHasil = new javax.swing.JButton();
        jKotak2 = new javax.swing.JPanel();
        jHasilnya = new javax.swing.JLabel();
        jTextHasilnya = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        jBackground.setBackground(new java.awt.Color(51, 51, 255));

        jLabelPenentuanNpm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPenentuanNpm.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPenentuanNpm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPenentuanNpm.setText("PENENTUAN NPM");
        jLabelPenentuanNpm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jGaris.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jGarisLayout = new javax.swing.GroupLayout(jGaris);
        jGaris.setLayout(jGarisLayout);
        jGarisLayout.setHorizontalGroup(
            jGarisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jGarisLayout.setVerticalGroup(
            jGarisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jKotak1.setBackground(new java.awt.Color(51, 51, 255));
        jKotak1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jJurusan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jJurusan.setForeground(new java.awt.Color(255, 255, 255));
        jJurusan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jJurusan.setText("Jurusan    :");
        jJurusan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jAngkatan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jAngkatan.setForeground(new java.awt.Color(255, 255, 255));
        jAngkatan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jAngkatan.setText("Angkatan :");
        jAngkatan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jNoUrut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jNoUrut.setForeground(new java.awt.Color(255, 255, 255));
        jNoUrut.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jNoUrut.setText("No. Urut   :");
        jNoUrut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jComboJurusan.setBackground(new java.awt.Color(51, 51, 255));
        jComboJurusan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika", "Teknik Industri", "Desain Komunikasi Visual" }));
        jComboJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboJurusanActionPerformed(evt);
            }
        });

        j2017.setBackground(new java.awt.Color(51, 51, 255));
        bAngkatan.add(j2017);
        j2017.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        j2017.setForeground(new java.awt.Color(255, 255, 255));
        j2017.setText("2017");
        j2017.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2017ActionPerformed(evt);
            }
        });

        j2018.setBackground(new java.awt.Color(51, 51, 255));
        bAngkatan.add(j2018);
        j2018.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        j2018.setForeground(new java.awt.Color(255, 255, 255));
        j2018.setText("2018");
        j2018.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2018ActionPerformed(evt);
            }
        });

        j2019.setBackground(new java.awt.Color(51, 51, 255));
        bAngkatan.add(j2019);
        j2019.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        j2019.setForeground(new java.awt.Color(255, 255, 255));
        j2019.setText("2019");
        j2019.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2019ActionPerformed(evt);
            }
        });

        jTextNoUrut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextNoUrut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNoUrutActionPerformed(evt);
            }
        });

        jHasil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jHasil.setText("Hasil");
        jHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHasilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jKotak1Layout = new javax.swing.GroupLayout(jKotak1);
        jKotak1.setLayout(jKotak1Layout);
        jKotak1Layout.setHorizontalGroup(
            jKotak1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jKotak1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jKotak1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jKotak1Layout.createSequentialGroup()
                        .addComponent(jJurusan)
                        .addGap(18, 18, 18)
                        .addComponent(jComboJurusan, 0, 186, Short.MAX_VALUE))
                    .addGroup(jKotak1Layout.createSequentialGroup()
                        .addGroup(jKotak1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jKotak1Layout.createSequentialGroup()
                                .addComponent(jAngkatan)
                                .addGap(18, 18, 18)
                                .addGroup(jKotak1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(j2018)
                                    .addComponent(j2017)
                                    .addComponent(j2019)))
                            .addGroup(jKotak1Layout.createSequentialGroup()
                                .addComponent(jNoUrut)
                                .addGap(18, 18, 18)
                                .addComponent(jTextNoUrut, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jKotak1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jKotak1Layout.setVerticalGroup(
            jKotak1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jKotak1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jKotak1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jKotak1Layout.createSequentialGroup()
                        .addGroup(jKotak1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jJurusan)
                            .addComponent(jComboJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(jAngkatan))
                    .addComponent(j2017))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j2018)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j2019)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jKotak1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNoUrut)
                    .addComponent(jTextNoUrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jHasil)
                .addGap(52, 52, 52))
        );

        jKotak2.setBackground(new java.awt.Color(51, 51, 255));
        jKotak2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jHasilnya.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jHasilnya.setForeground(new java.awt.Color(255, 255, 255));
        jHasilnya.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jHasilnya.setText("NPM anda adalah :");
        jHasilnya.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTextHasilnya.setEditable(false);
        jTextHasilnya.setBackground(new java.awt.Color(51, 51, 255));
        jTextHasilnya.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextHasilnya.setForeground(new java.awt.Color(255, 255, 255));
        jTextHasilnya.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextHasilnya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHasilnyaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jKotak2Layout = new javax.swing.GroupLayout(jKotak2);
        jKotak2.setLayout(jKotak2Layout);
        jKotak2Layout.setHorizontalGroup(
            jKotak2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jKotak2Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(jKotak2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jKotak2Layout.createSequentialGroup()
                        .addComponent(jHasilnya)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jKotak2Layout.createSequentialGroup()
                        .addComponent(jTextHasilnya, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))))
        );
        jKotak2Layout.setVerticalGroup(
            jKotak2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jKotak2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jHasilnya)
                .addGap(30, 30, 30)
                .addComponent(jTextHasilnya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jBackgroundLayout = new javax.swing.GroupLayout(jBackground);
        jBackground.setLayout(jBackgroundLayout);
        jBackgroundLayout.setHorizontalGroup(
            jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBackgroundLayout.createSequentialGroup()
                .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jGaris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jKotak1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jKotak2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBackgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelPenentuanNpm)
                .addGap(262, 262, 262))
        );
        jBackgroundLayout.setVerticalGroup(
            jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBackgroundLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelPenentuanNpm)
                .addGap(26, 26, 26)
                .addComponent(jGaris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jKotak1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jKotak2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j2017ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2017ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j2017ActionPerformed

    private void j2018ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2018ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j2018ActionPerformed

    private void j2019ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2019ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j2019ActionPerformed

    private void jComboJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboJurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboJurusanActionPerformed

    private void jTextNoUrutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNoUrutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNoUrutActionPerformed

    private void jTextHasilnyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHasilnyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHasilnyaActionPerformed

    private void jHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHasilActionPerformed
        // TODO add your handling code here:
        String a = null;
        String b = null;
        
        if (jComboJurusan.getSelectedItem() == "Teknik Informatika"){
            b = "111";
        } else if (jComboJurusan.getSelectedItem() == "Teknik Industri"){
            b = "112";
        } else if (jComboJurusan.getSelectedItem() == "Desain Komunikasi Visual"){
            b ="113";
        }
        
        if (j2017.isSelected()){
            a = "17";
        } else if (j2018.isSelected()){
            a = "18";
        } else if (j2019.isSelected()){
            a = "19";
        }
        
        jTextHasilnya.setText(a+b+jTextNoUrut.getText());
    }//GEN-LAST:event_jHasilActionPerformed

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
            java.util.logging.Logger.getLogger(Tugas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tugas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tugas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tugas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tugas2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bAngkatan;
    private javax.swing.JRadioButton j2017;
    private javax.swing.JRadioButton j2018;
    private javax.swing.JRadioButton j2019;
    private javax.swing.JLabel jAngkatan;
    private javax.swing.JPanel jBackground;
    private javax.swing.JComboBox<String> jComboJurusan;
    private javax.swing.JPanel jGaris;
    private javax.swing.JButton jHasil;
    private javax.swing.JLabel jHasilnya;
    private javax.swing.JLabel jJurusan;
    private javax.swing.JPanel jKotak1;
    private javax.swing.JPanel jKotak2;
    private javax.swing.JLabel jLabelPenentuanNpm;
    private javax.swing.JLabel jNoUrut;
    private javax.swing.JTextField jTextHasilnya;
    private javax.swing.JTextField jTextNoUrut;
    // End of variables declaration//GEN-END:variables
}
