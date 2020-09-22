package UI;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {
    ArrayList<String> contra;
    
    public Inicio() {
        initComponents();
        campass.setVisible(false);
        contra = UI.CargarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campass = new javax.swing.JPanel();
        camb = new javax.swing.JButton();
        oldpass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        newpass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        repass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        principal = new javax.swing.JPanel();
        cambio = new javax.swing.JButton();
        iniciar = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador de agendas");
        setLocationByPlatform(true);

        campass.setEnabled(false);

        camb.setText("Cambiar contraseña");
        camb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambActionPerformed(evt);
            }
        });

        jLabel2.setText("Contraseña actual:");

        jLabel3.setText("Contraseña nueva:");

        jLabel4.setText("Repetir contraseña:");

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout campassLayout = new javax.swing.GroupLayout(campass);
        campass.setLayout(campassLayout);
        campassLayout.setHorizontalGroup(
            campassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campassLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(campassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(campassLayout.createSequentialGroup()
                        .addGroup(campassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(campassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oldpass, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(repass)
                            .addComponent(newpass)))
                    .addGroup(campassLayout.createSequentialGroup()
                        .addComponent(camb, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        campassLayout.setVerticalGroup(
            campassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campassLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(campassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(oldpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(campassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(newpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(campassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(repass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(campassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(camb)
                    .addComponent(jButton1))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        cambio.setText("Cambiar contraseña");
        cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambioActionPerformed(evt);
            }
        });

        iniciar.setText("Ingresar");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese la contraseña de acceso:");

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cambio)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(campass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(campass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        if(contra.get(0).equals(new String(pass.getPassword()))){
            AplicacionAgenda ventana = new AplicacionAgenda(contra);
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Contraseña incorrecta");
        }
    }//GEN-LAST:event_iniciarActionPerformed

    private void cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambioActionPerformed
        principal.setVisible(false);
        principal.setEnabled(false);
        campass.setVisible(true);
        campass.setEnabled(true);
    }//GEN-LAST:event_cambioActionPerformed

    private void cambActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambActionPerformed
        if(contra.get(0).equals(new String(oldpass.getPassword()))){
            if(Arrays.equals(newpass.getPassword(), repass.getPassword())){
                contra.set(0, new String(newpass.getPassword()));
                UI.guardarDatos(contra);
                JOptionPane.showMessageDialog(this, "Contraseña cambiada correctamente");
                AplicacionAgenda ventana = new AplicacionAgenda(contra);
                ventana.setVisible(true);
                ventana.setLocationRelativeTo(null);
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Contraseña antigua incorrecta");
        }
    }//GEN-LAST:event_cambActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        principal.setVisible(true);
        principal.setEnabled(true);
        campass.setVisible(false);
        campass.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton camb;
    private javax.swing.JButton cambio;
    private javax.swing.JPanel campass;
    private javax.swing.JButton iniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JPasswordField oldpass;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPanel principal;
    private javax.swing.JPasswordField repass;
    // End of variables declaration//GEN-END:variables
}
