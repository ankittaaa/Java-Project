
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */

public class student_pr extends javax.swing.JFrame {
    ArrayList course=new ArrayList();

    /**
     * Creates new form student_pr
     */
    public student_pr() {
        initComponents();
        fillcourses();
        filltable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
      void filltable()
  {
          try
    {
       
          
             Class.forName("oracle.jdbc.OracleDriver");
          String str = "jdbc:oracle:thin:@localhost:1521:";
          Connection con = DriverManager.getConnection(str,"ANKITA","ANKITA");
            String s="select * from student_pr";
              PreparedStatement ps=con.prepareStatement(s);
              ResultSet rs=ps.executeQuery();
           Vector heading=new Vector();
         heading.add("S ID");
          heading.add("S Name");
           heading.add("Address");
            heading.add("ContactNo");
             heading.add("Username");
              heading.add("Password");
               heading.add("Email ID");
               heading.add("Course ID");
                      
          
           Vector row=new Vector();
             
            
              while(rs.next())
              {
                  String s1=rs.getString("sid");
                  String s2=rs.getString("sname");
                    String s3=rs.getString("address");
                     String s4=rs.getString("contactno");
                      String s5=rs.getString("username");
                       String s6=rs.getString("password");
                        String s7=rs.getString("emailid");
                        String s8=rs.getString("course_id");
                  Vector cell=new Vector();
                  cell.add(s1);
                  cell.add(s2);
                  cell.add(s3);
                  cell.add(s4);
                  cell.add(s5);
                  cell.add(s6);
                  cell.add(s7);
                  cell.add(s8);
                  row.add(cell);
                 
                
              }
                DefaultTableModel model=new DefaultTableModel(row,heading);
           ttt.setModel(model);   
              }
    
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
      
  }
      void fillcourses(){
    try{
     
            
              Class.forName("oracle.jdbc.OracleDriver");
          String str = "jdbc:oracle:thin:@localhost:1521:";
          Connection con = DriverManager.getConnection(str,"ANKITA","ANKITA");
          String s="select * from course";
          PreparedStatement ps=con.prepareStatement(s);
         
         ResultSet rs= ps.executeQuery();
         while(rs.next()){
             String c_array[]=new String[2];
             c_array[0]=rs.getString("course_id");
             c_array[1]=rs.getString("course_name");
            String cname= rs.getString("course_name");
            course.add(c_array);
            jComboBox1.addItem(cname);
         }
          con.close();
          
    }
    catch(Exception e){
        e.printStackTrace();
    }
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ttt = new javax.swing.JTable();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel1.setText("sid");

        jLabel2.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel2.setText("sname");

        jLabel3.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel3.setText("address");

        jLabel4.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel4.setText("contactno");

        jLabel5.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel5.setText("username");

        jLabel6.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel6.setText("password");

        jLabel7.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel7.setText("emailid");

        jLabel8.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel8.setText("courseid");

        jButton1.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Modify");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        ttt.setModel(new javax.swing.table.DefaultTableModel(
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
        ttt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tttMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ttt);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(346, 346, 346)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(t6, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(t5)
                                    .addComponent(t4)
                                    .addComponent(t3)
                                    .addComponent(t2)
                                    .addComponent(t1))))
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1)
                        .addGap(44, 44, 44)
                        .addComponent(jButton2)
                        .addGap(47, 47, 47)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try
         {
             String sid=t1.getText();
            
             String sname=t2.getText();
             String address=t3.getText();
             String contactno=t4.getText();
             String username=t5.getText();
             String password=t6.getText();
             String emailid=t7.getText();
                int id=jComboBox1.getSelectedIndex();
          String c[]=   (String [])course.get(id);
             
              Class.forName("oracle.jdbc.OracleDriver");
          String str = "jdbc:oracle:thin:@localhost:1521:";
          Connection con = DriverManager.getConnection(str,"ANKITA","ANKITA");
          String s="insert into student_pr values(?,?,?,?,?,?,?,?)";
          PreparedStatement ps=con.prepareStatement(s);
          ps.setString(1,sid);
           ps.setString(2,sname);
          ps.setString(3,address);
        ps.setString(4,contactno);
         ps.setString(5,username);
          ps.setString(6,password);
           ps.setString(7,emailid);
            ps.setString(8,c[0]);
          ps.executeUpdate();
          filltable();
          con.close();
          
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }        // TODO add your handling code here:
             
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          try
         {
              String sid=t1.getText();
            
             String sname=t2.getText();
             String address=t3.getText();
             String contactno=t4.getText();
             String username=t5.getText();
             String password=t6.getText();
             String emailid=t7.getText();
                int id=jComboBox1.getSelectedIndex();
          String c[]=   (String [])course.get(id);
          
              Class.forName("oracle.jdbc.OracleDriver");
               String str = "jdbc:oracle:thin:@localhost:1521:";

        
          Connection con = DriverManager.getConnection(str,"ANKITA","ANKITA");
          String s="update student_pr set sname=?,address=?,contactno=?,username=?,password=?,emailid=?,course_id=? where sid=?";
          PreparedStatement ps=con.prepareStatement(s);
         
           ps.setString(1,sname);
          ps.setString(2,address);
        ps.setString(3,contactno);
         ps.setString(4,username);
          ps.setString(5,password);
           ps.setString(6,emailid);
            ps.setString(7,c[0]);
            ps.setString(8,sid);
          ps.executeUpdate();
          filltable();
          con.close();
          
         }
         catch(Exception e)
         {
             e.printStackTrace();
         } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          try
         {
             String sid=t1.getText();
            
             String sname=t2.getText();
             String address=t3.getText();
             String contactno=t4.getText();
             String username=t5.getText();
             String password=t6.getText();
             String emailid=t7.getText();
                int id=jComboBox1.getSelectedIndex();
          String c[]=   (String [])course.get(id);
              Class.forName("oracle.jdbc.OracleDriver");
          String str = "jdbc:oracle:thin:@localhost:1521:";
          Connection con = DriverManager.getConnection(str,"ANKITA","ANKITA");
          String s="delete from student_pr where sid=?";
          PreparedStatement ps=con.prepareStatement(s);
        
          ps.setString(1, sid);
          ps.executeUpdate();
          filltable();
          con.close();
          
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tttMouseClicked
        // TODO add your handling code here:
             TableModel m1= ttt.getModel();
     int r=  ttt.getSelectedRow();
   String z=(String)  m1.getValueAt(r, 0);
    String y=(String) m1.getValueAt(r,1);
     String x=(String) m1.getValueAt(r,2);
      String w=(String) m1.getValueAt(r,3);
       String v=(String) m1.getValueAt(r,4);
       String u=(String) m1.getValueAt(r,5);
        String t=(String) m1.getValueAt(r,6);
        String cid=(String) m1.getValueAt(r,7);
        
t1.setText(z);  
t2.setText(y); 
t3.setText(x); 
t4.setText(w); 
t5.setText(v); 
t6.setText(u); 
t7.setText(t); 
for(int i=0;i<course.size();i++)
{
    String course1[]=(String[])course.get(i);
    if(course1[0].equals(cid))
    {
     jComboBox1.setSelectedIndex(i);   
    }
    }

    }//GEN-LAST:event_tttMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(student_pr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student_pr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student_pr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student_pr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student_pr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTable ttt;
    // End of variables declaration//GEN-END:variables
}
