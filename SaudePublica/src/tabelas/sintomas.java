/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelas;

/**
 *
 * @author User
 */
public class sintomas {
    
    private int cod_sintoma;
    private String nome_sintoma;
    private String descricao;

    /**
     * @return the cod_sintoma
     */
    public int getCod_sintoma() {
        return cod_sintoma;
    }

    /**
     * @param cod_sintoma the cod_sintoma to set
     */
    public void setCod_sintoma(int cod_sintoma) {
        this.cod_sintoma = cod_sintoma;
    }

    /**
     * @return the nome_sintoma
     */
    public String getNome_sintoma() {
        return nome_sintoma;
    }

    /**
     * @param nome_sintoma the nome_sintoma to set
     */
    public void setNome_sintoma(String nome_sintoma) {
        this.nome_sintoma = nome_sintoma;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
