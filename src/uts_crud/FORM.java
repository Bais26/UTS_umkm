package uts_crud;

import Config.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FORM extends javax.swing.JFrame {

    private Connection conn;
    
    public FORM() {
        initComponents();
        conn = koneksi.getConnection();
        getData();
    }
    private void getData() {
        DefaultTableModel model = (DefaultTableModel) TblData.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "select * from tabel_22090119_B";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                int no                   = rs.getInt("no");
                String nama_umkm         = rs.getString("nama_umkm");
                String bidang            = rs.getString("bidang");
                int tahun_pendirian   = rs.getInt("tahun_pendirian");
                String kategori   = rs.getString("kategori");
                
                Object[] rowData = {no,nama_umkm,bidang,tahun_pendirian,kategori};
                model.addRow(rowData);
                
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            Logger.getLogger(FORM.class.getName()).log(Level.SEVERE,null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        T_Umkm = new javax.swing.JTextField();
        T_Bidang = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        T_Pendirian = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        T_Kategori = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORM TAMBAH DATA");

        jLabel2.setText("1. NAMA UMKM");

        T_Umkm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_UmkmActionPerformed(evt);
            }
        });

        T_Bidang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kuliner", "fashion", "agrobisnis", "otomotif" }));
        T_Bidang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                T_BidangItemStateChanged(evt);
            }
        });
        T_Bidang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_BidangActionPerformed(evt);
            }
        });

        jLabel3.setText("2. BIDANG");

        T_Pendirian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_PendirianActionPerformed(evt);
            }
        });

        jLabel4.setText("3. TAHUN PENDIRIAN");

        T_Kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usaha Mikro", "Usaha Kecil", "Usaha Menengah" }));

        jLabel5.setText("4. KATEGORI");

        btnSimpan.setText("SIMPAN DATA");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        TblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "no", "nama umkm", "bidang", "tahun pendirian", "kategori"
            }
        ));
        jScrollPane1.setViewportView(TblData);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(T_Kategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(T_Umkm)
                            .addComponent(T_Bidang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(T_Pendirian)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T_Umkm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T_Bidang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T_Pendirian, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T_Kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 82, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void T_UmkmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_UmkmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_UmkmActionPerformed

    private void T_BidangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_BidangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_BidangActionPerformed

    private void T_PendirianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_PendirianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_PendirianActionPerformed

    private void T_BidangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_T_BidangItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_T_BidangItemStateChanged

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
    String nama_umkm = T_Umkm.getText();
    String bidang = T_Bidang.getSelectedItem().toString();
    String tahun_pendirian = T_Pendirian.getText();
    String kategori = T_Kategori.getSelectedItem().toString();
    
    if (nama_umkm.isEmpty() || bidang.isEmpty() || tahun_pendirian.isEmpty() || kategori.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus di isi","Peringatan!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            String sql = "INSERT INTO tabel_22090119_B(NAMA_UMKM, BIDANG, TAHUN_PENDIRIAN, KATEGORI) VALUES (?, ?, ?, ?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nama_umkm);
            st.setString(2, bidang);
            st.setString(3, tahun_pendirian);
            st.setString(4, kategori);
           
            int rowInserted = st.executeUpdate();
            if(rowInserted > 0){
                JOptionPane.showMessageDialog(this, "Data berhasil di tambahkan");
                getData();
            }
            st.close();
        } catch (Exception e) {
             Logger.getLogger(From.class.getName()).log(Level.SEVERE,null, e);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FORM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> T_Bidang;
    private javax.swing.JComboBox<String> T_Kategori;
    private javax.swing.JTextField T_Pendirian;
    private javax.swing.JTextField T_Umkm;
    private javax.swing.JTable TblData;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
}
