/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao05.view;

import Questao05.Calculo;



/**
 *
 * @author Samuel Melo
 */
public class Tela05 extends javax.swing.JFrame {

    /**
     * Creates new form Cal
     */
     static boolean control=true;
    public Tela05() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        um = new javax.swing.JButton();
        dois = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        quatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        sete = new javax.swing.JButton();
        oito = new javax.swing.JButton();
        nove = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        mais = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        limpa = new javax.swing.JButton();
        menos = new javax.swing.JButton();
        dividi = new javax.swing.JButton();
        vezes = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        display = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 250, 250));
        setMinimumSize(new java.awt.Dimension(250, 250));
        setResizable(false);
        setSize(new java.awt.Dimension(250, 250));

        um.setText("1");
        um.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        um.setFocusPainted(false);
        um.setFocusable(false);
        um.setMaximumSize(new java.awt.Dimension(45, 25));
        um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umActionPerformed(evt);
            }
        });

        dois.setText("2");
        dois.setFocusPainted(false);
        dois.setFocusable(false);
        dois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doisActionPerformed(evt);
            }
        });

        tres.setText("3");
        tres.setFocusPainted(false);
        tres.setFocusable(false);
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        quatro.setText("4");
        quatro.setFocusPainted(false);
        quatro.setFocusable(false);
        quatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatroActionPerformed(evt);
            }
        });

        cinco.setText("5");
        cinco.setFocusPainted(false);
        cinco.setFocusable(false);
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        seis.setText("6");
        seis.setFocusPainted(false);
        seis.setFocusable(false);
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        sete.setText("7");
        sete.setFocusPainted(false);
        sete.setFocusable(false);
        sete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seteActionPerformed(evt);
            }
        });

        oito.setText("8");
        oito.setFocusPainted(false);
        oito.setFocusable(false);
        oito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oitoActionPerformed(evt);
            }
        });

        nove.setText("9");
        nove.setFocusPainted(false);
        nove.setFocusable(false);
        nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noveActionPerformed(evt);
            }
        });

        zero.setText("0");
        zero.setFocusPainted(false);
        zero.setFocusable(false);
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        mais.setText("+");
        mais.setFocusPainted(false);
        mais.setFocusable(false);
        mais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maisActionPerformed(evt);
            }
        });

        igual.setText("=");
        igual.setFocusPainted(false);
        igual.setFocusable(false);
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        limpa.setText("C");
        limpa.setFocusPainted(false);
        limpa.setFocusable(false);
        limpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpaActionPerformed(evt);
            }
        });

        menos.setText("-");
        menos.setFocusPainted(false);
        menos.setFocusable(false);
        menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosActionPerformed(evt);
            }
        });

        dividi.setText("/");
        dividi.setFocusPainted(false);
        dividi.setFocusable(false);
        dividi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividiActionPerformed(evt);
            }
        });

        vezes.setText("*");
        vezes.setFocusPainted(false);
        vezes.setFocusable(false);
        vezes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vezesActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        display.setBackground(new java.awt.Color(204, 204, 204));
        display.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        display.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        display.setText("0");

        lb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lb3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(limpa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vezes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(oito, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dividi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(um, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dois, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mais, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(um, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dois, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mais, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oito, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nove, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dividi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(limpa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vezes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        // TODO add your handling code here:
        if(control){display.setText("");
       control=false;}
        if(!control){
        String valor = display.getText();
        display.setText(valor+"6");
        }   
    }//GEN-LAST:event_seisActionPerformed

    private void limpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpaActionPerformed
        // TODO add your handling code here:
        
     // display.setText("");
        if(!control){
         display.setText("0");
         lb1.setText("");
         lb3.setText("");
         lb2.setText("");
         control=true;
        }
        
    }//GEN-LAST:event_limpaActionPerformed

    private void umActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umActionPerformed
       // TODO add your handling code here:
        
        if(control){display.setText("");
        control=false;}
        if(!control){
        String valor = display.getText();
         display.setText(valor+"1");
        display.setText(valor+"1");
        }   
    }//GEN-LAST:event_umActionPerformed

    private void maisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maisActionPerformed
        // TODO add your handling code here:
        
         String valor = display.getText();
        display.setText(valor+"+");
        lb1.setText(valor);
        lb2.setText("+");
        display.setText("");
        
        
      
      
    }//GEN-LAST:event_maisActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        // TODO add your handling code here:
        String valor = display.getText();
        lb3.setText(valor);
        System.out.println(">>>"+valor);
        String n1=lb1.getText();
        String n2=lb3.getText();
       Calculo.a=Double.parseDouble(n1);
       Calculo.b=Double.parseDouble(n2);
       
          String operador =lb2.getText();
          
                switch(operador){
                    case "-":
                        Calculo.subtrair(Calculo.a, Calculo.b); 
                        display.setText(Calculo.res); 
                        break;
                        
                        case "+":
                        Calculo.somar(Calculo.a, Calculo.b); 
                        display.setText(Calculo.res); 
                        break;
                            
                            case "*":
                        Calculo.multiplicar(Calculo.a, Calculo.b); 
                        display.setText(Calculo.res); 
                        break;
                                
                                case "/":
                        Calculo.dividir(Calculo.a, Calculo.b); 
                        display.setText(Calculo.res); 
                        break;
                                    
                                     default:
                        
                        break;
                }
                
       
      
    }//GEN-LAST:event_igualActionPerformed

    private void doisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doisActionPerformed
        // TODO add your handling code here:
        
       // String valor =display.getText();
      //  display.setText(valor+"2");
        
      if(control){display.setText("");
       control=false;}
        if(!control){
        String valor = display.getText();
        display.setText(valor+"2");
        }   
    }//GEN-LAST:event_doisActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        // TODO add your handling code here:
        
        if(control){display.setText("");
       control=false;}
        if(!control){
        String valor = display.getText();
        display.setText(valor+"3");
        }   
    }//GEN-LAST:event_tresActionPerformed

    private void quatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatroActionPerformed
        // TODO add your handling code here:
        if(control){display.setText("");
       control=false;}
        if(!control){
        String valor = display.getText();
        display.setText(valor+"4");
        }   
    }//GEN-LAST:event_quatroActionPerformed

    private void menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosActionPerformed
        // TODO add your handling code here
        String valor = display.getText();
        display.setText(valor+"+");
        lb1.setText(valor);
        lb2.setText("-");
        display.setText("");
    }//GEN-LAST:event_menosActionPerformed

    private void dividiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividiActionPerformed
        // TODO add your handling code here:
        
         String valor = display.getText();
        display.setText(valor+"+");
        lb1.setText(valor);
        lb2.setText("/");
        display.setText("");
    }//GEN-LAST:event_dividiActionPerformed

    private void vezesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vezesActionPerformed
        // TODO add your handling code here:
        
         String valor = display.getText();
        display.setText(valor+"+");
        lb1.setText(valor);
        lb2.setText("*");
        display.setText("");
    }//GEN-LAST:event_vezesActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        // TODO add your handling code here:
        
        if(control){display.setText("");
       control=false;}
        if(!control){
        String valor = display.getText();
        display.setText(valor+"5");
        }   
    }//GEN-LAST:event_cincoActionPerformed

    private void seteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seteActionPerformed
        // TODO add your handling code here:
        if(control){display.setText("");
       control=false;}
        if(!control){
        String valor = display.getText();
        display.setText(valor+"7");
        }   
    }//GEN-LAST:event_seteActionPerformed

    private void oitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oitoActionPerformed
        // TODO add your handling code here:
        if(control){display.setText("");
       control=false;}
        if(!control){
        String valor = display.getText();
        display.setText(valor+"8");
        }   
    }//GEN-LAST:event_oitoActionPerformed

    private void noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noveActionPerformed
        // TODO add your handling code here:
        if(control){display.setText("");
       control=false;}
        if(!control){
        String valor = display.getText();
        display.setText(valor+"9");
        }   
    }//GEN-LAST:event_noveActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        // TODO add your handling code here:
        if(control){display.setText("");
        control=false;}
        if(!control){
        String valor = display.getText();
        display.setText(valor+"0");
        }  
    }//GEN-LAST:event_zeroActionPerformed

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
            java.util.logging.Logger.getLogger(Tela05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela05().setVisible(true);
            }
        });
        System.out.println(Calculo.subtrair(10, 3));
        System.out.println(control);
      
    
       
    
    };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cinco;
    private javax.swing.JLabel display;
    private javax.swing.JButton dividi;
    private javax.swing.JButton dois;
    private javax.swing.JButton igual;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JButton limpa;
    private javax.swing.JButton mais;
    private javax.swing.JButton menos;
    private javax.swing.JButton nove;
    private javax.swing.JButton oito;
    private javax.swing.JButton quatro;
    private javax.swing.JButton seis;
    private javax.swing.JButton sete;
    private javax.swing.JButton tres;
    public javax.swing.JButton um;
    private javax.swing.JButton vezes;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
