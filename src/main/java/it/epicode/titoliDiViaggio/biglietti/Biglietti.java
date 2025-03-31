package it.epicode.titoliDiViaggio.biglietti;

import it.epicode.titoliDiViaggio.TitoloDiViaggio;

import java.time.LocalDate;


public class Biglietti extends TitoloDiViaggio {

    private boolean vidimato;
    private LocalDate dataEmissione;

    public Biglietti(Long codiceUnivoco, LocalDate dataEmissione, boolean vidimato) {
        super(codiceUnivoco);
        this.dataEmissione = dataEmissione;
        this.vidimato = vidimato;
    }
}
