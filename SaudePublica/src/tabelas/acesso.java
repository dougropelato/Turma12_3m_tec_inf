/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelas;

/**
 *
 * @author Eduardo
 */
public class acesso {
    private String login;
    private String senha;
    private int codigo_humanos;
    private int codigo_nivel;

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the codigo_humanos
     */
    public int getCodigo_humanos() {
        return codigo_humanos;
    }

    /**
     * @param codigo_humanos the codigo_humanos to set
     */
    public void setCodigo_humanos(int codigo_humanos) {
        this.codigo_humanos = codigo_humanos;
    }

    /**
     * @return the codigo_nivel
     */
    public int getCodigo_nivel() {
        return codigo_nivel;
    }

    /**
     * @param codigo_nivel the codigo_nivel to set
     */
    public void setCodigo_nivel(int codigo_nivel) {
        this.codigo_nivel = codigo_nivel;
    }
}
