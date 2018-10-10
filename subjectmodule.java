
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
public class subjectmodule extends javax.swing.JInternalFrame {
ArrayList course=new ArrayList();
        
    public subjectmodule() {
        initComponents();
        fillcourses();
        filltable();
    }
      void filltable()
  {
          try
    {
       
          
             Class.forName("oracle.jdbc.OracleDriver");
          String str = "jdbc:oracle:thin:@localhost:1521:";
          Connection con = DriverManager.getConnection(str,"ANKITA","ANKITA");
            String s="select * from subject";
              PreparedStatement ps=con.prepareStatement(s);
              ResultSet rs=ps.executeQuery();
           Vector heading=new Vector();
         heading.add("Subject ID");
          heading.add("Subject Name");
          
          heading.add("Course Id");
           Vector row=new Vector();
             
            
              while(rs.next())
              {
                  String s1=rs.getString("subject_id");
                  String s2=rs.getString("subject_name");
                    String s3=rs.getString("course_id");
                  Vector cell=new Vector();
                  cell.add(s1);
                  cell.add(s2);
                  cell.add(s3);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        sname = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ttt = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel1.setText("Subject id");

        jLabel2.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel2.setText("Subject Name");

        jLabel3.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel3.setText("Select Courses");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

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
        jScrollPane2.setViewportView(ttt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 177, Short.MAX_VALUE)
                            .addComponent(sname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sid))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(51, 51, 51)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
      
       
           try
         {
             String a=sid.getText();
          
             String b=sname.getText();
            int id=jComboBox1.getSelectedIndex();
          String c[]=   (String [])course.get(id);
          
              Class.forName("oracle.jdbc.OracleDriver");
          String str = "jdbc:oracle:thin:@localhost:1521:";
          Connection con = DriverManager.getConnection(str,"ANKITA","ANKITA");
          String s="insert into subject values(?,?,?)";
          PreparedStatement ps=con.prepareStatement(s);
       
           ps.setString(1,a);
          ps.setString(2,b);
          ps.setString(3,c[0]);
          
 
          
          ps.executeUpdate();
          filltable();
          con.close();
          
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
          //jComboBox1.addItem();
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try
         {
             String a=sid.getText();
           
             String b=sname.getText();
              int id=jComboBox1.getSelectedIndex();
          String c[]=   (String [])course.get(id);
       
              Class.forName("oracle.jdbc.OracleDriver");
               String str = "jdbc:oracle:thin:@localhost:1521:";

        
          Connection con = DriverManager.getConnection(str,"ANKITA","ANKITA");
          String s="update subject set subject_name=?,course_id=? where subject_id=?";
          PreparedStatement ps=con.prepareStatement(s);
          ps.setString(1,b);
          
         ps.setString(2,c[0]);
          ps.setString(3,a);
          ps.executeUpdate();
          filltable();
          con.close();
          
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try
         {
           String a=sid.getText();
           
             String b=sname.getText();
              int id=jComboBox1.getSelectedIndex();
          String c[]=   (String [])course.get(id);
              Class.forName("oracle.jdbc.OracleDriver");
          String str = "jdbc:oracle:thin:@localhost:1521:";
          Connection con = DriverManager.getConnection(str,"ANKITA","ANKITA");
          String s="delete from subject where subject_id=?";
          PreparedStatement ps=con.prepareStatement(s);
        
          ps.setString(1,a);
          ps.executeUpdate();
          filltable();
          con.close();
          
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }          // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tttMouseClicked
        // TODO add your handling code here:
            TableModel m1= ttt.getModel();
     int r=  ttt.getSelectedRow();
   String z=(String)m1.getValueAt(r, 0);
    String y=(String)m1.getValueAt(r,1);
    
    String course_id=(String)m1.getValueAt(r,2);
        System.out.println("course id ");
    for(int i=0;i<course.size();i++){
       String c_array[]=(String[]) course.get(i);
      if(c_array[0].equals(course_id))
          jComboBox1.setSelectedIndex(Integer.parseInt(c_array[0]));
    }
    
      
sid.setText(z);  
sname.setText(y); 

        
    }//GEN-LAST:event_tttMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField sname;
    private javax.swing.JTable ttt;
    // End of variables declaration//GEN-END:variables
}
