/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agendamentoatendimento.view;

/**
 *
 * @author Mariane
 */
public class ClienteRead extends javax.swing.JFrame {

    /**
     * Creates new form ClienteRead
     */
    public ClienteRead() {
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

        agendamento_atendimentoPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("agendamento_atendimentoPU").createEntityManager();
        clientesQuery = java.beans.Beans.isDesignTime() ? null : agendamento_atendimentoPUEntityManager.createQuery("SELECT c FROM Clientes c");
        clientesList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clientesQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Clientes - FazConcertos Ltda");

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Agendamento de Atendimento - FazConcertos Ltda");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, clientesList, jTable2);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cpf}"));
        columnBinding.setColumnName("Cpf");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataNasc}"));
        columnBinding.setColumnName("Data Nasc");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rg}"));
        columnBinding.setColumnName("Rg");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telefone}"));
        columnBinding.setColumnName("Telefone");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setText("Ver clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager agendamento_atendimentoPUEntityManager;
    private java.util.List<org.agendamentoatendimento.view.Clientes> clientesList;
    private javax.persistence.Query clientesQuery;
    private javax.swing.JMenuItem itemMenuAjudaSobre;
    private javax.swing.JMenuItem itemMenuNovoOrcamento;
    private javax.swing.JMenuItem itemMenuNovoOrdem;
    private javax.swing.JMenuItem itemMenuNovoTecnico;
    private javax.swing.JMenuItem itemMenuVerCliente;
    private javax.swing.JMenuItem itemMenuVerOrcamento;
    private javax.swing.JMenuItem itemMenuVerOrdem;
    private javax.swing.JMenuItem itemMenuVerTecnico;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuNovo;
    private javax.swing.JMenu menuVer;
    private javax.swing.JMenuItem ìtemMenuNovoCliente;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
