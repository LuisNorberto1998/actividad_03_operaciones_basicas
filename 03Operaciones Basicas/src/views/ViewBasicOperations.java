/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Norberto
 */
public class ViewBasicOperations extends javax.swing.JFrame {

    /**
     * Creates new form ViewBasicOperations
     */
    public ViewBasicOperations() {
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

        jlNumberTwo = new javax.swing.JLabel();
        jlNumberOne = new javax.swing.JLabel();
        jtfNumberOne = new javax.swing.JTextField();
        jtfNumberTwo = new javax.swing.JTextField();
        jbDivision = new javax.swing.JButton();
        jbModule = new javax.swing.JButton();
        jbMultiplication = new javax.swing.JButton();
        jbSubtract = new javax.swing.JButton();
        jbSum = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlNumberTwo.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jlNumberTwo.setText("Number 2");

        jlNumberOne.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jlNumberOne.setText("Number 1");

        jtfNumberOne.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N

        jtfNumberTwo.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N

        jbDivision.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jbDivision.setText("/");

        jbModule.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jbModule.setText("%");

        jbMultiplication.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jbMultiplication.setText("*");

        jbSubtract.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jbSubtract.setText("-");

        jbSum.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jbSum.setText("+");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlNumberOne, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jlNumberTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfNumberOne, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNumberTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jbSum)
                .addGap(18, 18, 18)
                .addComponent(jbSubtract)
                .addGap(18, 18, 18)
                .addComponent(jbMultiplication)
                .addGap(18, 18, 18)
                .addComponent(jbDivision)
                .addGap(18, 18, 18)
                .addComponent(jbModule)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfNumberOne)
                    .addComponent(jlNumberOne, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlNumberTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfNumberTwo, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDivision)
                    .addComponent(jbMultiplication)
                    .addComponent(jbSum)
                    .addComponent(jbSubtract)
                    .addComponent(jbModule))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ViewBasicOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBasicOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBasicOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBasicOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewBasicOperations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbDivision;
    public javax.swing.JButton jbModule;
    public javax.swing.JButton jbMultiplication;
    public javax.swing.JButton jbSubtract;
    public javax.swing.JButton jbSum;
    public javax.swing.JLabel jlNumberOne;
    public javax.swing.JLabel jlNumberTwo;
    public javax.swing.JTextField jtfNumberOne;
    public javax.swing.JTextField jtfNumberTwo;
    // End of variables declaration//GEN-END:variables
}
