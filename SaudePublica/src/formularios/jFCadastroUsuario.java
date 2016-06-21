package formularios;

import dao.GenericDao;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tabelas.Humanos;
import tabelas.cidade;
import tabelas.estado;

/**
 *
 * @author Jardel
 */
public class jFCadastroUsuario extends javax.swing.JFrame {

    int retorno = 0;

    /**
     * Creates new form jFCadastroUsuario
     */
    public jFCadastroUsuario() {
        initComponents();
        jTBEditar.setVisible(false);
        setLocationRelativeTo(null);
        this.setSize(364, 425);
        try {
            listarEstados();
        } catch (SQLException ex) {
            Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCadastrarUsuario = new javax.swing.JLabel();
        jLCadastrarNome = new javax.swing.JLabel();
        jTFCadastrarNome = new javax.swing.JTextField();
        jLCadastrarEndereco = new javax.swing.JLabel();
        jTFCadastrarEndereco = new javax.swing.JTextField();
        jLCadastarCidade = new javax.swing.JLabel();
        jCBCidades = new javax.swing.JComboBox<>();
        jBCadastrarCadastrar = new javax.swing.JButton();
        jBCadastrarLimpar = new javax.swing.JButton();
        jCBEstados = new javax.swing.JComboBox<>();
        jLCadastrarUF = new javax.swing.JLabel();
        jLCadastrarSenha = new javax.swing.JLabel();
        jPFCadastrarSenha = new javax.swing.JPasswordField();
        jLGenero = new javax.swing.JLabel();
        jRBMasculino = new javax.swing.JRadioButton();
        jRBFeminino = new javax.swing.JRadioButton();
        jBSalvarEditar = new javax.swing.JButton();
        jCBEditarUsuario = new javax.swing.JComboBox<>();
        jLAlterar = new javax.swing.JLabel();
        jBLogar = new javax.swing.JButton();
        jLCod_humano = new javax.swing.JLabel();
        jBExcluir = new javax.swing.JButton();
        jTBEditar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLCadastrarUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCadastrarUsuario.setText("Cadastrar Novo Usuário");

        jLCadastrarNome.setText("Nome:");

        jTFCadastrarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCadastrarNomeActionPerformed(evt);
            }
        });

        jLCadastrarEndereco.setText("Endereço:");

        jLCadastarCidade.setText("Cidade:");

        jCBCidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jBCadastrarCadastrar.setText("Cadastrar");
        jBCadastrarCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarCadastrarActionPerformed(evt);
            }
        });

        jBCadastrarLimpar.setText("Limpar");
        jBCadastrarLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarLimparActionPerformed(evt);
            }
        });

        jCBEstados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBEstadosActionPerformed(evt);
            }
        });

        jLCadastrarUF.setText("UF:");

        jLCadastrarSenha.setText("Senha:");

        jLGenero.setText("Gênero:");

        jRBMasculino.setText("Masculino");

        jRBFeminino.setText("Feminino");

        jBSalvarEditar.setText("Alterar");
        jBSalvarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarEditarActionPerformed(evt);
            }
        });

        jCBEditarUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBEditarUsuarioActionPerformed(evt);
            }
        });

        jLAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLAlterar.setText("Editar Usuário");

        jBLogar.setText("X");
        jBLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLogarActionPerformed(evt);
            }
        });

        jLCod_humano.setText("COD");

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jTBEditar.setText("Editar");
        jTBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLCadastrarUsuario))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLCadastrarNome)
                                .addGap(49, 49, 49)
                                .addComponent(jTFCadastrarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLCadastrarEndereco)
                                .addGap(31, 31, 31)
                                .addComponent(jTFCadastrarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLCadastarCidade)
                                .addGap(43, 43, 43)
                                .addComponent(jCBCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLCadastrarUF)
                                .addGap(4, 4, 4)
                                .addComponent(jCBEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLGenero)
                                .addGap(41, 41, 41)
                                .addComponent(jRBMasculino)
                                .addGap(18, 18, 18)
                                .addComponent(jRBFeminino))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLCadastrarSenha)
                                .addGap(46, 46, 46)
                                .addComponent(jPFCadastrarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jTBEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBCadastrarLimpar)
                                .addGap(10, 10, 10)
                                .addComponent(jBCadastrarCadastrar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLAlterar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLCod_humano)
                                .addGap(18, 18, 18)
                                .addComponent(jCBEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jBSalvarEditar)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jBLogar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLCadastrarUsuario)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLCadastrarNome))
                    .addComponent(jTFCadastrarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLCadastrarEndereco))
                    .addComponent(jTFCadastrarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBCidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCadastarCidade)
                            .addComponent(jLCadastrarUF))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLGenero))
                    .addComponent(jRBMasculino)
                    .addComponent(jRBFeminino))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLCadastrarSenha))
                    .addComponent(jPFCadastrarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jBLogar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBCadastrarLimpar)
                        .addComponent(jTBEditar))
                    .addComponent(jBCadastrarCadastrar))
                .addGap(31, 31, 31)
                .addComponent(jLAlterar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCod_humano))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalvarEditar)
                    .addComponent(jBExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFCadastrarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCadastrarNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCadastrarNomeActionPerformed

    private void jBCadastrarLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarLimparActionPerformed

        int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja realmente limpar todos campos ?");

        if (confirmacao == 0) {
            limparCampos();
        }
    }//GEN-LAST:event_jBCadastrarLimparActionPerformed

    private void jBCadastrarCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarCadastrarActionPerformed
        String gen;

        if (jRBMasculino.isSelected() == true || jRBFeminino.isSelected() == true) {

            if (jRBMasculino.isSelected() == true) {
                gen = "m";
            } else {
                gen = "f";
            }
        } else {
            gen = "na";
        }

        String conf_nome = jTFCadastrarNome.getText();
        String conf_ende = jTFCadastrarEndereco.getText();
        String conf_senha = jPFCadastrarSenha.getText();

        if ((!conf_nome.equals("")) && (!conf_ende.equals("")) && (!conf_senha.equals("")) && (!gen.equals("na"))) {

            try {

                GenericDao gd = new GenericDao();
                Humanos usuario = new Humanos();

                                usuario.setNome(jTFCadastrarNome.getText());
                usuario.setEndereco(jTFCadastrarEndereco.getText());
                usuario.setRanking(0); // verificar
                usuario.setGenero(gen);
                usuario.setSenha(jPFCadastrarSenha.getText());

                String nome_cf = String.valueOf(jCBCidades.getSelectedItem());

                usuario.setCod_cidade(buscarCodCidade(nome_cf));

                gd.adicionar(usuario);
                limparCampos();

            } catch (SQLException ex) {
                Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchMethodException ex) {
                Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvocationTargetException ex) {
                Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos !");
        }

    }//GEN-LAST:event_jBCadastrarCadastrarActionPerformed

    private void jCBEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBEstadosActionPerformed
        if (jCBEstados.getSelectedItem() != null) {

            int pos = (jCBEstados.getSelectedIndex() + 1);

            jCBCidades.removeAllItems();

            GenericDao dao;
            try {
                dao = new GenericDao();

                List cid = dao.listar(cidade.class);
                List<cidade> lista = cid;

                for (int i = 0; i < lista.size(); i++) {
                    cidade cidadee = new cidade();
                    cidadee = lista.get(i);

                    if (cidadee.getCod_estado() == pos) {
                        jCBCidades.addItem(cidadee.getNome_cidade());
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchMethodException ex) {
                Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvocationTargetException ex) {
                Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jCBEstadosActionPerformed

    private void jCBEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBEditarUsuarioActionPerformed
        if (jCBEditarUsuario.getSelectedItem() != null) {

            String pos = (String) (jCBEditarUsuario.getSelectedItem());

            GenericDao dao;
            try {
                dao = new GenericDao();
                List users = dao.listar(Humanos.class);
                List<Humanos> lista = users;

                for (int i = 0; i < lista.size(); i++) {

                    Humanos hum = new Humanos();
                    hum = lista.get(i);

                    if (hum.getNome().equals(pos)) {
                        
                        limparCampos();

                        jTFCadastrarNome.setText(hum.getNome());
                        jTFCadastrarEndereco.setText(hum.getEndereco());
                        if (hum.getGenero().equals("m")) {
                            jRBMasculino.setSelected(true);

                        } else {
                            jRBFeminino.setSelected(true);
                        }
                        jPFCadastrarSenha.setText(hum.getSenha());
                                                int exb_cod = hum.getCod_humanos();
                        jLCod_humano.setText(Integer.toString(hum.getCod_humanos()));

                        int cod_cidade = hum.getCod_cidade();

                        GenericDao daocd = new GenericDao();
                        List cids = daocd.listar(cidade.class);
                        List<cidade> listacd = cids;
                        String nome_cidadee = "";
                        int cod_estadoo = 0;
                        for (int x = 0; x < listacd.size(); x++) {
                            cidade cidf = new cidade();
                            cidf = listacd.get(x);
                            int cod_cidadee = cidf.getCod_cidade();

                            if (cod_cidadee == cod_cidade) {
                                nome_cidadee = cidf.getNome_cidade();
                                cod_estadoo = cidf.getCod_estado();
                            }
                        }

                        GenericDao daoet = new GenericDao();
                        List est1 = daoet.listar(estado.class);
                        List<estado> listaest = est1;
                        String nome_est = "";
                        for (int y = 0; y < listaest.size(); y++) {
                            estado estss = new estado();
                            estss = listaest.get(y);
                            int cod_est = estss.getCod_estado();

                            if (cod_est == cod_estadoo) {
                                nome_est = estss.getUF();
                                                            }
                        }
                        jCBEstados.getModel().setSelectedItem(nome_est);
                        jCBCidades.getModel().setSelectedItem(nome_cidadee);

                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchMethodException ex) {
                Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvocationTargetException ex) {
                Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jCBEditarUsuarioActionPerformed

    private void jBLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLogarActionPerformed
        jTBEditar.setVisible(true);
    }//GEN-LAST:event_jBLogarActionPerformed

    private void jBSalvarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarEditarActionPerformed
        int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar este usuário ?");

        if (confirmacao == 0) {

            String gen;

            if (jRBMasculino.isSelected() == true || jRBFeminino.isSelected() == true) {

                if (jRBMasculino.isSelected() == true) {
                    gen = "m";
                } else {
                    gen = "f";
                }
            } else {
                gen = "na";
            }

            String conf_nome = jTFCadastrarNome.getText();
            String conf_ende = jTFCadastrarEndereco.getText();
            String conf_senha = jPFCadastrarSenha.getText();

            if ((!conf_nome.equals("")) && (!conf_ende.equals("")) && (!conf_senha.equals("")) && (!gen.equals("na"))) {

                try {
                    GenericDao gdAlt = new GenericDao();

                    Humanos hum_alt = new Humanos();

                    hum_alt.setCod_humanos(Integer.parseInt(jLCod_humano.getText()));
                    hum_alt.setNome(jTFCadastrarNome.getText());
                    hum_alt.setEndereco(jTFCadastrarEndereco.getText());
                    hum_alt.setRanking(0); // verificar
                    hum_alt.setGenero(gen);
                    hum_alt.setSenha(jPFCadastrarSenha.getText());

                    String nome_cf = String.valueOf(jCBCidades.getSelectedItem());

                    hum_alt.setCod_cidade(buscarCodCidade(nome_cf));

                    gdAlt.alterar(hum_alt);
                    String n = jTFCadastrarNome.getText();
                    listarUsuarios();
                    jCBEditarUsuario.getModel().setSelectedItem(n);

                } catch (SQLException ex) {
                    Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NoSuchMethodException ex) {
                    Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalArgumentException ex) {
                    Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvocationTargetException ex) {
                    Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Preencha todos os campos !");
            }
        }
    }//GEN-LAST:event_jBSalvarEditarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
         int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este usuário ?");

        if (confirmacao == 0) {
        try {
            GenericDao gdex = new GenericDao();
            Humanos humex = new Humanos();
            
            humex.setCod_humanos(Integer.parseInt(jLCod_humano.getText()));
            
            gdex.excluir(humex);
            listarUsuarios();
        } catch (SQLException ex) {
            Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchFieldException ex) {
            Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }    catch (IllegalAccessException ex) {
                 Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
             } catch (NoSuchMethodException ex) {
                 Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IllegalArgumentException ex) {
                 Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
             } catch (InvocationTargetException ex) {
                 Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
             } catch (InstantiationException ex) {
                 Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
             }
        
        
        }
        
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jTBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBEditarActionPerformed
        if(jTBEditar.isSelected() == true) {
        try {
            listarUsuarios();
            this.setSize(364, 550);
        } catch (SQLException ex) {
            Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
         this.setSize(364, 425);
         limparCampos();
        }
    }//GEN-LAST:event_jTBEditarActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jFCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrarCadastrar;
    private javax.swing.JButton jBCadastrarLimpar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBLogar;
    private javax.swing.JButton jBSalvarEditar;
    private javax.swing.JComboBox<String> jCBCidades;
    private javax.swing.JComboBox<String> jCBEditarUsuario;
    private javax.swing.JComboBox<String> jCBEstados;
    private javax.swing.JLabel jLAlterar;
    private javax.swing.JLabel jLCadastarCidade;
    private javax.swing.JLabel jLCadastrarEndereco;
    private javax.swing.JLabel jLCadastrarNome;
    private javax.swing.JLabel jLCadastrarSenha;
    private javax.swing.JLabel jLCadastrarUF;
    private javax.swing.JLabel jLCadastrarUsuario;
    private javax.swing.JLabel jLCod_humano;
    private javax.swing.JLabel jLGenero;
    private javax.swing.JPasswordField jPFCadastrarSenha;
    private javax.swing.JRadioButton jRBFeminino;
    private javax.swing.JRadioButton jRBMasculino;
    private javax.swing.JToggleButton jTBEditar;
    private javax.swing.JTextField jTFCadastrarEndereco;
    private javax.swing.JTextField jTFCadastrarNome;
    // End of variables declaration//GEN-END:variables

    public void listarEstados() throws SQLException, ClassNotFoundException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, InstantiationException {
        jCBEstados.removeAllItems();

        GenericDao dao = new GenericDao();
        List est = dao.listar(estado.class);

        List<estado> lista = est;

        for (int i = 0; i < lista.size(); i++) {

            estado estadoo = new estado();
            estadoo = lista.get(i);
            jCBEstados.addItem(estadoo.getUF());
        }
    }

    public int buscarCodCidade(String nc) throws IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, InstantiationException {

        GenericDao dao;
        try {
            dao = new GenericDao();

            List cid = dao.listar(cidade.class);

            List<cidade> lista = cid;

            for (int i = 0; i < lista.size(); i++) {
                cidade cidf = new cidade();
                cidf = lista.get(i);
                String nome_cidade = cidf.getNome_cidade();

                if (nome_cidade.equals(nc)) {
                    retorno = cidf.getCod_cidade();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jFCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

    public void limparCampos() {
        jTFCadastrarNome.setText("");
        jTFCadastrarEndereco.setText("");
        jPFCadastrarSenha.setText("");
        jRBMasculino.setSelected(false);
        jRBFeminino.setSelected(false);
    }

    public void listarUsuarios() throws SQLException, ClassNotFoundException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, InstantiationException {

        jCBEditarUsuario.removeAllItems();

        GenericDao dao;

        dao = new GenericDao();

        List users = dao.listar(Humanos.class);

        List<Humanos> lista = users;

        for (int i = 0; i < lista.size(); i++) {
            Humanos userss = new Humanos();
            userss = lista.get(i);
            String nome_user = userss.getNome();
            jCBEditarUsuario.addItem(nome_user);
        }
    }
}
