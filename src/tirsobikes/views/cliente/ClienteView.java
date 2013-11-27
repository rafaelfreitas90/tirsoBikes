package tirsobikes.views.cliente;

import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import tirsobikes.DAO.ClienteDAO;
import tirsobikes.DAO.FornecedorDAO;
import tirsobikes.entidades.Cliente;
import tirsobikes.main.TirsoBikes;

/**
 *
 * @author Rafael
 */
public class ClienteView extends javax.swing.JFrame {

    FornecedorDAO dao = new FornecedorDAO(TirsoBikes.getEntityManager());

    public ClienteView() {
        initComponents();
    }
    private Cliente cliente = null;

    public ClienteView(Cliente cliente) {
        this.cliente = cliente;
        initComponents();
        setarCamposCliente(cliente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNomeCompleto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        comboUF = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtDataNasc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtCpf = new javax.swing.JTextField();
        try{ 
            javax.swing.text.MaskFormatter telefone1 = new javax.swing.text.MaskFormatter("(##)####-####"); 
            TxtCpf = new javax.swing.JFormattedTextField(telefone1); 
        } 
        catch (Exception e){ 
        }
        txtTelefone2 = new javax.swing.JTextField();
        try{ 
            javax.swing.text.MaskFormatter telefone2 = new javax.swing.text.MaskFormatter("(##)####-####"); 
            txtTelefone2 = new javax.swing.JFormattedTextField(telefone2); 
        } 
        catch (Exception e){ 
        }
        jLabel11 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        try{ 
            javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("#####-###"); 
            txtCEP = new javax.swing.JFormattedTextField(cpf); 
        } 
        catch (Exception e){ 
        }
        txtBairro = new javax.swing.JTextField();
        txtTelefone1 = new javax.swing.JTextField();
        try{ 
            javax.swing.text.MaskFormatter telefone1 = new javax.swing.text.MaskFormatter("(##)####-####"); 
            TxtCpf = new javax.swing.JFormattedTextField(telefone1); 
        } 
        catch (Exception e){ 
        }
        jLabel13 = new javax.swing.JLabel();
        txtRg = new javax.swing.JTextField();
        try{ 
            javax.swing.text.MaskFormatter telefone1 = new javax.swing.text.MaskFormatter("(##)####-####"); 
            TxtCpf = new javax.swing.JFormattedTextField(telefone1); 
        } 
        catch (Exception e){ 
        }
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Fornecedor");
        setBounds(new java.awt.Rectangle(250, 150, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        txtNomeCompleto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setText("Nome completo");

        jLabel2.setText("Endereço");

        txtEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setText("Bairro");

        jLabel4.setText("Cidade");

        txtCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        comboUF.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        comboUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PR", "PB", "PA", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SE", "SP", "TO" }));

        jLabel5.setText("UF");

        jLabel6.setText("CEP");

        jLabel9.setText("Data Nascimento");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtDataNasc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setText("E-mail");

        TxtCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTelefone2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setText("Telefone");

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tirsobikes/imgs/save.png"))); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tirsobikes/imgs/cancel.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel14.setText("Cod.");

        txtCEP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTelefone1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setText("CPF");

        txtRg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setText("RG");

        jLabel12.setText("Telefone");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNomeCompleto)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndereco)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtCidade))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(comboUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDataNasc)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(TxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txtTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(311, 311, 311)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel14))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboUF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {TxtCpf, txtCidade, txtCodigo, txtDataNasc, txtEmail, txtEndereco, txtNomeCompleto, txtTelefone2});

        txtCEP.getAccessibleContext().setAccessibleDescription("");
        try{
            MaskFormatter mascara = new MaskFormatter("#####-###");
            mascara.setPlaceholderCharacter(' ');

            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascara));

        }

        catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        salvarAtualizar();
        limpaCampos();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Integer resposta = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja cancelar?");
        if (resposta == JOptionPane.YES_OPTION) {
            limpaCampos();
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        limpaCampos();
        this.dispose();

    }//GEN-LAST:event_formWindowClosing
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtCpf;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox comboUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDataNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNomeCompleto;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtTelefone1;
    private javax.swing.JTextField txtTelefone2;
    // End of variables declaration//GEN-END:variables

    private void salvarAtualizar() {
        Cliente model = new Cliente();
        ClienteDAO dao = new ClienteDAO(TirsoBikes.getEntityManager());

        model.setNomeCompleto(txtNomeCompleto.getText());
        model.setEndereco(txtEndereco.getText());       
        model.setCidade(txtCidade.getText());
        model.setBairro(txtBairro.getText());
        model.setUf(comboUF.getSelectedItem().toString());
        model.setCep(txtCEP.getText());
        model.setCpf(TxtCpf.getText());
        model.setRg(txtRg.getText());       
        model.setEmail(txtEmail.getText());
        model.setTelefone1(txtTelefone1.getText());
        model.setTelefone2(txtTelefone2.getText());
        


        if (!txtCodigo.getText().isEmpty()) {
            model.setIdcliente(Integer.parseInt(txtCodigo.getText()));
            dao.atualizarCliente(model);
            JOptionPane.showMessageDialog(rootPane, "Cliente Salvo com sucesso!");
        } else {
            dao.salvarCliente(model);
        }
    }

    public boolean verificaCampos() {

        if (txtNomeCompleto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Verifique o nome do Cliente ");
            txtNomeCompleto.requestFocus();
            return false;
        }

        if (txtEndereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Verifique o campo Endereço  !");
            txtEndereco.requestFocus();
            return false;
        }
     

        if (txtCEP.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Verifique o campo CEP!");
            txtCEP.requestFocus();
            return false;
        }

        if (txtCidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Verifique o campo Cidade! ");
            txtCidade.requestFocus();
            return false;
        }

        if (TxtCpf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Verifique o campo CPF! ");
            TxtCpf.requestFocus();
            return false;
        }

        if (txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Verifique o campo E-mail !");
            txtEmail.requestFocus();
            return false;
        }

        if (txtTelefone1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Verifique o campo Telefone !");
            txtTelefone1.requestFocus();
            return false;
        }

     
        return true;
    }

    private void limpaCampos() {
        txtCodigo.setText("");
        txtCEP.setText("");
        txtCidade.setText("");
        txtBairro.setText("");
        txtEmail.setText("");
        txtEndereco.setText("");
        txtRg.setText("");
        txtDataNasc.setText("");
        txtEndereco.setText("");
        txtNomeCompleto.setText("");
        TxtCpf.setText("");
        txtTelefone2.setText(""); 
        txtTelefone1.setText("");     

    }

    private void setarCamposCliente(Cliente cliente) {
        txtCodigo.setText(cliente.getIdcliente().toString());
        txtNomeCompleto.setText(cliente.getNomeCompleto());
        txtEndereco.setText(cliente.getEndereco());
        txtBairro.setText(cliente.getBairro());
        txtCidade.setText(cliente.getCidade());
        txtCEP.setText(cliente.getCep());        
        txtDataNasc.setText(cliente.getDataNascimento().toString());
        txtEmail.setText(cliente.getEmail());
        TxtCpf.setText(cliente.getCpf());
        txtRg.setText(cliente.getRg());
        txtTelefone1.setText(cliente.getTelefone1());        
        txtTelefone2.setText(cliente.getTelefone2());        
        comboUF.setSelectedItem(cliente.getUf());
    }
    
}
