/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import javax.swing.JOptionPane;

/**
 *
 * @author Professor
 */
public class Tela2 extends javax.swing.JFrame {

    /**
     * Creates new form Tela2
     */
    public Tela2() {
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

        painel = new javax.swing.JPanel();
        campoHoraInicial = new javax.swing.JTextField();
        campoMinutoInicial = new javax.swing.JTextField();
        campoHoraFinal = new javax.swing.JTextField();
        campoMinutoFinal = new javax.swing.JTextField();
        labelResultadoHora = new javax.swing.JLabel();
        labelResultadoMinuto = new javax.swing.JLabel();
        labelHoraInicial = new javax.swing.JLabel();
        labelHoraFinal = new javax.swing.JLabel();
        labelMinutoInicial = new javax.swing.JLabel();
        labelMinutoFinal = new javax.swing.JLabel();
        botaoSomar = new javax.swing.JButton();
        botaoSubtrair = new javax.swing.JButton();
        botaoReset = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuVoltar = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();
        menuSobreItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painel.setBackground(new java.awt.Color(112, 242, 140));

        labelHoraInicial.setText("Hora inicial:");

        labelHoraFinal.setText("Hora final:");

        labelMinutoInicial.setText("Minuto inicial:");

        labelMinutoFinal.setText("Minuto final:");

        botaoSomar.setText("Somar");
        botaoSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSomarActionPerformed(evt);
            }
        });

        botaoSubtrair.setText("Subtrair");
        botaoSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSubtrairActionPerformed(evt);
            }
        });

        botaoReset.setText("Limpar");
        botaoReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botaoSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(labelHoraFinal))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelHoraInicial)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelResultadoHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoHoraFinal)
                            .addComponent(campoHoraInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMinutoInicial, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelMinutoFinal, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoMinutoInicial)
                            .addComponent(labelResultadoMinuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoMinutoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(botaoReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(botaoSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoMinutoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelMinutoInicial))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoHoraInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelHoraInicial)))
                .addGap(18, 18, 18)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoMinutoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelMinutoFinal))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelHoraFinal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelResultadoHora, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelResultadoMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoSomar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(botaoSubtrair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(botaoReset))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        menuArquivo.setText("Arquivo");

        menuVoltar.setText("Voltar");
        menuVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVoltarActionPerformed(evt);
            }
        });
        menuArquivo.add(menuVoltar);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuSair);

        barraMenu.add(menuArquivo);

        menuSobre.setText("Sobre");

        menuSobreItem.setText("Sobre este item");
        menuSobreItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreItemActionPerformed(evt);
            }
        });
        menuSobre.add(menuSobreItem);

        barraMenu.add(menuSobre);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVoltarActionPerformed
        Janela.abrir();
        dispose();
    }//GEN-LAST:event_menuVoltarActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        dispose();
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuSobreItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreItemActionPerformed
        String mensagem = "Este programa foi desenvolvido para did??tica em programa????o!";
        JOptionPane.showMessageDialog(menuSobre, mensagem);
    }//GEN-LAST:event_menuSobreItemActionPerformed

    private void botaoSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSomarActionPerformed
        int horaInicial = Integer.parseInt(campoHoraInicial.getText());
        int horaFinal = Integer.parseInt(campoHoraFinal.getText());
        int minutoInicial = Integer.parseInt(campoMinutoInicial.getText());
        int minutoFinal = Integer.parseInt(campoMinutoFinal.getText());
        
        int resultadoHora = horaInicial + horaFinal;
        int resultadoMinuto = minutoInicial + minutoFinal;
        
        while(resultadoMinuto > 59){
            resultadoMinuto -= 60;
            resultadoHora ++;
        }
        
        labelResultadoHora.setText(resultadoHora+" horas");
        labelResultadoMinuto.setText(resultadoMinuto+" minutos");        
    }//GEN-LAST:event_botaoSomarActionPerformed

    private void botaoSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSubtrairActionPerformed
        int horaInicial = Integer.parseInt(campoHoraInicial.getText());
        int horaFinal = Integer.parseInt(campoHoraFinal.getText());
        int minutoInicial = Integer.parseInt(campoMinutoInicial.getText());
        int minutoFinal = Integer.parseInt(campoMinutoFinal.getText());        
        
        while(minutoInicial > 59){
            horaInicial++;
            minutoInicial -= 60;
        }
        while(minutoFinal > 59){
            horaFinal++;
            minutoFinal -= 60;
        }
        int resultadoHora = horaInicial - horaFinal;
        int resultadoMinuto = minutoInicial - minutoFinal;
        if (resultadoHora == 0){
            if(minutoInicial < minutoFinal){
                resultadoMinuto = minutoFinal - minutoInicial;
            }
        }
        
        if(horaInicial < horaFinal){
            resultadoHora = horaFinal - horaInicial;
            resultadoMinuto = minutoFinal - minutoInicial;
        }
        while(resultadoMinuto < 0){
            resultadoHora --;
            resultadoMinuto += 60;
        }
        
        labelResultadoHora.setText(resultadoHora+" horas");
        labelResultadoMinuto.setText(resultadoMinuto+" minutos"); 
    }//GEN-LAST:event_botaoSubtrairActionPerformed

    private void botaoResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoResetActionPerformed
        campoHoraFinal.setText(null);
        campoHoraInicial.setText(null);
        campoMinutoFinal.setText(null);
        campoMinutoInicial.setText(null);
        labelResultadoHora.setText(null);
        labelResultadoMinuto.setText(null);
    }//GEN-LAST:event_botaoResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void abrir() {
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
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton botaoReset;
    private javax.swing.JButton botaoSomar;
    private javax.swing.JButton botaoSubtrair;
    private javax.swing.JTextField campoHoraFinal;
    private javax.swing.JTextField campoHoraInicial;
    private javax.swing.JTextField campoMinutoFinal;
    private javax.swing.JTextField campoMinutoInicial;
    private javax.swing.JLabel labelHoraFinal;
    private javax.swing.JLabel labelHoraInicial;
    private javax.swing.JLabel labelMinutoFinal;
    private javax.swing.JLabel labelMinutoInicial;
    private javax.swing.JLabel labelResultadoHora;
    private javax.swing.JLabel labelResultadoMinuto;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JMenuItem menuSobreItem;
    private javax.swing.JMenuItem menuVoltar;
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables
}
