/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employee.payroll;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.awt.HeadlessException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;



/**
 *
 * @author ervinpepic
 */
public class SearchEmpSallary extends javax.swing.JFrame {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    /**
     * Creates new form SearchEmpSallary
     */
    
    public SearchEmpSallary() {
        initComponents();
        
        conn = db.java_db();
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_search_pdf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_id_pdf = new javax.swing.JTextField();
        txt_firstname_pdf = new javax.swing.JTextField();
        txt_surname_pdf = new javax.swing.JTextField();
        txt_dob_pdf = new javax.swing.JTextField();
        txt_dpt_pdf = new javax.swing.JTextField();
        txt_desig_pdf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_status_pdf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_hired_pdf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_job_pdf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_salary = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Search Employee:");

        txt_search_pdf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_search_pdfKeyTyped(evt);
            }
        });

        jLabel2.setText("Employee ID:");

        jLabel3.setText("First Name:");

        jLabel4.setText("Last Name:");

        jLabel5.setText("Date of Birth:");

        jLabel6.setText("Department:");

        jLabel7.setText("Desigantion:");

        jLabel8.setText("Status:");

        jLabel9.setText("Date hired:");

        jLabel10.setText("Job Title:");

        jLabel11.setText("Basic Salary:");

        jButton1.setText("Generate Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(264, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txt_search_pdf, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_id_pdf, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(txt_dob_pdf)
                            .addComponent(txt_surname_pdf)
                            .addComponent(txt_firstname_pdf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_dpt_pdf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_desig_pdf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_status_pdf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_hired_pdf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_job_pdf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_salary, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_search_pdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id_pdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_firstname_pdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_surname_pdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_dob_pdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_dpt_pdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_desig_pdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_status_pdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_hired_pdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_job_pdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_search_pdfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search_pdfKeyTyped
        
        try{

            String sql ="select * from Staff_information where first_name = ? ";
            
            

            pst = conn.prepareStatement(sql);
            pst.setString(1,txt_search_pdf.getText());
            rs = pst.executeQuery();
            
                while(rs.next()) {

                String add1 = rs.getString("id");
                txt_id_pdf.setText(add1);

                String add2 = rs.getString("first_name");
                txt_firstname_pdf.setText(add2);

                String add3 = rs.getString("surname");
                txt_surname_pdf.setText(add3);

                String add4 = rs.getString("Dob");
                txt_dob_pdf.setText(add4);

                String add5 = rs.getString("Department");
                txt_dpt_pdf.setText(add5);

                String add7 = rs.getString("Salary");
                txt_salary.setText(add7);

                String add8 = rs.getString("Status");
                txt_status_pdf.setText(add8);

                String add9 = rs.getString("Date_hired");
                txt_hired_pdf.setText(add9);

                String add10 = rs.getString("job_title");
                txt_job_pdf.setText(add10);

                String add17 = rs.getString("Designation");
                txt_desig_pdf.setText(add17);
            }


        } catch(SQLException | HeadlessException e){
            
          JOptionPane.showMessageDialog(null, "No Data");
          
        }
        
        finally {

            try {

                rs.close();
                pst.close();

            } catch(Exception e){

            }
        }
    }//GEN-LAST:event_txt_search_pdfKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String value = txt_firstname_pdf.getText();
        String value0 = txt_surname_pdf.getText();
        String value1 = txt_id_pdf.getText();
        String value2 = txt_desig_pdf.getText();
        String value3 = txt_dpt_pdf.getText();
        
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File(value + "_" + value0 + "_Salary Report" + ".pdf"));
        
        int dialogResult = dialog.showSaveDialog(null);
        
        if(dialogResult == JFileChooser.APPROVE_OPTION) {
            
            String filePath = dialog.getSelectedFile().getPath();
            
            try {
                
                String sql_pdf_salary ="select * from Deductions where emp_id = '"+value1+"'";
                
                pst = conn.prepareStatement(sql_pdf_salary);
                rs = pst.executeQuery(); 
                String val = rs.getString(5);
                String reason = rs.getString(6);
                
                rs.close();
                pst.close();

                String sq ="select * from Allowance where emp_id = '"+value1+"'";
                
                pst=conn.prepareStatement(sq);
                rs=pst.executeQuery(); 
                
                
                
                int calcTotal = Integer.parseInt(txt_salary.getText());
                float x = Float.valueOf(rs.getString(9));
                int v = Integer.parseInt(val);
                float total = calcTotal + x - v;

                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));

                myDocument.open();

                myDocument.add(new Paragraph("PAY SLIP", FontFactory.getFont(FontFactory.TIMES_BOLD, 20, Font.BOLD)));

                myDocument.add(new Paragraph(new Date().toString()));

                myDocument.add(new Paragraph("-------------------------------------------------------------------------"));

                myDocument.add(new Paragraph("Employee Details", FontFactory.getFont(FontFactory.TIMES_ROMAN, 15, Font.BOLD)));
                myDocument.add(new Paragraph("Name of Employee:" + value + " " + value0, FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
                myDocument.add(new Paragraph("Designation:" + value2 ,FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
                myDocument.add(new Paragraph("Department:" + value3, FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));

                myDocument.add(new Paragraph("-------------------------------------------------------------------------"));

                myDocument.add(new Paragraph("Salary", FontFactory.getFont(FontFactory.TIMES_ROMAN, 15, Font.BOLD)));
                myDocument.add(new Paragraph("Basic Salary:" + calcTotal, FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
                myDocument.add(new Paragraph("Overtime:" + rs.getString(2), FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
                myDocument.add(new Paragraph("Medical:" + rs.getString(3) , FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
                myDocument.add(new Paragraph("Bonus:" + rs.getString(4), FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
                myDocument.add(new Paragraph("Other:" + rs.getString(5), FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));

                myDocument.add(new Paragraph("-------------------------------------------------------------------------"));

                myDocument.add(new Paragraph("Decution", FontFactory.getFont(FontFactory.TIMES_ROMAN, 15, Font.BOLD)));
                myDocument.add(new Paragraph("Deduction details: " + reason, FontFactory.getFont(FontFactory.TIMES_ROMAN, 15, Font.PLAIN)));
                myDocument.add(new Paragraph("Total Dedcution:" + val, FontFactory.getFont(FontFactory.TIMES_ROMAN, 15, Font.PLAIN)));

                myDocument.add(new Paragraph("-------------------------------------------------------------------------"));

                myDocument.add(new Paragraph("Total Payment", FontFactory.getFont(FontFactory.TIMES_ROMAN, 15, Font.BOLD)));
                myDocument.add(new Paragraph("Total Earnings: " + rs.getString(9), FontFactory.getFont(FontFactory.TIMES_ROMAN, 15, Font.PLAIN)));
                myDocument.add(new Paragraph("Net Pay:" + total, FontFactory.getFont(FontFactory.TIMES_ROMAN, 15, Font.PLAIN)));

                myDocument.add(new Paragraph("-------------------------------------------------------------------------"));

                myDocument.newPage();
                myDocument.close();
                
                JOptionPane.showMessageDialog(null, "Report was created!");
                
                

            } catch (SQLException | NumberFormatException | FileNotFoundException | DocumentException | HeadlessException e) {
                
                JOptionPane.showMessageDialog(null, e);
            }
            
            finally {
            
            try{
               rs.close();
               pst.close();
                
            }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
         
            }
     }
            
        }
        
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
            java.util.logging.Logger.getLogger(SearchEmpSallary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchEmpSallary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchEmpSallary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchEmpSallary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SearchEmpSallary().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_desig_pdf;
    private javax.swing.JTextField txt_dob_pdf;
    private javax.swing.JTextField txt_dpt_pdf;
    private javax.swing.JTextField txt_firstname_pdf;
    private javax.swing.JTextField txt_hired_pdf;
    private javax.swing.JTextField txt_id_pdf;
    private javax.swing.JTextField txt_job_pdf;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search_pdf;
    private javax.swing.JTextField txt_status_pdf;
    private javax.swing.JTextField txt_surname_pdf;
    // End of variables declaration//GEN-END:variables
}
