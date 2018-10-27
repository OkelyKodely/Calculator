import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Calculator extends javax.swing.JFrame {

    private String whichNumber = "firstNumber";
    private String buttonClick = "number";
    private String operation = "";
    
    private double firstNumber;
    private double secondNumber;
    private double result;
    
    private boolean operationSelected;

    /**
     * Creates new form Calculator
     */
    public Calculator() {

        initComponents();

        this.setTitle("");
        
        jtxtDisplay.setEnabled(false);
        jtxtDisplay.setDisabledTextColor(Color.WHITE);

        try {
            bglabel.setText("");
            URL url = getClass().getResource("bg.gif");
            bglabel.setIcon(new ImageIcon(url));
            add(bglabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, this.getWidth(), this.getHeight()));
            bglabel.setBounds(0, 0, this.getWidth(), this.getHeight());
        } catch(Exception e) {
        }

        setResizable(false);
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
        bglabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OkelyKodely's Calculator");
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(300, 400));
        setPreferredSize(new java.awt.Dimension(300, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtDisplay.setBackground(new java.awt.Color(0, 0, 0));
        jtxtDisplay.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        getContentPane().add(jtxtDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 50));

        jButton1.setBackground(java.awt.Color.blue);
        jButton1.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 60, 50));

        jButton2.setBackground(java.awt.Color.red);
        jButton2.setFont(new java.awt.Font("Wingdings", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, 50));

        jButton3.setBackground(java.awt.Color.yellow);
        jButton3.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(105, 50, 33));
        jButton3.setText("C");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 60, 50));

        jButton4.setBackground(java.awt.Color.blue);
        jButton4.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("%");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 60, 50));

        jButton5.setBackground(java.awt.Color.blue);
        jButton5.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("7");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 60, 50));

        jButton6.setBackground(java.awt.Color.blue);
        jButton6.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("8");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 60, 50));

        jButton7.setBackground(java.awt.Color.blue);
        jButton7.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("9");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 60, 50));

        jButton8.setBackground(java.awt.Color.blue);
        jButton8.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("-");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 60, 50));

        jButton9.setBackground(java.awt.Color.blue);
        jButton9.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("4");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 60, 50));

        jButton10.setBackground(java.awt.Color.blue);
        jButton10.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("5");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 60, 50));

        jButton11.setBackground(java.awt.Color.blue);
        jButton11.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("6");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 60, 50));

        jButton12.setBackground(java.awt.Color.blue);
        jButton12.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("*");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 60, 50));

        jButton13.setBackground(java.awt.Color.blue);
        jButton13.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("1");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 60, 50));

        jButton14.setBackground(java.awt.Color.blue);
        jButton14.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("2");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 60, 50));

        jButton15.setBackground(java.awt.Color.blue);
        jButton15.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("3");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 60, 50));

        jButton16.setBackground(java.awt.Color.blue);
        jButton16.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("/");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 60, 50));

        jButton17.setBackground(java.awt.Color.blue);
        jButton17.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("0");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 60, 50));

        jButton18.setBackground(java.awt.Color.blue);
        jButton18.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText(".");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 60, 50));

        jButton19.setBackground(java.awt.Color.blue);
        jButton19.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("±");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 60, 50));

        jButton20.setBackground(java.awt.Color.green);
        jButton20.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        jButton20.setText("=");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 60, 50));

        bglabel.setText("jLabel1");
        getContentPane().add(bglabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        firstNumber = 0;
        secondNumber = 0;
        result = 0;

        operation = "";
        operationSelected = false;
        
        jtxtDisplay.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void getNumber(String num) {

        if(!operationSelected) {
            buttonClick = "number";
            jtxtDisplay.setText(jtxtDisplay.getText() + num);
            whichNumber = "firstNumber";
            try {
                firstNumber = Double.parseDouble(jtxtDisplay.getText());
            } catch(Exception e) {
            }
        } else {
            if(buttonClick.equals("number")) {
                jtxtDisplay.setText(jtxtDisplay.getText() + num);
                whichNumber = "secondNumber";
                try {
                    secondNumber = Double.parseDouble(jtxtDisplay.getText());
                } catch(Exception e) {
                }
            }
            if(buttonClick.equals("operation")) {
                buttonClick = "number";
                jtxtDisplay.setText(num);
                whichNumber = "secondNumber";
                try {
                    secondNumber = Double.parseDouble(jtxtDisplay.getText());
                } catch(Exception e) {
                }
            }
        }
    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        getNumber("7");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        buttonClick = "operation";

        operationSelected = true;
        operation = "plus";
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed

        if(operationSelected) {
            if(operation.equals("plus")) {
                buttonClick = "equals";
                operation = "";
                operationSelected = false;
                result = firstNumber + secondNumber;
                jtxtDisplay.setText("" + result);
                whichNumber = "firstNumber";
                firstNumber = result;
                secondNumber = 0;
            } else if(operation.equals("minus")) {
                buttonClick = "equals";
                operation = "";
                operationSelected = false;
                result = firstNumber - secondNumber;
                jtxtDisplay.setText("" + result);
                whichNumber = "firstNumber";
                firstNumber = result;
                secondNumber = 0;
            } else if(operation.equals("times")) {
                buttonClick = "equals";
                operation = "";
                operationSelected = false;
                result = firstNumber * secondNumber;
                jtxtDisplay.setText("" + result);
                whichNumber = "firstNumber";
                firstNumber = result;
                secondNumber = 0;
            } else if(operation.equals("divide")) {
                buttonClick = "equals";
                operation = "";
                operationSelected = false;
                result = firstNumber / secondNumber;
                jtxtDisplay.setText("" + result);
                whichNumber = "firstNumber";
                firstNumber = result;
                secondNumber = 0;
            } else if(operation.equals("percent")) {
                buttonClick = "equals";
                operation = "";
                operationSelected = false;
                result = firstNumber * (secondNumber / 100);
                jtxtDisplay.setText("" + result);
                whichNumber = "firstNumber";
                firstNumber = result;
                secondNumber = 0;
            }
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed

        if(!operationSelected) {
            buttonClick = "number";
            if(jtxtDisplay.getText().length() >= 1) {
                if(!jtxtDisplay.getText().contains(".")) {
                    jtxtDisplay.setText(jtxtDisplay.getText() + ".");
                }
            } else {
                jtxtDisplay.setText("0.");
            }
            whichNumber = "firstNumber";
            try {
                firstNumber = Double.parseDouble(jtxtDisplay.getText());
            } catch(Exception e) {
            }
        } else {
            if(buttonClick.equals("number")) {
                if(!jtxtDisplay.getText().contains(".")) {
                    jtxtDisplay.setText(jtxtDisplay.getText() + ".");
                }
                whichNumber = "secondNumber";
                try {
                    secondNumber = Double.parseDouble(jtxtDisplay.getText());
                } catch(Exception e) {
                }
            }
            if(buttonClick.equals("operation")) {
                buttonClick = "number";
                jtxtDisplay.setText("0.");
                whichNumber = "secondNumber";
                try {
                    secondNumber = Double.parseDouble(jtxtDisplay.getText());
                } catch(Exception e) {
                }
            }
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            jtxtDisplay.setText(jtxtDisplay.getText().substring(0, jtxtDisplay.getText().length() - 1));
            if(whichNumber.equals("firstNumber")) {
                firstNumber = Double.parseDouble(jtxtDisplay.getText());
            } else if(whichNumber.equals("secondNumber")) {
                secondNumber = Double.parseDouble(jtxtDisplay.getText());
            }
        } catch(Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        buttonClick = "operation";

        operationSelected = true;
        operation = "minus";
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        getNumber("8");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        getNumber("9");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        getNumber("4");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        getNumber("5");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        getNumber("6");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        getNumber("1");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

        getNumber("2");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

        getNumber("3");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed

        getNumber("0");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        buttonClick = "operation";

        operationSelected = true;
        operation = "times";
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        buttonClick = "operation";

        operationSelected = true;
        operation = "divide";
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        buttonClick = "operation";

        operationSelected = true;
        operation = "percent";
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed

        if(whichNumber.equals("firstNumber")) {
            firstNumber *= -1;
            jtxtDisplay.setText("" + firstNumber);
        } else if(whichNumber.equals("secondNumber")) {
            secondNumber *= -1;
            jtxtDisplay.setText("" + secondNumber);
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* For round buttons.. */
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
    private javax.swing.JLabel bglabel;
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