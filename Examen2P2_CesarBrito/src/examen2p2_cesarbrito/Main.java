package examen2p2_cesarbrito;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_add_combustion = new javax.swing.JDialog();
        jd_add_hibrido = new javax.swing.JDialog();
        jd_add_enchufable = new javax.swing.JDialog();
        jd_add_electrico = new javax.swing.JDialog();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jb_add_combustion = new javax.swing.JButton();
        jb_add_hibrido = new javax.swing.JButton();
        jb_add_hibridoenchufable = new javax.swing.JButton();
        jb_add_electrico = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        jb_listar_vehiculo = new javax.swing.JButton();
        jb_listar_baterias = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jd_ensamblar_carro = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jd_add_combustionLayout = new javax.swing.GroupLayout(jd_add_combustion.getContentPane());
        jd_add_combustion.getContentPane().setLayout(jd_add_combustionLayout);
        jd_add_combustionLayout.setHorizontalGroup(
            jd_add_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_add_combustionLayout.setVerticalGroup(
            jd_add_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_add_hibridoLayout = new javax.swing.GroupLayout(jd_add_hibrido.getContentPane());
        jd_add_hibrido.getContentPane().setLayout(jd_add_hibridoLayout);
        jd_add_hibridoLayout.setHorizontalGroup(
            jd_add_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_add_hibridoLayout.setVerticalGroup(
            jd_add_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_add_enchufableLayout = new javax.swing.GroupLayout(jd_add_enchufable.getContentPane());
        jd_add_enchufable.getContentPane().setLayout(jd_add_enchufableLayout);
        jd_add_enchufableLayout.setHorizontalGroup(
            jd_add_enchufableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_add_enchufableLayout.setVerticalGroup(
            jd_add_enchufableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_add_electricoLayout = new javax.swing.GroupLayout(jd_add_electrico.getContentPane());
        jd_add_electrico.getContentPane().setLayout(jd_add_electricoLayout);
        jd_add_electricoLayout.setHorizontalGroup(
            jd_add_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_add_electricoLayout.setVerticalGroup(
            jd_add_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jToolBar1.setRollover(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Agregar Vehiculo:");
        jToolBar1.add(jLabel1);

        jb_add_combustion.setText("Combustion");
        jb_add_combustion.setFocusable(false);
        jb_add_combustion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_add_combustion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jb_add_combustion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_add_combustionActionPerformed(evt);
            }
        });
        jToolBar1.add(jb_add_combustion);

        jb_add_hibrido.setText("Hibrido");
        jb_add_hibrido.setFocusable(false);
        jb_add_hibrido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_add_hibrido.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jb_add_hibrido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_add_hibridoActionPerformed(evt);
            }
        });
        jToolBar1.add(jb_add_hibrido);

        jb_add_hibridoenchufable.setText("Hibrido Enchufable");
        jb_add_hibridoenchufable.setFocusable(false);
        jb_add_hibridoenchufable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_add_hibridoenchufable.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jb_add_hibridoenchufable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_add_hibridoenchufableActionPerformed(evt);
            }
        });
        jToolBar1.add(jb_add_hibridoenchufable);

        jb_add_electrico.setText("Electrico Puro");
        jb_add_electrico.setFocusable(false);
        jb_add_electrico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_add_electrico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jb_add_electrico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_add_electricoActionPerformed(evt);
            }
        });
        jToolBar1.add(jb_add_electrico);

        jToolBar2.setRollover(true);

        jb_listar_vehiculo.setText("Listar Vehiculos");
        jb_listar_vehiculo.setFocusable(false);
        jb_listar_vehiculo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_listar_vehiculo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jb_listar_vehiculo);

        jb_listar_baterias.setText("Listar Baterias");
        jb_listar_baterias.setFocusable(false);
        jb_listar_baterias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_listar_baterias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jb_listar_baterias);
        jToolBar2.add(jSeparator1);

        jd_ensamblar_carro.setText("Ensamblar un Carro");
        jd_ensamblar_carro.setFocusable(false);
        jd_ensamblar_carro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jd_ensamblar_carro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jd_ensamblar_carro);

        jButton1.setText("Listar Carros Ensamblados");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(497, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_add_combustionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_add_combustionActionPerformed
        // TODO add your handling code here:
        jd_add_combustion.setModal(true);
        jd_add_combustion.pack();
        jd_add_combustion.setLocationRelativeTo(this);
        jd_add_combustion.setVisible(true);
    }//GEN-LAST:event_jb_add_combustionActionPerformed

    private void jb_add_hibridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_add_hibridoActionPerformed
        // TODO add your handling code here:
        jd_add_hibrido.setModal(true);
        jd_add_hibrido.pack();
        jd_add_hibrido.setLocationRelativeTo(this);
        jd_add_hibrido.setVisible(true);
    }//GEN-LAST:event_jb_add_hibridoActionPerformed

    private void jb_add_hibridoenchufableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_add_hibridoenchufableActionPerformed
        // TODO add your handling code here:
        jd_add_enchufable.setModal(true);
        jd_add_enchufable.pack();
        jd_add_enchufable.setLocationRelativeTo(this);
        jd_add_enchufable.setVisible(true);
    }//GEN-LAST:event_jb_add_hibridoenchufableActionPerformed

    private void jb_add_electricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_add_electricoActionPerformed
        // TODO add your handling code here:
        jd_add_electrico.setModal(true);
        jd_add_electrico.pack();
        jd_add_electrico.setLocationRelativeTo(this);
        jd_add_electrico.setVisible(true);
    }//GEN-LAST:event_jb_add_electricoActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JButton jb_add_combustion;
    private javax.swing.JButton jb_add_electrico;
    private javax.swing.JButton jb_add_hibrido;
    private javax.swing.JButton jb_add_hibridoenchufable;
    private javax.swing.JButton jb_listar_baterias;
    private javax.swing.JButton jb_listar_vehiculo;
    private javax.swing.JDialog jd_add_combustion;
    private javax.swing.JDialog jd_add_electrico;
    private javax.swing.JDialog jd_add_enchufable;
    private javax.swing.JDialog jd_add_hibrido;
    private javax.swing.JButton jd_ensamblar_carro;
    // End of variables declaration//GEN-END:variables
}
