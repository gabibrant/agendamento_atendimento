/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agendamentoatendimento.view;

import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import org.agendamentoatendimento.controller.TecnicoController;
import org.agendamentoatendimento.model.Habilidades;

/**
 *
 * @author Gabriela
 */
public class TecnicoCreate extends javax.swing.JFrame {
    private String nome;
    private String email;
    private String telefone;
    private Habilidades habilidade;
        
    /**
     * Creates new form TecnicoCreate2
     */
    public TecnicoCreate() {
        
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

        botaoCadastrarTecnico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        campo_nome = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        campo_telefone = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        campo_email = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cadastrar_tecnico = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        comboBox_habilidades = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuNovo = new javax.swing.JMenu();
        itemMenuNovoTecnico = new javax.swing.JMenuItem();
        ìtemMenuNovoCliente = new javax.swing.JMenuItem();
        itemMenuOrdem = new javax.swing.JMenuItem();
        itemMenuNovoOrcamento = new javax.swing.JMenuItem();
        menuVer = new javax.swing.JMenu();
        itemMenuVerTecnico = new javax.swing.JMenuItem();
        itemMenuVerOrcamento = new javax.swing.JMenuItem();
        itemMenuVerOrdem = new javax.swing.JMenuItem();
        itemMenuVerCliente = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        itemMenuAjudaSobre = new javax.swing.JMenuItem();

        botaoCadastrarTecnico.setText("Cadastrar");
        botaoCadastrarTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarTecnicoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"000001", "Nome1", "Habilidade1", "Ver", "Editar", "Remover"},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Matrícula", "Nome", "Habilidade", "Detalhes", "Editar", "Remover"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Técnico - ");

        jLabel3.setText("Nome:");

        jScrollPane2.setViewportView(campo_nome);

        jLabel4.setText("Telefone: ");

        jScrollPane3.setViewportView(campo_telefone);

        jLabel5.setText("Email:");

        jScrollPane4.setViewportView(campo_email);

        jLabel6.setText("Habilidade:");

        jLabel2.setText("Cadastrar Técnico");

        cadastrar_tecnico.setText("Cadastrar");
        cadastrar_tecnico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrar_tecnicoMouseClicked(evt);
            }
        });
        cadastrar_tecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_tecnicoActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        comboBox_habilidades.setModel(new DefaultComboBoxModel(Habilidades.values()));
        comboBox_habilidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_habilidadesActionPerformed(evt);
            }
        });

        jLabel1.setText("Agendamento de Atendimento - FazConcertos Ltda");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(11, 11, 11)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel3)))
                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane2)
                                            .addComponent(jScrollPane3)
                                            .addComponent(jScrollPane4)
                                            .addComponent(comboBox_habilidades, 0, 576, Short.MAX_VALUE)))
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 474, Short.MAX_VALUE)
                                .addComponent(cadastrar_tecnico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox_habilidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(cadastrar_tecnico)))
        );

        menuNovo.setText("Novo");

        itemMenuNovoTecnico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        itemMenuNovoTecnico.setText("Técnico");
        itemMenuNovoTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuNovoTecnicoActionPerformed(evt);
            }
        });
        menuNovo.add(itemMenuNovoTecnico);

        ìtemMenuNovoCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        ìtemMenuNovoCliente.setText("Cliente");
        menuNovo.add(ìtemMenuNovoCliente);

        itemMenuOrdem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        itemMenuOrdem.setText("Ordem de Serviço");
        itemMenuOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuOrdemActionPerformed(evt);
            }
        });
        menuNovo.add(itemMenuOrdem);

        itemMenuNovoOrcamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        itemMenuNovoOrcamento.setText("Orçamento");
        menuNovo.add(itemMenuNovoOrcamento);

        jMenuBar1.add(menuNovo);

        menuVer.setText("Ver");

        itemMenuVerTecnico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemMenuVerTecnico.setText("Técnico");
        itemMenuVerTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuVerTecnicoActionPerformed(evt);
            }
        });
        menuVer.add(itemMenuVerTecnico);

        itemMenuVerOrcamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemMenuVerOrcamento.setText("Orçamento");
        menuVer.add(itemMenuVerOrcamento);

        itemMenuVerOrdem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemMenuVerOrdem.setText("Ordem de Serviço");
        menuVer.add(itemMenuVerOrdem);

        itemMenuVerCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemMenuVerCliente.setText("Cliente");
        menuVer.add(itemMenuVerCliente);

        jMenuBar1.add(menuVer);

        menuAjuda.setText("Ajuda");

        itemMenuAjudaSobre.setText("Sobre...");
        itemMenuAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuAjudaSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(itemMenuAjudaSobre);

        jMenuBar1.add(menuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuNovoTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuNovoTecnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemMenuNovoTecnicoActionPerformed

    private void itemMenuOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuOrdemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemMenuOrdemActionPerformed

    private void itemMenuVerTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuVerTecnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemMenuVerTecnicoActionPerformed

    private void itemMenuAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuAjudaSobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemMenuAjudaSobreActionPerformed

    private void botaoCadastrarTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarTecnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCadastrarTecnicoActionPerformed

    private void cadastrar_tecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_tecnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrar_tecnicoActionPerformed

    private void comboBox_habilidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_habilidadesActionPerformed
        // TODO add your handling code here:        
        
        //habilidade = comboBox_habilidades.
        System.out.println(nome + email + telefone);
        
    }//GEN-LAST:event_comboBox_habilidadesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cadastrar_tecnicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrar_tecnicoMouseClicked
        // TODO add your handling code here:
        nome = campo_nome.getText();
        email = campo_email.getText();
        telefone = campo_telefone.getText();
        habilidade = (Habilidades)comboBox_habilidades.getSelectedItem();
        
        TecnicoController tc = new TecnicoController();
        try{
            tc.createTecnico(nome, email, telefone, habilidade);
            JOptionPane.showMessageDialog(this, "Contato salvo com sucesso!");
            //clearFields();
            //contatoList = new ContatoController().listaContatos();
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this, 
				"Nao foi possivel salvar contato!n" + 
				e.getLocalizedMessage()
			);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, 
				"Data possui formato inv&aacute;lido!n" + 
				e.getLocalizedMessage()
		);
        }
    }//GEN-LAST:event_cadastrar_tecnicoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrarTecnico;
    private javax.swing.JButton cadastrar_tecnico;
    private javax.swing.JTextPane campo_email;
    private javax.swing.JTextPane campo_nome;
    private javax.swing.JTextPane campo_telefone;
    private javax.swing.JComboBox<String> comboBox_habilidades;
    private javax.swing.JMenuItem itemMenuAjudaSobre;
    private javax.swing.JMenuItem itemMenuNovoOrcamento;
    private javax.swing.JMenuItem itemMenuNovoTecnico;
    private javax.swing.JMenuItem itemMenuOrdem;
    private javax.swing.JMenuItem itemMenuVerCliente;
    private javax.swing.JMenuItem itemMenuVerOrcamento;
    private javax.swing.JMenuItem itemMenuVerOrdem;
    private javax.swing.JMenuItem itemMenuVerTecnico;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuNovo;
    private javax.swing.JMenu menuVer;
    private javax.swing.JMenuItem ìtemMenuNovoCliente;
    // End of variables declaration//GEN-END:variables
}
