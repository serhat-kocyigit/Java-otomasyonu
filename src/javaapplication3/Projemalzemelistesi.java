
package javaapplication3;

import com.itextpdf.text.Image;
import java.util.ArrayList;
import java.util.List;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.NumberFormat;
import net.proteanit.sql.DbUtils;

public class Projemalzemelistesi extends javax.swing.JFrame {

    
    public Projemalzemelistesi() {
        initComponents();
        Selectional();
        
    }
    public Projemalzemelistesi(String projeıd){
        initComponents();
        prodeid.setText(projeıd);
        
        Selectional();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Kapat = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        malzemeid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        miktar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ekleme = new javax.swing.JButton();
        çıkarma = new javax.swing.JButton();
        tablostok = new javax.swing.JScrollPane();
        Tablostok = new javax.swing.JTable();
        temizleme = new javax.swing.JButton();
        kar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        güncelleme = new javax.swing.JButton();
        prodeid = new javax.swing.JTextField();
        kky = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fiyatalma = new javax.swing.JButton();
        anasayfa = new javax.swing.JButton();
        fiyatalma1 = new javax.swing.JButton();
        fiyatalma2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Eras Light ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROKONT FIYAT ALMA\n ");

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
                .addGap(42, 42, 42)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Kapat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Kapat, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        malzemeid.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        jLabel10.setText("Malzeme id");

        miktar.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        jLabel11.setText("Birim miktari");

        ekleme.setText("EKLE");
        ekleme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eklemeMouseClicked(evt);
            }
        });

        çıkarma.setText("ÇIKAR");
        çıkarma.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                çıkarmaMouseWheelMoved(evt);
            }
        });
        çıkarma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                çıkarmaMouseClicked(evt);
            }
        });
        çıkarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                çıkarmaActionPerformed(evt);
            }
        });

        Tablostok.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MALZEME ID", "MALZEME ADI", "BİRİM CİNSİ", "BİRİM MİKTARI", "BİRİM FİYATI", "KAR ORANI"
            }
        ));
        Tablostok.setRowHeight(30);
        Tablostok.setSelectionBackground(new java.awt.Color(0, 0, 0));
        Tablostok.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Tablostok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablostokMouseClicked(evt);
            }
        });
        tablostok.setViewportView(Tablostok);

        temizleme.setText("CLEAR");
        temizleme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                temizlemeMouseClicked(evt);
            }
        });

        kar.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        jLabel13.setText("Kar oranı");

        güncelleme.setText("GÜNCELLE");
        güncelleme.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                güncellemeMouseWheelMoved(evt);
            }
        });
        güncelleme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                güncellemeMouseClicked(evt);
            }
        });
        güncelleme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                güncellemeActionPerformed(evt);
            }
        });

        prodeid.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N

        kky.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        kky.setText("proje id");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prodeid, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kky, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(malzemeid, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(miktar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(kar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ekleme, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(temizleme, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(çıkarma, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(güncelleme, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tablostok, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kky, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(malzemeid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(prodeid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(kar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(miktar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ekleme, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(çıkarma, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 21, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(temizleme, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(güncelleme, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(tablostok, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        fiyatalma.setText("FIYAT ALMA");
        fiyatalma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fiyatalmaMouseClicked(evt);
            }
        });

        anasayfa.setText("ANA SAYFA");
        anasayfa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anasayfaMouseClicked(evt);
            }
        });

        fiyatalma1.setText("Malzeme sorgu\n");
        fiyatalma1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fiyatalma1MouseClicked(evt);
            }
        });

        fiyatalma2.setText("Tablo temizleme\n");
        fiyatalma2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fiyatalma2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(fiyatalma, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(fiyatalma1)
                .addGap(82, 82, 82)
                .addComponent(anasayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(fiyatalma2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fiyatalma, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anasayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiyatalma1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiyatalma2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   private static final String IMAGE_DIRECTORY = "C:\\Users\\serhat\\Documents\\NetBeansProjects\\JavaApplication3\\proje ressimleri\\";

    private void KapatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KapatMouseClicked
         System.exit(100);
    }//GEN-LAST:event_KapatMouseClicked
//kimlik_id veri tablosuna stok veri tablosundan veri ekleyen fonksiyon
    private void eklemeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eklemeMouseClicked
         String idText = prodeid.getText();
        String karOraniText = kar.getText();
int result=JOptionPane.showConfirmDialog(this, "Eklenmeyi onaylıyormusunuz?");
        if(result==JOptionPane.YES_OPTION){
            if (idText.isEmpty() || karOraniText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lütfen ID ve Kar Oranı girin.", "Hata", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/oto?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "S19b310?");
            int id = Integer.parseInt(malzemeid.getText());
            Statement işlem = conn.createStatement();
            ResultSet rs = işlem.executeQuery("SELECT * FROM stok where Id="+id);
    
    
    PreparedStatement add = conn.prepareStatement("INSERT INTO oto.kimlik_"+prodeid.getText()+ " (Id, Ad, Cins, Miktar,Kar, Fiyat) VALUES (?, ?, ?, ?, ?,?)");
    
     while (rs.next()) {
        double karOrani = Double.parseDouble(karOraniText) / 100;
        int eskiId = rs.getInt("Id");
        String eskiAd = rs.getString("Ad");
        String eskiCins = rs.getString("Cins");
        
        double eskiFiyat = rs.getDouble("Fiyat");
        eskiFiyat=eskiFiyat+(eskiFiyat*karOrani);
        // Yeni tabloya verileri ekle
        add.setInt(1, eskiId);
        add.setString(2, eskiAd);
        add.setString(3, eskiCins);
        add.setInt(4, Integer.valueOf(miktar.getText()));
        add.setDouble(6, eskiFiyat);
        add.setInt(5, Integer.valueOf(kar.getText()));
        add.executeUpdate();
    }
    
    
            malzemeid.setText("");
            miktar.setText("");
            kar.setText("");
        
            conn.close();
            Selectional();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_eklemeMouseClicked

    private void çıkarmaMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_çıkarmaMouseWheelMoved

    }//GEN-LAST:event_çıkarmaMouseWheelMoved
//kilmil_id veri tablosunda id numarası şeçilen veriyi silen fonksiyon
    private void çıkarmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_çıkarmaMouseClicked
        int result=JOptionPane.showConfirmDialog(this, "malzeme listesinden silinsin mi?");
        if(result==JOptionPane.YES_OPTION){
            if(malzemeid.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Eksik bilgi ");
            }else{
            try {
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/oto", "root", "S19b310?");
                String id=malzemeid.getText();
                String sorgu="delete from kimlik_"+prodeid.getText()+" where Id= "+id;
                Statement add=conn.createStatement();
                add.executeUpdate(sorgu);
                Selectional();
                JOptionPane.showMessageDialog(this, "Başarılı bir şekilde kaldırıldı");
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        }
    }//GEN-LAST:event_çıkarmaMouseClicked

    private void çıkarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_çıkarmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_çıkarmaActionPerformed
//arayüzde bulunan tablodaki verilerden seçilen verinin bilgilerini textboxlara yazan fonksiyon
    private void TablostokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablostokMouseClicked
        DefaultTableModel model=(DefaultTableModel) Tablostok.getModel();
        int index=Tablostok.getSelectedRow();
        malzemeid.setText(model.getValueAt(index, 0).toString());
        miktar.setText(model.getValueAt(index, 3).toString());
        kar.setText(model.getValueAt(index, 4).toString());

    }//GEN-LAST:event_TablostokMouseClicked
//textboxlara girilen verileri silen fonksiyon
    private void temizlemeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temizlemeMouseClicked
        malzemeid.setText("");
        miktar.setText("");
        kar.setText("");
    }//GEN-LAST:event_temizlemeMouseClicked

    private void güncellemeMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_güncellemeMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_güncellemeMouseWheelMoved
//kimlik_id veri tablosundaki seçilen verinin değiştirilen özelliklerini güncelleyen fonksiyon
    private void güncellemeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_güncellemeMouseClicked
        int result=JOptionPane.showConfirmDialog(this, "güncelleme işlemini onaylıyormusun");
        if(result==JOptionPane.YES_OPTION){
            if(malzemeid.getText().isEmpty()||miktar.getText().isEmpty()||kar.getText().isEmpty()||prodeid.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Eksik bilgi");
        }else{
            try {
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/oto", "root", "S19b310?");
                int id = Integer.parseInt(malzemeid.getText());
                String sorgu = "UPDATE kimlik_"+prodeid.getText()+" SET Miktar='" + miktar.getText() + "', kar='" + kar.getText() + "' WHERE Id=" + malzemeid.getText();
                Statement add=conn.createStatement();
                add.executeUpdate(sorgu);
                Statement işlem = conn.createStatement();
                ResultSet rs = işlem.executeQuery("SELECT * FROM stok where Id="+id);
                String selectQuery = "SELECT * FROM kimlik_"+prodeid.getText()+" WHERE Id=?";
                PreparedStatement selectStatement = conn.prepareStatement(selectQuery);
                selectStatement.setInt(1, id);
       
        if (rs.next()) {
            double eskiFiyat = rs.getDouble("Fiyat");
            //double karorani = rs.getInt("kar") / 100.0;
             String text = kar.getText();
             double karorani = Double.parseDouble(text)/100;
            double yeniFiyat = eskiFiyat + (eskiFiyat * karorani);
            String updatePriceQuery = "UPDATE kimlik_"+prodeid.getText()+" SET Fiyat=? WHERE Id=?";
            PreparedStatement updatePriceStatement = conn.prepareStatement(updatePriceQuery);
            updatePriceStatement.setDouble(1, yeniFiyat);
            updatePriceStatement.setInt(2, id);
            updatePriceStatement.executeUpdate();
        }
                
                JOptionPane.showMessageDialog(this, "Başarıyla güncellendi");
                Selectional();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        }
    }//GEN-LAST:event_güncellemeMouseClicked

    private void güncellemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_güncellemeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_güncellemeActionPerformed
//arayüzde id numarası girilen projenin malzeme listesiyle beraber proje fotografını pdf yapan tüm fonksiyonların çaliştırıldığı fonksiyon
    private void fiyatalmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiyatalmaMouseClicked
          String projectId = prodeid.getText(); // TextField'den proje ID'sini al
          int result=JOptionPane.showConfirmDialog(this, "Pdf oluşturma işlemini onaylıyormusun");
    if(result==JOptionPane.YES_OPTION){
        try {
        // Veri tabanından proje bilgilerini al
        String[] projectDetails = getProjectDetails(projectId);
        // Veri tabanından malzeme bilgilerini al
        String[][] materials = getMaterialDetails(projectId);

        if (projectDetails != null) {
            createPDF(projectId, projectDetails, materials);
            JOptionPane.showMessageDialog(null, "PDF başarıyla oluşturuldu!");
        } else {
            JOptionPane.showMessageDialog(null, "Proje ID bulunamadı.");
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Hata: " + ex.getMessage());
    }
    }
                
                
    }//GEN-LAST:event_fiyatalmaMouseClicked
//seçim ekranına götüren fonksiyon
    private void anasayfaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anasayfaMouseClicked
        SECIM seçimEkranı = new SECIM();
        seçimEkranı.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_anasayfaMouseClicked
//malzeme sorgu ekranına götüren fonksiyon
    private void fiyatalma1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiyatalma1MouseClicked
        Stokmalzemesorgu seçimEkranı = new Stokmalzemesorgu();
        seçimEkranı.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_fiyatalma1MouseClicked
//kimlik_id adlı veri tablosundaki tüm verileri silen fonksiyon
    private void fiyatalma2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiyatalma2MouseClicked
        int result=JOptionPane.showConfirmDialog(this, "Tabloyu silme işlemini gerçekleştirmek istiyormusunuz");
        if(result==JOptionPane.YES_OPTION){
            try {
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/oto", "root", "S19b310?");
                    Statement stmt = conn.createStatement();
                    String sql = "DELETE FROM kimlik_"+prodeid.getText(); // Veritabanındaki tüm verileri silen SQL sorgusu
                    stmt.executeUpdate(sql);
                    stmt.close();
                    conn.close();
                    Selectional();
                    JOptionPane.showMessageDialog(this, "İşsleminiz başarıyla gerçekleştirilmiştir");
                    
                    
                    
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Veritabanı sorgusunda bir sorunla karşılaşıldı");
                }
        }
    }//GEN-LAST:event_fiyatalma2MouseClicked
    //kimlik_id adlı veri tablosundaki tüm verileri arayüzdeki tabloya ekleyen fonksiyon
    private void Selectional(){
        try {
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/oto", "root", "S19b310?");
            Statement stt=conn.createStatement();
            ResultSet rss=stt.executeQuery("select * from oto.kimlik_"+prodeid.getText());
            Tablostok.setModel(DbUtils.resultSetToTableModel(rss));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 //pdf oluşturan fonksiyon   
private void createPDF(String projectId, String[] projectDetails, String[][] materials) throws FileNotFoundException, DocumentException, SQLException {
    
    Document document = new Document();
    String pdfPath = "Proje_" + projectId + ".pdf";
    PdfWriter.getInstance(document, new FileOutputStream("Proje_" + projectId + ".pdf"));

    document.open();
    document.add(new Paragraph("                                                 Prokont yapi ve mimarlik ltd.sti"));
    document.add(new Paragraph(" "));
    document.add(new Paragraph("Bu bir tekliftir  "));
    document.add(new Paragraph(" "));
    document.add(new Paragraph("Proje ID: " + projectId));
    document.add(new Paragraph(" "));
    document.add(new Paragraph("Proje Adi: " + projectDetails[1]));
    document.add(new Paragraph(" "));
    document.add(new Paragraph("Projenin Yapılacagi Sirket: " + projectDetails[3]));
    document.add(new Paragraph(" "));
    document.add(new Paragraph(" "));
    document.add(new Paragraph("Proje resmi "));
    document.add(new Paragraph(" "));
    //pdf dosyasına rasim ekleyen kod parçacığı
    try {
        String imagePath = IMAGE_DIRECTORY + "projeresimleri" + projectId + ".png";
        Image img = Image.getInstance(imagePath);
        img.scaleToFit(500, 500); // İsteğe bağlı: Resmi ölçeklendirin
        document.add(img);
    } catch (IOException e) {
        e.printStackTrace();
    }
    document.add(new Paragraph(" "));
    // Malzeme Tablosu
    document.add(new Paragraph("Proje Malzemeleri:"));
    document.add(new Paragraph(" "));
    
    PdfPTable table = new PdfPTable(5);
    table.setWidthPercentage(100);
    table.addCell("Malzeme ID");
    table.addCell("Malzeme adı");
    table.addCell("Birim cinsi");
    table.addCell("Birim miktarı");
    
    table.addCell("Birim fiyatı");
    
    
    for (String[] material : materials) {
        for (String data : material) {
            table.addCell(data);
            
            
        }
    }

    document.add(table);
    double totalFiyat = getTotalPrice();
    document.add(new Paragraph(" "));
    document.add(new Paragraph("Toplam Fiyat: " + String.format("%.2f", totalFiyat)));
    document.close();
     if (Desktop.isDesktopSupported()) {
        try {
            File pdfFile = new File(pdfPath);
            Desktop.getDesktop().open(pdfFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
//kimlik_id veri tablosundaki tüm verileri pdfteki tabloya eklemek için oluşturulan fonksiyon
private String[][] getMaterialDetails(String projectId) throws SQLException {
    List<String[]> materials = new ArrayList<>();
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/oto", "root", "S19b310?");
        String sql = "SELECT * FROM kimlik_"+projectId;
        pstmt = conn.prepareStatement(sql);
        
        rs = pstmt.executeQuery();

        while (rs.next()) {
            materials.add(new String[]{
                    rs.getString("Id"),
                    rs.getString("Ad"),
                    rs.getString("Cins"),
                    rs.getString("Miktar"),
                    
                    rs.getString("Fiyat")
            });
        }
    } finally {
        if (rs != null) rs.close();
        if (pstmt != null) pstmt.close();
        if (conn != null) conn.close();
    }
    return materials.toArray(new String[0][]);
}
//pdf teki proje bilgilerini proje adlı veri tablosundan getiren fonksiyon
private String[] getProjectDetails(String projectId) throws SQLException {
    String[] projectDetails = null;
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/oto", "root", "S19b310?");
        String sql = "SELECT * FROM proje WHERE ıd = ?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, projectId);
        rs = pstmt.executeQuery();

        if (rs.next()) {
            projectDetails = new String[]{
                    rs.getString("ıd"),
                    rs.getString("ad"),
                    rs.getString("yol"),
                    rs.getString("şirket")
            };
        }
    } catch(Exception e){
        e.printStackTrace();
    }finally {
        if (rs != null) rs.close();
        if (pstmt != null) pstmt.close();
        if (conn != null) conn.close();
    }
    return projectDetails;
}
//kimlik_id veri tablosundaki tüm verilerin birim miktari ve birim fiyatlarını çarpıp tüm hepsini toplayan fonksiyon
private double getTotalPrice() throws SQLException {
    double totalPrice = 0;
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/oto", "root", "S19b310?");
        String sql = "SELECT SUM(Miktar * Fiyat) AS ToplamFiyat FROM kimlik_"+prodeid.getText();
        pstmt = conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        if (rs.next()) {
            totalPrice = rs.getDouble("ToplamFiyat");
        }
    } finally {
        if (rs != null) rs.close();
        if (pstmt != null) pstmt.close();
        if (conn != null) conn.close();
    }
    return totalPrice;
}



    
    public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Projemalzemelistesi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Kapat;
    private javax.swing.JTable Tablostok;
    private javax.swing.JButton anasayfa;
    private javax.swing.JButton ekleme;
    private javax.swing.JButton fiyatalma;
    private javax.swing.JButton fiyatalma1;
    private javax.swing.JButton fiyatalma2;
    private javax.swing.JButton güncelleme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField kar;
    private javax.swing.JLabel kky;
    private javax.swing.JTextField malzemeid;
    private javax.swing.JTextField miktar;
    private javax.swing.JTextField prodeid;
    private javax.swing.JScrollPane tablostok;
    private javax.swing.JButton temizleme;
    private javax.swing.JButton çıkarma;
    // End of variables declaration//GEN-END:variables

}
