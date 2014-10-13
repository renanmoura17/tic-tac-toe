package jogodavelha;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan Moura
 */
public class Main extends javax.swing.JFrame {

    int qtdJogadas;
    int jogador;
    Integer posicoes[][] = new Integer[3][9];
    JButton botoes[] = new JButton[9];
    String ganhador, jogador1, jogador2;

    public Main() {
        initComponents();
        qtdJogadas = 1;
        jogador = 1;

        botoes[0] = bt_1;
        botoes[1] = bt_2;
        botoes[2] = bt_3;
        botoes[3] = bt_4;
        botoes[4] = bt_5;
        botoes[5] = bt_6;
        botoes[6] = bt_7;
        botoes[7] = bt_8;
        botoes[8] = bt_9;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        bt_1 = new javax.swing.JButton();
        bt_2 = new javax.swing.JButton();
        bt_3 = new javax.swing.JButton();
        bt_4 = new javax.swing.JButton();
        bt_5 = new javax.swing.JButton();
        bt_6 = new javax.swing.JButton();
        bt_7 = new javax.swing.JButton();
        bt_8 = new javax.swing.JButton();
        bt_9 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_1.setEnabled(false);
        bt_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_1ActionPerformed(evt);
            }
        });

        bt_2.setEnabled(false);
        bt_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_2ActionPerformed(evt);
            }
        });

        bt_3.setEnabled(false);
        bt_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_3ActionPerformed(evt);
            }
        });

        bt_4.setEnabled(false);
        bt_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_4ActionPerformed(evt);
            }
        });

        bt_5.setEnabled(false);
        bt_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_5ActionPerformed(evt);
            }
        });

        bt_6.setToolTipText("");
        bt_6.setEnabled(false);
        bt_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_6ActionPerformed(evt);
            }
        });

        bt_7.setEnabled(false);
        bt_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_7ActionPerformed(evt);
            }
        });

        bt_8.setEnabled(false);
        bt_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_8ActionPerformed(evt);
            }
        });

        bt_9.setEnabled(false);
        bt_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_9ActionPerformed(evt);
            }
        });

        jMenu1.setText("Opção");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setMnemonic('N');
        jMenuItem1.setText("Novo Jogo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");
        jMenu2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu2MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_6, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(bt_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        limpar();
        jogador1 = JOptionPane.showInputDialog("Digite o nome do primeiro jogador:");
        jogador2 = JOptionPane.showInputDialog("Digite o nome do segundo jogador:");
    }                                          

    private void bt_1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        jogar(bt_1, 0, 0);
    }                                    

    private void bt_2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        jogar(bt_2, 0, 1);
    }                                    

    private void bt_3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        jogar(bt_3, 0, 2);
    }                                    

    private void bt_4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        jogar(bt_4, 1, 0);
    }                                    

    private void bt_5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        jogar(bt_5, 1, 1);
    }                                    

    private void bt_6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        jogar(bt_6, 1, 2);
    }                                    

    private void bt_7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        jogar(bt_7, 2, 0);
    }                                    

    private void bt_8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        jogar(bt_8, 2, 1);
    }                                    

    private void bt_9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        jogar(bt_9, 2, 2);
    }                                    

    private void jMenu2MenuSelected(javax.swing.event.MenuEvent evt) {                                    
        System.exit(0);
    }                                   

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
    }                                      

    public boolean isVencedor(int numJogador) {

        for (int i = 0; i < posicoes.length; i++) {
            if (posicoes[i][0] == numJogador && posicoes[i][1] == numJogador && posicoes[i][2] == numJogador) {
                return true;
            }
            if (posicoes[0][i] == numJogador && posicoes[1][i] == numJogador && posicoes[2][i] == numJogador) {
                return true;
            }
        }

        if (posicoes[0][0] == numJogador && posicoes[1][1] == numJogador && posicoes[2][2] == numJogador) {
            return true;
        }

        if (posicoes[0][2] == numJogador && posicoes[1][1] == numJogador && posicoes[2][0] == numJogador) {
            return true;
        }

        return false;
    }

    public void terminarJogo() {
        for (int i = 0; i < botoes.length; i++) {
            botoes[i].setEnabled(false);
        }
    }

    public void checaJogada(int numJogador) {
        if (isVencedor(numJogador)) {
            if (numJogador == 1) {
                ganhador = jogador1;
            } else {
                ganhador = jogador2;
            }

            JOptionPane.showMessageDialog(null, "Jogador " + ganhador + " é o vencedor da partida!", "Vitória!", JOptionPane.INFORMATION_MESSAGE);
            terminarJogo();
        }
    }

    public void limpar() {
        for (int i = 0; i < botoes.length; i++) {
            botoes[i].setEnabled(true);
            botoes[i].setText("");
        }

        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                posicoes[j][k] = 0;
            }
        }

        jogador = 1;
        jogador1 = "";
        jogador2 = "";
        ganhador = "";
    }

    public void jogar(JButton b, int x, int y) {
        
        if ( posicoes[ x ][ y ] != 0 ) {
            return;
        }
                
        if (jogador == 1) {
            posicoes[x][y] = 1;
            b.setText("X");

            checaJogada(1);

            jogador = 2;
        } else {
            posicoes[x][y] = 2;
            b.setText("O");

            checaJogada(2);

            jogador = 1;
        }
        qtdJogadas++;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton bt_1;
    private javax.swing.JButton bt_2;
    private javax.swing.JButton bt_3;
    private javax.swing.JButton bt_4;
    private javax.swing.JButton bt_5;
    private javax.swing.JButton bt_6;
    private javax.swing.JButton bt_7;
    private javax.swing.JButton bt_8;
    private javax.swing.JButton bt_9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration                   
}
