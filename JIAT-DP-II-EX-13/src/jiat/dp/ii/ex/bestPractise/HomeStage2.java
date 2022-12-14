/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jiat.dp.ii.ex.bestPractise;

import BadPractise.HomeStage1;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jiat.dp.ii.ex.bestPractise.models.Vehicle;
import jiat.dp.ii.ex.bestPractise.utils.ConstantUtils;
import jiat.dp.ii.ex.bestPractise.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author grays
 */
public class HomeStage2 extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    private DefaultTableModel defaultTablemodel = null;

    public HomeStage2() {
        initComponents();
        defaultTablemodel = (DefaultTableModel) jTable1.getModel();
        Session session = HibernateUtil.getSessionFactory().openSession();
        loadTableofVehicles(session);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Brand = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Engine = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Seats = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Description = new javax.swing.JTextField();
        svSeller = new javax.swing.JButton();
        svSeller1 = new javax.swing.JButton();
        svSeller2 = new javax.swing.JButton();
        svSeller3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle ID", "Vehicle Name", "Vehicle Brand", "Vehicle Engine", "Vehicle Seats", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Vehicle Brand");

        Brand.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Vehicle Name");

        Name.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Vehicle Engine");

        Engine.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Engine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EngineActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Vehicle Seats");

        Seats.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Seats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeatsActionPerformed(evt);
            }
        });
        Seats.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SeatsKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Vehicle Description");

        Description.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescriptionActionPerformed(evt);
            }
        });

        svSeller.setBackground(new java.awt.Color(255, 255, 51));
        svSeller.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        svSeller.setForeground(new java.awt.Color(0, 0, 0));
        svSeller.setText("Insert");
        svSeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svSellerActionPerformed(evt);
            }
        });

        svSeller1.setBackground(new java.awt.Color(255, 0, 51));
        svSeller1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        svSeller1.setForeground(new java.awt.Color(0, 0, 0));
        svSeller1.setText("Update");
        svSeller1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svSeller1ActionPerformed(evt);
            }
        });

        svSeller2.setBackground(new java.awt.Color(0, 0, 204));
        svSeller2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        svSeller2.setForeground(new java.awt.Color(255, 255, 255));
        svSeller2.setText("Delete");
        svSeller2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svSeller2ActionPerformed(evt);
            }
        });

        svSeller3.setBackground(new java.awt.Color(51, 255, 51));
        svSeller3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        svSeller3.setForeground(new java.awt.Color(0, 0, 0));
        svSeller3.setText("Clear All");
        svSeller3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svSeller3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Brand, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Engine, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Seats, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(svSeller, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(svSeller1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(svSeller2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(svSeller3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Engine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Seats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(svSeller)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(svSeller1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(svSeller2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(svSeller3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Product");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (jTable1.getSelectedRow() > -1) {
            int selectedRow = jTable1.getSelectedRow();
            String selectedVehicleId = jTable1.getValueAt(selectedRow, 0).toString();
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction().commit();
            Vehicle selectedVehicle = (Vehicle) session.createCriteria(Vehicle.class).add(Restrictions.eq("vehiId", Integer.valueOf(selectedVehicleId))).uniqueResult();
            Name.setText(selectedVehicle.getVehiName());
            Brand.setText(selectedVehicle.getVehiBrand());
            Engine.setText(selectedVehicle.getVehiEngine());
            Seats.setText(selectedVehicle.getVehiSeats());
            Description.setText(selectedVehicle.getVehiDescrip());

            session.flush();
            session.clear();
            session.close();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void BrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrandActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void EngineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EngineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EngineActionPerformed

    private void SeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeatsActionPerformed

    private void SeatsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SeatsKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_SeatsKeyTyped

    private void DescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescriptionActionPerformed

    private void svSellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svSellerActionPerformed
        if (!Brand.getText().isEmpty() || !Name.getText().isEmpty() || !Engine.getText().isEmpty() || !Seats.getText().isEmpty() || !Description.getText().isEmpty()) {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction savingTransaction = session.beginTransaction();
            try {
                Vehicle savingVehicle = new Vehicle(Name.getText(), Brand.getText(), Engine.getText(), Seats.getText(), Description.getText(), 1, "");
                session.save(savingVehicle);
                Brand.setText("");
                Name.setText("");
                Engine.setText("");
                Seats.setText("");
                Description.setText("");
                loadTableofVehicles(session);
            } catch (Exception ex) {
                Logger.getLogger(HomeStage2.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                savingTransaction.commit();
            }
        } else {
            JOptionPane.showMessageDialog(this, ConstantUtils.getEMPTY_FEILD_ERROR(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_svSellerActionPerformed

    private void svSeller1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svSeller1ActionPerformed
        if (jTable1.getSelectedRow() > -1) {
            if (!Brand.getText().isEmpty() || !Name.getText().isEmpty() || !Engine.getText().isEmpty() || !Seats.getText().isEmpty() || !Description.getText().isEmpty()) {
                Session session = HibernateUtil.getSessionFactory().openSession();
                Transaction updatingTransaction = session.beginTransaction();
                try {
                    int selectedRow = jTable1.getSelectedRow();
                    String selectedVehicleId = jTable1.getValueAt(selectedRow, 0).toString();
                    Vehicle selectedVehicle = (Vehicle) session.createCriteria(Vehicle.class).add(Restrictions.eq("vehiId", Integer.valueOf(selectedVehicleId))).uniqueResult();

                    selectedVehicle.setVehiName(Name.getText());
                    selectedVehicle.setVehiBrand(Brand.getText());
                    selectedVehicle.setVehiEngine(Engine.getText());
                    selectedVehicle.setVehiSeats(Seats.getText());
                    selectedVehicle.setVehiDescrip(Description.getText());

                    session.save(selectedVehicle);

                    Brand.setText("");
                    Name.setText("");
                    Engine.setText("");
                    Seats.setText("");
                    Description.setText("");
                    loadTableofVehicles(session);

                } catch (Exception ex) {
                    Logger.getLogger(HomeStage1.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    updatingTransaction.commit();
                }
            } else {
                JOptionPane.showMessageDialog(this, ConstantUtils.getEMPTY_FEILD_ERROR(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "select a row to update", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_svSeller1ActionPerformed

    private void svSeller2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svSeller2ActionPerformed
        if (jTable1.getSelectedRow() > -1) {
            int selectedRow = jTable1.getSelectedRow();
            String selectedVehicleId = jTable1.getValueAt(selectedRow, 0).toString();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            Vehicle selectedVehicle = (Vehicle) session.createCriteria(Vehicle.class).add(Restrictions.eq("vehiId", Integer.valueOf(selectedVehicleId))).uniqueResult();

            session.delete(selectedVehicle);

            Brand.setText("");
            Name.setText("");
            Engine.setText("");
            Seats.setText("");
            Description.setText("");

            loadTableofVehicles(session);
            transaction.commit();
        }else {
            JOptionPane.showMessageDialog(this, "select a row to Delete", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_svSeller2ActionPerformed

    private void svSeller3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svSeller3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_svSeller3ActionPerformed

    private void loadTableofVehicles(Session session) {
        defaultTablemodel.setRowCount(0);
        try {
            List<Vehicle> vehicleList = session.createCriteria(Vehicle.class).list();
            for (Vehicle currentVehicle : vehicleList) {
                Vector row = new Vector<>();
                row.add(currentVehicle.getVehiId());
                row.add(currentVehicle.getVehiName());
                row.add(currentVehicle.getVehiBrand());
                row.add(currentVehicle.getVehiEngine());
                row.add(currentVehicle.getVehiSeats());
                row.add(currentVehicle.getVehiDescrip());
                defaultTablemodel.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.clear();
            session.close();
        }
    }

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HomeStage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HomeStage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HomeStage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HomeStage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HomeStage2().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Brand;
    private javax.swing.JTextField Description;
    private javax.swing.JTextField Engine;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Seats;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton svSeller;
    private javax.swing.JButton svSeller1;
    private javax.swing.JButton svSeller2;
    private javax.swing.JButton svSeller3;
    // End of variables declaration//GEN-END:variables
}
