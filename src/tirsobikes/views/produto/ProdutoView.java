package tirsobikes.views.produto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import tirsobikes.DAO.CategoriaDAO;
import tirsobikes.DAO.EstoqueDAO;
import tirsobikes.DAO.MarcaDAO;
import tirsobikes.DAO.ProdutoDAO;
import tirsobikes.DAO.ServicoDAO;
import tirsobikes.controllers.CategoriaGrupoController;
import tirsobikes.controllers.MarcaController;
import tirsobikes.entidades.Categoria;
import tirsobikes.entidades.Estoque;
import tirsobikes.entidades.Marca;
import tirsobikes.entidades.Produto;
import tirsobikes.entidades.Servico;
import tirsobikes.main.TirsoBikes;
import tirsobikes.views.validacoes.Validacoes;

/**
 *
 * @author Luis Henrique
 */
public class ProdutoView extends javax.swing.JFrame {

  
   
    public ProdutoView() {
        initComponents();
        preencherJcomboMarca();
        preencherJcomboCategoria();
        desabilitaTodosCampos();
    }
    private Produto produto = null;

    public ProdutoView(Produto produto) {
        this.produto = produto;
        initComponents();
        preencherJcomboMarca();
        preencherJcomboCategoria();
        setarCampos(produto);
    }
    private Servico servico = null;

    public ProdutoView(Servico servico) {
        this.servico = servico;
        initComponents();
        setarCamposServico(servico);
    }

    // Habilita apenas os campos necessario para o cadastro de Serviço
    private void exibeCamposServico() {
        desabilitaTodosCampos();
        txtDescricao.setEnabled(true);
        txtValorVenda.setEnabled(true);
    }

    // Habilita todos os campos da view
    private void exibeTodosCampos() {
        jComboCategoria.setEnabled(true);
        bntAddCategoria.setEnabled(true);
        bntAddMarca.setEnabled(true);
        jComboMarca.setEnabled(true);
        txtFornecedor.setEnabled(true);
        txtEstoqueAtual.setEnabled(true);
        txtEstoqueMinimo.setEnabled(true);
        txtValorCusto.setEnabled(true);
        txtValorVenda.setEnabled(true);
        txtMargem.setEnabled(true);
        txtCodigoDeBarra.setEnabled(true);
        txtDescricao.setEnabled(true);

    }

    // Desabilita todos os campos da view
    private void desabilitaTodosCampos() {
        jComboCategoria.setEnabled(false);
        bntAddCategoria.setEnabled(false);
        bntAddMarca.setEnabled(false);
        jComboMarca.setEnabled(false);
        txtFornecedor.setEnabled(false);
        txtEstoqueAtual.setEnabled(false);
        txtEstoqueMinimo.setEnabled(false);
        txtValorCusto.setEnabled(false);
        txtValorVenda.setEnabled(false);
        txtMargem.setEnabled(false);
        txtCodigoDeBarra.setEnabled(false);
        txtDescricao.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboTipo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoDeBarra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bntAddMarca = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtEstoqueMinimo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEstoqueAtual = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtValorCusto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtMargem = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtValorVenda = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        bntSalvar = new javax.swing.JButton();
        bntCancelar = new javax.swing.JToggleButton();
        bntAddCategoria = new javax.swing.JButton();
        jComboMarca = new javax.swing.JComboBox();
        jComboCategoria = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produtos de Venda / Serviços");
        setBounds(new java.awt.Rectangle(200, 100, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Código");

        txtCodigo.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Tipo");

        jComboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Produto", "Serviço" }));
        jComboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTipoActionPerformed(evt);
            }
        });

        jLabel3.setText("Código de Barras");

        jLabel4.setText("Descrição Produto / Serviço");

        jLabel5.setText("Marca");

        jLabel6.setText("Grupo / Categoria");

        bntAddMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tirsobikes/imgs/addMenor.png"))); // NOI18N
        bntAddMarca.setMargin(new java.awt.Insets(2, 2, 2, 2));
        bntAddMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAddMarcaActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESTOQUE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 8))); // NOI18N

        jLabel7.setText("Estoque Mínimo");

        jLabel8.setText("Estoque Atual");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEstoqueAtual, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(txtEstoqueMinimo))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEstoqueMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEstoqueAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PREÇO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 8))); // NOI18N

        jLabel9.setText("Valor CUSTO R$");

        txtValorCusto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValorCustoKeyReleased(evt);
            }
        });

        jLabel10.setText("( % ) Margem");

        txtMargem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMargemKeyReleased(evt);
            }
        });

        jLabel11.setText("%");

        txtValorVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtValorVenda.setText("0,0");

        jLabel13.setText("Valor VENDA R$");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorVenda))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValorCusto)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtMargem, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(jLabel11)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtMargem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel12.setText("Fornecedor");

        bntSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tirsobikes/imgs/save.png"))); // NOI18N
        bntSalvar.setText("   SALVAR");
        bntSalvar.setMargin(new java.awt.Insets(2, 2, 2, 14));
        bntSalvar.setPreferredSize(new java.awt.Dimension(133, 27));
        bntSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalvarActionPerformed(evt);
            }
        });

        bntCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tirsobikes/imgs/cancel.png"))); // NOI18N
        bntCancelar.setText(" CANCELAR");
        bntCancelar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        bntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarActionPerformed(evt);
            }
        });

        bntAddCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tirsobikes/imgs/addMenor.png"))); // NOI18N
        bntAddCategoria.setMargin(new java.awt.Insets(2, 2, 2, 2));
        bntAddCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAddCategoriaActionPerformed(evt);
            }
        });

        jComboMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboMarcaActionPerformed(evt);
            }
        });
        jComboMarca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboMarcaFocusGained(evt);
            }
        });

        jComboCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCategoriaActionPerformed(evt);
            }
        });
        jComboCategoria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboCategoriaFocusGained(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodigoDeBarra)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bntAddMarca)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bntAddCategoria))
                                    .addComponent(jLabel6)))
                            .addComponent(txtDescricao)
                            .addComponent(txtFornecedor)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bntSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bntCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtCodigoDeBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(bntAddCategoria)
                    .addComponent(bntAddMarca)
                    .addComponent(jComboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(1, 1, 1)
                .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bntSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bntCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    }//GEN-LAST:event_formWindowActivated

    private void jComboCategoriaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboCategoriaFocusGained
        preencherJcomboCategoria();
    }//GEN-LAST:event_jComboCategoriaFocusGained

    private void jComboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCategoriaActionPerformed
        // abre view para cadastar categoria/grupo
        if (jComboCategoria.getSelectedItem() != null && jComboCategoria.getSelectedItem().equals("+ Adicionar..")) {
            CategoriaGrupoController.getInstancia().exibirInterfaceGrafica("Categoria / Grupo");
        }
    }//GEN-LAST:event_jComboCategoriaActionPerformed

    private void jComboMarcaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboMarcaFocusGained
        preencherJcomboMarca();
    }//GEN-LAST:event_jComboMarcaFocusGained

    private void jComboMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboMarcaActionPerformed
        // abre view para cadastar marca
        if (jComboMarca.getSelectedItem() != null && jComboMarca.getSelectedItem().equals("+ Adicionar..")) {
            MarcaController.getInstancia().exibirInterfaceGrafica("Marca");
        }
    }//GEN-LAST:event_jComboMarcaActionPerformed

    private void bntAddCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAddCategoriaActionPerformed
        CategoriaGrupoController.getInstancia().exibirInterfaceGrafica("Categoria / Grupo");
    }//GEN-LAST:event_bntAddCategoriaActionPerformed

    private void bntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarActionPerformed
        Integer resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar?");
        if (resposta == JOptionPane.YES_OPTION) {
           limpaCampos();
            this.dispose();
        }
    }//GEN-LAST:event_bntCancelarActionPerformed

    private void bntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarActionPerformed
        // 1 = "Produto" selecionado
        // 2 = "Serviço" selecionado
        // 0 = "Selecione" selecionado

        if (jComboTipo.getSelectedIndex() == 1) {
            if (!validaCamposProduto()) {
                return;
            }
            salvarProduto();
            limpaCampos();
        }

        if (jComboTipo.getSelectedIndex() == 2) {
            if (!validaCamposServico()) {
                return;
            }
            salvarServico();
            limpaCampos();
        }

        if (jComboTipo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione um tipo (Serviço ou Produto)");
        }
    }//GEN-LAST:event_bntSalvarActionPerformed

    private void txtMargemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMargemKeyReleased
        if (!txtMargem.getText().isEmpty()) {
            atualizaValorVenda();
        }
    }//GEN-LAST:event_txtMargemKeyReleased

    private void bntAddMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAddMarcaActionPerformed
        MarcaController.getInstancia().exibirInterfaceGrafica("Marca");
    }//GEN-LAST:event_bntAddMarcaActionPerformed

    private void jComboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTipoActionPerformed
        // 0 = "Selecione" selecionado
        if (jComboTipo.getSelectedIndex() == 0) {
            desabilitaTodosCampos();
        }

        // 1 = "Produto" selecionado
        if (jComboTipo.getSelectedIndex() == 1) {
            exibeTodosCampos();
        }

        // 2 = "Serviço" selecionado
        if (jComboTipo.getSelectedIndex() == 2) {
            exibeCamposServico();
        }
    }//GEN-LAST:event_jComboTipoActionPerformed

    private void txtValorCustoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorCustoKeyReleased
        if (!txtMargem.getText().isEmpty()) {
            atualizaValorVenda();
        }
    }//GEN-LAST:event_txtValorCustoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAddCategoria;
    private javax.swing.JButton bntAddMarca;
    private javax.swing.JToggleButton bntCancelar;
    private javax.swing.JButton bntSalvar;
    private javax.swing.JComboBox jComboCategoria;
    private javax.swing.JComboBox jComboMarca;
    private javax.swing.JComboBox jComboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoDeBarra;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEstoqueAtual;
    private javax.swing.JTextField txtEstoqueMinimo;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtMargem;
    private javax.swing.JTextField txtValorCusto;
    private javax.swing.JTextField txtValorVenda;
    // End of variables declaration//GEN-END:variables

    private void atualizaValorVenda() {
        if (!(txtValorCusto.getText().isEmpty()) && (!txtMargem.getText().isEmpty())) {
            Produto produto = new Produto();
            produto.setValorCusto(txtValorCusto.getText());
            produto.setMargem(txtMargem.getText());

            // atualiza valor venda
            String valorVenda = produto.getValorVenda().toString();
            valorVenda = valorVenda.replace(".", ",");
            txtValorVenda.setText(valorVenda);
        } else {
            JOptionPane.showMessageDialog(null, "O campo Valor Custo e Margem de Lucro são obrigatórios para o calculo!");
        }
    }

    private void salvarProduto() {
        Produto produto = new Produto();
        Marca marca = new Marca();
        Categoria categoria = new Categoria();
        ProdutoDAO dao = new ProdutoDAO(TirsoBikes.getEntityManager());

        // verifica se o campo contem algum valor, pois o campos pode ser nulo
        if (!txtCodigoDeBarra.getText().isEmpty()) {
            produto.setCodigoDeBarras(Integer.parseInt(txtCodigoDeBarra.getText()));
        }

        // seta os outros campos
        produto.setDescricao(txtDescricao.getText());
        produto.setIdmarca(marca = (Marca) jComboMarca.getSelectedItem());
        produto.setIdcategoria(categoria = (Categoria) jComboCategoria.getSelectedItem());
        produto.setFornecedor(txtFornecedor.getText());
        produto.setEstoqueMinimo(Integer.parseInt(txtEstoqueMinimo.getText()));
        produto.setValorCusto(txtValorCusto.getText());
        produto.setMargem(txtMargem.getText());
        produto.getValorVenda();

        if (!txtCodigo.getText().isEmpty()) {
            produto.setIdproduto(Integer.parseInt(txtCodigo.getText()));
            dao.atualizarProduto(produto);
        } else {
            produto = dao.salvarProduto(produto);
        }

        //salva estoque
        Estoque estoque = new Estoque();
        EstoqueDAO daoEstoque = new EstoqueDAO(TirsoBikes.getEntityManager());
        Date data = new Date();

        estoque.setData(data);
        estoque.setIdproduto(produto);
        estoque.setQuantidade(Integer.parseInt(txtEstoqueAtual.getText()));
        daoEstoque.salvarEstoque(estoque);

    }

    private void salvarServico() {
        Servico servico = new Servico();
        ServicoDAO dao = new ServicoDAO(TirsoBikes.getEntityManager());

        servico.setDescricao(txtDescricao.getText());
        servico.setValor(txtValorVenda.getText());

        if (!txtCodigo.getText().isEmpty()) {
            servico.setIdservico(Integer.parseInt(txtCodigo.getText()));
            dao.atualizarServico(servico);
        } else {
            dao.salvarServico(servico);
        }
    }

    // preenche o dropdown com as marcas dos banco
    private void preencherJcomboMarca() {
        List<Marca> marcas = new ArrayList<Marca>();
        MarcaDAO dao = new MarcaDAO(TirsoBikes.getEntityManager());
        marcas = dao.listaMarcas();
        jComboMarca.removeAllItems();
        jComboMarca.addItem("Selecione uma Marca");
        if (!marcas.isEmpty()) {
            for (Marca m : marcas) {
                jComboMarca.addItem(m);
            }
        }
        jComboMarca.addItem("+ Adicionar..");
    }

    // preenche o dropdown com as categorias dos banco
    private void preencherJcomboCategoria() {

        CategoriaDAO dao = new CategoriaDAO(TirsoBikes.getEntityManager());
        List<Categoria> categorias = new ArrayList<Categoria>();
        categorias = dao.listaCategorias();
        jComboCategoria.removeAllItems();
        jComboCategoria.addItem("Selecione uma Categoria");
        if (!categorias.isEmpty()) {
            for (Categoria m : categorias) {
                jComboCategoria.addItem(m);
            }
        }
        jComboCategoria.addItem("+ Adicionar..");
    }

    // zera todos os campos da view
    private void limpaCampos() {
        jComboTipo.setSelectedIndex(0);
        jComboCategoria.setSelectedIndex(0);
        jComboMarca.setSelectedIndex(0);
        txtFornecedor.setText("");
        txtEstoqueAtual.setText("");
        txtEstoqueMinimo.setText("");
        txtValorCusto.setText("");
        txtValorVenda.setText("");
        txtMargem.setText("");
        txtCodigoDeBarra.setText("");
        txtDescricao.setText("");
    }

    // validaçao de todos os campos de Produto
    private boolean validaCamposProduto() {
        if (!txtCodigoDeBarra.getText().isEmpty()) {
            if (!Validacoes.validaNumero(txtCodigoDeBarra.getText())) {
                JOptionPane.showMessageDialog(null, "Código de Barras inválido");
                txtCodigoDeBarra.requestFocus();
                return false;
            }
        }

        if (txtDescricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o nome/descrição do produto");
            txtDescricao.requestFocus();
            return false;
        }

        if (jComboMarca.getSelectedItem().equals("Selecione uma Marca") || jComboMarca.getSelectedItem().equals("+ Adicionar..")) {
            JOptionPane.showMessageDialog(null, "Selecione uma marca!");
            jComboMarca.requestFocus();
            return false;
        }

        if (jComboCategoria.getSelectedItem().equals("Selecione uma Categoria") || jComboCategoria.getSelectedItem().equals("+ Adicionar..")) {
            JOptionPane.showMessageDialog(null, "Selecione uma categoria!");
            jComboCategoria.requestFocus();
            return false;
        }

        if (!Validacoes.validaNumero(txtEstoqueMinimo.getText())) {
            JOptionPane.showMessageDialog(null, "Estoque minimo inválido");
            txtEstoqueMinimo.requestFocus();
            return false;
        }

        if (!Validacoes.validaNumero(txtEstoqueAtual.getText())) {
            JOptionPane.showMessageDialog(null, "Estoque atual inválido");
            txtEstoqueAtual.requestFocus();
            return false;
        }

        String valorCusto = txtValorCusto.getText();
        valorCusto = valorCusto.replace(",", ".");
        if (!Validacoes.validaNumero(valorCusto)) {
            JOptionPane.showMessageDialog(null, "Valor Custo inválido");
            txtValorCusto.requestFocus();
            return false;
        }

        String margem = txtMargem.getText();
        margem = margem.replace(",", ".");
        if (!Validacoes.validaNumero(margem)) {
            JOptionPane.showMessageDialog(null, "Margem de lucro inválida");
            txtMargem.requestFocus();
            return false;
        }

        return true;
    }

    // validaçao de todos os campos de Produto
    private boolean validaCamposServico() {
        if (txtDescricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o nome/descrição do serviço");
            txtDescricao.requestFocus();
            return false;
        }

        String valorVenda = txtValorVenda.getText();
        valorVenda = valorVenda.replace(",", ".");
        if (txtValorVenda.getText().isEmpty() || !Validacoes.validaNumero(valorVenda)) {
            JOptionPane.showMessageDialog(null, "Valor de venda inválido");
            txtValorVenda.requestFocus();
            return false;
        }
        return true;
    }

    private void setarCampos(Produto produto) {
        jComboTipo.setSelectedIndex(1);
        txtCodigo.setText(produto.getIdproduto().toString());
        if (produto.getCodigoDeBarras() != null) {
            txtCodigoDeBarra.setText(produto.getCodigoDeBarras().toString());
        }
        txtDescricao.setText(produto.getDescricao());

        MarcaDAO daoMarca = new MarcaDAO(TirsoBikes.getEntityManager());
        Marca marca = daoMarca.procurarMarca(produto.getIdmarca().getIdmarca());
        jComboMarca.getModel().setSelectedItem(marca);

        CategoriaDAO daoCategoria = new CategoriaDAO(TirsoBikes.getEntityManager());
        Categoria categoria = daoCategoria.procurarCategoria(produto.getIdcategoria().getIdcategoria());
        jComboCategoria.getModel().setSelectedItem(categoria);

        txtFornecedor.setText(produto.getFornecedor());

        EstoqueDAO daoEstoque = new EstoqueDAO(TirsoBikes.getEntityManager());
        List<Estoque> estoques = daoEstoque.ultimoEstoque(produto.getIdproduto());
        if (!estoques.isEmpty()) {
            Estoque estoque = estoques.get(0);
            txtEstoqueAtual.setText(String.valueOf(estoque.getQuantidade()));
        }

        txtEstoqueMinimo.setText(String.valueOf(produto.getEstoqueMinimo()));


        txtValorCusto.setText(produto.getValorCustoString());
        txtMargem.setText(produto.getMargemString());
        txtValorVenda.setText(produto.getValorVendaString());

    }

    private void setarCamposServico(Servico servico) {
        jComboTipo.setSelectedIndex(2);
        txtCodigo.setText(servico.getIdservico().toString());
        txtDescricao.setText(servico.getDescricao());
        txtValorVenda.setText(servico.getValorString());
    }
}
