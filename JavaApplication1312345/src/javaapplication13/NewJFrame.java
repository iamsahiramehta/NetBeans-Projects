/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author Sahira Mehta
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        impt = new javax.swing.JButton();
        nme = new javax.swing.JTextField();
        s = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        onr = new javax.swing.JTextField();
        updte = new javax.swing.JButton();
        dlte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        impt.setText("Import data");
        impt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imptActionPerformed(evt);
            }
        });

        s.setEditable(false);

        jLabel1.setText("name");

        jLabel2.setText("sex");

        spc.setEditable(false);

        jLabel3.setText("species");

        jLabel4.setText("owner");

        onr.setEditable(false);

        updte.setText("update");
        updte.setEnabled(false);
        updte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updteActionPerformed(evt);
            }
        });

        dlte.setText("Delete");
        dlte.setEnabled(false);
        dlte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spc)
                    .addComponent(s)
                    .addComponent(nme)
                    .addComponent(onr, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(impt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dlte, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(impt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(updte))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(onr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dlte))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imptActionPerformed
try{
String sqlquery= "select * from pet where name= '"+nme.getText()+"';";
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/menagerie","root","admin");
Statement stm = con.createStatement();
ResultSet rs= stm.executeQuery(sqlquery);
if(rs.next()){
String Nam = rs.getString("name") ;
String sx = rs.getString("sex");
String spcs = rs.getString("species");
String own = rs.getString("owner");
s.setText(sx);
spc.setText(spcs);
onr.setText(own);
updte.setEnabled(true);
dlte.setEnabled(true);
s.setEditable(true);
spc.setEditable(true);
onr.setEditable(true);
System.out.println("Completed");
}else{
    JOptionPane.showMessageDialog(null,"no record found");
}}
catch(SQLException e){System.out.println(e);}
    }//GEN-LAST:event_imptActionPerformed

    private void updteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updteActionPerformed
try{
    String sqlquery= "UPDATE pet SET name= '"+nme.getText() +"',sex= '"+s.getText() +"',species= '"+spc.getText() +"',owner= '"+onr.getText() +"';" ;
    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/menagerie","root","admin");
    Statement stm = con.createStatement();
    stm.executeUpdate(sqlquery);
        JOptionPane.showMessageDialog(null,"Success");
        }
catch(SQLException e){
    System.out.println(e);
}nme.setText("");
s.setText("");
onr.setText("");
spc.setText("");
updte.setEnabled(false);
dlte.setEnabled(false);
    }//GEN-LAST:event_updteActionPerformed

    private void dlteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlteActionPerformed
try{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/menagerie","root","admin");
String query="DELETE FROM pet WHERE name='"+nme.getText()+"';";
Statement stm = con.createStatement();
    stm.executeUpdate(query);
    JOptionPane.showMessageDialog(null,"success");
}
catch(SQLException e){
    System.out.println(e);
}
    }//GEN-LAST:event_dlteActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dlte;
    private javax.swing.JButton impt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nme;
    private javax.swing.JTextField onr;
    private javax.swing.JTextField s;
    private javax.swing.JTextField spc;
    private javax.swing.JButton updte;
    // End of variables declaration//GEN-END:variables
}
