
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhcho
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public Calculator() {
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

        jtxtDisplay = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(280, 370));
        setPreferredSize(new java.awt.Dimension(280, 370));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jtxtDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 50));

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton1.setText("+");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 60, 50));

        jButton2.setFont(new java.awt.Font("Wingdings", 1, 20)); // NOI18N
        jButton2.setText("");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, 50));

        jButton3.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton3.setText("C");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 60, 50));

        jButton4.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton4.setText("%");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 60, 50));

        jButton5.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton5.setText("7");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 60, 50));

        jButton6.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton6.setText("8");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 60, 50));

        jButton7.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton7.setText("9");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 60, 50));

        jButton8.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton8.setText("-");
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 60, 50));

        jButton9.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton9.setText("4");
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 60, 50));

        jButton10.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton10.setText("5");
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 60, 50));

        jButton11.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton11.setText("6");
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 60, 50));

        jButton12.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton12.setText("*");
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 60, 50));

        jButton13.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton13.setText("1");
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 60, 50));

        jButton14.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton14.setText("2");
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 60, 50));

        jButton15.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton15.setText("3");
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 60, 50));

        jButton16.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton16.setText("/");
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 60, 50));

        jButton17.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton17.setText("0");
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 60, 50));

        jButton18.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton18.setText(".");
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 60, 50));

        jButton19.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton19.setText("±");
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 60, 50));

        jButton20.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton20.setText("=");
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 60, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JTextField jtxtDisplay;
    // End of variables declaration//GEN-END:variables
}
