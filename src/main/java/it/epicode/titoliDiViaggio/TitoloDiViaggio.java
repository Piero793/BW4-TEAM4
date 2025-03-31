package it.epicode.titoliDiViaggio;

import jakarta.persistence.Id;

public abstract class TitoloDiViaggio {

    @Id
    private Long codiceUnivoco;

    public TitoloDiViaggio(Long codiceUnivoco) {
        this.codiceUnivoco = codiceUnivoco;
    }
}
