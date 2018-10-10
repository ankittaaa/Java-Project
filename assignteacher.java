
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class assignteacher extends javax.swing.JInternalFrame {

    /**
     * Creates new form assignteacher
     */
    public assignteacher() {
        initComponents();
       
        fillteacherid();
        fillcourses();
       // fillsubjectid();
        filltable1();
    }
     ArrayList teacher=new ArrayList();
      ArrayList course=new ArrayList();
       ArrayList subjectid=new ArrayList();
//       void filltable()
//  {
//          try
//    {
//       
//          
//             Class.forName("oracle.jdbc.OracleDriver");
//          String str = "jdbc:oracle:thin:@localhost:1521:";
//          Connection con = DriverManager.getConnection(str,"ANKITA","ANKITA");
//            String s="select * from assignteacher";
//              PreparedStatement ps=con.prepareStatement(s);
//              ResultSet rs=ps.executeQuery();
//           Vector heading=new Vector();
//         heading.add("Teacher ID");
//          heading.add("Course");
//           heading.add("Subject ID");
//            
//           Vector row=new Vector();
//             
//            
//              while(rs.next())
//              {
//                  String s1=rs.getString("tid");
//                  String s2=rs.getString("course");
//                    String s3=rs.getString("subject_id");
//                   
//                  Vector cell=new Vector();
//                  cell.add(s1);
//                  cell.add(s2);
//                  cell.add(s3);
//                 
//                  row.add(cell);
//                 
//                
//              }
//                DefaultTableModel model=new DefaultTableModel(row,heading);
//           ttt.setModel(model);   
//              }
//    
//    catch(Exception ex)
//    {
//        ex.printStackTrace();
//    }
//      
//  }
   void filltable1()
  {
          try
    {
       
          
             Class.forName("oracle.jdbc.OracleDriver");
          String str = "jdbc:oracle:thin:@localhost:1521:";
          Connection con = DriverManager.getConnection(str,"ANKITA","ANKITA");
            String s="select * from assignteacher";
              PreparedStatement ps=con.prepareStatement(s);
              ResultSet rs=ps.executeQuery();
           Vector heading=new Vector();
         heading.add("ASSIGN ID");
          heading.add("T ID");
           heading.add("SUBJECT ID");
           
           Vector row=new Vector();
             
            
              while(rs.next())
              {
                  String s1=rs.getString("assignid");
                  String s2=rs.getString("tid");
                    String s3=rs.getString("subject_id");
                     
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
   void fillteacherid(){
    try{
     
           
              Class.forName("oracle.jdbc.OracleDriver");
          String str = "jdbc:oracle:thin:@localhost:1521:";
          Connection con = DriverManager.getConnection(str,"ANKITA","ANKITA");
          String s="select * from teacher";
          PreparedStatement ps=con.prepareStatement(s);
         
         ResultSet rs= ps.executeQuery();
         while(rs.next()){
             String c_array[]=new String[7];
             c_array[0]=rs.getString("tid");
             c_array[1]=rs.getString("tname");
              c_array[2]=rs.getString("address");
               c_array[3]=rs.getString("contactno");
                c_array[4]=rs.getString("username");
                 c_array[5]=rs.getString("password");
                  c_array[6]=rs.getString("emailid");
            String cname= rs.getString("tid");
           teacher.add(c_array);
            cb1.addItem(cname);
         }
          con.close();
          
    }
    catch(Exception e){
        e.printStackTrace();
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
            cb2.addItem(cname);
         }
          con.close();
          
    }
    catch(Exception e){
        e.printStackTrace();
    }
}
   void fillsubjectid(String cid){
    try{
     
           
              Class.forName("oracle.jdbc.OracleDriver");
          String str = "jdbc:oracle:thin:@localhost:1521:";
          Connection con = DriverManager.getConnection(str,"ANKITA","ANKITA");
          String s="select * from subject where course_id=?";
          PreparedStatement ps=con.prepareStatement(s);
         ps.setString(1, cid);
         ResultSet rs= ps.executeQuery();
         while(rs.next()){
             String c_array[]=new String[2];
             c_array[0]=rs.getString("subject_id");
             c_array[1]=rs.getString("subject_name");
              
            String cname= rs.getString("subject_id");
           subjectid.add(c_array);
            cb3.addItem(cname);
         }
          con.close();
          
    }
    catch(Exception e){
        e.printStackTrace();
    }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ttt = new javax.swing.JTable();
        cb1 = new javax.swing.JComboBox();
        cb2 = new javax.swing.JComboBox();
        cb3 = new javax.swing.JComboBox();

        setClosable(true);
        setForeground(new java.awt.Color(0, 51, 204));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("ASSIGN TEACHER");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Teacher ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Course");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Subject ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jButton1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jButton1.setText("Assign");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        ttt.setFont(new java.awt.Font("Vivaldi", 1, 18)); // NOI18N
        ttt.setForeground(new java.awt.Color(51, 255, 0));
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
        jScrollPane1.setViewportView(ttt);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 385, 402));

        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 160, 30));

        cb2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb2ItemStateChanged(evt);
            }
        });
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });
        getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 160, 30));

        getContentPane().add(cb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 160, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try
         {
           
            int id=cb1.getSelectedIndex();
          String tid[]= (String []) teacher.get(id);
           int id1=cb2.getSelectedIndex();
          String cid[]=(String [])  course.get(id1);
           int id2=cb3.getSelectedIndex();
          String sid[]=(String [])  subjectid.get(id2);
          
          
              Class.forName("oracle.jdbc.OracleDriver");
          String str = "jdbc:oracle:thin:@localhost:1521:";
          Connection con = DriverManager.getConnection(str,"ANKITA","ANKITA");
          String s="insert into assignteacher values(?,?,?)";
          PreparedStatement ps=con.prepareStatement(s);
       ps.setString(1,"");
           ps.setString(2,tid[0]);
          ps.setString(3,sid[0]);
          
 
          
          ps.executeUpdate();
          filltable1();
          con.close();
          
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
          //jComboBox1.addItem();
          
                              
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ActionPerformed

    private void cb2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb2ItemStateChanged
        cb3.removeAllItems();
        
        int id1=cb2.getSelectedIndex();
          String cid[]=(String [])  course.get(id1);
        
        
        fillsubjectid(cid[0]);         
        
    }//GEN-LAST:event_cb2ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb1;
    private javax.swing.JComboBox cb2;
    private javax.swing.JComboBox cb3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ttt;
    // End of variables declaration//GEN-END:variables
}
