package it.epicode.classi;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

public class Tratta {

    @Getter
    @Id
    private Long id;

    @Setter
    @Getter
    private String zonaPartenza;

    @Setter
    @Getter
    private String capolinea;

    @Setter
    @Getter
    private int tempoPrevisto;

    public Tratta() {}

    public Tratta(Long id, String zonaPartenza, String capolinea, int tempoPrevisto) {
        this.id = id;
        this.zonaPartenza = zonaPartenza;
        this.capolinea = capolinea;
        this.tempoPrevisto = tempoPrevisto;
    }
}
