/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface.Admin;

import CalculateDay.CalculateDayBetween;
import MySQLConnection.ConnectionProvider;
import com.toedter.calendar.JDateChooser;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Phạm Việt Hoàng
 */
public class AdminUpdateEvent extends javax.swing.JFrame {

    private static String oldEventName = null;
    private static String oldStartDate = null;
    private static String oldEndDate = null;
    private static String oldLocation = null;
    private static String headDoctorID = null;
    private static String oldHeadDoctor = null;
    
    /**
     * Creates new form AdminUpdateEvent
     */
    public AdminUpdateEvent() {
        initComponents();
        this.setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
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
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("UPDATE EVENT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 24, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 90, 785, 10));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EventName", "StartDate", "EndDate", "Location", "HeadDoctor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 178, 780, 100));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 640, 785, 12));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/save.png"))); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 664, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 102, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/reset.png"))); // NOI18N
        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 664, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/cancel.png"))); // NOI18N
        jButton3.setText("CANCEL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 664, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Event name: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 121, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 118, 230, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 162, 785, 10));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 296, 785, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Event name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 327, -1, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 324, 250, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 373, 250, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Location");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 376, -1, -1));

        jDateChooser1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jDateChooser1.setDateFormatString("dd-MM-yyyy");
        jDateChooser1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 324, 200, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Start date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 327, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("End date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 376, -1, -1));

        jDateChooser2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jDateChooser2.setDateFormatString("dd-MM-yyyy");
        jDateChooser2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 373, 200, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Select", "DoctorID", "FullName", "Email", "PhoneNumber", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(-10);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(-10);
            jTable2.getColumnModel().getColumn(1).setMinWidth(5);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(5);
            jTable2.getColumnModel().getColumn(2).setMinWidth(75);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(75);
            jTable2.getColumnModel().getColumn(3).setMinWidth(170);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(170);
            jTable2.getColumnModel().getColumn(4).setMinWidth(50);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable2.getColumnModel().getColumn(5).setMinWidth(140);
            jTable2.getColumnModel().getColumn(5).setPreferredWidth(140);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 466, 780, 124));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Available doctor");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 602, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Head doctor");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 425, -1, -1));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 422, 250, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Background.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setSelectionEnableOrDisable(JTable table) {
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = table.getSelectedRow();
                if ((Boolean) table.getValueAt(selectedRow, 0)) {
                    for (int i = 0; i < table.getRowCount(); i++) {
                        if (i != selectedRow) {
                            table.setValueAt(false, i, 0);
                        }
                    }
                }
            }
        });
    }

    private boolean checkExistedEvent(String eventName, String startDate, String location, String headDoctor) {
        try {
            Connection con = ConnectionProvider.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from event join doctor on event.HeadDoctor = doctor.DoctorID where StartDate >= curdate()");
            while (rs.next()) {
                if (eventName.equals(rs.getString("Name"))
                        && startDate.equals(new SimpleDateFormat("dd-MM-yyyy").format(rs.getDate("StartDate")))
                        && location.equals(rs.getString("Location"))
                        && headDoctor.equals(rs.getString("FullName"))) {
                    return true;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try {
            Connection con = ConnectionProvider.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from event join doctor on event.HeadDoctor = doctor.DoctorID where event.StartDate >= curdate() order by event.StartDate asc");
            while (rs.next()) {
                String eventName = rs.getString("Name");
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                String startDate = dateFormat.format(rs.getDate("StartDate"));
                String endDate = dateFormat.format(rs.getDate("EndDate"));
                String location = rs.getString("Location");
                String headDoctor = rs.getString("Fullname");
                headDoctorID = rs.getString("DoctorID");

                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.addRow(new Object[]{eventName, startDate, endDate, location, headDoctor});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        try {
            Connection con = ConnectionProvider.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select distinct doctor.DoctorID, doctor.FullName, doctor.Email, doctor.PhoneNumber, doctor.Street, event.EndDate in (select max(event.EndDate) from event group by HeadDoctor) "
                    + "from doctor left join event on doctor.DoctorID = event.HeadDoctor "
                    + "where event.Name is null or (event.EndDate < curdate() and event.EndDate in (select max(event.EndDate) from event group by HeadDoctor) != 0) group by doctor.DoctorID order by convert(doctor.DoctorID, unsigned) asc");
            while (rs.next()) {
                String doctorID = rs.getString("DoctorID");
                String fullName = rs.getString("FullName");
                String email = rs.getString("Email");
                String phoneNumber = rs.getString("PhoneNumber");
                String street = rs.getString("Street");

                DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                model.addRow(new Object[]{false, doctorID, fullName, email, phoneNumber, street});
            }
            jTable2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setSelectionEnableOrDisable(jTable2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jDateChooser1.setEnabled(false);
        jDateChooser2.setEnabled(false);
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jTextField2.getText().isBlank() || jTextField3.getText().isBlank()
                || jDateChooser1.getDate() == null
                || jDateChooser2.getDate() == null) {
            JOptionPane.showMessageDialog(null, "All fields must be filled");
        } else {
            if (CalculateDayBetween.CalculateDayBetween(new SimpleDateFormat("dd-MM-yyyy").format(jDateChooser1.getDate())) < 0) {
                JOptionPane.showMessageDialog(null, "'Start date is invalid'");
            } else {
                if (jDateChooser1.getDate().after(jDateChooser2.getDate())) {
                    JOptionPane.showMessageDialog(null, "End date is invalid");
                } else {
                    if (jTable1.getSelectedRowCount() == 1) {
                        String eventName = jTextField2.getText();
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                        String startDate = dateFormat.format(jDateChooser1.getDate());
                        String endDate = dateFormat.format(jDateChooser2.getDate());
                        String location = jTextField3.getText();

                        try {
                            Connection con = ConnectionProvider.getConnection();
                            Statement st = con.createStatement();
                            st.executeUpdate("update event set Name = '" + eventName + "', StartDate = str_to_date('" + startDate + "', \"%d-%m-%Y\"), EndDate = str_to_date('" + endDate + "', \"%d-%m-%Y\"), Location = '" + location + "', HeadDoctor = '" + headDoctorID + "' "
                                    + "where Name = '" + oldEventName + "' and StartDate = str_to_date('" + oldStartDate + "', \"%d-%m-%Y\") and EndDate = str_to_date('" + oldEndDate + "', \"%d-%m-%Y\") and Location = '" + oldLocation + "'");
                            st.executeUpdate("update registration set EventName = '" + eventName + "', DonationDate = str_to_date('" + startDate + "', \"%d-%m-%Y\"), HeadDoctor = '" + headDoctorID + "'  where EventName = '" + oldEventName + "' and DonationDate = str_to_date('" + oldStartDate + "', \"%d-%m-%Y\")");
                            JOptionPane.showMessageDialog(null, "Updated successfully");
                            setVisible(false);
                            new AdminUpdateEvent().setVisible(true);
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AdminUpdateEvent().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jTextField1.getText().trim()));
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            oldEventName = (String) jTable1.getModel().getValueAt(selectedRow, 0);
            oldStartDate = (String) jTable1.getModel().getValueAt(selectedRow, 1);
            oldEndDate = (String) jTable1.getModel().getValueAt(selectedRow, 2);
            oldLocation = (String) jTable1.getModel().getValueAt(selectedRow, 3);
            oldHeadDoctor = (String) jTable1.getModel().getValueAt(selectedRow, 4);
            
            jTextField2.setText(oldEventName);
            jTextField2.setEditable(true);
            jTextField3.setText(oldLocation);
            jTextField3.setEditable(true);
            jTextField4.setText(oldHeadDoctor);
            try {
                jDateChooser1.setDate(new SimpleDateFormat("dd-MM-yyyy").parse(oldStartDate));
                jDateChooser1.setEnabled(true);
                jDateChooser2.setDate(new SimpleDateFormat("dd-MM-yyyy").parse(oldEndDate));
                jDateChooser2.setEnabled(true);
                
                DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
                dtm.setRowCount(0);
                //String startDate = new SimpleDateFormat("dd-MM-yyyy").format(jDateChooser1.getDate());
                try {
                    Connection con = ConnectionProvider.getConnection();
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("select distinct doctor.DoctorID, doctor.FullName, doctor.Email, doctor.PhoneNumber, doctor.Street, event.EndDate in (select max(event.EndDate) from event group by HeadDoctor) "
                            + "from doctor left join event on doctor.DoctorID = event.HeadDoctor "
                            + "where event.Name is null or (event.EndDate < str_to_date('" + oldStartDate + "', \"%d-%m-%Y\") and event.EndDate in (select max(event.EndDate) from event group by HeadDoctor) != 0) group by doctor.DoctorID order by convert(doctor.DoctorID, unsigned) asc");
                    while (rs.next()) {
                        String doctorID = rs.getString("DoctorID");
                        String fullName = rs.getString("FullName");
                        String email = rs.getString("Email");
                        String phoneNumber = rs.getString("PhoneNumber");
                        String street = rs.getString("Street");

                        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                        model.addRow(new Object[]{false, doctorID, fullName, email, phoneNumber, street});
                    }
                    jTable2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                    setSelectionEnableOrDisable(jTable2);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            } catch (ParseException ex) {
                Logger.getLogger(AdminUpdateEvent.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable2.getSelectedRow();
        if (selectedRow != -1 && (Boolean) jTable2.getValueAt(selectedRow, 0) == true) {
            headDoctorID = (String) jTable2.getModel().getValueAt(selectedRow, 1);
            jTextField4.setText((String) jTable2.getModel().getValueAt(selectedRow, 2));
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
        if ("date".equals(evt.getPropertyName())) {
            JDateChooser aDateChooser = (JDateChooser) evt.getSource();
            boolean isDateSelectedByUser = false;
            // Get the otherwise unaccessible JDateChooser's 'dateSelected' field.
            try {
                // Get the desired field using reflection
                java.lang.reflect.Field dateSelectedField = JDateChooser.class.getDeclaredField("dateSelected");
                // This line makes the value accesible (can be read and/or modified)
                dateSelectedField.setAccessible(true);
                isDateSelectedByUser = dateSelectedField.getBoolean(aDateChooser);
            } catch (Exception ignoreOrNot) {
                //System.out.println(ignoreOrNot);
            }

            // Do some important stuff depending on wether value was changed by user
            if (isDateSelectedByUser) {
                DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
                dtm.setRowCount(0);
                String startDate = new SimpleDateFormat("dd-MM-yyyy").format(jDateChooser2.getDate());
                try {
                    Connection con = ConnectionProvider.getConnection();
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("select distinct doctor.DoctorID, doctor.FullName, doctor.Email, doctor.PhoneNumber, doctor.Street, event.EndDate in (select max(event.EndDate) from event group by HeadDoctor) "
                            + "from doctor left join event on doctor.DoctorID = event.HeadDoctor "
                            + "where event.Name is null or (event.EndDate < str_to_date('" + startDate + "', \"%d-%m-%Y\") and event.EndDate in (select max(event.EndDate) from event group by HeadDoctor) != 0) group by doctor.DoctorID order by convert(doctor.DoctorID, unsigned) asc");
                    while (rs.next()) {
                        String doctorID = rs.getString("DoctorID");
                        String fullName = rs.getString("FullName");
                        String email = rs.getString("Email");
                        String phoneNumber = rs.getString("PhoneNumber");
                        String street = rs.getString("Street");

                        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                        model.addRow(new Object[]{false, doctorID, fullName, email, phoneNumber, street});
                    }
                    jTable2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                    setSelectionEnableOrDisable(jTable2);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }

            // Reset the value to false
            try {
                java.lang.reflect.Field dateSelectedField = JDateChooser.class.getDeclaredField("dateSelected");
                dateSelectedField.setAccessible(true);
                //isDateSelectedByUser = dateSelectedField.setBoolean(aDateChooser, false);
                isDateSelectedByUser = false;
            } catch (Exception ignoreOrNot) {
                //System.out.println(ignoreOrNot);
            }
        }
    }//GEN-LAST:event_jDateChooser1PropertyChange

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
            java.util.logging.Logger.getLogger(AdminUpdateEvent.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminUpdateEvent.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminUpdateEvent.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminUpdateEvent.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminUpdateEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}