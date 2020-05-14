package datacorona;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class tambah extends javax.swing.JFrame {
    koneksi kon = new koneksi();
    String sql,daerah,odp,pdp,positif,status;
    
    public tambah() {
        initComponents();
        btEd.setEnabled(false);
        btEd.setVisible(false);
    }
    public void tampil(){
      DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Daerah");
        tbl.addColumn("ODP");
        tbl.addColumn("PDP");
        tbl.addColumn("Positif");
        tbl.addColumn("Status");
        tbl1.setModel(tbl);
        try{
            String sql="SELECT * FROM daerah";
            java.sql.Connection conn=(Connection)kon.configDB();
            java.sql.Statement s = conn.createStatement();
            java.sql.ResultSet r = s.executeQuery(sql);
            while(r.next()){
                tbl.addRow(new Object[]{
                r.getString("kecamatan"),
                r.getString("odp"),
                r.getString("pdp"),
                r.getString("positif"),
                r.getString("status"),
                });
            }
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }  
    }
    public void clear(){
        txtKec.setText("");
        txtOdp.setText("");
        txtPdp.setText("");
        txtPstp.setText("");
    }
    public void showSp(){
        btSp.setEnabled(true);
        btSp.setVisible(true);
        btEd.setEnabled(false);
        btEd.setVisible(false);
    }
    public void hideSp(){
        btSp.setEnabled(false);
        btSp.setVisible(false);
        btEd.setEnabled(true);
        btEd.setVisible(true);
    } 
    public void simpan(){
        daerah	= txtKec.getText();
	odp	= txtOdp.getText();
        pdp	= txtPdp.getText();
	positif = txtPstp.getText();
			
	if(Double.parseDouble((String) positif) > 0){
            status = "Zona Merah";
	}else {
            status = "Zona Hijau";
	}
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtKec = new javax.swing.JTextField();
        txtPstp = new javax.swing.JTextField();
        txtPdp = new javax.swing.JTextField();
        txtOdp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btHps = new javax.swing.JButton();
        btBtl = new javax.swing.JButton();
        btSp = new javax.swing.JButton();
        btEd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtKec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKecActionPerformed(evt);
            }
        });
        getContentPane().add(txtKec, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 180, 30));

        txtPstp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPstpActionPerformed(evt);
            }
        });
        getContentPane().add(txtPstp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 180, 30));

        txtPdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPdpActionPerformed(evt);
            }
        });
        getContentPane().add(txtPdp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 180, 30));

        txtOdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOdpActionPerformed(evt);
            }
        });
        getContentPane().add(txtOdp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 180, 30));

        jLabel5.setText("POSITIF");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 130, 30));

        jLabel6.setText("PDP");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 130, 30));

        jLabel3.setText("ODP");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 130, 30));

        jLabel2.setText("DAERAH");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 130, 30));

        btHps.setText("HAPUS");
        btHps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHpsActionPerformed(evt);
            }
        });
        getContentPane().add(btHps, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 80, 30));

        btBtl.setText("BATAL");
        btBtl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBtlActionPerformed(evt);
            }
        });
        getContentPane().add(btBtl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 80, 30));

        btSp.setText("SIMPAN");
        btSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSpActionPerformed(evt);
            }
        });
        getContentPane().add(btSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 90, 30));

        btEd.setText("EDIT");
        btEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEdActionPerformed(evt);
            }
        });
        getContentPane().add(btEd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 80, 30));

        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 370, 180));

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("DATA COVID-19");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 160, 30));

        jToggleButton1.setText("KELUAR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 90, 30));

        jToggleButton2.setText("TAMBAH");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 90, 30));

        setSize(new java.awt.Dimension(392, 483));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSpActionPerformed
        simpan();
        try{
            String sql = "INSERT INTO daerah (kecamatan,odp,pdp,positif,status) "
                    + "VALUES ('"+daerah+"','"+odp+
                    "','"+pdp+"','"+positif+
                    "','"+status+"')";
            java.sql.Connection conn=(Connection)kon.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
            clear();
            tampil();
            //btSp.setText("Tambah");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Gagal");
        }
    }//GEN-LAST:event_btSpActionPerformed

    private void btBtlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBtlActionPerformed
       clear();
            
    }//GEN-LAST:event_btBtlActionPerformed

    private void tbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl1MouseClicked
        int baris=tbl1.rowAtPoint(evt.getPoint());
        String kec = tbl1.getValueAt(baris, 0).toString();
        txtKec.setText(kec);
        String odp = tbl1.getValueAt(baris, 1).toString();
        txtOdp.setText(odp);
        String pdp = tbl1.getValueAt(baris, 2).toString();
        txtPdp.setText(pdp);
        String pstp = tbl1.getValueAt(baris, 3).toString();
        txtPstp.setText(pstp);
        hideSp();
    }//GEN-LAST:event_tbl1MouseClicked

    private void btEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEdActionPerformed
        simpan();
        try{
            String sql = "UPDATE daerah SET odp ='"+odp+
                    "',pdp = '"+pdp+
                    "',positif = '"+positif+
                    "',status = '"+status+
                    "' WHERE kecamatan = '"+daerah+"'";
            java.sql.Connection conn=(Connection)kon.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Edit Data Berhasil");
            clear();
            tampil();
            //btSp.setText("Tambah");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Edit Data Gagal");
        }
    }//GEN-LAST:event_btEdActionPerformed

    private void btHpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHpsActionPerformed
        simpan();
        int opsi = JOptionPane.showConfirmDialog(null, "Yakin Hapus?", "Peringatan!!", JOptionPane.YES_NO_OPTION);
        if (opsi == JOptionPane.YES_OPTION){
            try {
            String sql = "DELETE FROM daerah WHERE kecamatan='"+daerah+"'";
            java.sql.Connection conn=(Connection)kon.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            tampil();
            clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }}
    }//GEN-LAST:event_btHpsActionPerformed

    private void txtPstpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPstpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPstpActionPerformed

    private void txtPdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPdpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPdpActionPerformed

    private void txtOdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOdpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOdpActionPerformed

    private void txtKecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKecActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        simpan();
        try{
            String sql = "INSERT INTO daerah (kecamatan,odp,pdp,positif,status) "
                    + "VALUES ('"+daerah+"','"+odp+
                    "','"+pdp+"','"+positif+
                    "','"+status+"')";
            java.sql.Connection conn=(Connection)kon.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
            clear();
            tampil();
            //btSp.setText("Tambah");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Gagal");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tambah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBtl;
    private javax.swing.JButton btEd;
    private javax.swing.JButton btHps;
    private javax.swing.JButton btSp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTable tbl1;
    private javax.swing.JTextField txtKec;
    private javax.swing.JTextField txtOdp;
    private javax.swing.JTextField txtPdp;
    private javax.swing.JTextField txtPstp;
    // End of variables declaration//GEN-END:variables
}
