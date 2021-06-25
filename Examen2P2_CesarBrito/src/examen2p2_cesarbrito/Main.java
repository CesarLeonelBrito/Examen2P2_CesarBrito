package examen2p2_cesarbrito;

import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_add_combustion = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        marca_add_combustion = new javax.swing.JTextField();
        modelo_add_combustion = new javax.swing.JTextField();
        comb_suv = new javax.swing.JRadioButton();
        comb_familiar = new javax.swing.JRadioButton();
        comb_compacto = new javax.swing.JRadioButton();
        comb_sub = new javax.swing.JRadioButton();
        comb_deportivo = new javax.swing.JRadioButton();
        vin_add_combustion = new javax.swing.JFormattedTextField();
        cilindrada_add_combustion = new javax.swing.JFormattedTextField();
        cilindros_add_combustion = new javax.swing.JFormattedTextField();
        consumo_add_combustion = new javax.swing.JFormattedTextField();
        jb_agregar_combustion = new javax.swing.JButton();
        jd_add_hibrido = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        vin_add_hibrido = new javax.swing.JFormattedTextField();
        marca_add_hibrido = new javax.swing.JTextField();
        kilo_add_hibrido = new javax.swing.JFormattedTextField();
        modelo_add_hibrido = new javax.swing.JTextField();
        pasajeros_add_hibrido = new javax.swing.JFormattedTextField();
        precio_add_hibrido = new javax.swing.JFormattedTextField();
        jb_agregar_hibrido = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        hibrido_suv = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        hibrido_familiar = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        hibrido_compacto = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        hibrido_sub = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        hibrido_deportivo = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jd_add_enchufable = new javax.swing.JDialog();
        enchufable_deportivo = new javax.swing.JRadioButton();
        jb_agregar_enchufable = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        enchufable_suv = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        enchufable_familiar = new javax.swing.JRadioButton();
        vin_add_enchufable = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        marca_add_enchufable = new javax.swing.JTextField();
        enchufable_compacto = new javax.swing.JRadioButton();
        maletero_add_enchufable = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        modelo_add_enchufable = new javax.swing.JTextField();
        enchufable_sub = new javax.swing.JRadioButton();
        galones_add_enchufable = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        jd_add_electrico = new javax.swing.JDialog();
        recarga_add_elec = new javax.swing.JFormattedTextField();
        elec_deportivo = new javax.swing.JRadioButton();
        jb_agregar_elec = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        elec_suv = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        elec_familiar = new javax.swing.JRadioButton();
        vin_add_elec = new javax.swing.JFormattedTextField();
        jLabel26 = new javax.swing.JLabel();
        marca_add_elec = new javax.swing.JTextField();
        elec_compacto = new javax.swing.JRadioButton();
        coeficiente_add_coeficiente = new javax.swing.JFormattedTextField();
        modelo_add_elec = new javax.swing.JTextField();
        elec_sub = new javax.swing.JRadioButton();
        motores_add_elec = new javax.swing.JFormattedTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jd_listar_vehiculos = new javax.swing.JDialog();
        jd_listar_baterias = new javax.swing.JDialog();
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

        jd_add_combustion.setMinimumSize(new java.awt.Dimension(812, 609));
        jd_add_combustion.setSize(new java.awt.Dimension(812, 609));

        jLabel2.setText("Marca:");

        jLabel3.setText("Modelo:");

        jLabel4.setText("Carroceria:");

        jLabel5.setText("VIN:");

        jLabel6.setText("Cilindrada:");

        jLabel7.setText("Cilindros del Motor:");

        jLabel8.setText("Consumo:");

        buttonGroup1.add(comb_suv);
        comb_suv.setText("SUV");

        buttonGroup1.add(comb_familiar);
        comb_familiar.setText("Familiar");

        buttonGroup1.add(comb_compacto);
        comb_compacto.setText("Compacto");

        buttonGroup1.add(comb_sub);
        comb_sub.setText("Sub-Compacto");

        buttonGroup1.add(comb_deportivo);
        comb_deportivo.setText("Deportivo");

        vin_add_combustion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        cilindrada_add_combustion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        cilindros_add_combustion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        consumo_add_combustion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        jb_agregar_combustion.setText("Agregar");
        jb_agregar_combustion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregar_combustionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_add_combustionLayout = new javax.swing.GroupLayout(jd_add_combustion.getContentPane());
        jd_add_combustion.getContentPane().setLayout(jd_add_combustionLayout);
        jd_add_combustionLayout.setHorizontalGroup(
            jd_add_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_add_combustionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_add_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_agregar_combustion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jd_add_combustionLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(100, 100, 100)
                        .addComponent(marca_add_combustion))
                    .addGroup(jd_add_combustionLayout.createSequentialGroup()
                        .addGroup(jd_add_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(jd_add_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cilindrada_add_combustion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modelo_add_combustion, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                            .addGroup(jd_add_combustionLayout.createSequentialGroup()
                                .addComponent(comb_suv)
                                .addGap(18, 18, 18)
                                .addComponent(comb_familiar)
                                .addGap(18, 18, 18)
                                .addComponent(comb_compacto)
                                .addGap(18, 18, 18)
                                .addComponent(comb_sub)
                                .addGap(18, 18, 18)
                                .addComponent(comb_deportivo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(vin_add_combustion)
                            .addComponent(cilindros_add_combustion)
                            .addComponent(consumo_add_combustion))))
                .addContainerGap())
        );
        jd_add_combustionLayout.setVerticalGroup(
            jd_add_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_add_combustionLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jd_add_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(marca_add_combustion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_add_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(modelo_add_combustion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_add_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comb_suv)
                    .addComponent(comb_familiar)
                    .addComponent(comb_compacto)
                    .addComponent(comb_sub)
                    .addComponent(comb_deportivo))
                .addGap(18, 18, 18)
                .addGroup(jd_add_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(vin_add_combustion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_add_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cilindrada_add_combustion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_add_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cilindros_add_combustion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_add_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(consumo_add_combustion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jb_agregar_combustion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jd_add_hibrido.setMinimumSize(new java.awt.Dimension(812, 609));
        jd_add_hibrido.setSize(new java.awt.Dimension(812, 609));

        jLabel9.setText("Precio:");

        vin_add_hibrido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        kilo_add_hibrido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        pasajeros_add_hibrido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        precio_add_hibrido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        jb_agregar_hibrido.setText("Agregar");
        jb_agregar_hibrido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregar_hibridoActionPerformed(evt);
            }
        });

        jLabel10.setText("Marca:");

        buttonGroup2.add(hibrido_suv);
        hibrido_suv.setText("SUV");

        jLabel11.setText("Modelo:");

        buttonGroup2.add(hibrido_familiar);
        hibrido_familiar.setText("Familiar");

        jLabel12.setText("Carroceria:");

        buttonGroup2.add(hibrido_compacto);
        hibrido_compacto.setText("Compacto");

        jLabel13.setText("VIN:");

        buttonGroup2.add(hibrido_sub);
        hibrido_sub.setText("Sub-Compacto");

        jLabel14.setText("Kilometros:");

        buttonGroup2.add(hibrido_deportivo);
        hibrido_deportivo.setText("Deportivo");

        jLabel15.setText("Cantidad de Pasajeros:");

        javax.swing.GroupLayout jd_add_hibridoLayout = new javax.swing.GroupLayout(jd_add_hibrido.getContentPane());
        jd_add_hibrido.getContentPane().setLayout(jd_add_hibridoLayout);
        jd_add_hibridoLayout.setHorizontalGroup(
            jd_add_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_add_hibridoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_add_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_agregar_hibrido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jd_add_hibridoLayout.createSequentialGroup()
                        .addGroup(jd_add_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10))
                        .addGap(30, 30, 30)
                        .addGroup(jd_add_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marca_add_hibrido)
                            .addComponent(kilo_add_hibrido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modelo_add_hibrido, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                            .addGroup(jd_add_hibridoLayout.createSequentialGroup()
                                .addComponent(hibrido_suv)
                                .addGap(18, 18, 18)
                                .addComponent(hibrido_familiar)
                                .addGap(18, 18, 18)
                                .addComponent(hibrido_compacto)
                                .addGap(18, 18, 18)
                                .addComponent(hibrido_sub)
                                .addGap(18, 18, 18)
                                .addComponent(hibrido_deportivo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(vin_add_hibrido)
                            .addComponent(pasajeros_add_hibrido)
                            .addComponent(precio_add_hibrido))))
                .addContainerGap())
        );
        jd_add_hibridoLayout.setVerticalGroup(
            jd_add_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_add_hibridoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jd_add_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(marca_add_hibrido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_add_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(modelo_add_hibrido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_add_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(hibrido_suv)
                    .addComponent(hibrido_familiar)
                    .addComponent(hibrido_compacto)
                    .addComponent(hibrido_sub)
                    .addComponent(hibrido_deportivo))
                .addGap(18, 18, 18)
                .addGroup(jd_add_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(vin_add_hibrido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_add_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(kilo_add_hibrido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_add_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(pasajeros_add_hibrido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_add_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(precio_add_hibrido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jb_agregar_hibrido, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jd_add_enchufable.setMinimumSize(new java.awt.Dimension(812, 609));
        jd_add_enchufable.setSize(new java.awt.Dimension(812, 609));

        buttonGroup3.add(enchufable_deportivo);
        enchufable_deportivo.setText("Deportivo");

        jb_agregar_enchufable.setText("Agregar");
        jb_agregar_enchufable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregar_enchufableActionPerformed(evt);
            }
        });

        jLabel16.setText("Galones:");

        jLabel17.setText("Marca:");

        buttonGroup3.add(enchufable_suv);
        enchufable_suv.setText("SUV");

        jLabel18.setText("Modelo:");

        buttonGroup3.add(enchufable_familiar);
        enchufable_familiar.setText("Familiar");

        vin_add_enchufable.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        jLabel20.setText("Carroceria:");

        buttonGroup3.add(enchufable_compacto);
        enchufable_compacto.setText("Compacto");

        maletero_add_enchufable.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        jLabel21.setText("VIN:");

        buttonGroup3.add(enchufable_sub);
        enchufable_sub.setText("Sub-Compacto");

        galones_add_enchufable.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        jLabel22.setText("Maletero:");

        javax.swing.GroupLayout jd_add_enchufableLayout = new javax.swing.GroupLayout(jd_add_enchufable.getContentPane());
        jd_add_enchufable.getContentPane().setLayout(jd_add_enchufableLayout);
        jd_add_enchufableLayout.setHorizontalGroup(
            jd_add_enchufableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_add_enchufableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_add_enchufableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_agregar_enchufable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jd_add_enchufableLayout.createSequentialGroup()
                        .addGroup(jd_add_enchufableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel16)
                            .addComponent(jLabel20)
                            .addComponent(jLabel17))
                        .addGap(30, 30, 30)
                        .addGroup(jd_add_enchufableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marca_add_enchufable)
                            .addComponent(maletero_add_enchufable, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modelo_add_enchufable, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                            .addGroup(jd_add_enchufableLayout.createSequentialGroup()
                                .addComponent(enchufable_suv)
                                .addGap(18, 18, 18)
                                .addComponent(enchufable_familiar)
                                .addGap(18, 18, 18)
                                .addComponent(enchufable_compacto)
                                .addGap(18, 18, 18)
                                .addComponent(enchufable_sub)
                                .addGap(18, 18, 18)
                                .addComponent(enchufable_deportivo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(vin_add_enchufable)
                            .addComponent(galones_add_enchufable))))
                .addContainerGap())
        );
        jd_add_enchufableLayout.setVerticalGroup(
            jd_add_enchufableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_add_enchufableLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jd_add_enchufableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(marca_add_enchufable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_add_enchufableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(modelo_add_enchufable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_add_enchufableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(enchufable_suv)
                    .addComponent(enchufable_familiar)
                    .addComponent(enchufable_compacto)
                    .addComponent(enchufable_sub)
                    .addComponent(enchufable_deportivo))
                .addGap(18, 18, 18)
                .addGroup(jd_add_enchufableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(vin_add_enchufable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_add_enchufableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(maletero_add_enchufable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_add_enchufableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(galones_add_enchufable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jb_agregar_enchufable, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jd_add_electrico.setMinimumSize(new java.awt.Dimension(812, 609));
        jd_add_electrico.setSize(new java.awt.Dimension(812, 609));

        recarga_add_elec.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        buttonGroup4.add(elec_deportivo);
        elec_deportivo.setText("Deportivo");

        jb_agregar_elec.setText("Agregar");
        jb_agregar_elec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregar_elecActionPerformed(evt);
            }
        });

        jLabel19.setText("Cantidad Motores:");

        jLabel23.setText("Marca:");

        buttonGroup4.add(elec_suv);
        elec_suv.setText("SUV");

        jLabel24.setText("Modelo:");

        jLabel25.setText("Recarga:");

        buttonGroup4.add(elec_familiar);
        elec_familiar.setText("Familiar");

        vin_add_elec.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        jLabel26.setText("Carroceria:");

        buttonGroup4.add(elec_compacto);
        elec_compacto.setText("Compacto");

        coeficiente_add_coeficiente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        buttonGroup4.add(elec_sub);
        elec_sub.setText("Sub-Compacto");

        motores_add_elec.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        jLabel27.setText("Coeficiente:");

        jLabel28.setText("VIN:");

        javax.swing.GroupLayout jd_add_electricoLayout = new javax.swing.GroupLayout(jd_add_electrico.getContentPane());
        jd_add_electrico.getContentPane().setLayout(jd_add_electricoLayout);
        jd_add_electricoLayout.setHorizontalGroup(
            jd_add_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_add_electricoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_add_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_agregar_elec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jd_add_electricoLayout.createSequentialGroup()
                        .addGroup(jd_add_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel27)
                            .addComponent(jLabel19)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel23)
                            .addComponent(jLabel28))
                        .addGap(30, 30, 30)
                        .addGroup(jd_add_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marca_add_elec)
                            .addComponent(coeficiente_add_coeficiente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modelo_add_elec, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                            .addGroup(jd_add_electricoLayout.createSequentialGroup()
                                .addComponent(elec_suv)
                                .addGap(18, 18, 18)
                                .addComponent(elec_familiar)
                                .addGap(18, 18, 18)
                                .addComponent(elec_compacto)
                                .addGap(18, 18, 18)
                                .addComponent(elec_sub)
                                .addGap(18, 18, 18)
                                .addComponent(elec_deportivo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(vin_add_elec)
                            .addComponent(motores_add_elec)
                            .addComponent(recarga_add_elec))))
                .addContainerGap())
        );
        jd_add_electricoLayout.setVerticalGroup(
            jd_add_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_add_electricoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jd_add_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(marca_add_elec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_add_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(modelo_add_elec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_add_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(elec_suv)
                    .addComponent(elec_familiar)
                    .addComponent(elec_compacto)
                    .addComponent(elec_sub)
                    .addComponent(elec_deportivo))
                .addGap(18, 18, 18)
                .addGroup(jd_add_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vin_add_elec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jd_add_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(coeficiente_add_coeficiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_add_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(motores_add_elec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_add_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(recarga_add_elec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jb_agregar_elec, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_listar_vehiculosLayout = new javax.swing.GroupLayout(jd_listar_vehiculos.getContentPane());
        jd_listar_vehiculos.getContentPane().setLayout(jd_listar_vehiculosLayout);
        jd_listar_vehiculosLayout.setHorizontalGroup(
            jd_listar_vehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_listar_vehiculosLayout.setVerticalGroup(
            jd_listar_vehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_listar_bateriasLayout = new javax.swing.GroupLayout(jd_listar_baterias.getContentPane());
        jd_listar_baterias.getContentPane().setLayout(jd_listar_bateriasLayout);
        jd_listar_bateriasLayout.setHorizontalGroup(
            jd_listar_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_listar_bateriasLayout.setVerticalGroup(
            jd_listar_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

    private void jb_agregar_combustionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregar_combustionActionPerformed
        // TODO add your handling code here:
        try {
            String marca = marca_add_combustion.getText();
            String modelo = modelo_add_combustion.getText();;
            String carroceria = "";
            if (comb_suv.isSelected()) {
                carroceria = "SUV";
            } else if (comb_sub.isSelected()) {
                carroceria = "Sub_Compacto";
            } else if (comb_familiar.isSelected()) {
                carroceria = "Familiar";
            } else if (comb_deportivo.isSelected()) {
                carroceria = "Deportivo";
            } else {
                carroceria = "Compacto";
            }
            int vin = Integer.parseInt(vin_add_combustion.getText());
            int cilindrada = Integer.parseInt(cilindrada_add_combustion.getText());
            int motores = Integer.parseInt(cilindros_add_combustion.getText());
            int consumo = Integer.parseInt(consumo_add_combustion.getText());
            Combustion x = new Combustion(cilindrada, motores, consumo, marca, modelo, carroceria, vin);
            AdministrarVehiculo av = new AdministrarVehiculo("./clases.cbm");
            av.cargarArchivo();
            av.getListaVehiculos().add(x);
            av.escribirArchivo();
            marca_add_combustion.setText("");
            modelo_add_combustion.setText("");
            vin_add_combustion.setText("");
            cilindrada_add_combustion.setText("");
            cilindros_add_combustion.setText("");
            consumo_add_combustion.setText("");
            jd_add_combustion.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_agregar_combustionActionPerformed

    private void jb_agregar_hibridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregar_hibridoActionPerformed
        // TODO add your handling code here:
        try {
            String marca = marca_add_hibrido.getText();
            String modelo = modelo_add_hibrido.getText();;
            String carroceria = "";
            if (hibrido_suv.isSelected()) {
                carroceria = "SUV";
            } else if (hibrido_sub.isSelected()) {
                carroceria = "Sub_Compacto";
            } else if (hibrido_familiar.isSelected()) {
                carroceria = "Familiar";
            } else if (hibrido_deportivo.isSelected()) {
                carroceria = "Deportivo";
            } else {
                carroceria = "Compacto";
            }
            int vin = Integer.parseInt(vin_add_hibrido.getText());
            int kilometros = Integer.parseInt(kilo_add_hibrido.getText());
            int pasajeros = Integer.parseInt(pasajeros_add_hibrido.getText());
            int precio = Integer.parseInt(precio_add_hibrido.getText());
            Hibrido x = new Hibrido(kilometros, pasajeros, precio, marca, modelo, carroceria, vin);
            AdministrarVehiculo av = new AdministrarVehiculo("./Vehiculos.cbm");
            av.cargarArchivo();
            av.getListaVehiculos().add(x);
            av.escribirArchivo();
            marca_add_hibrido.setText("");
            modelo_add_hibrido.setText("");
            vin_add_hibrido.setText("");
            kilo_add_hibrido.setText("");
            pasajeros_add_hibrido.setText("");
            precio_add_hibrido.setText("");
            jd_add_hibrido.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_agregar_hibridoActionPerformed

    private void jb_agregar_enchufableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregar_enchufableActionPerformed
        // TODO add your handling code here:
        try {
            String marca = marca_add_enchufable.getText();
            String modelo = modelo_add_enchufable.getText();;
            String carroceria = "";
            if (enchufable_suv.isSelected()) {
                carroceria = "SUV";
            } else if (enchufable_sub.isSelected()) {
                carroceria = "Sub_Compacto";
            } else if (enchufable_familiar.isSelected()) {
                carroceria = "Familiar";
            } else if (enchufable_deportivo.isSelected()) {
                carroceria = "Deportivo";
            } else {
                carroceria = "Compacto";
            }
            int vin = Integer.parseInt(vin_add_enchufable.getText());
            int maletero = Integer.parseInt(maletero_add_enchufable.getText());
            int galones = Integer.parseInt(galones_add_enchufable.getText());
            HibridoEnchufable x = new HibridoEnchufable(maletero, galones, marca, modelo, carroceria, vin);
            AdministrarVehiculo av = new AdministrarVehiculo("./Vehiculos.cbm");
            av.cargarArchivo();
            av.getListaVehiculos().add(x);
            av.escribirArchivo();
            marca_add_enchufable.setText("");
            modelo_add_enchufable.setText("");
            vin_add_enchufable.setText("");
            maletero_add_enchufable.setText("");
            galones_add_enchufable.setText("");
            jd_add_enchufable.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_agregar_enchufableActionPerformed

    private void jb_agregar_elecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregar_elecActionPerformed
        // TODO add your handling code here:
        try {
            String marca = marca_add_elec.getText();
            String modelo = modelo_add_elec.getText();;
            String carroceria = "";
            if (elec_suv.isSelected()) {
                carroceria = "SUV";
            } else if (elec_sub.isSelected()) {
                carroceria = "Sub_Compacto";
            } else if (elec_familiar.isSelected()) {
                carroceria = "Familiar";
            } else if (elec_deportivo.isSelected()) {
                carroceria = "Deportivo";
            } else {
                carroceria = "Compacto";
            }
            int vin = Integer.parseInt(vin_add_elec.getText());
            int coeficiente = Integer.parseInt(coeficiente_add_coeficiente.getText());
            int motores = Integer.parseInt(motores_add_elec.getText());
            int recarga = Integer.parseInt(recarga_add_elec.getText());
            ElectricoPuro x = new ElectricoPuro(coeficiente, motores, recarga, marca, modelo, carroceria, vin);
            AdministrarVehiculo av = new AdministrarVehiculo("./Vehiculos.cbm");
            av.cargarArchivo();
            av.getListaVehiculos().add(x);
            av.escribirArchivo();
            marca_add_elec.setText("");
            modelo_add_elec.setText("");
            vin_add_elec.setText("");
            coeficiente_add_coeficiente.setText("");
            motores_add_elec.setText("");
            recarga_add_elec.setText("");
            jd_add_electrico.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_agregar_elecActionPerformed

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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JFormattedTextField cilindrada_add_combustion;
    private javax.swing.JFormattedTextField cilindros_add_combustion;
    private javax.swing.JFormattedTextField coeficiente_add_coeficiente;
    private javax.swing.JRadioButton comb_compacto;
    private javax.swing.JRadioButton comb_deportivo;
    private javax.swing.JRadioButton comb_familiar;
    private javax.swing.JRadioButton comb_sub;
    private javax.swing.JRadioButton comb_suv;
    private javax.swing.JFormattedTextField consumo_add_combustion;
    private javax.swing.JRadioButton elec_compacto;
    private javax.swing.JRadioButton elec_deportivo;
    private javax.swing.JRadioButton elec_familiar;
    private javax.swing.JRadioButton elec_sub;
    private javax.swing.JRadioButton elec_suv;
    private javax.swing.JRadioButton enchufable_compacto;
    private javax.swing.JRadioButton enchufable_deportivo;
    private javax.swing.JRadioButton enchufable_familiar;
    private javax.swing.JRadioButton enchufable_sub;
    private javax.swing.JRadioButton enchufable_suv;
    private javax.swing.JFormattedTextField galones_add_enchufable;
    private javax.swing.JRadioButton hibrido_compacto;
    private javax.swing.JRadioButton hibrido_deportivo;
    private javax.swing.JRadioButton hibrido_familiar;
    private javax.swing.JRadioButton hibrido_sub;
    private javax.swing.JRadioButton hibrido_suv;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JButton jb_add_combustion;
    private javax.swing.JButton jb_add_electrico;
    private javax.swing.JButton jb_add_hibrido;
    private javax.swing.JButton jb_add_hibridoenchufable;
    private javax.swing.JButton jb_agregar_combustion;
    private javax.swing.JButton jb_agregar_elec;
    private javax.swing.JButton jb_agregar_enchufable;
    private javax.swing.JButton jb_agregar_hibrido;
    private javax.swing.JButton jb_listar_baterias;
    private javax.swing.JButton jb_listar_vehiculo;
    private javax.swing.JDialog jd_add_combustion;
    private javax.swing.JDialog jd_add_electrico;
    private javax.swing.JDialog jd_add_enchufable;
    private javax.swing.JDialog jd_add_hibrido;
    private javax.swing.JButton jd_ensamblar_carro;
    private javax.swing.JDialog jd_listar_baterias;
    private javax.swing.JDialog jd_listar_vehiculos;
    private javax.swing.JFormattedTextField kilo_add_hibrido;
    private javax.swing.JFormattedTextField maletero_add_enchufable;
    private javax.swing.JTextField marca_add_combustion;
    private javax.swing.JTextField marca_add_elec;
    private javax.swing.JTextField marca_add_enchufable;
    private javax.swing.JTextField marca_add_hibrido;
    private javax.swing.JTextField modelo_add_combustion;
    private javax.swing.JTextField modelo_add_elec;
    private javax.swing.JTextField modelo_add_enchufable;
    private javax.swing.JTextField modelo_add_hibrido;
    private javax.swing.JFormattedTextField motores_add_elec;
    private javax.swing.JFormattedTextField pasajeros_add_hibrido;
    private javax.swing.JFormattedTextField precio_add_hibrido;
    private javax.swing.JFormattedTextField recarga_add_elec;
    private javax.swing.JFormattedTextField vin_add_combustion;
    private javax.swing.JFormattedTextField vin_add_elec;
    private javax.swing.JFormattedTextField vin_add_enchufable;
    private javax.swing.JFormattedTextField vin_add_hibrido;
    // End of variables declaration//GEN-END:variables
}
