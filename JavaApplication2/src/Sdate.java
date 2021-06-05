
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
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
public class Sdate extends javax.swing.JFrame {
Connection con;
Statement pst;
ResultSet rs;
    /**
     * Creates new form Sdate
     */
    public Sdate() {
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

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        export1 = new javax.swing.JTable();
        chk1 = new javax.swing.JCheckBox();
        chk2 = new javax.swing.JCheckBox();
        search = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt1 = new com.toedter.calendar.JDateChooser();
        txt2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        export1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date_of_enqy", "Reply_on_enqy", "Product_Name", "Cas_No", "Buyer_Name", "Seller_Plant", "Quantity", "Price ", "Terms", "Offered_Price", "COA", "Remarks"
            }
        ));
        jScrollPane2.setViewportView(export1);

        chk1.setText("IMPORT");
        chk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1ActionPerformed(evt);
            }
        });

        chk2.setText("EXPORT");

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel1.setText("Search");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(chk1)
                        .addGap(28, 28, 28)
                        .addComponent(chk2)
                        .addGap(92, 92, 92)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(search)
                        .addGap(64, 64, 64))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(chk1)
                            .addComponent(chk2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(search))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk1ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
java.sql.Date date = new java.sql.Date(txt1.getDate().getTime());
java.sql.Date date1 = new java.sql.Date(txt2.getDate().getTime());

        String qry= "select * from export_data where date_of_enqy>='"+date+"'&& date_of_enqy<='"+date1+"';" ;
        String qry1= "select * from import_data where date_of_enqy>='"+date+"'and date_of_enqy<='"+date1+"';" ;
if (chk1.isSelected()){
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
        System.out.println("sucess-Import");

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
        System.out.println("sucess-Export");
        pst.close();
        con.close();
        
    }
     catch (SQLException ex) {
       System.out.println(ex);
    } }
    }//GEN-LAST:event_searchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Sdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chk1;
    private javax.swing.JCheckBox chk2;
    private javax.swing.JTable export1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton search;
    private com.toedter.calendar.JDateChooser txt1;
    private com.toedter.calendar.JDateChooser txt2;
    // End of variables declaration//GEN-END:variables
}
