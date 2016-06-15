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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCadastrarNome)
                            .addComponent(jLCadastrarEndereco)
                            .addComponent(jLCadastarCidade)
                            .addComponent(jLCadastrarSenha)
                            .addComponent(jLGenero))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBMasculino)
                                .addGap(18, 18, 18)
                                .addComponent(jRBFeminino))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jCBCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLCadastrarUF)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCBEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTFCadastrarEndereco)
                                .addComponent(jTFCadastrarNome))
                            .addComponent(jPFCadastrarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLCadastrarUsuario)))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBCadastrarLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBCadastrarCadastrar)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLCadastrarUsuario)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCadastrarNome)
                    .addComponent(jTFCadastrarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCadastrarEndereco)
                    .addComponent(jTFCadastrarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCadastarCidade)
                    .addComponent(jCBCidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCadastrarUF))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLGenero)
                    .addComponent(jRBMasculino)
                    .addComponent(jRBFeminino))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCadastrarSenha)
                    .addComponent(jPFCadastrarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrarLimpar)
                    .addComponent(jBCadastrarCadastrar))
                .addContainerGap())
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
            jTFCadastrarNome.setText("");
            jTFCadastrarEndereco.setText("");
            jPFCadastrarSenha.setText("");
            jRBMasculino.setSelected(false);
            jRBFeminino.setSelected(false);
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

                // usuario.setCod_humanos(8); nao precisa
                usuario.setNome(jTFCadastrarNome.getText());
                usuario.setEndereco(jTFCadastrarEndereco.getText());
                usuario.setRanking(0); // verificar
                usuario.setGenero(gen);
                usuario.setSenha(jPFCadastrarSenha.getText());

                String nome_cf = String.valueOf(jCBCidades.getSelectedItem());

                usuario.setCod_cidade(buscarCodCidade(nome_cf));

                gd.adicionar(usuario);

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
    private javax.swing.JComboBox<String> jCBCidades;
    private javax.swing.JComboBox<String> jCBEstados;
    private javax.swing.JLabel jLCadastarCidade;
    private javax.swing.JLabel jLCadastrarEndereco;
    private javax.swing.JLabel jLCadastrarNome;
    private javax.swing.JLabel jLCadastrarSenha;
    private javax.swing.JLabel jLCadastrarUF;
    private javax.swing.JLabel jLCadastrarUsuario;
    private javax.swing.JLabel jLGenero;
    private javax.swing.JPasswordField jPFCadastrarSenha;
    private javax.swing.JRadioButton jRBFeminino;
    private javax.swing.JRadioButton jRBMasculino;
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

}
