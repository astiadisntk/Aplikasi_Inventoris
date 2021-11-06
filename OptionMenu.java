/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplikasi;

import javax.swing.JOptionPane;

/**
 *
 * @author Asti
 */
public class OptionMenu extends javax.swing.JInternalFrame {

    /**
     * Creates new form OptionMenu
     */
    public OptionMenu() {
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

        desktopPanes = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        databarang = new javax.swing.JMenuItem();
        datapegawai = new javax.swing.JMenuItem();
        datalokasi = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        permintaanbarang = new javax.swing.JMenuItem();
        pembelianbarang = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        lapinventoriskantor = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setTitle("MENU UTAMA");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APLIKASI PENGOLAHAN DATA INVENTARIS  KANTOR");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PADA PT PUPUK SRIWIDJAJA LAMPUNG");

        desktopPanes.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPanes.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPanesLayout = new javax.swing.GroupLayout(desktopPanes);
        desktopPanes.setLayout(desktopPanesLayout);
        desktopPanesLayout.setHorizontalGroup(
            desktopPanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPanesLayout.createSequentialGroup()
                .addGroup(desktopPanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopPanesLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1))
                    .addGroup(desktopPanesLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel2)))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        desktopPanesLayout.setVerticalGroup(
            desktopPanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPanesLayout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addContainerGap(532, Short.MAX_VALUE))
        );

        jMenu1.setText("MASTER");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        databarang.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        databarang.setText("Data Barang");
        databarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                databarangActionPerformed(evt);
            }
        });
        jMenu1.add(databarang);

        datapegawai.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        datapegawai.setText("Data Pegawai");
        datapegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datapegawaiActionPerformed(evt);
            }
        });
        jMenu1.add(datapegawai);

        datalokasi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        datalokasi.setText("Data Lokasi");
        datalokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datalokasiActionPerformed(evt);
            }
        });
        jMenu1.add(datalokasi);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("TRANSAKSI");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        permintaanbarang.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        permintaanbarang.setText("Inventaris Masuk");
        permintaanbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permintaanbarangActionPerformed(evt);
            }
        });
        jMenu2.add(permintaanbarang);

        pembelianbarang.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pembelianbarang.setText("Inventaris Keluar");
        pembelianbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pembelianbarangActionPerformed(evt);
            }
        });
        jMenu2.add(pembelianbarang);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("LAPORAN");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        lapinventoriskantor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lapinventoriskantor.setText("Laporan Inventaris Masuk");
        lapinventoriskantor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapinventoriskantorActionPerformed(evt);
            }
        });
        jMenu3.add(lapinventoriskantor);

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuItem1.setText("Laporan Inventaris Keluar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("EXIT");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPanes)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPanes)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void databarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_databarangActionPerformed
        desktopPanes.removeAll();
        DataBarang dataBarang = new DataBarang();
        dataBarang.setVisible(true);
        desktopPanes.add(dataBarang);
    }//GEN-LAST:event_databarangActionPerformed

    private void datapegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datapegawaiActionPerformed
        desktopPanes.removeAll();
        DataPegawai dataPegawai = new DataPegawai();
        dataPegawai.setVisible(true);
        desktopPanes.add(dataPegawai);
    }//GEN-LAST:event_datapegawaiActionPerformed

    private void datalokasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datalokasiActionPerformed
        desktopPanes.removeAll();
        DataLokasi dataLokasi = new DataLokasi();
        dataLokasi.setVisible(true);
        desktopPanes.add(dataLokasi);
    }//GEN-LAST:event_datalokasiActionPerformed

    private void permintaanbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permintaanbarangActionPerformed
        desktopPanes.removeAll();
        InventarisMasuk inventarisMasuk = new InventarisMasuk();
        inventarisMasuk.setVisible(true);
        desktopPanes.add(inventarisMasuk);
    }//GEN-LAST:event_permintaanbarangActionPerformed

    private void pembelianbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pembelianbarangActionPerformed
        desktopPanes.removeAll();
        inventarisKeluar inventarisKeluar = new inventarisKeluar();
        inventarisKeluar.setVisible(true);
        desktopPanes.add(inventarisKeluar);
    }//GEN-LAST:event_pembelianbarangActionPerformed

    private void lapinventoriskantorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapinventoriskantorActionPerformed
        desktopPanes.removeAll();
        LaporanInventarisMasuk laporanInventarisMasuk = new LaporanInventarisMasuk();
        laporanInventarisMasuk.setVisible(true);
        desktopPanes.add(laporanInventarisMasuk);
    }//GEN-LAST:event_lapinventoriskantorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        desktopPanes.removeAll();
        LaporanInventarisKeluar laporanInventarisKeluar = new LaporanInventarisKeluar();
        laporanInventarisKeluar.setVisible(true);
        desktopPanes.add(laporanInventarisKeluar);
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem databarang;
    private javax.swing.JMenuItem datalokasi;
    private javax.swing.JMenuItem datapegawai;
    private javax.swing.JDesktopPane desktopPanes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem lapinventoriskantor;
    private javax.swing.JMenuItem pembelianbarang;
    private javax.swing.JMenuItem permintaanbarang;
    // End of variables declaration//GEN-END:variables
}