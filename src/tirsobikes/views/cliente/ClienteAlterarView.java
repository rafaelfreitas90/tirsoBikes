package tirsobikes.views.cliente;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tirsobikes.DAO.ClienteDAO;
import tirsobikes.controllers.ClienteController;
import tirsobikes.entidades.Cliente;
import tirsobikes.main.TirsoBikes;

/**
 *
 * @author Rafael
 */
public class ClienteAlterarView extends javax.swing.JFrame {

    public ClienteAlterarView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtBuscaNomeCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        bntAlterar = new javax.swing.JButton();
        bntAlterar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Produtos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("PESQUISAR CLIENTE"));

        txtBuscaNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtBuscaNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaNomeClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscaNomeClienteKeyTyped(evt);
            }
        });

        jLabel1.setText("Nome Completo:");

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tirsobikes/imgs/search.png"))); // NOI18N
        btnPesquisar.setText("Buscar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscaNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPesquisar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscaNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))))
        );

        tabelaCliente.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.", "Nome Completo", "Endereço", "Telefone", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaCliente);
        tabelaCliente.getColumnModel().getColumn(0).setResizable(false);
        tabelaCliente.getColumnModel().getColumn(0).setPreferredWidth(3);
        tabelaCliente.getColumnModel().getColumn(1).setResizable(false);
        tabelaCliente.getColumnModel().getColumn(1).setPreferredWidth(200);
        tabelaCliente.getColumnModel().getColumn(2).setResizable(false);
        tabelaCliente.getColumnModel().getColumn(2).setPreferredWidth(200);
        tabelaCliente.getColumnModel().getColumn(3).setResizable(false);
        tabelaCliente.getColumnModel().getColumn(3).setPreferredWidth(50);
        tabelaCliente.getColumnModel().getColumn(4).setResizable(false);
        tabelaCliente.getColumnModel().getColumn(4).setPreferredWidth(120);

        bntAlterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bntAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tirsobikes/imgs/alterar.png"))); // NOI18N
        bntAlterar.setText(" Alterar Cliente");
        bntAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAlterarActionPerformed(evt);
            }
        });

        bntAlterar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tirsobikes/imgs/cancel.png"))); // NOI18N
        bntAlterar1.setText("  Excluir Cliente");
        bntAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAlterar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bntAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntAlterar1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(bntAlterar1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        atualizarTabela();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        atualizarTabela();
    }//GEN-LAST:event_formWindowActivated

    private void bntAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAlterarActionPerformed
        
        int linhaTabela = tabelaCliente.getSelectedRow();

        if (linhaTabela > -1) {
            Cliente cliente = new Cliente();
            cliente.setIdcliente(Integer.parseInt(tabelaCliente.getValueAt(linhaTabela, 0).toString()));

            ClienteDAO dao = new ClienteDAO(TirsoBikes.getEntityManager());
            cliente = dao.procurarCliente(cliente.getIdcliente());

            ClienteController.getInstancia().exibirInterfaceGrafica2(cliente);
        }
    }//GEN-LAST:event_bntAlterarActionPerformed

    private void txtBuscaNomeClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNomeClienteKeyTyped
    }//GEN-LAST:event_txtBuscaNomeClienteKeyTyped

    private void txtBuscaNomeClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNomeClienteKeyReleased
        atualizarTabela();
    }//GEN-LAST:event_txtBuscaNomeClienteKeyReleased

    private void bntAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAlterar1ActionPerformed
    int linhaTabela = tabelaCliente.getSelectedRow();

        if (linhaTabela > -1) {
            Cliente cliente = new Cliente();

            ClienteDAO dao = new ClienteDAO(TirsoBikes.getEntityManager());
            cliente = dao.procurarCliente(Integer.parseInt(tabelaCliente.getValueAt(linhaTabela, 0).toString()));

            Integer resposta = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja\n excluir o cliente: " + cliente.getNomeCompleto()+ "?");
            if (resposta == JOptionPane.YES_OPTION) {
                if (cliente != null) {
                    dao.deletarCliente(cliente);
                    JOptionPane.showMessageDialog(rootPane, "Cliente deletado com sucesso!");
                }
            }

        }       
    }//GEN-LAST:event_bntAlterar1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAlterar;
    private javax.swing.JButton bntAlterar1;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTextField txtBuscaNomeCliente;
    // End of variables declaration//GEN-END:variables

    private void atualizarTabela() {
        List<Cliente> cliente = new ArrayList<Cliente>();
        ClienteDAO dao = new ClienteDAO(TirsoBikes.getEntityManager());

        cliente = dao.procurarClienteNome(txtBuscaNomeCliente.getText());
        cliente = dao.listarCliente();
        DefaultTableModel dtm = (DefaultTableModel) tabelaCliente.getModel();
        dtm.setRowCount(0);

        if (!cliente.isEmpty()) {
            for (Cliente c : cliente) {
                dtm.addRow(new Object[]{c.getIdcliente(), c.getNomeCompleto(), c.getEndereco(), c.getTelefone1(), c.getEmail()});
            }

        }
    }
}
