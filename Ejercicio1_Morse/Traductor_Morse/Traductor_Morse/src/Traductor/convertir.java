/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Traductor;
/**
 *
 * @author JassaidPrieto
 */
public class convertir extends javax.swing.JFrame {

    /**
     * Creates new form convertir
     */
    public convertir() {
        initComponents();
        //Localizar en el centro de la Pantalla del computador
        this.setLocationRelativeTo(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTexto = new javax.swing.JEditorPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Traductor de Codigo Morse [ Versión 1.0 ] [ 2014 ]");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtTexto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(txtTexto);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TRADUCTOR DE TEXTPO A MORSE");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Porfavor ingrese el texto que desee traducir");

        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Traducir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Traducción");

        txtResultado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jScrollPane3.setViewportView(txtResultado);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String texto;
        texto = txtTexto.getText();

        txtResultado.setText(stringConvertido(texto));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtTexto.setText("");
        txtResultado.setText("");
        txtTexto.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(convertir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(convertir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(convertir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(convertir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new convertir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JEditorPane txtResultado;
    private javax.swing.JEditorPane txtTexto;
    // End of variables declaration//GEN-END:variables
public static String stringConvertido(String loreString)
{
    String cadena;
    String getMorse;
    String convertirString = "";

    for (int i = 0; i < loreString.length(); i++)
    {
        //Obtiene un caracter en la posición i
        cadena = loreString.charAt(i) + "";  

        //convertir caracteres a código Morse
        getMorse = convierte(cadena);

        //palabras separadas con el símbolo |
        if (getMorse.equals(" "))
        {
            convertirString= convertirString + "  |  ";
        } 

        else 
        {
            //concatena la letra convertida
            convertirString = convertirString + getMorse;

            //Añadir un espacio entre cada letra
            if (!getMorse.equals(" ")) 
            {
                convertirString = convertirString + " ";
            }   
        }           
    }

    return convertirString;

}
 public static String convierte (String letra)  
    {  
        String morse = letra;  

        if (letra.equalsIgnoreCase("a"))  
            morse = ".-";  
        if (letra.equalsIgnoreCase("b"))  
            morse = "-...";  
        if (letra.equalsIgnoreCase("c"))  
            morse = "-.-.";  
        if (letra.equalsIgnoreCase("d"))  
            morse = "-..";  
        if (letra.equalsIgnoreCase("e"))  
            morse = ".";  
        if (letra.equalsIgnoreCase("f"))  
            morse = "..-.";  
        if (letra.equalsIgnoreCase("g"))  
            morse = "--.";  
        if (letra.equalsIgnoreCase("h"))  
            morse = "....";  
        if (letra.equalsIgnoreCase("i"))  
            morse = "..";  
        if (letra.equalsIgnoreCase("j"))  
            morse = ".---";  
        if (letra.equalsIgnoreCase("k"))  
            morse = "-.-";  
        if (letra.equalsIgnoreCase("l"))  
            morse = ".-..";  
        if (letra.equalsIgnoreCase("m"))  
            morse = "--";  
        if (letra.equalsIgnoreCase("n"))  
            morse = "-.";  
        if (letra.equalsIgnoreCase("o"))  
            morse = "---";  
        if (letra.equalsIgnoreCase("p"))  
            morse = ".--.";  
        if (letra.equalsIgnoreCase("q"))  
            morse = "--.-";  
        if (letra.equalsIgnoreCase("r"))  
            morse = ".-.";  
        if (letra.equalsIgnoreCase("s"))  
            morse = "...";  
        if (letra.equalsIgnoreCase("t"))  
            morse = "-";  
        if (letra.equalsIgnoreCase("u"))  
            morse = "..-";  
        if (letra.equalsIgnoreCase("v"))  
            morse = "...-";  
        if (letra.equalsIgnoreCase("w"))  
            morse = ".--";  
        if (letra.equalsIgnoreCase("x"))  
            morse = "-..-";  
        if (letra.equalsIgnoreCase("y"))  
            morse = "-.--";  
        if (letra.equalsIgnoreCase("z"))  
            morse = "--..";  
        if (letra.equalsIgnoreCase("0"))  
            morse = "-----";  
        if (letra.equalsIgnoreCase("1"))  
            morse = ".----";  
        if (letra.equalsIgnoreCase("2"))  
            morse = "..---";  
        if (letra.equalsIgnoreCase("3"))  
            morse = "...--";  
        if (letra.equalsIgnoreCase("4"))  
            morse = "....-";  
        if (letra.equalsIgnoreCase("5"))  
            morse = ".....";  
        if (letra.equalsIgnoreCase("6"))  
            morse = "-....";  
        if (letra.equalsIgnoreCase("7"))  
            morse = "--...";  
        if (letra.equalsIgnoreCase("8"))  
            morse = "---..";  
        if (letra.equalsIgnoreCase("9"))  
            morse = "----.";  
        if (letra.equalsIgnoreCase("."))  
            morse = ".-.-";  
        if (letra.equalsIgnoreCase(","))  
            morse = "--..--";  
        if (letra.equalsIgnoreCase("?"))  
            morse = "..--.."; 

        return morse;      
    }    
}
