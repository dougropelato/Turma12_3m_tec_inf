/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelas;

/**
 *
 * @author Bruno
 */
public class Alertas {
    private int cod_alerta;
    private String descricao;
    private String cor_alerta;

    /**
     * @return the cod_alerta
     */
    public int getCod_alerta() {
        return cod_alerta;
    }

    /**
     * @param cod_alerta the cod_alerta to set
     */
    public void setCod_alerta(int cod_alerta) {
        this.cod_alerta = cod_alerta;
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

    /**
     * @return the cor_alerta
     */
    public String getCor_alerta() {
        return cor_alerta;
    }

    /**
     * @param cor_alerta the cor_alerta to set
     */
    public void setCor_alerta(String cor_alerta) {
        this.cor_alerta = cor_alerta;
    }
}
