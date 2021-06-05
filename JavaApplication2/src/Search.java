
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DropMode;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sahira Mehta
 */
public class Search extends javax.swing.JFrame {
Connection con;
Statement pst;
ResultSet rs;
    /**
     * Creates new form Editim
     */
    public Search() {
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

        chk1 = new javax.swing.JCheckBox();
        bck = new javax.swing.JButton();
        chk2 = new javax.swing.JCheckBox();
        search = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        export1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(959, 1000));

        chk1.setText("IMPORT");
        chk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1ActionPerformed(evt);
            }
        });

        bck.setText("BACK");
        bck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckActionPerformed(evt);
            }
        });

        chk2.setText("EXPORT");

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1KeyReleased(evt);
            }
        });

        jLabel1.setText("Search");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        export1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date_of_enqy", "Reply_on_enqy", "Product_Name", "Cas_No", "Buyer_Name", "Seller_Plant", "Quantity", "Price ", "Terms", "Offered_Price", "COA", "Remarks"
            }
        ));
        jScrollPane2.setViewportView(export1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bck, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(chk1)
                        .addGap(96, 96, 96)
                        .addComponent(chk2)
                        .addGap(112, 112, 112)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(search)
                        .addGap(108, 108, 108))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chk2)
                            .addComponent(chk1)
                            .addComponent(bck)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(search)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk1ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
String srch= txt1.getText();
String qry1= "select * from export_data where product_nme like '"+txt1.getText()+"%';";
String qry= "select * from import_data where product_nme like '"+txt1.getText()+"%';";
if (chk1.isSelected()){
    DefaultTableModel model = (DefaultTableModel) export1.getModel();
while(model.getRowCount()>0){
for(int i = 0;i<model.getRowCount();i++){model.removeRow(i);}}
        try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sumsahi_data","root","admin");
pst= con.createStatement();
rs= pst.executeQuery(qry);
int count=0;
while(rs.next()){
count++;
String Date_of_enqy= rs.getString("date_of_enqy");
String Reply_on_enqy  = rs.getString("rply_of_enqy");
String Product_Name= rs.getString("product_nme");
String Cas_No = rs.getString("casno");
String Buyer_Name = rs.getString("buyer_nme");
String Seller_Plant = rs.getString("seller_plant");
String Quantity= rs.getString("qty");
String Price= rs.getString("price");
String Terms= rs.getString("terms");
String Offered_Price= rs.getString("offered_price");
String COA = rs.getString("coa");
String Remarks= rs.getString("remarks");

 Object[] row1 = {Date_of_enqy,Reply_on_enqy,Product_Name,Cas_No,Buyer_Name,Seller_Plant,Quantity,Price,Terms,Offered_Price,COA,Remarks};
 model.addRow(row1);
}
        System.out.println("sucess");
txt1.setText("");
System.out.println("field cleared");
        pst.close();
        con.close();
        
    }
     catch (SQLException ex) {
       System.out.println(ex);
    } 
}
if(chk2.isSelected()){
DefaultTableModel model = (DefaultTableModel) export1.getModel();
while(model.getRowCount()>0){
for(int i = 0;i<model.getRowCount();i++){model.removeRow(i);}}
      try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sumsahi_data","root","admin");
pst= con.createStatement();
rs= pst.executeQuery(qry1);
int count=0;
while(rs.next()){
count++;
String Date_of_enqy= rs.getString("date_of_enqy");
String Reply_on_enqy  = rs.getString("rply_of_enqy");
String Product_Name= rs.getString("product_nme");
String Cas_No = rs.getString("casno");
String Buyer_Name = rs.getString("buyer_nme");
String Seller_Plant = rs.getString("seller_plant");
String Quantity= rs.getString("qty");
String Price= rs.getString("price");
String Terms= rs.getString("terms");
String Offered_Price= rs.getString("offered_price");
String COA = rs.getString("coa");
String Remarks= rs.getString("remarks");

 Object[] row1 = {Date_of_enqy,Reply_on_enqy,Product_Name,Cas_No,Buyer_Name,Seller_Plant,Quantity,Price,Terms,Offered_Price,COA,Remarks};
 model.addRow(row1);
}
        System.out.println("sucess");
txt1.setText("");
System.out.println("field cleared");
        pst.close();
        con.close();
        
    }
     catch (SQLException ex) {
       System.out.println(ex);
    } }
    }//GEN-LAST:event_searchActionPerformed

    private void txt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1KeyReleased

    private void bckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bckActionPerformed

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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bck;
    private javax.swing.JCheckBox chk1;
    private javax.swing.JCheckBox chk2;
    private javax.swing.JTable export1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton search;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables
}
