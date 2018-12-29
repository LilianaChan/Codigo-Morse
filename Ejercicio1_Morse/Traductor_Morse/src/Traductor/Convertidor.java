/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Traductor;
/**
 *
 * @author Lily
 */
public class Convertidor extends javax.swing.JFrame {

    /**
     * Creates new form convertir
     */
    public Convertidor() {
        initComponents();

        this.setLocationRelativeTo(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTexto = new javax.swing.JEditorPane();
        jTitulo1 = new javax.swing.JLabel();
        jSubTitulo1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSubTitulo2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Traductor de texto a código Morse");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        txtTexto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(txtTexto);

        jTitulo1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTitulo1.setForeground(new java.awt.Color(0, 0, 255));
        jTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTitulo1.setText("TRADUCTOR DE TEXTO A MORSE");

        jSubTitulo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSubTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSubTitulo1.setText("Porfavor ingrese el texto que desee traducir");

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        jButton1.setText("Traducir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSubTitulo2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jSubTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSubTitulo2.setText("Traducción");

        txtResultado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jScrollPane3.setViewportView(txtResultado);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTitulo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSubTitulo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSubTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSubTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSubTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Convertidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jSubTitulo1;
    private javax.swing.JLabel jSubTitulo2;
    private javax.swing.JLabel jTitulo1;
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
        
        cadena = loreString.charAt(i) + "";  

        
        getMorse = convierte(cadena);

        
        if (getMorse.equals(" "))
        {
            convertirString= convertirString + "   ";
        } 

        else 
        {
            
            convertirString = convertirString + getMorse;

            
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
