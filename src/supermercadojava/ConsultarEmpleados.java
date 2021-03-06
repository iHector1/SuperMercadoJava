/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercadojava;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class ConsultarEmpleados extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarEmpleados
     */
    Datos datos;
    listaEmpleados emp;
    DefaultTableModel table = new DefaultTableModel();
    public ConsultarEmpleados(Datos datos) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/listaEmpleados.png")).getImage());
        this.setLocationRelativeTo(null);
        this.datos=datos;
        String [] columnas= new String[]{"ID","Nombre","Apellido","Fecha de nacimiento"
                ,"Edad","Salario","Horario","Area","Domicilio"};
        
        table.setColumnIdentifiers(columnas);
        this.tabla.setModel(table);
        Object[] emp=this.datos.empleados.imprimir();
        int contador = this.datos.empleados.contador;
        if(contador!=0){
           for(int i =0;i<contador;i++){
               Empleado a=(Empleado) emp[i];
               table.addRow(new Object[]{a.getIdentificador(),a.getNombre(),a.getApellido(),a.getFechaNacimiento(),a.getEdad(),a.getSalario(),a.getHorario(),a.getArea(),a.getDomicilio()});
            } 
        }else{
           JOptionPane.showMessageDialog(null, "No hay empleados registrados","Error", JOptionPane.ERROR_MESSAGE);
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

        jPanel1 = new javax.swing.JPanel();
        jbVolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(146, 79, 246));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regreso.png"))); // NOI18N
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 640, 60, 40));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabla);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 289, 1280, 91));

        jLabel13.setBackground(new java.awt.Color(246, 246, 246));
        jLabel13.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(246, 246, 246));
        jLabel13.setText("MOSTRANDO DATOS RECOPILADOS HASTA EL MOMENTO");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        jLabel14.setBackground(new java.awt.Color(246, 246, 246));
        jLabel14.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(246, 246, 246));
        jLabel14.setText("DEL REGISTRO DE EMPLEADOS");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

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
    }// </editor-fold>//GEN-END:initComponents

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        // TODO add your handling code here:
        MenuAdministrador menu=new MenuAdministrador(this.datos);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbVolver;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
