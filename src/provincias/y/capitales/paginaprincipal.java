/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provincias.y.capitales;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class paginaprincipal extends javax.swing.JFrame {
    

    /**
     * Creates new form paginaprincipal
     */
    public paginaprincipal() {
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

        jLabel1 = new javax.swing.JLabel();
        btn_esmeraldas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_manabi = new javax.swing.JButton();
        btn_santa_elena = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btn_guayas = new javax.swing.JButton();
        btn_los_rios = new javax.swing.JButton();
        btn_el_oro = new javax.swing.JButton();
        btn_sto_domingo = new javax.swing.JButton();
        btn_carchi = new javax.swing.JButton();
        btn_imbabura = new javax.swing.JButton();
        btn_pichincha = new javax.swing.JButton();
        btn_cotopaxi = new javax.swing.JButton();
        btn_tungurahua = new javax.swing.JButton();
        btn_bolivar = new javax.swing.JButton();
        btn_chimborazo = new javax.swing.JButton();
        btn_cañar = new javax.swing.JButton();
        btn_azuay = new javax.swing.JButton();
        btn_loja = new javax.swing.JButton();
        btn_sucumbios = new javax.swing.JButton();
        btn_napo = new javax.swing.JButton();
        btn_orellana = new javax.swing.JButton();
        btn_pastaza = new javax.swing.JButton();
        btn_morona_santiago = new javax.swing.JButton();
        btn_zamora_chinchipe = new javax.swing.JButton();
        btn_galapagos = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_cerrar = new javax.swing.JButton();
        btn_evaluacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1350, 650));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Seleccione la provincia que desea saber su información:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(860, 40, 399, 22);

        btn_esmeraldas.setText("ESMERALDAS");
        btn_esmeraldas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_esmeraldasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_esmeraldas);
        btn_esmeraldas.setBounds(850, 120, 110, 23);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Mapa del Ecuador:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 30, 190, 28);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/provincias/y/capitales/Mapa del Ecuador.jpg"))); // NOI18N
        jLabel3.setAlignmentY(5.0F);
        jScrollPane1.setViewportView(jLabel3);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 80, 820, 530);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Costa");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(890, 80, 50, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Sierra");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1000, 80, 42, 22);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Amazonía");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1110, 80, 80, 22);

        btn_manabi.setText("MANABÍ");
        btn_manabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manabiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_manabi);
        btn_manabi.setBounds(850, 150, 110, 23);

        btn_santa_elena.setText("SANTA ELENA");
        btn_santa_elena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_santa_elenaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_santa_elena);
        btn_santa_elena.setBounds(850, 180, 110, 23);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Insular");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1230, 80, 60, 22);

        btn_guayas.setText("GUAYAS");
        btn_guayas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guayasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guayas);
        btn_guayas.setBounds(850, 210, 110, 23);

        btn_los_rios.setText("LOS RÍOS");
        btn_los_rios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_los_riosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_los_rios);
        btn_los_rios.setBounds(850, 240, 110, 23);

        btn_el_oro.setText("EL ORO");
        btn_el_oro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_el_oroActionPerformed(evt);
            }
        });
        getContentPane().add(btn_el_oro);
        btn_el_oro.setBounds(850, 270, 110, 23);

        btn_sto_domingo.setText("SANTO DOMINGO");
        btn_sto_domingo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sto_domingoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sto_domingo);
        btn_sto_domingo.setBounds(850, 300, 110, 23);

        btn_carchi.setText("CARCHI");
        btn_carchi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carchiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_carchi);
        btn_carchi.setBounds(970, 120, 110, 23);

        btn_imbabura.setText("IMBABURA");
        btn_imbabura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imbaburaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_imbabura);
        btn_imbabura.setBounds(970, 150, 110, 23);

        btn_pichincha.setText("PICHINCHA");
        btn_pichincha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pichinchaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pichincha);
        btn_pichincha.setBounds(970, 180, 110, 23);

        btn_cotopaxi.setText("COTOPAXI");
        btn_cotopaxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cotopaxiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cotopaxi);
        btn_cotopaxi.setBounds(970, 210, 110, 23);

        btn_tungurahua.setText("TUNGURAHUA");
        btn_tungurahua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tungurahuaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tungurahua);
        btn_tungurahua.setBounds(970, 240, 110, 23);

        btn_bolivar.setText("BOLÍVAR");
        btn_bolivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bolivarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_bolivar);
        btn_bolivar.setBounds(970, 270, 110, 23);

        btn_chimborazo.setText("CHIMBORAZO");
        btn_chimborazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chimborazoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_chimborazo);
        btn_chimborazo.setBounds(970, 300, 110, 23);

        btn_cañar.setText("CAÑAR");
        btn_cañar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cañarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cañar);
        btn_cañar.setBounds(970, 330, 110, 23);

        btn_azuay.setText("AZUAY");
        btn_azuay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_azuayActionPerformed(evt);
            }
        });
        getContentPane().add(btn_azuay);
        btn_azuay.setBounds(970, 360, 110, 23);

        btn_loja.setText("LOJA");
        btn_loja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lojaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_loja);
        btn_loja.setBounds(970, 390, 110, 23);

        btn_sucumbios.setText("SUCUMBÍOS");
        btn_sucumbios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sucumbiosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sucumbios);
        btn_sucumbios.setBounds(1090, 120, 110, 23);

        btn_napo.setText("NAPO");
        btn_napo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_napoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_napo);
        btn_napo.setBounds(1090, 150, 110, 23);

        btn_orellana.setText("ORELLANA");
        btn_orellana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_orellanaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_orellana);
        btn_orellana.setBounds(1090, 180, 110, 23);

        btn_pastaza.setText("PASTAZA");
        btn_pastaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pastazaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pastaza);
        btn_pastaza.setBounds(1090, 210, 110, 23);

        btn_morona_santiago.setText("MORONA SANTIAGO");
        btn_morona_santiago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_morona_santiagoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_morona_santiago);
        btn_morona_santiago.setBounds(1090, 240, 110, 23);

        btn_zamora_chinchipe.setText("ZAMORA CHINCHIPE");
        btn_zamora_chinchipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_zamora_chinchipeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_zamora_chinchipe);
        btn_zamora_chinchipe.setBounds(1090, 270, 110, 23);

        btn_galapagos.setText("GALÁPAGOS");
        btn_galapagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_galapagosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_galapagos);
        btn_galapagos.setBounds(1210, 120, 110, 23);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Evaluación sobre el conocimiento adquirido:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(940, 470, 320, 20);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Cierre de Programa:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1020, 550, 150, 22);

        btn_cerrar.setText("CERRAR");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cerrar);
        btn_cerrar.setBounds(1040, 580, 110, 23);

        btn_evaluacion.setText("EVALUACIÓN");
        btn_evaluacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_evaluacionActionPerformed(evt);
            }
        });
        getContentPane().add(btn_evaluacion);
        btn_evaluacion.setBounds(1040, 500, 110, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_esmeraldasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_esmeraldasActionPerformed
        // TODO add your handling code here:
        esmeraldas frame2 = new esmeraldas(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);  //para que la ventana anterior se oculte
    }//GEN-LAST:event_btn_esmeraldasActionPerformed

    private void btn_manabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manabiActionPerformed
        // TODO add your handling code here:
        manabi frame2 = new manabi(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);
    }//GEN-LAST:event_btn_manabiActionPerformed

    private void btn_santa_elenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_santa_elenaActionPerformed
        // TODO add your handling code here:
        santa_elena frame2 = new santa_elena(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);
    }//GEN-LAST:event_btn_santa_elenaActionPerformed

    private void btn_guayasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guayasActionPerformed
        // TODO add your handling code here:
        guayas frame2 = new guayas(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);
    }//GEN-LAST:event_btn_guayasActionPerformed

    private void btn_los_riosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_los_riosActionPerformed
        // TODO add your handling code here:
        los_rios frame2 = new los_rios(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);
    }//GEN-LAST:event_btn_los_riosActionPerformed

    private void btn_el_oroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_el_oroActionPerformed
        // TODO add your handling code here:
        el_oro frame2 = new el_oro(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);
    }//GEN-LAST:event_btn_el_oroActionPerformed

    private void btn_sto_domingoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sto_domingoActionPerformed
        // TODO add your handling code here:
        santo_domingo frame2 = new santo_domingo(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);
    }//GEN-LAST:event_btn_sto_domingoActionPerformed

    private void btn_carchiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carchiActionPerformed
        // TODO add your handling code here:
        carchi frame2 = new carchi(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);
    }//GEN-LAST:event_btn_carchiActionPerformed

    private void btn_imbaburaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imbaburaActionPerformed
        // TODO add your handling code here:
        imbabura frame2 = new imbabura(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);
    }//GEN-LAST:event_btn_imbaburaActionPerformed

    private void btn_pichinchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pichinchaActionPerformed
        // TODO add your handling code here:
        pichincha frame2 = new pichincha(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);
    }//GEN-LAST:event_btn_pichinchaActionPerformed

    private void btn_cotopaxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cotopaxiActionPerformed
        // TODO add your handling code here:
        cotopaxi frame2 = new cotopaxi(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);
    }//GEN-LAST:event_btn_cotopaxiActionPerformed

    private void btn_tungurahuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tungurahuaActionPerformed
        // TODO add your handling code here:
        tungurahua frame2 = new tungurahua(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);
    }//GEN-LAST:event_btn_tungurahuaActionPerformed

    private void btn_bolivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bolivarActionPerformed
        // TODO add your handling code here:
        bolivar frame2 = new bolivar(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);
    }//GEN-LAST:event_btn_bolivarActionPerformed

    private void btn_chimborazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chimborazoActionPerformed
        // TODO add your handling code here:
        chimborazo frame2 = new chimborazo(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);
    }//GEN-LAST:event_btn_chimborazoActionPerformed

    private void btn_cañarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cañarActionPerformed
        // TODO add your handling code here:
        cañar frame2 = new cañar(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);
    }//GEN-LAST:event_btn_cañarActionPerformed

    private void btn_azuayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_azuayActionPerformed
        // TODO add your handling code here:
        azuay frame2 = new azuay(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);
    }//GEN-LAST:event_btn_azuayActionPerformed

    private void btn_lojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lojaActionPerformed
        // TODO add your handling code here:
        loja frame2 = new loja(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);
    }//GEN-LAST:event_btn_lojaActionPerformed

    private void btn_sucumbiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sucumbiosActionPerformed
        // TODO add your handling code here:
        sucumbios frame2 = new sucumbios(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);
    }//GEN-LAST:event_btn_sucumbiosActionPerformed

    private void btn_napoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_napoActionPerformed
        // TODO add your handling code here:
        napo frame2 = new napo(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);
    }//GEN-LAST:event_btn_napoActionPerformed

    private void btn_orellanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_orellanaActionPerformed
        // TODO add your handling code here:
        orellana frame2 = new orellana(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);
    }//GEN-LAST:event_btn_orellanaActionPerformed

    private void btn_pastazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pastazaActionPerformed
        // TODO add your handling code here:
        pastaza frame2 = new pastaza(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);
    }//GEN-LAST:event_btn_pastazaActionPerformed

    private void btn_morona_santiagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_morona_santiagoActionPerformed
        // TODO add your handling code here:
        morona_santiago frame2 = new morona_santiago(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);
    }//GEN-LAST:event_btn_morona_santiagoActionPerformed

    private void btn_zamora_chinchipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_zamora_chinchipeActionPerformed
        // TODO add your handling code here:
        zamora_chinchipe frame2 = new zamora_chinchipe(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);
    }//GEN-LAST:event_btn_zamora_chinchipeActionPerformed

    private void btn_galapagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_galapagosActionPerformed
        // TODO add your handling code here:
        galapagos frame2 = new galapagos(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);
    }//GEN-LAST:event_btn_galapagosActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        // TODO add your handling code here:
        despedida frame2 = new despedida(); //Para que se abra la siguiente ventana
        frame2.setVisible(true); //mostrar por pantalla la ventana
        this.setVisible(false);
        
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_evaluacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_evaluacionActionPerformed
        // TODO add your handling code here:
        //Poner enlace en un botón
        try {
            Desktop.getDesktop().browse(new URI("https://forms.gle/5wMhc57zhn86gDuWA"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"NO SE HA PODIDO CARGAR LA PÁGINA");
        }
    }//GEN-LAST:event_btn_evaluacionActionPerformed

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
            java.util.logging.Logger.getLogger(paginaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paginaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paginaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paginaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new paginaprincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_azuay;
    private javax.swing.JButton btn_bolivar;
    private javax.swing.JButton btn_carchi;
    private javax.swing.JButton btn_cañar;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_chimborazo;
    private javax.swing.JButton btn_cotopaxi;
    private javax.swing.JButton btn_el_oro;
    private javax.swing.JButton btn_esmeraldas;
    private javax.swing.JButton btn_evaluacion;
    private javax.swing.JButton btn_galapagos;
    private javax.swing.JButton btn_guayas;
    private javax.swing.JButton btn_imbabura;
    private javax.swing.JButton btn_loja;
    private javax.swing.JButton btn_los_rios;
    private javax.swing.JButton btn_manabi;
    private javax.swing.JButton btn_morona_santiago;
    private javax.swing.JButton btn_napo;
    private javax.swing.JButton btn_orellana;
    private javax.swing.JButton btn_pastaza;
    private javax.swing.JButton btn_pichincha;
    private javax.swing.JButton btn_santa_elena;
    private javax.swing.JButton btn_sto_domingo;
    private javax.swing.JButton btn_sucumbios;
    private javax.swing.JButton btn_tungurahua;
    private javax.swing.JButton btn_zamora_chinchipe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
