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
public class estado {
    private int cod_estado;
    private String UF;
    private String nome_estado;
    

    /**
     * @return the cod_estado
     */
    public int getCod_estado() {
        return cod_estado;
    }

    /**
     * @param cod_estado the cod_estado to set
     */
    public void setCod_estado(int cod_estado) {
        this.cod_estado = cod_estado;
    }

    /**
     * @return the nome_estado
     */
    public String getNome_estado() {
        return nome_estado;
    }

    /**
     * @param nome_estado the nome_estado to set
     */
    public void setNome_estado(String nome_estado) {
        this.nome_estado = nome_estado;
    }

    /**
     * @return the UF
     */
    public String getUF() {
        return UF;
    }

    /**
     * @param UF the UF to set
     */
    public void setUF(String UF) {
        this.UF = UF;
    }
    
    
}
