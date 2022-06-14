/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercadojava;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author Benjamín Cortina
 */
public class MenuAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdministrador
     */
    Datos datos;
            Image img = new ImageIcon("src/imagenes/administrador.png").getImage();
    ImageIcon icon = new ImageIcon(img.getScaledInstance(100, 124, Image.SCALE_SMOOTH));
    public MenuAdministrador(Datos datos) {
        initComponents();
        this.datos=datos;
        this.jlbBienvenida.setText(this.jlbBienvenida.getText()+" "+this.datos.nombre);
        this.setIconImage(this.getIconImage());
        this.setLocationRelativeTo(null);
        
    }
        @Override
    public Image getIconImage() {
        //Se elige de los recursos de imágenes, la que se utilizará como icono
        Image valorRetorno = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/administrador.png"));
        return valorRetorno;
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
        jlbBienvenida = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmEmpleados = new javax.swing.JMenu();
        jmiRegistrar = new javax.swing.JMenuItem();
        jmiConsultar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(174, 146, 224));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 300));

        jlbBienvenida.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlbBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbBienvenida.setText("BIENVENIDO/A ");

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar sesion.png"))); // NOI18N
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(490, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jlbBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 300));

        jmEmpleados.setText("Empleados");

        jmiRegistrar.setText("Registrar/Modificar");
        jmiRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistrarActionPerformed(evt);
            }
        });
        jmEmpleados.add(jmiRegistrar);

        jmiConsultar.setText("Consultar");
        jmiConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarActionPerformed(evt);
            }
        });
        jmEmpleados.add(jmiConsultar);

        jMenuBar1.add(jmEmpleados);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistrarActionPerformed
        // TODO add your handling code here:
        RegistrarEmpleado empleado=new RegistrarEmpleado(this.datos);
        empleado.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jmiRegistrarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        Login login=new Login(this.datos);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jmiConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarActionPerformed

        // TODO add your handling code here:
        ConsultarEmpleados emp= new ConsultarEmpleados(this.datos);
        emp.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jmiConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlbBienvenida;
    private javax.swing.JMenu jmEmpleados;
    private javax.swing.JMenuItem jmiConsultar;
    private javax.swing.JMenuItem jmiRegistrar;
    // End of variables declaration//GEN-END:variables
}
