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
 * @author PC
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Datos datos;
    int s;
    Image img = new ImageIcon("src/imagenes/inicioSesion.png").getImage();
    ImageIcon icon = new ImageIcon(img.getScaledInstance(100, 124, Image.SCALE_SMOOTH));
    public Login(Datos datos) {
        initComponents();
        jtfUsername.setText("");
        jtfPassword.setText("");
        this.setLocationRelativeTo(null);
        this.setIconImage(this.getIconImage());
        this.datos=datos;
        this.s=0;
    }
        @Override
    public Image getIconImage() {
        //Se elige de los recursos de imágenes, la que se utilizará como icono
        Image valorRetorno = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/inicioSesion.png"));
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
        jPanel2 = new javax.swing.JPanel();
        jbEntry = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        passIcon = new javax.swing.JLabel();
        jtfUsername = new javax.swing.JTextField();
        jtfPassword = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jlbSystemMessage = new javax.swing.JLabel();
        jbEntry1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(7, 143, 201));
        jPanel1.setPreferredSize(new java.awt.Dimension(371, 526));

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));

        jbEntry.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jbEntry.setForeground(new java.awt.Color(228, 255, 255));
        jbEntry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Barra-Login.png"))); // NOI18N
        jbEntry.setText("LOGIN");
        jbEntry.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbEntry.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Barra-Login.png"))); // NOI18N
        jbEntry.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Barra-Login-Selected.png"))); // NOI18N
        jbEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntryActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(5, 136, 206));
        jLabel1.setText("¡BIENVENIDO!");

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/userIcon.png"))); // NOI18N

        passIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/passIcon.png"))); // NOI18N

        jtfUsername.setBackground(new java.awt.Color(230, 230, 230));

        jtfPassword.setBackground(new java.awt.Color(230, 230, 230));

        jComboBox1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "EMPLEADO" }));

        jlbSystemMessage.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jlbSystemMessage.setForeground(new java.awt.Color(204, 0, 51));
        jlbSystemMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbSystemMessage.setText("...");

        jbEntry1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jbEntry1.setForeground(new java.awt.Color(228, 255, 255));
        jbEntry1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/barra-Salir.png"))); // NOI18N
        jbEntry1.setText("SALIR");
        jbEntry1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbEntry1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/barra-Salir.png"))); // NOI18N
        jbEntry1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/barra-Salir-Selected.png"))); // NOI18N
        jbEntry1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntry1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jbEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jbEntry1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(passIcon)
                                    .addComponent(userIcon))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(jtfPassword))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlbSystemMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userIcon)
                    .addComponent(jtfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passIcon)
                    .addComponent(jtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jlbSystemMessage)
                .addGap(36, 36, 36)
                .addComponent(jbEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jbEntry1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntryActionPerformed
        // TODO add your handling code here:
        if(!this.jtfUsername.getText().isEmpty() &&!this.jtfPassword.getText().isEmpty()){
            if(this.jComboBox1.getSelectedIndex()==0){
                //Administrador
                int i=this.datos.admis.buscar(this.jtfUsername.getText(),this.jtfPassword.getText());
                if(i!=-1){
                    this.s=i;
                    this.seguir();
                }else{
                    this.jlbSystemMessage.setText("Datos incorrectos");
                }
            }else{
                //Empleado
                int i=this.datos.empleados.buscar(this.jtfUsername.getText(),this.jtfPassword.getText());
                if(i!=-1){
                    this.s=i;
                    this.seguir2();
                }else{
                    this.jlbSystemMessage.setText("Datos incorrectos");
                }
            }
        }else{
            this.jlbSystemMessage.setText("Inserte todos los datos");
        }
    }//GEN-LAST:event_jbEntryActionPerformed

    private void jbEntry1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntry1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbEntry1ActionPerformed

    private void seguir(){
        this.datos.nombre=this.datos.admis.administrador[this.s].getNombre()+ " "+this.datos.admis.administrador[this.s].getApellido();
        MenuAdministrador admi=new MenuAdministrador(this.datos);
        admi.setVisible(true);
        this.dispose();
    }
    private void seguir2(){
        this.datos.nombre=this.datos.empleados.empleados[this.s].getNombre()+ " "+this.datos.empleados.empleados[this.s].getApellido();
        MenuEmpleado emple=new MenuEmpleado(this.datos);
        emple.setVisible(true);
        this.dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbEntry;
    private javax.swing.JButton jbEntry1;
    private javax.swing.JLabel jlbSystemMessage;
    private javax.swing.JPasswordField jtfPassword;
    private javax.swing.JTextField jtfUsername;
    private javax.swing.JLabel passIcon;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables
}
