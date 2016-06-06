/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelas;


public class Doencas {
    private int cod_doenca;
    private String nome_doenca;
    private String descricao;    
    /**
     * @return the codigo
     */
    public int getcod_doenca() {
        return cod_doenca;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setcod_doenca(int codigo) {
        this.cod_doenca = codigo;
    }

    /**
     * @return the nome
     */
    public String getnome_doenca() {
        return nome_doenca;
    }

    /**
     * @param nome the nome to set
     */
    public void setnome_doenca(String nome) {
        this.nome_doenca = nome;
    }

    /**
     * @return the descrição
     */
    public String getdescricao() {
        return descricao;
    }

    /**
     * @param descrição the descrição to set
     */
    public void setdescricao(String descrição) {
        this.descricao = descrição;
    }
}
