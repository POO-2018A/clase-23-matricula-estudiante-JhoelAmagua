package matricula;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Matricula extends javax.swing.JFrame {
    
    String [][] materias;
    DefaultTableModel tblModelMaterias;
    
    String [][] estudiantes;
    DefaultTableModel tblModelEstudiantes;
    
    String [][] matriculados;
    DefaultTableModel tblModelMatriculados;
  
    List<Materia> listaMaterias = new ArrayList<Materia>();
    DefaultComboBoxModel listaMateriasModel = 
            new DefaultComboBoxModel(listaMaterias.toArray());
    
    List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
    DefaultComboBoxModel listaEstudiantesModel = 
            new DefaultComboBoxModel(listaEstudiantes.toArray());

    List<Matriculados> listaMatriculados = new ArrayList<Matriculados>();
    DefaultComboBoxModel listaMatriculadosModel = 
            new DefaultComboBoxModel(listaMatriculados.toArray());
    
    public Matricula() {
        initComponents();     

        materias = new String [][] {};
        String titulosColumnasMaterias[] = new String [] {"Materia" };
        tblModelMaterias = new DefaultTableModel(materias, titulosColumnasMaterias);
        tblMaterias.setModel(tblModelMaterias);
        
        estudiantes = new String[][]{};
        String titulosColumnasEstudiantes[] = new String [] {"Nombre", "Apellido", "Edad"};
        tblModelEstudiantes = new DefaultTableModel(estudiantes, titulosColumnasEstudiantes);
        tblEstudiantes.setModel(tblModelEstudiantes);
        
        matriculados = new String [][]{};
        String titulosColumnasMatriculados[] = new String [] {"Estudiante","Materia"};
        tblModelMatriculados = new DefaultTableModel(matriculados, titulosColumnasMatriculados);
        tblMatriculados.setModel(tblModelMatriculados);
        
        cmbListaMaterias.setModel(listaMateriasModel);
        cmbListaEstudiantes.setModel(listaEstudiantesModel);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblNombreMateria = new javax.swing.JLabel();
        txtNombreMateria = new javax.swing.JTextField();
        btnAgregarMateria = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMaterias = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblNombreEstudiante = new javax.swing.JLabel();
        lblApellidoEstudiante = new javax.swing.JLabel();
        lblEdadEstudiante = new javax.swing.JLabel();
        txtNombreEstudiante = new javax.swing.JTextField();
        txtApellidoEstudiante = new javax.swing.JTextField();
        txtEdadEstudiante = new javax.swing.JTextField();
        btnRegistrarEstudiante = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEstudiantes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cmbListaEstudiantes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cmbListaMaterias = new javax.swing.JComboBox<>();
        btnMatricularEstudiante = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMatriculados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombreMateria.setText("Nombre");

        txtNombreMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreMateriaActionPerformed(evt);
            }
        });

        btnAgregarMateria.setText("Agregar materia");
        btnAgregarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMateriaActionPerformed(evt);
            }
        });

        tblMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMaterias);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(btnAgregarMateria))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(lblNombreMateria)
                        .addGap(48, 48, 48)
                        .addComponent(txtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreMateria)
                    .addComponent(txtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregarMateria)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Materias", jPanel1);

        lblNombreEstudiante.setText("Nombre");

        lblApellidoEstudiante.setText("Apellido");

        lblEdadEstudiante.setText("Edad");

        btnRegistrarEstudiante.setText("Registrar Estudiante");
        btnRegistrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEstudianteActionPerformed(evt);
            }
        });

        tblEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblEstudiantes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreEstudiante)
                            .addComponent(lblApellidoEstudiante)
                            .addComponent(lblEdadEstudiante))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addComponent(txtApellidoEstudiante))
                            .addComponent(txtEdadEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(btnRegistrarEstudiante))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreEstudiante)
                    .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoEstudiante)
                    .addComponent(txtApellidoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdadEstudiante)
                    .addComponent(txtEdadEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarEstudiante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Estudiantes", jPanel2);

        jLabel3.setText("Estudiante");

        jLabel1.setText("Materia");

        cmbListaMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbListaMateriasActionPerformed(evt);
            }
        });

        btnMatricularEstudiante.setText("Matricular");
        btnMatricularEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatricularEstudianteActionPerformed(evt);
            }
        });

        tblMatriculados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblMatriculados);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbListaEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(btnMatricularEstudiante)))
                .addGap(201, 207, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbListaEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addComponent(btnMatricularEstudiante)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Matrículas", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMateriaActionPerformed
        Materia newMateria = new Materia(txtNombreMateria.getText());
        tblModelMaterias.addRow(new String[]{newMateria.getNombre()});
        
        listaMateriasModel.addElement(newMateria);
        txtNombreMateria.setText("");
    }//GEN-LAST:event_btnAgregarMateriaActionPerformed

    private void btnRegistrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEstudianteActionPerformed
        String nombre = txtNombreEstudiante.getText();
        String apellido = txtApellidoEstudiante.getText();
        int edad = Integer.parseInt(txtEdadEstudiante.getText());
        
        Estudiante newEstudiante = new Estudiante(nombre, apellido, edad);
        
        tblModelEstudiantes.addRow(new String[]{newEstudiante.getNombre(), newEstudiante.getApellido(), ""+newEstudiante.getEdad()});
        listaEstudiantesModel.addElement(txtNombreEstudiante.getText()+" "+txtApellidoEstudiante.getText()+" ");
        
        txtNombreEstudiante.setText("");
        txtApellidoEstudiante.setText("");
        txtEdadEstudiante.setText("");
    }//GEN-LAST:event_btnRegistrarEstudianteActionPerformed

    private void btnMatricularEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatricularEstudianteActionPerformed
        String estudiante = cmbListaEstudiantes.getSelectedItem().toString();
        String materias = cmbListaMaterias.getSelectedItem().toString();
        
        Matriculados newMatriculados = new Matriculados(estudiante,materias);
        tblModelMatriculados.addRow(new String []{ estudiante,materias}); 
  
    }//GEN-LAST:event_btnMatricularEstudianteActionPerformed

    private void txtNombreMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMateriaActionPerformed

    private void cmbListaMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbListaMateriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbListaMateriasActionPerformed

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
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarMateria;
    private javax.swing.JButton btnMatricularEstudiante;
    private javax.swing.JButton btnRegistrarEstudiante;
    private javax.swing.JComboBox<String> cmbListaEstudiantes;
    private javax.swing.JComboBox<String> cmbListaMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblApellidoEstudiante;
    private javax.swing.JLabel lblEdadEstudiante;
    private javax.swing.JLabel lblNombreEstudiante;
    private javax.swing.JLabel lblNombreMateria;
    private javax.swing.JTable tblEstudiantes;
    private javax.swing.JTable tblMaterias;
    private javax.swing.JTable tblMatriculados;
    private javax.swing.JTextField txtApellidoEstudiante;
    private javax.swing.JTextField txtEdadEstudiante;
    private javax.swing.JTextField txtNombreEstudiante;
    private javax.swing.JTextField txtNombreMateria;
    // End of variables declaration//GEN-END:variables
}
