package it.epicode.titoliDiViaggio.abbonamenti;

import it.epicode.titoliDiViaggio.TitoloDiViaggio;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;



public class Abbonamento extends TitoloDiViaggio {


    @Enumerated(EnumType.STRING)
    private TipoDiAbbonamento tipoDiAbbonamento;

    public Abbonamento(Long codiceUnivoco, TipoDiAbbonamento tipoDiAbbonamento) {
        super(codiceUnivoco);
        this.tipoDiAbbonamento = tipoDiAbbonamento;
    }
}
