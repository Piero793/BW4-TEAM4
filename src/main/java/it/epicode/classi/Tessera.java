package it.epicode.classi;

import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;


@Data
public class Tessera  {

    @Id
    private String numeroTessera;
    private LocalDate dataDiEmissione;
    private LocalDate dataDiScadenza;

    public Tessera(String numeroTessera, LocalDate dataDiEmissione) {
        this.numeroTessera = numeroTessera;
        this.dataDiScadenza = dataDiEmissione.plusYears(1);
        this.dataDiEmissione = dataDiEmissione;
    }


}
