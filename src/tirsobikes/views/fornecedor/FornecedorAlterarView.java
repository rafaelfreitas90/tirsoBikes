package tirsobikes.views.fornecedor;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tirsobikes.DAO.FornecedorDAO;
import tirsobikes.DAO.ProdutoDAO;
import tirsobikes.controllers.FornecedorController;
import tirsobikes.controllers.ProdutoController;
import tirsobikes.entidades.Fornecedor;
import tirsobikes.entidades.Produto;
import tirsobikes.main.TirsoBikes;

/**
 *
 * @author Rafael
 */
public class FornecedorAlterarView extends javax.swing.JFrame {

    public FornecedorAlterarView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtBusca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFornecedor = new javax.swing.JTable();
        bntAlterar = new javax.swing.JButton();
        bntAlterar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Produtos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("PESQUISAR FORNCEDOR"));

        txtBusca.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscaKeyTyped(evt);
            }
        });

        jLabel1.setText("Nome / Descrição:");

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
                .addComponent(txtBusca)
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
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))))
        );

        tabelaFornecedor.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tabelaFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.", "Nome / Razão", "Nome Fantasia", "Telefone", "E-mail", "Vendedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaFornecedor);
        tabelaFornecedor.getColumnModel().getColumn(0).setResizable(false);
        tabelaFornecedor.getColumnModel().getColumn(0).setPreferredWidth(2);
        tabelaFornecedor.getColumnModel().getColumn(1).setResizable(false);
        tabelaFornecedor.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabelaFornecedor.getColumnModel().getColumn(2).setResizable(false);
        tabelaFornecedor.getColumnModel().getColumn(2).setPreferredWidth(80);
        tabelaFornecedor.getColumnModel().getColumn(3).setResizable(false);
        tabelaFornecedor.getColumnModel().getColumn(3).setPreferredWidth(40);
        tabelaFornecedor.getColumnModel().getColumn(4).setResizable(false);
        tabelaFornecedor.getColumnModel().getColumn(4).setPreferredWidth(80);
        tabelaFornecedor.getColumnModel().getColumn(5).setResizable(false);
        tabelaFornecedor.getColumnModel().getColumn(5).setPreferredWidth(40);

        bntAlterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bntAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tirsobikes/imgs/alterar.png"))); // NOI18N
        bntAlterar.setText(" Alterar Fornecedor");
        bntAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAlterarActionPerformed(evt);
            }
        });

        bntAlterar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tirsobikes/imgs/cancel.png"))); // NOI18N
        bntAlterar1.setText("  Excluir Fornecedor");
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bntAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntAlterar1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGap(0, 0, Short.MAX_VALUE))
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
        
        int linhaTabela = tabelaFornecedor.getSelectedRow();

        if (linhaTabela > -1) {
            Fornecedor fornecedor = new Fornecedor();
            fornecedor.setIdfornecedor(Integer.parseInt(tabelaFornecedor.getValueAt(linhaTabela, 0).toString()));

            FornecedorDAO dao = new FornecedorDAO(TirsoBikes.getEntityManager());
            fornecedor = dao.procurarFornecedor(fornecedor.getIdfornecedor());

            FornecedorController.getInstancia().exibirInterfaceGrafica2(fornecedor);
        }
    }//GEN-LAST:event_bntAlterarActionPerformed

    private void txtBuscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyTyped
    }//GEN-LAST:event_txtBuscaKeyTyped

    private void txtBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyReleased
        atualizarTabela();
    }//GEN-LAST:event_txtBuscaKeyReleased

    private void bntAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAlterar1ActionPerformed
    int linhaTabela = tabelaFornecedor.getSelectedRow();

        if (linhaTabela > -1) {
            Fornecedor fornecedor = new Fornecedor();

            FornecedorDAO dao = new FornecedorDAO(TirsoBikes.getEntityManager());
            fornecedor = dao.procurarFornecedor(Integer.parseInt(tabelaFornecedor.getValueAt(linhaTabela, 0).toString()));

            Integer resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja\n excluir o fornecedor: " + fornecedor.getNomeRazao()+ "?");
            if (resposta == JOptionPane.YES_OPTION) {
                if (fornecedor != null) {
                    dao.deletarForncedor(fornecedor);
                    JOptionPane.showMessageDialog(null, "Fornecedor deletado com sucesso!");
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
    private javax.swing.JTable tabelaFornecedor;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables

    private void atualizarTabela() {
        List<Fornecedor> fornecedor = new ArrayList<Fornecedor>();
        FornecedorDAO dao = new FornecedorDAO(TirsoBikes.getEntityManager());

        fornecedor = dao.procurarFornecedorNome(txtBusca.getText());
        fornecedor = dao.listarFornecedor();
        DefaultTableModel dtm = (DefaultTableModel) tabelaFornecedor.getModel();
        dtm.setRowCount(0);

        if (!fornecedor.isEmpty()) {
            for (Fornecedor f : fornecedor) {
                dtm.addRow(new Object[]{f.getIdfornecedor(), f.getNomeRazao(), f.getNomeFantasia(), f.getTelefone1(), f.getEmail(), f.getVendedor()});
            }

        }
    }
}
