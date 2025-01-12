
package javaapplication3;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Stokmalzemesorgu extends javax.swing.JFrame {

   
    public Stokmalzemesorgu() {
        initComponents();
        Selectional();
    }
    

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Kapat = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Anasayfa3 = new javax.swing.JButton();
        Anasayfa4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        malzemeadı = new javax.swing.JTextField();
        sorgu = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Temizle = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Eras Light ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROKONT MALZEME BİLGİ ALMA");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 338, Short.MAX_VALUE)
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

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        Anasayfa3.setText("STOK SAYFA");
        Anasayfa3.setActionCommand("");
        Anasayfa3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Anasayfa3MouseClicked(evt);
            }
        });

        Anasayfa4.setText("PROJE MALZEMELERİ");
        Anasayfa4.setActionCommand("");
        Anasayfa4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Anasayfa4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(438, 438, 438)
                .addComponent(Anasayfa3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(Anasayfa4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Anasayfa3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anasayfa4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        jLabel9.setFont(new java.awt.Font("Eras Light ITC", 1, 36)); // NOI18N
        jLabel9.setText("Malzeme adı");

        malzemeadı.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        malzemeadı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                malzemeadıActionPerformed(evt);
            }
        });

        sorgu.setText("EKLE");
        sorgu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sorguMouseClicked(evt);
            }
        });
        sorgu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sorguActionPerformed(evt);
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

        Temizle.setLabel("TEMİZLE");
        Temizle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TemizleMouseClicked(evt);
            }
        });

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "İd", "malzeme adı", "malzeme cinsi", "malzeme miktarı", "malzeme fiyatı"
            }
        ));
        tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabloMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablo);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(malzemeadı, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sorgu, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(62, 62, 62))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sorgu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(malzemeadı, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//arayüzü kapatan fonksiyon
    private void KapatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KapatMouseClicked
        System.exit(100);
    }//GEN-LAST:event_KapatMouseClicked
//fiyat alma ara yüzüne giden fonksiyon
    private void Anasayfa3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Anasayfa3MouseClicked
        FIYATALMA seçimEkranı = new FIYATALMA();
        seçimEkranı.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Anasayfa3MouseClicked

    private void sorguMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sorguMouseClicked
          
           
    }//GEN-LAST:event_sorguMouseClicked
//adı girilen verilee
    
    
    /*ad textoxsuna girilen değere göre stok veri tablosundaki verileri getiren ve sonradan başka ad araştırırken
    sorgu veri tablosundaki tüm verileri silen ve yeni isime göre yeni veri getiren fonksiyon */
    private void sorguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sorguActionPerformed
        String ad = malzemeadı.getText();
                if (!ad.isEmpty()) {
                    Connection conn1 = null;
                    Connection conn2 = null;
                    try {
                        // İlk veritabanına bağlan
                        conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/oto", "root", "S19b310?");
                        String sql1 = "SELECT * FROM stok WHERE Ad LIKE ?";
                        PreparedStatement pstmt1 = conn1.prepareStatement(sql1);
                        pstmt1.setString(1, "%" + ad + "%");
                        ResultSet rs = pstmt1.executeQuery();

                        // İkinci veritabanına bağlan
                        conn2 =DriverManager.getConnection("jdbc:mysql://localhost:3306/oto", "root", "S19b310?");
                        String deleteSql = "DELETE FROM sorgu";
                        PreparedStatement deleteStmt = conn2.prepareStatement(deleteSql);
                        deleteStmt.executeUpdate();
                        deleteStmt.close();
                        String sql2 = "INSERT INTO sorgu (Id,Ad,Cins,Miktar,Fiyat) VALUES (?, ?, ?,?,?)";
                        PreparedStatement pstmt2 = conn2.prepareStatement(sql2);

                        

                        
                        while (rs.next()) {
                            int id = rs.getInt("Id");
                            String urunAdi = rs.getString("Ad");
                            String cins=rs.getString("Cins");
                            int miktar=rs.getInt("Miktar");
                            double fiyat = rs.getDouble("Fiyat");

                            
                            pstmt2.setInt(1, id);
                            pstmt2.setString(2, urunAdi);
                            pstmt2.setString(3, cins);
                            pstmt2.setInt(4, miktar);
                            pstmt2.setDouble(5, fiyat);
                            pstmt2.executeUpdate();
                            
                            
                            
                            
                        }

                        rs.close();
                        pstmt1.close();
                        pstmt2.close();
                        conn1.close();
                        conn2.close();
                        
                        Selectional();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(this,"Veritabanı hatası: " + ex.getMessage());
                    } finally {
                        try {
                            if (conn1 != null) conn1.close();
                            if (conn2 != null) conn2.close();
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Lütfen bir ad girin.");
                }
            
    }//GEN-LAST:event_sorguActionPerformed
//sorgu adlı veri tablosundaki tüm verileri silen fonksiyon
    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        int result=JOptionPane.showConfirmDialog(this, "Silme işlemini onaylıyormusun");
        if(result==JOptionPane.YES_OPTION){
            try {
            Connection conn2 =DriverManager.getConnection("jdbc:mysql://localhost:3306/oto", "root", "S19b310?");
            String deleteSql = "DELETE FROM sorgu";
            PreparedStatement deleteStmt = conn2.prepareStatement(deleteSql);
            deleteStmt.executeUpdate();
            deleteStmt.close();
            conn2.close();
            Selectional();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        }

    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed
//arayüzdeki d adlı textboxsun içine yazılanı silen fonksiyon
    private void TemizleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TemizleMouseClicked
        
        malzemeadı.setText("");
       

    }//GEN-LAST:event_TemizleMouseClicked

    private void malzemeadıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_malzemeadıActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_malzemeadıActionPerformed

    private void tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabloMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabloMouseClicked
//proje malzeme listesi arayüzüne giden fonksiyon
    private void Anasayfa4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Anasayfa4MouseClicked
        Projemalzemelistesi seçimEkranı = new Projemalzemelistesi();
        seçimEkranı.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Anasayfa4MouseClicked
//sorgu adli veri tablosundaki verileri arayüzdeki tabloya ekleyen fonksiyon
    private void Selectional(){
        try {
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/oto", "root", "S19b310?");
            Statement stt=conn.createStatement();
            ResultSet rss=stt.executeQuery("select * from sorgu");
            tablo.setModel(DbUtils.resultSetToTableModel(rss));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
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
            java.util.logging.Logger.getLogger(Stokmalzemesorgu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stokmalzemesorgu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stokmalzemesorgu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stokmalzemesorgu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stokmalzemesorgu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anasayfa3;
    private javax.swing.JButton Anasayfa4;
    private javax.swing.JLabel Kapat;
    private javax.swing.JButton Temizle;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField malzemeadı;
    private javax.swing.JButton sorgu;
    private javax.swing.JTable tablo;
    // End of variables declaration//GEN-END:variables
}
