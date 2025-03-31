package it.epicode.classi;

import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
public class Tessera  { // tessera

    @Id
    private String numeroTessera;
    private LocalDate dataDiEmissione;
    private LocalDate dataDiScadenza;

    public Tessera(String numeroTessera, LocalDate dataDiEmissione) {
        this.numeroTessera = numeroTessera;
        this.dataDiScadenza = dataDiEmissione.plusYears(1);
        this.dataDiEmissione = dataDiEmissione;
    }

    public boolean isValid() {
        return LocalDate.now().isBefore(dataDiScadenza);  //metodo per vedere se la tessera è valida
    }


}
