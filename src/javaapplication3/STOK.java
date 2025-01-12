
package javaapplication3;

import com.sun.security.auth.module.KeyStoreLoginModule;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class STOK extends javax.swing.JFrame {

    public STOK() {
        initComponents();
        Selectional();
    }

    Connection conn=null;
    Statement stt = null;
    ResultSet rss = null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Kapat = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Ad = new javax.swing.JTextField();
        Cins = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Miktar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Ekle = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Fiyat = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Temizle = new javax.swing.JButton();
        GÜNCELLE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablo = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        Anasayfa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Eras Light ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROKONT STOK YÖNETIMI ");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\serhat\\Pictures\\Ekran görüntüsü 2024-05-24 170938.png")); // NOI18N
        jLabel3.setText("jLabel2");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\serhat\\Pictures\\Ekran görüntüsü 2024-05-24 170938.png")); // NOI18N
        jLabel4.setText("jLabel2");

        Kapat.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Kapat.setForeground(new java.awt.Color(255, 255, 255));
        Kapat.setText("X");
        Kapat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KapatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(94, 94, 94)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Kapat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(Kapat, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        Id.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        jLabel8.setText("Birim ");

        jLabel9.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        jLabel9.setText("Malzeme adı");

        Ad.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N

        Cins.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        jLabel10.setText("Malzeme Kimligi");

        Miktar.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        jLabel11.setText("Stok\n");

        Ekle.setText("EKLE");
        Ekle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EkleMouseClicked(evt);
            }
        });
        Ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EkleActionPerformed(evt);
            }
        });

        jButton4.setText("ÇIKAR");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Fiyat.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        jLabel12.setText("Birim fiyatı");

        Temizle.setLabel("TEMİZLE");
        Temizle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TemizleMouseClicked(evt);
            }
        });

        GÜNCELLE.setText("GÜNCELLE");
        GÜNCELLE.setActionCommand("");
        GÜNCELLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GÜNCELLEMouseClicked(evt);
            }
        });

        Tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Malzeme kimliği", "Malzeme adı", "Malzeme cinsi", "Malzeme miktarı", "Malzeme fiyatı"
            }
        ));
        Tablo.setAlignmentX(1.0F);
        Tablo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        Tablo.setSelectionBackground(new java.awt.Color(0, 0, 0));
        Tablo.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tablo);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ad, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(Cins, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(145, 145, 145)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Miktar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 408, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(Fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ekle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Temizle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GÜNCELLE, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cins, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Miktar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GÜNCELLE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        Anasayfa.setText("ANA SAYFA\n");
        Anasayfa.setActionCommand("");
        Anasayfa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnasayfaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Anasayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(459, 459, 459))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(Anasayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //stok adlı veri tablosundaki verileri arayüzdeki tabloya ekleyen fonksiyon
    private void Selectional(){
        try {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/oto", "root", "S19b310?");
            stt=conn.createStatement();
            rss=stt.executeQuery("select * from stok");
            Tablo.setModel(DbUtils.resultSetToTableModel(rss));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //stok adlı veri tablosuna veri ekleyen fonksiyon
    private void EkleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EkleMouseClicked
        int result=JOptionPane.showConfirmDialog(this, "Eklenmeyi onaylıyormusunuz?");
        if(result==JOptionPane.YES_OPTION){
        try {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/oto", "root", "S19b310?");
            PreparedStatement add=conn.prepareStatement("INSERT INTO stok VALUES(?,?,?,?,?)");
           
            add.setInt(1,Integer.valueOf(Id.getText()));
            add.setString(2, Ad.getText());
            add.setString(3, Cins.getText());
            add.setInt(4,Integer.valueOf(Miktar.getText()));
            add.setInt(5,Integer.valueOf(Fiyat.getText()));
            int row=add.executeUpdate();
            
            Id.setText("");
            Ad.setText("");
            Cins.setText("");
            Miktar.setText("");
            Fiyat.setText("");
            conn.close();
            Selectional();
        }catch (SQLException e) {
         e.printStackTrace();
}
        }
    }//GEN-LAST:event_EkleMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
    }//GEN-LAST:event_jButton4ActionPerformed
//tetboxlara girilen verileri silen fonksiyon
    private void TemizleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TemizleMouseClicked
        Id.setText("");
        Ad.setText("");
        Cins.setText("");
        Miktar.setText("");
        Fiyat.setText("");
        
    }//GEN-LAST:event_TemizleMouseClicked
//sistemi kapatan fonksiyon
    private void KapatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KapatMouseClicked
        System.exit(100);
    }//GEN-LAST:event_KapatMouseClicked
//id numarası girilen verinin stok adli veri tablosundan silen fonksiyon
    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
            
        int result=JOptionPane.showConfirmDialog(this, "Stok tablosundan silinsin mi?");
        if(result==JOptionPane.YES_OPTION){
            if(Id.getText().isEmpty()){
            JOptionPane.showConfirmDialog(this, "Eksik bilgi ");
        }else{
            try {
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/oto", "root", "S19b310?");
                String id=Id.getText();
                String sorgu="delete from stok where Id= "+id;
                Statement add=conn.createStatement();
                add.executeUpdate(sorgu);
                Selectional();
                JOptionPane.showMessageDialog(this, "Başarılı bir şekilde kaldırıldı");
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        }
       
    }//GEN-LAST:event_jButton4MouseClicked
//stok veri talosundan seçilen verinin istenilen özelliğini güncelleyen fonksiyon
    private void GÜNCELLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GÜNCELLEMouseClicked
        int result=JOptionPane.showConfirmDialog(this, "Güncellemeyi onaylıyormusun");
        if(result==JOptionPane.YES_OPTION){
            if(Id.getText().isEmpty()||Ad.getText().isEmpty()||Cins.getText().isEmpty()||Miktar.getText().isEmpty()||Fiyat.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Eksik bilgi");
            }else{
            try {
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/oto", "root", "S19b310?");
                String sorgu = "UPDATE stok SET Ad='" + Ad.getText() + "', Cins='" + Cins.getText() + "', Miktar=" + Miktar.getText() + ", Fiyat=" + Fiyat.getText() + " WHERE Id=" + Id.getText();

                Statement add=conn.createStatement();
                add.executeUpdate(sorgu);
                JOptionPane.showMessageDialog(this, "Başarıyla güncellendi");
                Selectional();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        }
    }//GEN-LAST:event_GÜNCELLEMouseClicked
//seçim arayüzüne götüren fonksiyon
    private void AnasayfaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnasayfaMouseClicked
        SECIM seçimEkranı = new SECIM();
            seçimEkranı.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_AnasayfaMouseClicked

    private void EkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EkleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EkleActionPerformed
//arayüzdeki tabloda bulunan verilerden seçilenin bilgileriyle textboxları dolduran fonksiyon
    private void TabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabloMouseClicked
        DefaultTableModel model=(DefaultTableModel) Tablo.getModel();
        int index=Tablo.getSelectedRow();
        Id.setText(model.getValueAt(index, 0).toString());
        Ad.setText(model.getValueAt(index, 1).toString());
        Cins.setText(model.getValueAt(index, 2).toString());
        Miktar.setText(model.getValueAt(index, 3).toString());
        Fiyat.setText(model.getValueAt(index, 4).toString());
    }//GEN-LAST:event_TabloMouseClicked
    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(STOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(STOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(STOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(STOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new STOK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ad;
    private javax.swing.JButton Anasayfa;
    private javax.swing.JTextField Cins;
    private javax.swing.JButton Ekle;
    private javax.swing.JTextField Fiyat;
    private javax.swing.JButton GÜNCELLE;
    private javax.swing.JTextField Id;
    private javax.swing.JLabel Kapat;
    private javax.swing.JTextField Miktar;
    private javax.swing.JTable Tablo;
    private javax.swing.JButton Temizle;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
