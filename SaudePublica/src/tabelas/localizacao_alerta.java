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
public class localizacao_alerta {
    private int cod_localizacao;
    private float cord_lat;
    private float cord_log;
    private int cod_alerta;

    /**
     * @return the cod_localizacao
     */
    public int getCod_localizacao() {
        return cod_localizacao;
    }

    /**
     * @param cod_localizacao the cod_localizacao to set
     */
    public void setCod_localizacao(int cod_localizacao) {
        this.cod_localizacao = cod_localizacao;
    }

    /**
     * @return the cord_lat
     */
    public float getCord_lat() {
        return cord_lat;
    }

    /**
     * @param cord_lat the cord_lat to set
     */
    public void setCord_lat(float cord_lat) {
        this.cord_lat = cord_lat;
    }

    /**
     * @return the cord_log
     */
    public float getCord_log() {
        return cord_log;
    }

    /**
     * @param cord_log the cord_log to set
     */
    public void setCord_log(float cord_log) {
        this.cord_log = cord_log;
    }

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
}
