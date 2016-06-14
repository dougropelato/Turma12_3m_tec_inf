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
public class historico_avaliacao {
    private int cod_diagnostico;
    private String dATA_hora;
    private int cod_humanos;
    private int cod_doenca;

    /**
     * @return the cod_diagnostico
     */
    public int getCod_diagnostico() {
        return cod_diagnostico;
    }

    /**
     * @param cod_diagnostico the cod_diagnostico to set
     */
    public void setCod_diagnostico(int cod_diagnostico) {
        this.cod_diagnostico = cod_diagnostico;
    }

    /**
     * @return the dATA_hora
     */
    public String getdATA_hora() {
        return dATA_hora;
    }

    /**
     * @param dATA_hora the dATA_hora to set
     */
    public void setdATA_hora(String dATA_hora) {
        this.dATA_hora = dATA_hora;
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

    /**
     * @return the cod_doenca
     */
    public int getCod_doenca() {
        return cod_doenca;
    }

    /**
     * @param cod_doenca the cod_doenca to set
     */
    public void setCod_doenca(int cod_doenca) {
        this.cod_doenca = cod_doenca;
    }
}
