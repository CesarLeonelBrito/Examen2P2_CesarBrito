package examen2p2_cesarbrito;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        ensam = new Ensamblar(prog_bar);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_vehiculos = new javax.swing.JTable();
        eliminar_vehiculo = new javax.swing.JButton();
        modificar_vehiculo = new javax.swing.JButton();
        jd_mod_combustion = new javax.swing.JDialog();
        jLabel29 = new javax.swing.JLabel();
        vin_add_combustion1 = new javax.swing.JFormattedTextField();
        marca_add_combustion1 = new javax.swing.JTextField();
        cilindrada_add_combustion1 = new javax.swing.JFormattedTextField();
        modelo_add_combustion1 = new javax.swing.JTextField();
        cilindros_add_combustion1 = new javax.swing.JFormattedTextField();
        consumo_add_combustion1 = new javax.swing.JFormattedTextField();
        jb_modificar_combustion = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        comb_suv1 = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();
        comb_familiar1 = new javax.swing.JRadioButton();
        jLabel32 = new javax.swing.JLabel();
        comb_compacto1 = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        comb_sub1 = new javax.swing.JRadioButton();
        jLabel34 = new javax.swing.JLabel();
        comb_deportivo1 = new javax.swing.JRadioButton();
        jLabel35 = new javax.swing.JLabel();
        jd_mod_hibrido = new javax.swing.JDialog();
        precio_add_hibrido1 = new javax.swing.JFormattedTextField();
        hibrido_deportivo1 = new javax.swing.JRadioButton();
        jb_modificar_hibrido = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        hibrido_suv1 = new javax.swing.JRadioButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        hibrido_familiar1 = new javax.swing.JRadioButton();
        vin_add_hibrido1 = new javax.swing.JFormattedTextField();
        jLabel40 = new javax.swing.JLabel();
        marca_add_hibrido1 = new javax.swing.JTextField();
        hibrido_compacto1 = new javax.swing.JRadioButton();
        kilo_add_hibrido1 = new javax.swing.JFormattedTextField();
        jLabel41 = new javax.swing.JLabel();
        modelo_add_hibrido1 = new javax.swing.JTextField();
        hibrido_sub1 = new javax.swing.JRadioButton();
        pasajeros_add_hibrido1 = new javax.swing.JFormattedTextField();
        jLabel42 = new javax.swing.JLabel();
        jd_mod_enchufable = new javax.swing.JDialog();
        enchufable_familiar1 = new javax.swing.JRadioButton();
        vin_add_enchufable1 = new javax.swing.JFormattedTextField();
        jLabel43 = new javax.swing.JLabel();
        marca_add_enchufable1 = new javax.swing.JTextField();
        enchufable_deportivo1 = new javax.swing.JRadioButton();
        enchufable_compacto1 = new javax.swing.JRadioButton();
        jb_modificar_enchufable = new javax.swing.JButton();
        maletero_add_enchufable1 = new javax.swing.JFormattedTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        modelo_add_enchufable1 = new javax.swing.JTextField();
        enchufable_suv1 = new javax.swing.JRadioButton();
        enchufable_sub1 = new javax.swing.JRadioButton();
        jLabel47 = new javax.swing.JLabel();
        galones_add_enchufable1 = new javax.swing.JFormattedTextField();
        jLabel48 = new javax.swing.JLabel();
        jd_mod_electrico = new javax.swing.JDialog();
        jLabel49 = new javax.swing.JLabel();
        recarga_add_elec1 = new javax.swing.JFormattedTextField();
        marca_add_elec1 = new javax.swing.JTextField();
        elec_compacto1 = new javax.swing.JRadioButton();
        coeficiente_add_coeficiente1 = new javax.swing.JFormattedTextField();
        modelo_add_elec1 = new javax.swing.JTextField();
        elec_sub1 = new javax.swing.JRadioButton();
        motores_add_elec1 = new javax.swing.JFormattedTextField();
        elec_deportivo1 = new javax.swing.JRadioButton();
        jLabel50 = new javax.swing.JLabel();
        jb_modificar_elec = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        elec_suv1 = new javax.swing.JRadioButton();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        elec_familiar1 = new javax.swing.JRadioButton();
        vin_add_elec1 = new javax.swing.JFormattedTextField();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        jd_add_baterias = new javax.swing.JDialog();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        tf_marca = new javax.swing.JTextField();
        tf_autonomia = new javax.swing.JTextField();
        rb_hibrido = new javax.swing.JRadioButton();
        rb_enchufable = new javax.swing.JRadioButton();
        rb_electrico = new javax.swing.JRadioButton();
        tf_capacidad = new javax.swing.JFormattedTextField();
        tf_modulos = new javax.swing.JFormattedTextField();
        tf_carga = new javax.swing.JFormattedTextField();
        tf_tiempo = new javax.swing.JFormattedTextField();
        jb_agregar_bateria = new javax.swing.JButton();
        jd_listar_baterias = new javax.swing.JDialog();
        eliminar_bateria = new javax.swing.JButton();
        modificar_modificar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_baterias = new javax.swing.JTable();
        jd_mod_baterias = new javax.swing.JDialog();
        rb_enchufable1 = new javax.swing.JRadioButton();
        rb_electrico1 = new javax.swing.JRadioButton();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        tf_capacidad1 = new javax.swing.JFormattedTextField();
        jLabel65 = new javax.swing.JLabel();
        tf_modulos1 = new javax.swing.JFormattedTextField();
        jLabel66 = new javax.swing.JLabel();
        tf_carga1 = new javax.swing.JFormattedTextField();
        jLabel67 = new javax.swing.JLabel();
        tf_tiempo1 = new javax.swing.JFormattedTextField();
        tf_marca1 = new javax.swing.JTextField();
        jb_modificar_bateria = new javax.swing.JButton();
        tf_autonomia1 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        rb_hibrido1 = new javax.swing.JRadioButton();
        jLabel69 = new javax.swing.JLabel();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        jd_listar_ensamblados = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_ensamblados = new javax.swing.JTable();
        jd_seleccionar = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        jt_vehiculos1 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jt_baterias1 = new javax.swing.JTable();
        jLabel70 = new javax.swing.JLabel();
        jb_ensamblar = new javax.swing.JButton();
        jd_ensamblar = new javax.swing.JDialog();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        prog_bar = new javax.swing.JProgressBar();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jb_add_combustion = new javax.swing.JButton();
        jb_add_hibrido = new javax.swing.JButton();
        jb_add_hibridoenchufable = new javax.swing.JButton();
        jb_add_electrico = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        jb_listar_vehiculo = new javax.swing.JButton();
        jb_listar_baterias = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jd_ensamblar_carro = new javax.swing.JButton();
        jb_listar_ensamblados = new javax.swing.JButton();

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

        jd_listar_vehiculos.setMinimumSize(new java.awt.Dimension(873, 632));
        jd_listar_vehiculos.setSize(new java.awt.Dimension(873, 632));

        jt_vehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Marca", "VIN", "Carroceria", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_vehiculos);
        if (jt_vehiculos.getColumnModel().getColumnCount() > 0) {
            jt_vehiculos.getColumnModel().getColumn(0).setResizable(false);
            jt_vehiculos.getColumnModel().getColumn(1).setResizable(false);
            jt_vehiculos.getColumnModel().getColumn(2).setResizable(false);
            jt_vehiculos.getColumnModel().getColumn(3).setResizable(false);
            jt_vehiculos.getColumnModel().getColumn(4).setResizable(false);
        }

        eliminar_vehiculo.setText("Eliminar");
        eliminar_vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_vehiculoActionPerformed(evt);
            }
        });

        modificar_vehiculo.setText("Modificar");
        modificar_vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_vehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_listar_vehiculosLayout = new javax.swing.GroupLayout(jd_listar_vehiculos.getContentPane());
        jd_listar_vehiculos.getContentPane().setLayout(jd_listar_vehiculosLayout);
        jd_listar_vehiculosLayout.setHorizontalGroup(
            jd_listar_vehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listar_vehiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_listar_vehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eliminar_vehiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
                    .addComponent(modificar_vehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jd_listar_vehiculosLayout.setVerticalGroup(
            jd_listar_vehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listar_vehiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminar_vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificar_vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel29.setText("Consumo:");

        vin_add_combustion1.setEditable(false);
        vin_add_combustion1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        cilindrada_add_combustion1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        cilindros_add_combustion1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        consumo_add_combustion1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        jb_modificar_combustion.setText("Modificar");
        jb_modificar_combustion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificar_combustionActionPerformed(evt);
            }
        });

        jLabel30.setText("Marca:");

        buttonGroup5.add(comb_suv1);
        comb_suv1.setText("SUV");

        jLabel31.setText("Modelo:");

        buttonGroup5.add(comb_familiar1);
        comb_familiar1.setText("Familiar");

        jLabel32.setText("Carroceria:");

        buttonGroup5.add(comb_compacto1);
        comb_compacto1.setText("Compacto");

        jLabel33.setText("VIN:");

        buttonGroup5.add(comb_sub1);
        comb_sub1.setText("Sub-Compacto");

        jLabel34.setText("Cilindrada:");

        buttonGroup5.add(comb_deportivo1);
        comb_deportivo1.setText("Deportivo");

        jLabel35.setText("Cilindros del Motor:");

        javax.swing.GroupLayout jd_mod_combustionLayout = new javax.swing.GroupLayout(jd_mod_combustion.getContentPane());
        jd_mod_combustion.getContentPane().setLayout(jd_mod_combustionLayout);
        jd_mod_combustionLayout.setHorizontalGroup(
            jd_mod_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mod_combustionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_mod_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_modificar_combustion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jd_mod_combustionLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(100, 100, 100)
                        .addComponent(marca_add_combustion1))
                    .addGroup(jd_mod_combustionLayout.createSequentialGroup()
                        .addGroup(jd_mod_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)
                            .addComponent(jLabel29)
                            .addComponent(jLabel32))
                        .addGap(30, 30, 30)
                        .addGroup(jd_mod_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cilindrada_add_combustion1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modelo_add_combustion1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                            .addGroup(jd_mod_combustionLayout.createSequentialGroup()
                                .addComponent(comb_suv1)
                                .addGap(18, 18, 18)
                                .addComponent(comb_familiar1)
                                .addGap(18, 18, 18)
                                .addComponent(comb_compacto1)
                                .addGap(18, 18, 18)
                                .addComponent(comb_sub1)
                                .addGap(18, 18, 18)
                                .addComponent(comb_deportivo1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(vin_add_combustion1)
                            .addComponent(cilindros_add_combustion1)
                            .addComponent(consumo_add_combustion1))))
                .addContainerGap())
        );
        jd_mod_combustionLayout.setVerticalGroup(
            jd_mod_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mod_combustionLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jd_mod_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(marca_add_combustion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(modelo_add_combustion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(comb_suv1)
                    .addComponent(comb_familiar1)
                    .addComponent(comb_compacto1)
                    .addComponent(comb_sub1)
                    .addComponent(comb_deportivo1))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(vin_add_combustion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(cilindrada_add_combustion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(cilindros_add_combustion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_combustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(consumo_add_combustion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jb_modificar_combustion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        precio_add_hibrido1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        buttonGroup6.add(hibrido_deportivo1);
        hibrido_deportivo1.setText("Deportivo");

        jb_modificar_hibrido.setText("Modificar");
        jb_modificar_hibrido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificar_hibridoActionPerformed(evt);
            }
        });

        jLabel36.setText("Cantidad de Pasajeros:");

        jLabel37.setText("Marca:");

        buttonGroup6.add(hibrido_suv1);
        hibrido_suv1.setText("SUV");

        jLabel38.setText("Modelo:");

        jLabel39.setText("Precio:");

        buttonGroup6.add(hibrido_familiar1);
        hibrido_familiar1.setText("Familiar");

        vin_add_hibrido1.setEditable(false);
        vin_add_hibrido1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        jLabel40.setText("Carroceria:");

        buttonGroup6.add(hibrido_compacto1);
        hibrido_compacto1.setText("Compacto");

        kilo_add_hibrido1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        jLabel41.setText("VIN:");

        buttonGroup6.add(hibrido_sub1);
        hibrido_sub1.setText("Sub-Compacto");

        pasajeros_add_hibrido1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        jLabel42.setText("Kilometros:");

        javax.swing.GroupLayout jd_mod_hibridoLayout = new javax.swing.GroupLayout(jd_mod_hibrido.getContentPane());
        jd_mod_hibrido.getContentPane().setLayout(jd_mod_hibridoLayout);
        jd_mod_hibridoLayout.setHorizontalGroup(
            jd_mod_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mod_hibridoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_mod_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_modificar_hibrido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jd_mod_hibridoLayout.createSequentialGroup()
                        .addGroup(jd_mod_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel41)
                            .addComponent(jLabel42)
                            .addComponent(jLabel36)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40)
                            .addComponent(jLabel37))
                        .addGap(30, 30, 30)
                        .addGroup(jd_mod_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marca_add_hibrido1)
                            .addComponent(kilo_add_hibrido1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modelo_add_hibrido1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                            .addGroup(jd_mod_hibridoLayout.createSequentialGroup()
                                .addComponent(hibrido_suv1)
                                .addGap(18, 18, 18)
                                .addComponent(hibrido_familiar1)
                                .addGap(18, 18, 18)
                                .addComponent(hibrido_compacto1)
                                .addGap(18, 18, 18)
                                .addComponent(hibrido_sub1)
                                .addGap(18, 18, 18)
                                .addComponent(hibrido_deportivo1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(vin_add_hibrido1)
                            .addComponent(pasajeros_add_hibrido1)
                            .addComponent(precio_add_hibrido1))))
                .addContainerGap())
        );
        jd_mod_hibridoLayout.setVerticalGroup(
            jd_mod_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mod_hibridoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jd_mod_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(marca_add_hibrido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(modelo_add_hibrido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(hibrido_suv1)
                    .addComponent(hibrido_familiar1)
                    .addComponent(hibrido_compacto1)
                    .addComponent(hibrido_sub1)
                    .addComponent(hibrido_deportivo1))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(vin_add_hibrido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(kilo_add_hibrido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(pasajeros_add_hibrido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_hibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(precio_add_hibrido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jb_modificar_hibrido, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        buttonGroup7.add(enchufable_familiar1);
        enchufable_familiar1.setText("Familiar");

        vin_add_enchufable1.setEditable(false);
        vin_add_enchufable1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        jLabel43.setText("Carroceria:");

        buttonGroup7.add(enchufable_deportivo1);
        enchufable_deportivo1.setText("Deportivo");

        buttonGroup7.add(enchufable_compacto1);
        enchufable_compacto1.setText("Compacto");

        jb_modificar_enchufable.setText("Modificar");
        jb_modificar_enchufable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificar_enchufableActionPerformed(evt);
            }
        });

        maletero_add_enchufable1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        jLabel44.setText("Galones:");

        jLabel45.setText("VIN:");

        jLabel46.setText("Marca:");

        buttonGroup7.add(enchufable_suv1);
        enchufable_suv1.setText("SUV");

        buttonGroup7.add(enchufable_sub1);
        enchufable_sub1.setText("Sub-Compacto");

        jLabel47.setText("Modelo:");

        galones_add_enchufable1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        jLabel48.setText("Maletero:");

        javax.swing.GroupLayout jd_mod_enchufableLayout = new javax.swing.GroupLayout(jd_mod_enchufable.getContentPane());
        jd_mod_enchufable.getContentPane().setLayout(jd_mod_enchufableLayout);
        jd_mod_enchufableLayout.setHorizontalGroup(
            jd_mod_enchufableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mod_enchufableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_mod_enchufableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_modificar_enchufable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jd_mod_enchufableLayout.createSequentialGroup()
                        .addGroup(jd_mod_enchufableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jLabel45)
                            .addComponent(jLabel48)
                            .addComponent(jLabel44)
                            .addComponent(jLabel43)
                            .addComponent(jLabel46))
                        .addGap(30, 30, 30)
                        .addGroup(jd_mod_enchufableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marca_add_enchufable1)
                            .addComponent(maletero_add_enchufable1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modelo_add_enchufable1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                            .addGroup(jd_mod_enchufableLayout.createSequentialGroup()
                                .addComponent(enchufable_suv1)
                                .addGap(18, 18, 18)
                                .addComponent(enchufable_familiar1)
                                .addGap(18, 18, 18)
                                .addComponent(enchufable_compacto1)
                                .addGap(18, 18, 18)
                                .addComponent(enchufable_sub1)
                                .addGap(18, 18, 18)
                                .addComponent(enchufable_deportivo1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(vin_add_enchufable1)
                            .addComponent(galones_add_enchufable1))))
                .addContainerGap())
        );
        jd_mod_enchufableLayout.setVerticalGroup(
            jd_mod_enchufableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mod_enchufableLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jd_mod_enchufableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(marca_add_enchufable1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_enchufableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(modelo_add_enchufable1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_enchufableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(enchufable_suv1)
                    .addComponent(enchufable_familiar1)
                    .addComponent(enchufable_compacto1)
                    .addComponent(enchufable_sub1)
                    .addComponent(enchufable_deportivo1))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_enchufableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(vin_add_enchufable1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_enchufableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(maletero_add_enchufable1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_enchufableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(galones_add_enchufable1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jb_modificar_enchufable, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jLabel49.setText("Carroceria:");

        recarga_add_elec1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        buttonGroup8.add(elec_compacto1);
        elec_compacto1.setText("Compacto");

        coeficiente_add_coeficiente1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        buttonGroup8.add(elec_sub1);
        elec_sub1.setText("Sub-Compacto");

        motores_add_elec1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        buttonGroup8.add(elec_deportivo1);
        elec_deportivo1.setText("Deportivo");

        jLabel50.setText("Coeficiente:");

        jb_modificar_elec.setText("Modificar");
        jb_modificar_elec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificar_elecActionPerformed(evt);
            }
        });

        jLabel51.setText("Cantidad Motores:");

        jLabel52.setText("VIN:");

        jLabel53.setText("Marca:");

        buttonGroup8.add(elec_suv1);
        elec_suv1.setText("SUV");

        jLabel54.setText("Modelo:");

        jLabel55.setText("Recarga:");

        buttonGroup8.add(elec_familiar1);
        elec_familiar1.setText("Familiar");

        vin_add_elec1.setEditable(false);
        vin_add_elec1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        javax.swing.GroupLayout jd_mod_electricoLayout = new javax.swing.GroupLayout(jd_mod_electrico.getContentPane());
        jd_mod_electrico.getContentPane().setLayout(jd_mod_electricoLayout);
        jd_mod_electricoLayout.setHorizontalGroup(
            jd_mod_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_mod_electricoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_mod_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_modificar_elec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jd_mod_electricoLayout.createSequentialGroup()
                        .addGroup(jd_mod_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51)
                            .addComponent(jLabel55)
                            .addComponent(jLabel49)
                            .addComponent(jLabel53)
                            .addComponent(jLabel52))
                        .addGap(30, 30, 30)
                        .addGroup(jd_mod_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marca_add_elec1)
                            .addComponent(coeficiente_add_coeficiente1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modelo_add_elec1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                            .addGroup(jd_mod_electricoLayout.createSequentialGroup()
                                .addComponent(elec_suv1)
                                .addGap(18, 18, 18)
                                .addComponent(elec_familiar1)
                                .addGap(18, 18, 18)
                                .addComponent(elec_compacto1)
                                .addGap(18, 18, 18)
                                .addComponent(elec_sub1)
                                .addGap(18, 18, 18)
                                .addComponent(elec_deportivo1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(vin_add_elec1)
                            .addComponent(motores_add_elec1)
                            .addComponent(recarga_add_elec1))))
                .addContainerGap())
        );
        jd_mod_electricoLayout.setVerticalGroup(
            jd_mod_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mod_electricoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jd_mod_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(marca_add_elec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(modelo_add_elec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(elec_suv1)
                    .addComponent(elec_familiar1)
                    .addComponent(elec_compacto1)
                    .addComponent(elec_sub1)
                    .addComponent(elec_deportivo1))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vin_add_elec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(coeficiente_add_coeficiente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(motores_add_elec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_electricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(recarga_add_elec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jb_modificar_elec, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        jLabel56.setText("Marca de Fabricacion:");

        jLabel57.setText("Autonomia:");

        jLabel58.setText("Tipo de Vehiculo:");

        jLabel59.setText("Capacidad:");

        jLabel60.setText("Modulos:");

        jLabel61.setText("Capacidad de Carga:");

        jLabel62.setText("Tiempo de Ensamblaje:");

        buttonGroup9.add(rb_hibrido);
        rb_hibrido.setText("Hibrido");

        buttonGroup9.add(rb_enchufable);
        rb_enchufable.setText("Hibrido Enchufable");

        buttonGroup9.add(rb_electrico);
        rb_electrico.setText("Electrico Puro");

        tf_capacidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        tf_modulos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        tf_carga.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        tf_tiempo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        jb_agregar_bateria.setText("Agregar");
        jb_agregar_bateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregar_bateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_add_bateriasLayout = new javax.swing.GroupLayout(jd_add_baterias.getContentPane());
        jd_add_baterias.getContentPane().setLayout(jd_add_bateriasLayout);
        jd_add_bateriasLayout.setHorizontalGroup(
            jd_add_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_add_bateriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_add_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_agregar_bateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jd_add_bateriasLayout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addGap(50, 50, 50)
                        .addComponent(tf_marca))
                    .addGroup(jd_add_bateriasLayout.createSequentialGroup()
                        .addGroup(jd_add_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel57)
                            .addComponent(jLabel58)
                            .addComponent(jLabel59)
                            .addComponent(jLabel60)
                            .addComponent(jLabel61)
                            .addComponent(jLabel62))
                        .addGap(44, 44, 44)
                        .addGroup(jd_add_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_autonomia, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                            .addGroup(jd_add_bateriasLayout.createSequentialGroup()
                                .addComponent(rb_hibrido)
                                .addGap(18, 18, 18)
                                .addComponent(rb_enchufable)
                                .addGap(18, 18, 18)
                                .addComponent(rb_electrico)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tf_capacidad)
                            .addComponent(tf_modulos)
                            .addComponent(tf_carga)
                            .addComponent(tf_tiempo))))
                .addContainerGap())
        );
        jd_add_bateriasLayout.setVerticalGroup(
            jd_add_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_add_bateriasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jd_add_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(tf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_add_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(tf_autonomia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_add_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(rb_hibrido)
                    .addComponent(rb_enchufable)
                    .addComponent(rb_electrico))
                .addGap(18, 18, 18)
                .addGroup(jd_add_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(tf_capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_add_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(tf_modulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_add_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(tf_carga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_add_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(tf_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jb_agregar_bateria, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );

        eliminar_bateria.setText("Eliminar");
        eliminar_bateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_bateriaActionPerformed(evt);
            }
        });

        modificar_modificar.setText("Modificar");
        modificar_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_modificarActionPerformed(evt);
            }
        });

        jt_baterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Autonomia", "Modulos", "Tiempo de Ensamblaje", "Tipo de Vehiculo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jt_baterias);
        if (jt_baterias.getColumnModel().getColumnCount() > 0) {
            jt_baterias.getColumnModel().getColumn(0).setResizable(false);
            jt_baterias.getColumnModel().getColumn(1).setResizable(false);
            jt_baterias.getColumnModel().getColumn(2).setResizable(false);
            jt_baterias.getColumnModel().getColumn(3).setResizable(false);
            jt_baterias.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jd_listar_bateriasLayout = new javax.swing.GroupLayout(jd_listar_baterias.getContentPane());
        jd_listar_baterias.getContentPane().setLayout(jd_listar_bateriasLayout);
        jd_listar_bateriasLayout.setHorizontalGroup(
            jd_listar_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listar_bateriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_listar_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eliminar_bateria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
                    .addComponent(modificar_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jd_listar_bateriasLayout.setVerticalGroup(
            jd_listar_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listar_bateriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminar_bateria, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificar_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        buttonGroup10.add(rb_enchufable1);
        rb_enchufable1.setText("Hibrido Enchufable");

        buttonGroup10.add(rb_electrico1);
        rb_electrico1.setText("Electrico Puro");

        jLabel63.setText("Tipo de Vehiculo:");

        jLabel64.setText("Capacidad:");

        tf_capacidad1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        jLabel65.setText("Modulos:");

        tf_modulos1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        jLabel66.setText("Capacidad de Carga:");

        tf_carga1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        jLabel67.setText("Tiempo de Ensamblaje:");

        tf_tiempo1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        jb_modificar_bateria.setText("Modificar");
        jb_modificar_bateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificar_bateriaActionPerformed(evt);
            }
        });

        jLabel68.setText("Marca de Fabricacion:");

        buttonGroup10.add(rb_hibrido1);
        rb_hibrido1.setText("Hibrido");

        jLabel69.setText("Autonomia:");

        javax.swing.GroupLayout jd_mod_bateriasLayout = new javax.swing.GroupLayout(jd_mod_baterias.getContentPane());
        jd_mod_baterias.getContentPane().setLayout(jd_mod_bateriasLayout);
        jd_mod_bateriasLayout.setHorizontalGroup(
            jd_mod_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mod_bateriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_mod_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_modificar_bateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jd_mod_bateriasLayout.createSequentialGroup()
                        .addComponent(jLabel68)
                        .addGap(50, 50, 50)
                        .addComponent(tf_marca1))
                    .addGroup(jd_mod_bateriasLayout.createSequentialGroup()
                        .addGroup(jd_mod_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel69)
                            .addComponent(jLabel63)
                            .addComponent(jLabel64)
                            .addComponent(jLabel65)
                            .addComponent(jLabel66)
                            .addComponent(jLabel67))
                        .addGap(44, 44, 44)
                        .addGroup(jd_mod_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_autonomia1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                            .addGroup(jd_mod_bateriasLayout.createSequentialGroup()
                                .addComponent(rb_hibrido1)
                                .addGap(18, 18, 18)
                                .addComponent(rb_enchufable1)
                                .addGap(18, 18, 18)
                                .addComponent(rb_electrico1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tf_capacidad1)
                            .addComponent(tf_modulos1)
                            .addComponent(tf_carga1)
                            .addComponent(tf_tiempo1))))
                .addContainerGap())
        );
        jd_mod_bateriasLayout.setVerticalGroup(
            jd_mod_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mod_bateriasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jd_mod_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(tf_marca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(tf_autonomia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(rb_hibrido1)
                    .addComponent(rb_enchufable1)
                    .addComponent(rb_electrico1))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(tf_capacidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(tf_modulos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(tf_carga1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mod_bateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(tf_tiempo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jb_modificar_bateria, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );

        jt_ensamblados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo Carro", "Marca Carro", "VIN Carro", "Tipo", "Marca Bateria", "Modulo Bateria", "Tiempo Ensamblaje"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jt_ensamblados);
        if (jt_ensamblados.getColumnModel().getColumnCount() > 0) {
            jt_ensamblados.getColumnModel().getColumn(0).setResizable(false);
            jt_ensamblados.getColumnModel().getColumn(1).setResizable(false);
            jt_ensamblados.getColumnModel().getColumn(2).setResizable(false);
            jt_ensamblados.getColumnModel().getColumn(3).setResizable(false);
            jt_ensamblados.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jd_listar_ensambladosLayout = new javax.swing.GroupLayout(jd_listar_ensamblados.getContentPane());
        jd_listar_ensamblados.getContentPane().setLayout(jd_listar_ensambladosLayout);
        jd_listar_ensambladosLayout.setHorizontalGroup(
            jd_listar_ensambladosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listar_ensambladosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE)
                .addContainerGap())
        );
        jd_listar_ensambladosLayout.setVerticalGroup(
            jd_listar_ensambladosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listar_ensambladosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
        );

        jt_vehiculos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Marca", "VIN", "Carroceria", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jt_vehiculos1);
        if (jt_vehiculos1.getColumnModel().getColumnCount() > 0) {
            jt_vehiculos1.getColumnModel().getColumn(0).setResizable(false);
            jt_vehiculos1.getColumnModel().getColumn(1).setResizable(false);
            jt_vehiculos1.getColumnModel().getColumn(2).setResizable(false);
            jt_vehiculos1.getColumnModel().getColumn(3).setResizable(false);
            jt_vehiculos1.getColumnModel().getColumn(4).setResizable(false);
        }

        jt_baterias1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Autonomia", "Modulos", "Tiempo de Ensamblaje", "Tipo de Vehiculo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jt_baterias1);
        if (jt_baterias1.getColumnModel().getColumnCount() > 0) {
            jt_baterias1.getColumnModel().getColumn(0).setResizable(false);
            jt_baterias1.getColumnModel().getColumn(1).setResizable(false);
            jt_baterias1.getColumnModel().getColumn(2).setResizable(false);
            jt_baterias1.getColumnModel().getColumn(3).setResizable(false);
            jt_baterias1.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel70.setText("Seleccionar de ambos JTables:");

        jb_ensamblar.setText("Ensamblar");
        jb_ensamblar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ensamblarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_seleccionarLayout = new javax.swing.GroupLayout(jd_seleccionar.getContentPane());
        jd_seleccionar.getContentPane().setLayout(jd_seleccionarLayout);
        jd_seleccionarLayout.setHorizontalGroup(
            jd_seleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_seleccionarLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jd_seleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_ensamblar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE))
                .addGap(54, 54, 54))
            .addGroup(jd_seleccionarLayout.createSequentialGroup()
                .addGap(391, 391, 391)
                .addComponent(jLabel70)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jd_seleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_seleccionarLayout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
                    .addGap(54, 54, 54)))
        );
        jd_seleccionarLayout.setVerticalGroup(
            jd_seleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_seleccionarLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel70)
                .addGap(45, 45, 45)
                .addComponent(jb_ensamblar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(jd_seleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_seleccionarLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(491, Short.MAX_VALUE)))
        );

        jd_ensamblar.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jd_ensamblarComponentHidden(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        jLabel71.setText("Tiempo");

        jLabel72.setText("Si se sale se detiene el esamblaje");

        javax.swing.GroupLayout jd_ensamblarLayout = new javax.swing.GroupLayout(jd_ensamblar.getContentPane());
        jd_ensamblar.getContentPane().setLayout(jd_ensamblarLayout);
        jd_ensamblarLayout.setHorizontalGroup(
            jd_ensamblarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ensamblarLayout.createSequentialGroup()
                .addContainerGap(344, Short.MAX_VALUE)
                .addComponent(jLabel71)
                .addGap(333, 333, 333))
            .addGroup(jd_ensamblarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jd_ensamblarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prog_bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jd_ensamblarLayout.createSequentialGroup()
                        .addComponent(jLabel72)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jd_ensamblarLayout.setVerticalGroup(
            jd_ensamblarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ensamblarLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel71)
                .addGap(52, 52, 52)
                .addComponent(prog_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addComponent(jLabel72)
                .addGap(15, 15, 15))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jToolBar1.setRollover(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Agregar:      ");
        jLabel1.setToolTipText("");
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

        jButton1.setText("Bateria");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jToolBar2.setRollover(true);

        jb_listar_vehiculo.setText("Listar Vehiculos");
        jb_listar_vehiculo.setFocusable(false);
        jb_listar_vehiculo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_listar_vehiculo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jb_listar_vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_listar_vehiculoActionPerformed(evt);
            }
        });
        jToolBar2.add(jb_listar_vehiculo);

        jb_listar_baterias.setText("Listar Baterias");
        jb_listar_baterias.setFocusable(false);
        jb_listar_baterias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_listar_baterias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jb_listar_baterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_listar_bateriasActionPerformed(evt);
            }
        });
        jToolBar2.add(jb_listar_baterias);
        jToolBar2.add(jSeparator1);

        jd_ensamblar_carro.setText("Ensamblar un Carro");
        jd_ensamblar_carro.setFocusable(false);
        jd_ensamblar_carro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jd_ensamblar_carro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jd_ensamblar_carro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jd_ensamblar_carroActionPerformed(evt);
            }
        });
        jToolBar2.add(jd_ensamblar_carro);

        jb_listar_ensamblados.setText("Listar Carros Ensamblados");
        jb_listar_ensamblados.setFocusable(false);
        jb_listar_ensamblados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_listar_ensamblados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jb_listar_ensamblados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_listar_ensambladosActionPerformed(evt);
            }
        });
        jToolBar2.add(jb_listar_ensamblados);

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
                carroceria = "Sub-Compacto";
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
            AdministrarVehiculo av = new AdministrarVehiculo("./Vehiculos.cbm");
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
                carroceria = "Sub-Compacto";
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
                carroceria = "Sub-Compacto";
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
                carroceria = "Sub-Compacto";
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

    private void jb_listar_vehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_listar_vehiculoActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) jt_vehiculos.getModel();
        modelo.setRowCount(0);
        AdministrarVehiculo av = new AdministrarVehiculo("./Vehiculos.cbm");
        av.cargarArchivo();
        for (int i = 0; i < av.getListaVehiculos().size(); i++) {
            String tipo;
            if (av.getListaVehiculos().get(i) instanceof Combustion) {
                tipo = "Combustion";
            } else if (av.getListaVehiculos().get(i) instanceof Hibrido) {
                tipo = "Hibrido";
            } else if (av.getListaVehiculos().get(i) instanceof HibridoEnchufable) {
                tipo = "Hibrido Enchufable";
            } else {
                tipo = "Electrico Puro";
            }
            Object[] nuevo = {av.getListaVehiculos().get(i).getModelo(), av.getListaVehiculos().get(i).getMarca(), av.getListaVehiculos().get(i).getVin(),
                av.getListaVehiculos().get(i).getTipoCarroceria(), tipo};
            modelo.addRow(nuevo);
        }
        jt_vehiculos.setModel(modelo);
        jd_listar_vehiculos.setModal(true);
        jd_listar_vehiculos.pack();
        jd_listar_vehiculos.setLocationRelativeTo(this);
        jd_listar_vehiculos.setVisible(true);
    }//GEN-LAST:event_jb_listar_vehiculoActionPerformed

    private void eliminar_vehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_vehiculoActionPerformed
        // TODO add your handling code here:
        try {
            if (jt_vehiculos.getSelectedRow() >= 0) {
                int po = jt_vehiculos.getSelectedRow();
                DefaultTableModel modelo = (DefaultTableModel) jt_vehiculos.getModel();
                modelo.removeRow(po);
                jt_vehiculos.setModel(modelo);
                AdministrarVehiculo av = new AdministrarVehiculo("./Vehiculos.cbm");
                av.cargarArchivo();
                av.getListaVehiculos().remove(po);
                av.escribirArchivo();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_eliminar_vehiculoActionPerformed

    private void modificar_vehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_vehiculoActionPerformed
        // TODO add your handling code here:
        try {
            if (jt_vehiculos.getSelectedRow() >= 0) {
                poVehiculo = jt_vehiculos.getSelectedRow();
                AdministrarVehiculo av = new AdministrarVehiculo("./Vehiculos.cbm");
                av.cargarArchivo();
                if (av.getListaVehiculos().get(poVehiculo) instanceof Combustion) {
                    Combustion x = (Combustion) av.getListaVehiculos().get(poVehiculo);
                    marca_add_combustion1.setText(x.getMarca());
                    modelo_add_combustion1.setText(x.getModelo());
                    vin_add_combustion1.setText(String.valueOf(x.getVin()));
                    cilindrada_add_combustion1.setText(String.valueOf(x.getCilindrada()));
                    cilindros_add_combustion1.setText(String.valueOf(x.getMotores()));
                    consumo_add_combustion1.setText(String.valueOf(x.getConsumo()));
                    if (x.getTipoCarroceria().equals("SUV")) {
                        comb_suv1.setSelected(true);
                    } else if (x.getTipoCarroceria().equals("Sub-Compacto")) {
                        comb_sub1.setSelected(true);
                    } else if (x.getTipoCarroceria().equals("Familiar")) {
                        comb_familiar1.setSelected(true);
                    } else if (x.getTipoCarroceria().equals("Deportivo")) {
                        comb_deportivo1.setSelected(true);
                    } else {
                        comb_compacto1.setSelected(true);
                    }
                    jd_mod_combustion.setModal(true);
                    jd_mod_combustion.pack();
                    jd_mod_combustion.setLocationRelativeTo(this);
                    jd_mod_combustion.setVisible(true);
                } else if (av.getListaVehiculos().get(poVehiculo) instanceof Hibrido) {
                    Hibrido x = (Hibrido) av.getListaVehiculos().get(poVehiculo);
                    marca_add_hibrido1.setText(x.getMarca());
                    modelo_add_hibrido1.setText(x.getModelo());
                    vin_add_hibrido1.setText(String.valueOf(x.getVin()));
                    kilo_add_hibrido1.setText(String.valueOf(x.getKilometros()));
                    pasajeros_add_hibrido1.setText(String.valueOf(x.getPasajeros()));
                    precio_add_hibrido1.setText(String.valueOf(x.getPrecio()));
                    if (x.getTipoCarroceria().equals("SUV")) {
                        hibrido_suv1.setSelected(true);
                    } else if (x.getTipoCarroceria().equals("Sub-Compacto")) {
                        hibrido_sub1.setSelected(true);
                    } else if (x.getTipoCarroceria().equals("Familiar")) {
                        hibrido_familiar1.setSelected(true);
                    } else if (x.getTipoCarroceria().equals("Deportivo")) {
                        hibrido_deportivo1.setSelected(true);
                    } else {
                        hibrido_compacto1.setSelected(true);
                    }
                    jd_mod_hibrido.setModal(true);
                    jd_mod_hibrido.pack();
                    jd_mod_hibrido.setLocationRelativeTo(this);
                    jd_mod_hibrido.setVisible(true);
                } else if (av.getListaVehiculos().get(poVehiculo) instanceof HibridoEnchufable) {
                    HibridoEnchufable x = (HibridoEnchufable) av.getListaVehiculos().get(poVehiculo);
                    marca_add_enchufable1.setText(x.getMarca());
                    modelo_add_enchufable1.setText(x.getModelo());
                    vin_add_enchufable1.setText(String.valueOf(x.getVin()));
                    maletero_add_enchufable1.setText(String.valueOf(x.getCapacidadMaletero()));
                    galones_add_enchufable1.setText(String.valueOf(x.getGalones()));
                    if (x.getTipoCarroceria().equals("SUV")) {
                        enchufable_suv1.setSelected(true);
                    } else if (x.getTipoCarroceria().equals("Sub-Compacto")) {
                        enchufable_sub1.setSelected(true);
                    } else if (x.getTipoCarroceria().equals("Familiar")) {
                        enchufable_familiar1.setSelected(true);
                    } else if (x.getTipoCarroceria().equals("Deportivo")) {
                        enchufable_deportivo1.setSelected(true);
                    } else {
                        enchufable_compacto1.setSelected(true);
                    }
                    jd_mod_enchufable.setModal(true);
                    jd_mod_enchufable.pack();
                    jd_mod_enchufable.setLocationRelativeTo(this);
                    jd_mod_enchufable.setVisible(true);
                } else {
                    ElectricoPuro x = (ElectricoPuro) av.getListaVehiculos().get(poVehiculo);
                    marca_add_elec1.setText(x.getMarca());
                    modelo_add_elec1.setText(x.getModelo());
                    vin_add_elec1.setText(String.valueOf(x.getVin()));
                    coeficiente_add_coeficiente1.setText(String.valueOf(x.getCoeficiente()));
                    motores_add_elec1.setText(String.valueOf(x.getMotores()));
                    recarga_add_elec1.setText(String.valueOf(x.getRecarga()));
                    if (x.getTipoCarroceria().equals("SUV")) {
                        elec_suv1.setSelected(true);
                    } else if (x.getTipoCarroceria().equals("Sub-Compacto")) {
                        elec_sub1.setSelected(true);
                    } else if (x.getTipoCarroceria().equals("Familiar")) {
                        elec_familiar1.setSelected(true);
                    } else if (x.getTipoCarroceria().equals("Deportivo")) {
                        elec_familiar1.setSelected(true);
                    } else {
                        elec_compacto1.setSelected(true);
                    }
                    jd_mod_electrico.setModal(true);
                    jd_mod_electrico.pack();
                    jd_mod_electrico.setLocationRelativeTo(this);
                    jd_mod_electrico.setVisible(true);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_modificar_vehiculoActionPerformed

    private void jb_modificar_combustionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificar_combustionActionPerformed
        // TODO add your handling code here:
        try {
            String marca = marca_add_combustion1.getText();
            String modelo = modelo_add_combustion1.getText();;
            String carroceria = "";
            if (comb_suv1.isSelected()) {
                carroceria = "SUV";
            } else if (comb_sub1.isSelected()) {
                carroceria = "Sub-Compacto";
            } else if (comb_familiar1.isSelected()) {
                carroceria = "Familiar";
            } else if (comb_deportivo1.isSelected()) {
                carroceria = "Deportivo";
            } else {
                carroceria = "Compacto";
            }
            int vin = Integer.parseInt(vin_add_combustion1.getText());
            int cilindrada = Integer.parseInt(cilindrada_add_combustion1.getText());
            int motores = Integer.parseInt(cilindros_add_combustion1.getText());
            int consumo = Integer.parseInt(consumo_add_combustion1.getText());
            Combustion x = new Combustion(cilindrada, motores, consumo, marca, modelo, carroceria, vin);
            AdministrarVehiculo av = new AdministrarVehiculo("./Vehiculos.cbm");
            av.cargarArchivo();
            av.getListaVehiculos().set(poVehiculo, x);
            av.escribirArchivo();
            DefaultTableModel model = (DefaultTableModel) jt_vehiculos.getModel();
            Object[] nuevo = {x.getModelo(), x.getMarca(), x.getVin(), x.getTipoCarroceria(), "Combustion"};
            model.insertRow(poVehiculo, nuevo);
            model.removeRow(poVehiculo + 1);
            jt_vehiculos.setModel(model);
            jd_mod_combustion.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_modificar_combustionActionPerformed

    private void jb_modificar_hibridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificar_hibridoActionPerformed
        // TODO add your handling code here:
        try {
            String marca = marca_add_hibrido1.getText();
            String modelo = modelo_add_hibrido1.getText();;
            String carroceria = "";
            if (hibrido_suv1.isSelected()) {
                carroceria = "SUV";
            } else if (hibrido_sub1.isSelected()) {
                carroceria = "Sub-Compacto";
            } else if (hibrido_familiar1.isSelected()) {
                carroceria = "Familiar";
            } else if (hibrido_deportivo1.isSelected()) {
                carroceria = "Deportivo";
            } else {
                carroceria = "Compacto";
            }
            int vin = Integer.parseInt(vin_add_hibrido1.getText());
            int kilometros = Integer.parseInt(kilo_add_hibrido1.getText());
            int pasajeros = Integer.parseInt(pasajeros_add_hibrido1.getText());
            int precio = Integer.parseInt(precio_add_hibrido1.getText());
            Hibrido x = new Hibrido(kilometros, pasajeros, precio, marca, modelo, carroceria, vin);
            AdministrarVehiculo av = new AdministrarVehiculo("./Vehiculos.cbm");
            av.cargarArchivo();
            av.getListaVehiculos().set(poVehiculo, x);
            av.escribirArchivo();
            DefaultTableModel model = (DefaultTableModel) jt_vehiculos.getModel();
            Object[] nuevo = {x.getModelo(), x.getMarca(), x.getVin(), x.getTipoCarroceria(), "Hibrido"};
            model.insertRow(poVehiculo, nuevo);
            model.removeRow(poVehiculo + 1);
            jt_vehiculos.setModel(model);
            jd_mod_hibrido.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_modificar_hibridoActionPerformed

    private void jb_modificar_enchufableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificar_enchufableActionPerformed
        // TODO add your handling code here:
        try {
            String marca = marca_add_enchufable1.getText();
            String modelo = modelo_add_enchufable1.getText();;
            String carroceria = "";
            if (enchufable_suv1.isSelected()) {
                carroceria = "SUV";
            } else if (enchufable_sub1.isSelected()) {
                carroceria = "Sub-Compacto";
            } else if (enchufable_familiar1.isSelected()) {
                carroceria = "Familiar";
            } else if (enchufable_deportivo1.isSelected()) {
                carroceria = "Deportivo";
            } else {
                carroceria = "Compacto";
            }
            int vin = Integer.parseInt(vin_add_enchufable1.getText());
            int maletero = Integer.parseInt(maletero_add_enchufable1.getText());
            int galones = Integer.parseInt(galones_add_enchufable1.getText());
            HibridoEnchufable x = new HibridoEnchufable(maletero, galones, marca, modelo, carroceria, vin);
            AdministrarVehiculo av = new AdministrarVehiculo("./Vehiculos.cbm");
            av.cargarArchivo();
            av.getListaVehiculos().set(poVehiculo, x);
            av.escribirArchivo();
            DefaultTableModel model = (DefaultTableModel) jt_vehiculos.getModel();
            Object[] nuevo = {x.getModelo(), x.getMarca(), x.getVin(), x.getTipoCarroceria(), "Hibrido Enchufable"};
            model.insertRow(poVehiculo, nuevo);
            model.removeRow(poVehiculo + 1);
            jt_vehiculos.setModel(model);
            jd_mod_enchufable.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_modificar_enchufableActionPerformed

    private void jb_modificar_elecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificar_elecActionPerformed
        // TODO add your handling code here:
        try {
            String marca = marca_add_elec1.getText();
            String modelo = modelo_add_elec1.getText();;
            String carroceria = "";
            if (elec_suv1.isSelected()) {
                carroceria = "SUV";
            } else if (elec_sub1.isSelected()) {
                carroceria = "Sub-Compacto";
            } else if (elec_familiar1.isSelected()) {
                carroceria = "Familiar";
            } else if (elec_deportivo1.isSelected()) {
                carroceria = "Deportivo";
            } else {
                carroceria = "Compacto";
            }
            int vin = Integer.parseInt(vin_add_elec1.getText());
            int coeficiente = Integer.parseInt(coeficiente_add_coeficiente1.getText());
            int motores = Integer.parseInt(motores_add_elec1.getText());
            int recarga = Integer.parseInt(recarga_add_elec1.getText());
            ElectricoPuro x = new ElectricoPuro(coeficiente, motores, recarga, marca, modelo, carroceria, vin);
            AdministrarVehiculo av = new AdministrarVehiculo("./Vehiculos.cbm");
            av.cargarArchivo();
            av.getListaVehiculos().set(poVehiculo, x);
            av.escribirArchivo();
            DefaultTableModel model = (DefaultTableModel) jt_vehiculos.getModel();
            Object[] nuevo = {x.getModelo(), x.getMarca(), x.getVin(), x.getTipoCarroceria(), "Hibrido Enchufable"};
            model.insertRow(poVehiculo, nuevo);
            model.removeRow(poVehiculo + 1);
            jt_vehiculos.setModel(model);
            jd_mod_enchufable.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_modificar_elecActionPerformed

    private void jb_agregar_bateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregar_bateriaActionPerformed
        // TODO add your handling code here:
        try {
            String marca = tf_marca.getText();
            String autonoma = tf_autonomia.getText();;
            String tipoVehiculo = "";
            if (rb_electrico.isSelected()) {
                tipoVehiculo = "Electrico Puro";
            } else if (rb_hibrido.isSelected()) {
                tipoVehiculo = "Hibrido";
            } else {
                tipoVehiculo = "Hibrido Enchufable";
            }
            int capacidad = Integer.parseInt(tf_capacidad.getText());
            int modulos = Integer.parseInt(tf_modulos.getText());
            int carga = Integer.parseInt(tf_carga.getText());
            int tiempo = Integer.parseInt(tf_tiempo.getText());
            Bateria x = new Bateria(marca, autonoma, tipoVehiculo, capacidad, modulos, carga, tiempo);
            AdministrarBateria ab = new AdministrarBateria("./Baterias.cbm");
            ab.cargarArchivo();
            ab.getListaBaterias().add(x);
            ab.escribirArchivo();
            tf_marca.setText("");
            tf_autonomia.setText("");
            tf_capacidad.setText("");
            tf_modulos.setText("");
            tf_carga.setText("");
            tf_tiempo.setText("");
            jd_add_baterias.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_agregar_bateriaActionPerformed

    private void jb_listar_bateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_listar_bateriasActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) jt_baterias.getModel();
        modelo.setRowCount(0);
        AdministrarBateria ab = new AdministrarBateria("./Baterias.cbm");
        ab.cargarArchivo();
        for (int i = 0; i < ab.getListaBaterias().size(); i++) {
            Bateria x = ab.getListaBaterias().get(i);
            Object[] nuevo = {x.getMarca(), x.getAutonomia(), x.getModulos(), x.getTiempo(), x.getTipoVehiculo()};
            modelo.addRow(nuevo);
        }
        jt_baterias.setModel(modelo);
        jd_listar_baterias.setModal(true);
        jd_listar_baterias.pack();
        jd_listar_baterias.setLocationRelativeTo(this);
        jd_listar_baterias.setVisible(true);
    }//GEN-LAST:event_jb_listar_bateriasActionPerformed

    private void eliminar_bateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_bateriaActionPerformed
        // TODO add your handling code here:
        try {
            if (jt_baterias.getSelectedRow() >= 0) {
                int po = jt_baterias.getSelectedRow();
                DefaultTableModel modelo = (DefaultTableModel) jt_baterias.getModel();
                modelo.removeRow(po);
                jt_baterias.setModel(modelo);
                AdministrarBateria ab = new AdministrarBateria("./Baterias.cbm");
                ab.cargarArchivo();
                ab.getListaBaterias().remove(po);
                ab.escribirArchivo();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_eliminar_bateriaActionPerformed

    private void modificar_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_modificarActionPerformed
        // TODO add your handling code here:
        try {
            if (jt_baterias.getSelectedRow() >= 0) {
                poBateria = jt_baterias.getSelectedRow();
                AdministrarBateria ab = new AdministrarBateria("./Baterias.cbm");
                ab.cargarArchivo();
                Bateria x = (Bateria) ab.getListaBaterias().get(poBateria);
                tf_marca1.setText(x.getMarca());
                tf_autonomia1.setText(x.getAutonomia());
                tf_capacidad1.setText(String.valueOf(x.getCapacidad()));
                tf_modulos1.setText(String.valueOf(x.getModulos()));
                tf_carga1.setText(String.valueOf(x.getCarga()));
                tf_tiempo1.setText(String.valueOf(x.getTiempo()));
                if (x.getTipoVehiculo().equals("Hibrido")) {
                    rb_hibrido1.setSelected(true);
                } else if (x.getTipoVehiculo().equals("Electrico Puro")) {
                    rb_electrico1.setSelected(true);
                } else {
                    rb_enchufable1.setSelected(true);
                }
                jd_mod_baterias.setModal(true);
                jd_mod_baterias.pack();
                jd_mod_baterias.setLocationRelativeTo(this);
                jd_mod_baterias.setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_modificar_modificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jd_add_baterias.setModal(true);
        jd_add_baterias.pack();
        jd_add_baterias.setLocationRelativeTo(this);
        jd_add_baterias.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jb_modificar_bateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificar_bateriaActionPerformed
        // TODO add your handling code here:
        try {
            String marca = tf_marca1.getText();
            String autonoma = tf_autonomia1.getText();;
            String tipoVehiculo = "";
            if (rb_electrico1.isSelected()) {
                tipoVehiculo = "Electrico Puro";
            } else if (rb_hibrido1.isSelected()) {
                tipoVehiculo = "Hibrido";
            } else {
                tipoVehiculo = "Hibrido Enchufable";
            }
            int capacidad = Integer.parseInt(tf_capacidad1.getText());
            int modulos = Integer.parseInt(tf_modulos1.getText());
            int carga = Integer.parseInt(tf_carga1.getText());
            int tiempo = Integer.parseInt(tf_tiempo1.getText());
            Bateria x = new Bateria(marca, autonoma, tipoVehiculo, capacidad, modulos, carga, tiempo);
            AdministrarBateria ab = new AdministrarBateria("./Baterias.cbm");
            ab.cargarArchivo();
            ab.getListaBaterias().set(poBateria, x);
            ab.escribirArchivo();
            DefaultTableModel model = (DefaultTableModel) jt_baterias.getModel();
            Object[] nuevo = {x.getMarca(), x.getAutonomia(), x.getModulos(), x.getTiempo(), x.getTipoVehiculo()};
            model.insertRow(poBateria, nuevo);
            model.removeRow(poBateria + 1);
            jt_baterias.setModel(model);
            jd_mod_baterias.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_modificar_bateriaActionPerformed

    private void jb_listar_ensambladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_listar_ensambladosActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) jt_ensamblados.getModel();
        modelo.setRowCount(0);
        AdministrarVehiculo av = new AdministrarVehiculo("./Ensamblados.cbm");
        av.cargarArchivo();
        for (int i = 0; i < av.getListaVehiculos().size(); i++) {
            if (av.getListaVehiculos().get(i) instanceof ElectricoPuro) {
                ElectricoPuro x = (ElectricoPuro) av.getListaVehiculos().get(i);
                Object[] nuevo = {x.getModelo(), x.getMarca(), x.getVin(), "Electrico Puro", x.getBateria().getMarca(), x.getBateria().getModulos(), x.getBateria().getTiempo()};
                modelo.addRow(nuevo);
            } else if (av.getListaVehiculos().get(i) instanceof Hibrido) {
                Hibrido x = (Hibrido) av.getListaVehiculos().get(i);
                Object[] nuevo = {x.getModelo(), x.getMarca(), x.getVin(), "Hibrido", x.getBateria().getMarca(), x.getBateria().getModulos(), x.getBateria().getTiempo()};
                modelo.addRow(nuevo);
            } else if (av.getListaVehiculos().get(i) instanceof HibridoEnchufable) {
                HibridoEnchufable x = (HibridoEnchufable) av.getListaVehiculos().get(i);
                Object[] nuevo = {x.getModelo(), x.getMarca(), x.getVin(), "Hibrido Enchufable", x.getBateria().getMarca(), x.getBateria().getModulos(), x.getBateria().getTiempo()};
                modelo.addRow(nuevo);
            }
        }
        jt_ensamblados.setModel(modelo);
        jd_listar_ensamblados.setModal(true);
        jd_listar_ensamblados.pack();
        jd_listar_ensamblados.setLocationRelativeTo(this);
        jd_listar_ensamblados.setVisible(true);
    }//GEN-LAST:event_jb_listar_ensambladosActionPerformed

    private void jd_ensamblar_carroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jd_ensamblar_carroActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) jt_vehiculos1.getModel();
        modelo.setRowCount(0);
        AdministrarVehiculo av = new AdministrarVehiculo("./Vehiculos.cbm");
        av.cargarArchivo();
        for (int i = 0; i < av.getListaVehiculos().size(); i++) {
            String tipo;
            if (av.getListaVehiculos().get(i) instanceof Combustion) {
                tipo = "Combustion";
            } else if (av.getListaVehiculos().get(i) instanceof Hibrido) {
                tipo = "Hibrido";
            } else if (av.getListaVehiculos().get(i) instanceof HibridoEnchufable) {
                tipo = "Hibrido Enchufable";
            } else {
                tipo = "Electrico Puro";
            }
            Object[] nuevo = {av.getListaVehiculos().get(i).getModelo(), av.getListaVehiculos().get(i).getMarca(), av.getListaVehiculos().get(i).getVin(),
                av.getListaVehiculos().get(i).getTipoCarroceria(), tipo};
            modelo.addRow(nuevo);
        }
        jt_vehiculos1.setModel(modelo);
        DefaultTableModel model = (DefaultTableModel) jt_baterias1.getModel();
        model.setRowCount(0);
        AdministrarBateria ab = new AdministrarBateria("./Baterias.cbm");
        ab.cargarArchivo();
        for (int i = 0; i < ab.getListaBaterias().size(); i++) {
            Bateria x = ab.getListaBaterias().get(i);
            Object[] nuevo = {x.getMarca(), x.getAutonomia(), x.getModulos(), x.getTiempo(), x.getTipoVehiculo()};
            model.addRow(nuevo);
        }
        jt_baterias1.setModel(model);
        jd_seleccionar.setModal(true);
        jd_seleccionar.pack();
        jd_seleccionar.setLocationRelativeTo(this);
        jd_seleccionar.setVisible(true);
    }//GEN-LAST:event_jd_ensamblar_carroActionPerformed

    private void jd_ensamblarComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jd_ensamblarComponentHidden
        // TODO add your handling code here:
        ensam.suspend();
        prog_bar.setValue(0);
    }//GEN-LAST:event_jd_ensamblarComponentHidden

    private void jb_ensamblarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ensamblarActionPerformed
        // TODO add your handling code here:
        AdministrarVehiculo av = new AdministrarVehiculo("./Vehiculos.cbm");
        av.cargarArchivo();
        AdministrarBateria ab = new AdministrarBateria("./Baterias.cbm");
        ab.cargarArchivo();
        int po1 = jt_vehiculos1.getSelectedRow();
        int po2 = jt_baterias1.getSelectedRow();
        if (po1 >= 0 && po2 >= 0) {
            if (av.getListaVehiculos().get(po1) instanceof Combustion) {
                JOptionPane.showMessageDialog(this, "No puede ser un vehiculo de combustion");
            } else {
                if (av.getListaVehiculos().get(po1) instanceof Hibrido && ab.getListaBaterias().get(po2).getTipoVehiculo().equals("Hibrido")) {
                    ensam = new Ensamblar(prog_bar);
                    ensam.setBateria(ab.getListaBaterias().get(po2));
                    ensam.setVehiculo(av.getListaVehiculos().get(po1));
                    try {
                        ensam.start();
                    } catch (Exception e) {
                    }
                    ensam.setAvanzar(true);
                    jd_ensamblar.setModal(true);
                    jd_ensamblar.pack();
                    jd_ensamblar.setLocationRelativeTo(this);
                    jd_ensamblar.setVisible(true);
                } else if (av.getListaVehiculos().get(po1) instanceof HibridoEnchufable && ab.getListaBaterias().get(po2).getTipoVehiculo().equals("Hibrido Enchufable")) {
                    ensam = new Ensamblar(prog_bar);
                    ensam.setBateria(ab.getListaBaterias().get(po2));
                    ensam.setVehiculo(av.getListaVehiculos().get(po1));
                    try {
                        ensam.start();
                    } catch (Exception e) {
                    }
                    ensam.setAvanzar(true);
                    jd_ensamblar.setModal(true);
                    jd_ensamblar.pack();
                    jd_ensamblar.setLocationRelativeTo(this);
                    jd_ensamblar.setVisible(true);
                } else if (av.getListaVehiculos().get(po1) instanceof ElectricoPuro && ab.getListaBaterias().get(po2).getTipoVehiculo().equals("Electrico Puro")) {
                    ensam = new Ensamblar(prog_bar);
                    ensam.setBateria(ab.getListaBaterias().get(po2));
                    ensam.setVehiculo(av.getListaVehiculos().get(po1));
                    try {
                        ensam.start();
                    } catch (Exception e) {
                    }
                    ensam.setAvanzar(true);
                    jd_ensamblar.setModal(true);
                    jd_ensamblar.pack();
                    jd_ensamblar.setLocationRelativeTo(this);
                    jd_ensamblar.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Deben ser el mismo tipo de vehiculo");
                }
            }
        }
    }//GEN-LAST:event_jb_ensamblarActionPerformed

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
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JFormattedTextField cilindrada_add_combustion;
    private javax.swing.JFormattedTextField cilindrada_add_combustion1;
    private javax.swing.JFormattedTextField cilindros_add_combustion;
    private javax.swing.JFormattedTextField cilindros_add_combustion1;
    private javax.swing.JFormattedTextField coeficiente_add_coeficiente;
    private javax.swing.JFormattedTextField coeficiente_add_coeficiente1;
    private javax.swing.JRadioButton comb_compacto;
    private javax.swing.JRadioButton comb_compacto1;
    private javax.swing.JRadioButton comb_deportivo;
    private javax.swing.JRadioButton comb_deportivo1;
    private javax.swing.JRadioButton comb_familiar;
    private javax.swing.JRadioButton comb_familiar1;
    private javax.swing.JRadioButton comb_sub;
    private javax.swing.JRadioButton comb_sub1;
    private javax.swing.JRadioButton comb_suv;
    private javax.swing.JRadioButton comb_suv1;
    private javax.swing.JFormattedTextField consumo_add_combustion;
    private javax.swing.JFormattedTextField consumo_add_combustion1;
    private javax.swing.JRadioButton elec_compacto;
    private javax.swing.JRadioButton elec_compacto1;
    private javax.swing.JRadioButton elec_deportivo;
    private javax.swing.JRadioButton elec_deportivo1;
    private javax.swing.JRadioButton elec_familiar;
    private javax.swing.JRadioButton elec_familiar1;
    private javax.swing.JRadioButton elec_sub;
    private javax.swing.JRadioButton elec_sub1;
    private javax.swing.JRadioButton elec_suv;
    private javax.swing.JRadioButton elec_suv1;
    private javax.swing.JButton eliminar_bateria;
    private javax.swing.JButton eliminar_vehiculo;
    private javax.swing.JRadioButton enchufable_compacto;
    private javax.swing.JRadioButton enchufable_compacto1;
    private javax.swing.JRadioButton enchufable_deportivo;
    private javax.swing.JRadioButton enchufable_deportivo1;
    private javax.swing.JRadioButton enchufable_familiar;
    private javax.swing.JRadioButton enchufable_familiar1;
    private javax.swing.JRadioButton enchufable_sub;
    private javax.swing.JRadioButton enchufable_sub1;
    private javax.swing.JRadioButton enchufable_suv;
    private javax.swing.JRadioButton enchufable_suv1;
    private javax.swing.JFormattedTextField galones_add_enchufable;
    private javax.swing.JFormattedTextField galones_add_enchufable1;
    private javax.swing.JRadioButton hibrido_compacto;
    private javax.swing.JRadioButton hibrido_compacto1;
    private javax.swing.JRadioButton hibrido_deportivo;
    private javax.swing.JRadioButton hibrido_deportivo1;
    private javax.swing.JRadioButton hibrido_familiar;
    private javax.swing.JRadioButton hibrido_familiar1;
    private javax.swing.JRadioButton hibrido_sub;
    private javax.swing.JRadioButton hibrido_sub1;
    private javax.swing.JRadioButton hibrido_suv;
    private javax.swing.JRadioButton hibrido_suv1;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JButton jb_add_combustion;
    private javax.swing.JButton jb_add_electrico;
    private javax.swing.JButton jb_add_hibrido;
    private javax.swing.JButton jb_add_hibridoenchufable;
    private javax.swing.JButton jb_agregar_bateria;
    private javax.swing.JButton jb_agregar_combustion;
    private javax.swing.JButton jb_agregar_elec;
    private javax.swing.JButton jb_agregar_enchufable;
    private javax.swing.JButton jb_agregar_hibrido;
    private javax.swing.JButton jb_ensamblar;
    private javax.swing.JButton jb_listar_baterias;
    private javax.swing.JButton jb_listar_ensamblados;
    private javax.swing.JButton jb_listar_vehiculo;
    private javax.swing.JButton jb_modificar_bateria;
    private javax.swing.JButton jb_modificar_combustion;
    private javax.swing.JButton jb_modificar_elec;
    private javax.swing.JButton jb_modificar_enchufable;
    private javax.swing.JButton jb_modificar_hibrido;
    private javax.swing.JDialog jd_add_baterias;
    private javax.swing.JDialog jd_add_combustion;
    private javax.swing.JDialog jd_add_electrico;
    private javax.swing.JDialog jd_add_enchufable;
    private javax.swing.JDialog jd_add_hibrido;
    private javax.swing.JDialog jd_ensamblar;
    private javax.swing.JButton jd_ensamblar_carro;
    private javax.swing.JDialog jd_listar_baterias;
    private javax.swing.JDialog jd_listar_ensamblados;
    private javax.swing.JDialog jd_listar_vehiculos;
    private javax.swing.JDialog jd_mod_baterias;
    private javax.swing.JDialog jd_mod_combustion;
    private javax.swing.JDialog jd_mod_electrico;
    private javax.swing.JDialog jd_mod_enchufable;
    private javax.swing.JDialog jd_mod_hibrido;
    private javax.swing.JDialog jd_seleccionar;
    private javax.swing.JTable jt_baterias;
    private javax.swing.JTable jt_baterias1;
    private javax.swing.JTable jt_ensamblados;
    private javax.swing.JTable jt_vehiculos;
    private javax.swing.JTable jt_vehiculos1;
    private javax.swing.JFormattedTextField kilo_add_hibrido;
    private javax.swing.JFormattedTextField kilo_add_hibrido1;
    private javax.swing.JFormattedTextField maletero_add_enchufable;
    private javax.swing.JFormattedTextField maletero_add_enchufable1;
    private javax.swing.JTextField marca_add_combustion;
    private javax.swing.JTextField marca_add_combustion1;
    private javax.swing.JTextField marca_add_elec;
    private javax.swing.JTextField marca_add_elec1;
    private javax.swing.JTextField marca_add_enchufable;
    private javax.swing.JTextField marca_add_enchufable1;
    private javax.swing.JTextField marca_add_hibrido;
    private javax.swing.JTextField marca_add_hibrido1;
    private javax.swing.JTextField modelo_add_combustion;
    private javax.swing.JTextField modelo_add_combustion1;
    private javax.swing.JTextField modelo_add_elec;
    private javax.swing.JTextField modelo_add_elec1;
    private javax.swing.JTextField modelo_add_enchufable;
    private javax.swing.JTextField modelo_add_enchufable1;
    private javax.swing.JTextField modelo_add_hibrido;
    private javax.swing.JTextField modelo_add_hibrido1;
    private javax.swing.JButton modificar_modificar;
    private javax.swing.JButton modificar_vehiculo;
    private javax.swing.JFormattedTextField motores_add_elec;
    private javax.swing.JFormattedTextField motores_add_elec1;
    private javax.swing.JFormattedTextField pasajeros_add_hibrido;
    private javax.swing.JFormattedTextField pasajeros_add_hibrido1;
    private javax.swing.JFormattedTextField precio_add_hibrido;
    private javax.swing.JFormattedTextField precio_add_hibrido1;
    private javax.swing.JProgressBar prog_bar;
    private javax.swing.JRadioButton rb_electrico;
    private javax.swing.JRadioButton rb_electrico1;
    private javax.swing.JRadioButton rb_enchufable;
    private javax.swing.JRadioButton rb_enchufable1;
    private javax.swing.JRadioButton rb_hibrido;
    private javax.swing.JRadioButton rb_hibrido1;
    private javax.swing.JFormattedTextField recarga_add_elec;
    private javax.swing.JFormattedTextField recarga_add_elec1;
    private javax.swing.JTextField tf_autonomia;
    private javax.swing.JTextField tf_autonomia1;
    private javax.swing.JFormattedTextField tf_capacidad;
    private javax.swing.JFormattedTextField tf_capacidad1;
    private javax.swing.JFormattedTextField tf_carga;
    private javax.swing.JFormattedTextField tf_carga1;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField tf_marca1;
    private javax.swing.JFormattedTextField tf_modulos;
    private javax.swing.JFormattedTextField tf_modulos1;
    private javax.swing.JFormattedTextField tf_tiempo;
    private javax.swing.JFormattedTextField tf_tiempo1;
    private javax.swing.JFormattedTextField vin_add_combustion;
    private javax.swing.JFormattedTextField vin_add_combustion1;
    private javax.swing.JFormattedTextField vin_add_elec;
    private javax.swing.JFormattedTextField vin_add_elec1;
    private javax.swing.JFormattedTextField vin_add_enchufable;
    private javax.swing.JFormattedTextField vin_add_enchufable1;
    private javax.swing.JFormattedTextField vin_add_hibrido;
    private javax.swing.JFormattedTextField vin_add_hibrido1;
    // End of variables declaration//GEN-END:variables
    int poVehiculo;
    int poBateria;
    Ensamblar ensam;
}
