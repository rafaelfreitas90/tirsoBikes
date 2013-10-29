/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tirsobikes.views.produto;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import tirsobikes.DAO.CategoriaDAO;
import tirsobikes.DAO.EstoqueDAO;
import tirsobikes.DAO.MarcaDAO;
import tirsobikes.DAO.ProdutoDAO;
import tirsobikes.controllers.ProdutoController;
import tirsobikes.controllers.QuantidadeController;
import tirsobikes.entidades.Categoria;
import tirsobikes.entidades.Estoque;
import tirsobikes.entidades.Marca;
import tirsobikes.entidades.Produto;

/**
 *
 * @author LuisHenrique
 */
public class ProdutoAlterarView extends javax.swing.JFrame {

    /**
     * Creates new form ProdutoEstoqueView
     */
    public ProdutoAlterarView() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtBusca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        bntAlterar = new javax.swing.JButton();
        bntAlterar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Produtos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("PESQUISAR PRODUTO"));

        txtBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscaKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaKeyReleased(evt);
            }
        });

        jLabel1.setText("Nome / Descrição:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tirsobikes/imgs/search.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)))
        );

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.", "Descrição", "Marca", "Categoria", "Fornecedor", "Preço Venda"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(tabelaProduto);

        bntAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tirsobikes/imgs/alterar.png"))); // NOI18N
        bntAlterar.setText(" Alterar Produto");
        bntAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAlterarActionPerformed(evt);
            }
        });

        bntAlterar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tirsobikes/imgs/cancel.png"))); // NOI18N
        bntAlterar1.setText("  Excluir Produto");
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bntAlterar)
                        .addGap(14, 14, 14)
                        .addComponent(bntAlterar1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        atualizarTabela();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        atualizarTabela();
    }//GEN-LAST:event_formWindowActivated

    private void bntAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAlterarActionPerformed
        //verifica produto selecionado
        int linhaTabela = tabelaProduto.getSelectedRow();
        
        if (linhaTabela > -1){
            Produto produto = new Produto();
            produto.setIdproduto(Integer.parseInt(tabelaProduto.getValueAt(linhaTabela, 0).toString()));
            
            ProdutoDAO dao = new ProdutoDAO();
            produto = dao.procurarProduto(produto.getIdproduto());
            
            ProdutoController.getInstancia().exibirInterfaceGrafica(produto);
        }
    }//GEN-LAST:event_bntAlterarActionPerformed

    private void txtBuscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyTyped
       
    }//GEN-LAST:event_txtBuscaKeyTyped

    private void txtBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyReleased
         atualizarTabela();
    }//GEN-LAST:event_txtBuscaKeyReleased

    private void bntAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAlterar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntAlterar1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProdutoAlterarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoAlterarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoAlterarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoAlterarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoAlterarView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAlterar;
    private javax.swing.JButton bntAlterar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables

    private void atualizarTabela() {
        List<Produto> produtos = new ArrayList<Produto>();
        ProdutoDAO dao = new ProdutoDAO();       
        
        produtos = dao.procurarProdutoNome(txtBusca.getText());

        DefaultTableModel dtm = (DefaultTableModel) tabelaProduto.getModel();
        dtm.setRowCount(0);
        
        if (!produtos.isEmpty()){
        for (Produto p : produtos) {
                dtm.addRow(new Object[]{p.getIdproduto(), p.getDescricao(), p.getIdmarca().getDescricao(), p.getIdcategoria().getDescricao(), p.getFornecedor(), p.getValorVenda() });
            }

        }
    }
}