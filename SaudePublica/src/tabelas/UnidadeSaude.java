/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelas;

/**
 *
 * @author Micro06
 */
public class UnidadeSaude {
    private int cod_unidade_de_saude;
    private int nome_unidade_saude;
    private int cord_lat;
    private int cord_long;
    private int cod_humanos;

    /**
     * @return the cod_unidade_de_saude
     */
    public int getCod_unidade_de_saude() {
        return cod_unidade_de_saude;
    }

    /**
     * @param cod_unidade_de_saude the cod_unidade_de_saude to set
     */
    public void setCod_unidade_de_saude(int cod_unidade_de_saude) {
        this.cod_unidade_de_saude = cod_unidade_de_saude;
    }

    /**
     * @return the nome_unidade_saude
     */
    public int getNome_unidade_saude() {
        return nome_unidade_saude;
    }

    /**
     * @param nome_unidade_saude the nome_unidade_saude to set
     */
    public void setNome_unidade_saude(int nome_unidade_saude) {
        this.nome_unidade_saude = nome_unidade_saude;
    }

    /**
     * @return the cord_lat
     */
    public int getCord_lat() {
        return cord_lat;
    }

    /**
     * @param cord_lat the cord_lat to set
     */
    public void setCord_lat(int cord_lat) {
        this.cord_lat = cord_lat;
    }

    /**
     * @return the cord_long
     */
    public int getCord_long() {
        return cord_long;
    }

    /**
     * @param cord_long the cord_long to set
     */
    public void setCord_long(int cord_long) {
        this.cord_long = cord_long;
    }

    /**
     * @return the cod_humanos
     */
    public int getCod_humanos() {
        return cod_humanos;
    }

    /**
     * @param cod_humanos the cod_humanos to set
     */
    public void setCod_humanos(int cod_humanos) {
        this.cod_humanos = cod_humanos;
    }
}
