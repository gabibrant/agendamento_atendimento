/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agendamentoatendimento.view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import org.agendamentoatendimento.controller.OrdemServicoController;

/**
 *
 * @author Paulo-Lehman
 */
public class OrdemServicoRead extends javax.swing.JFrame {

    /**
     * Creates new form OrdemServicoRead
     */
    public OrdemServicoRead() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel2 = new javax.swing.JLabel();
        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("agendamento_atendimento?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        ordemServicoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT o FROM OrdemServico o");
        ordemServicoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : ordemServicoQuery.getResultList();
        ordemServicoQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT o FROM OrdemServico o");
        ordemServicoList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : ordemServicoQuery1.getResultList();
        agendamento_atendimentoPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("agendamento_atendimentoPU").createEntityManager();
        ordemServicoQuery2 = java.beans.Beans.isDesignTime() ? null : agendamento_atendimentoPUEntityManager.createQuery("SELECT o FROM OrdemServico o");
        ordemServicoList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : ordemServicoQuery2.getResultList();
        ordemServicoQuery3 = java.beans.Beans.isDesignTime() ? null : agendamento_atendimentoPUEntityManager.createQuery("SELECT o FROM OrdemServico o");
        ordemServicoList3 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : ordemServicoQuery3.getResultList();
        ordemServicoQuery4 = java.beans.Beans.isDesignTime() ? null : agendamento_atendimentoPUEntityManager.createQuery("SELECT o FROM OrdemServico o");
        ordemServicoList4 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : ordemServicoQuery4.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOrdemServico = new javax.swing.JTable();
        botaoCadastrarOrdemServico = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuNovo = new javax.swing.JMenu();
        itemMenuNovoTecnico = new javax.swing.JMenuItem();
        ìtemMenuNovoCliente = new javax.swing.JMenuItem();
        itemMenuNovoOrdem = new javax.swing.JMenuItem();
        itemMenuNovoOrcamento = new javax.swing.JMenuItem();
        menuVer = new javax.swing.JMenu();
        itemMenuVerTecnico = new javax.swing.JMenuItem();
        itemMenuVerCliente = new javax.swing.JMenuItem();
        itemMenuVerOrdem = new javax.swing.JMenuItem();
        itemMenuVerOrcamento = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        itemMenuAjudaSobre = new javax.swing.JMenuItem();

        jLabel2.setText("Ver Técnicos");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Ordens de Serviço - FazConcertos Ltda");

        jLabel1.setText("Agendamento de Atendimento - FazConcertos Ltda");

        jLabel3.setText("Ver Ordens de Serviço");

        tableOrdemServico.setColumnSelectionAllowed(true);
        tableOrdemServico.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, ordemServicoList4, tableOrdemServico);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${matrTecnico}"));
        columnBinding.setColumnName("Matr Tecnico");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${status}"));
        columnBinding.setColumnName("Status");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${observacao}"));
        columnBinding.setColumnName("Observacao");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataConclusao}"));
        columnBinding.setColumnName("Data Conclusao");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idPagamento}"));
        columnBinding.setColumnName("Id Pagamento");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idOrcamento}"));
        columnBinding.setColumnName("Id Orcamento");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cpfCliente}"));
        columnBinding.setColumnName("Cpf Cliente");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${habilidade}"));
        columnBinding.setColumnName("Habilidade");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("Remover"));
        columnBinding.setColumnName("Remover");
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        tableOrdemServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableOrdemServicoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableOrdemServico);
        tableOrdemServico.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tableOrdemServico.getColumnModel().getColumnCount() > 0) {
            tableOrdemServico.getColumnModel().getColumn(9).setResizable(false);
        }

        botaoCadastrarOrdemServico.setText("Cadastrar");
        botaoCadastrarOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarOrdemServicoActionPerformed(evt);
            }
        });

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
        ìtemMenuNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ìtemMenuNovoClienteActionPerformed(evt);
            }
        });
        menuNovo.add(ìtemMenuNovoCliente);

        itemMenuNovoOrdem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        itemMenuNovoOrdem.setText("Ordem de Serviço");
        itemMenuNovoOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuNovoOrdemActionPerformed(evt);
            }
        });
        menuNovo.add(itemMenuNovoOrdem);

        itemMenuNovoOrcamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        itemMenuNovoOrcamento.setText("Orçamento");
        itemMenuNovoOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuNovoOrcamentoActionPerformed(evt);
            }
        });
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

        itemMenuVerCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemMenuVerCliente.setText("Cliente");
        itemMenuVerCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuVerClienteActionPerformed(evt);
            }
        });
        menuVer.add(itemMenuVerCliente);

        itemMenuVerOrdem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemMenuVerOrdem.setText("Ordem de Serviço");
        itemMenuVerOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuVerOrdemActionPerformed(evt);
            }
        });
        menuVer.add(itemMenuVerOrdem);

        itemMenuVerOrcamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemMenuVerOrcamento.setText("Orçamento");
        itemMenuVerOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuVerOrcamentoActionPerformed(evt);
            }
        });
        menuVer.add(itemMenuVerOrcamento);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addContainerGap(562, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botaoCadastrarOrdemServico)
                            .addGap(0, 752, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(botaoCadastrarOrdemServico)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(56, Short.MAX_VALUE)))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuNovoTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuNovoTecnicoActionPerformed
        TecnicoCreate tecnicoCreate = new TecnicoCreate();
        tecnicoCreate.setVisible(true);
        tecnicoCreate.setLocationRelativeTo(null);
    }//GEN-LAST:event_itemMenuNovoTecnicoActionPerformed

    private void ìtemMenuNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ìtemMenuNovoClienteActionPerformed
        ClienteCreate clienteCreate = new ClienteCreate();
        clienteCreate.setVisible(true);
        clienteCreate.setLocationRelativeTo(null);
    }//GEN-LAST:event_ìtemMenuNovoClienteActionPerformed

    private void itemMenuNovoOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuNovoOrdemActionPerformed
        OrdemServicoCreate ordemServicoCreate = new OrdemServicoCreate();
        ordemServicoCreate.setVisible(true);
        ordemServicoCreate.setLocationRelativeTo(null);
    }//GEN-LAST:event_itemMenuNovoOrdemActionPerformed

    private void itemMenuNovoOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuNovoOrcamentoActionPerformed
        OrcamentoCreate orcamentoCreate = new OrcamentoCreate();
        orcamentoCreate.setVisible(true);
        orcamentoCreate.setLocationRelativeTo(null);
    }//GEN-LAST:event_itemMenuNovoOrcamentoActionPerformed

    private void itemMenuVerTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuVerTecnicoActionPerformed
        TecnicoRead tecnicoRead = new TecnicoRead();
        tecnicoRead.setVisible(true);
        tecnicoRead.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_itemMenuVerTecnicoActionPerformed

    private void itemMenuVerClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuVerClienteActionPerformed
        ClienteRead clienteRead = new ClienteRead();
        clienteRead.setVisible(true);
        clienteRead.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_itemMenuVerClienteActionPerformed

    private void itemMenuVerOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuVerOrdemActionPerformed
        OrdemServicoRead ordemServicoRead = new OrdemServicoRead();
        ordemServicoRead.setVisible(true);
        ordemServicoRead.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_itemMenuVerOrdemActionPerformed

    private void itemMenuVerOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuVerOrcamentoActionPerformed
        OrcamentoRead orcamentoRead = new OrcamentoRead();
        orcamentoRead.setVisible(true);
        orcamentoRead.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_itemMenuVerOrcamentoActionPerformed

    private void itemMenuAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuAjudaSobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemMenuAjudaSobreActionPerformed

    private void botaoCadastrarOrdemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarOrdemServicoActionPerformed
        OrdemServicoCreate ordemServicoCreate = new OrdemServicoCreate();
        ordemServicoCreate.setVisible(true);
        ordemServicoCreate.setLocationRelativeTo(null);
    }//GEN-LAST:event_botaoCadastrarOrdemServicoActionPerformed

    private void tableOrdemServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableOrdemServicoMouseClicked
        Object[] botoes = new Object[2];
        botoes[0] = "Sim";
        botoes[1] = "Não";
        
        int idOrdemServicoSelecionada = Integer.valueOf(tableOrdemServico.getModel().getValueAt(tableOrdemServico.rowAtPoint(evt.getPoint()), 0).toString());
        int optionPane;
        
        OrdemServicoController ordemServicoController = new OrdemServicoController();
        
        // Remover
        if(tableOrdemServico.columnAtPoint(evt.getPoint()) == 9) {            
            optionPane = JOptionPane.showOptionDialog(this,
                "Confirma remover Ordem de Serviço?",
                "Remover Ordem Serviço",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,     
                botoes,  
                botoes[1]);
            
            if (optionPane == JOptionPane.YES_OPTION) {
                try {
                    ordemServicoController.deleteOrdemServico(idOrdemServicoSelecionada);
                    tableOrdemServico.repaint();
                } catch (SQLException ex) {
                    Logger.getLogger(OrdemServicoRead.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_tableOrdemServicoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager agendamento_atendimentoPUEntityManager;
    private javax.swing.JButton botaoCadastrarOrdemServico;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JMenuItem itemMenuAjudaSobre;
    private javax.swing.JMenuItem itemMenuNovoOrcamento;
    private javax.swing.JMenuItem itemMenuNovoOrdem;
    private javax.swing.JMenuItem itemMenuNovoTecnico;
    private javax.swing.JMenuItem itemMenuVerCliente;
    private javax.swing.JMenuItem itemMenuVerOrcamento;
    private javax.swing.JMenuItem itemMenuVerOrdem;
    private javax.swing.JMenuItem itemMenuVerTecnico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuNovo;
    private javax.swing.JMenu menuVer;
    private java.util.List<org.agendamentoatendimento.view.OrdemServico> ordemServicoList;
    private java.util.List<org.agendamentoatendimento.view.OrdemServico> ordemServicoList1;
    private java.util.List<org.agendamentoatendimento.view.OrdemServico> ordemServicoList2;
    private java.util.List<org.agendamentoatendimento.view.OrdemServico> ordemServicoList3;
    private java.util.List<org.agendamentoatendimento.view.OrdemServico> ordemServicoList4;
    private javax.persistence.Query ordemServicoQuery;
    private javax.persistence.Query ordemServicoQuery1;
    private javax.persistence.Query ordemServicoQuery2;
    private javax.persistence.Query ordemServicoQuery3;
    private javax.persistence.Query ordemServicoQuery4;
    private javax.swing.JTable tableOrdemServico;
    private javax.swing.JMenuItem ìtemMenuNovoCliente;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
