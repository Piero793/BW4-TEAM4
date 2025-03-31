package it.epicode.classi;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
    @NoArgsConstructor
    public class Utente {

        private Long idUtente;
        private String nome;
        private String cognome;
        private Tessera tessera; // Associazione con la classe Tessera

        public Utente(Long idUtente, String nome, String cognome, Tessera tessera) {
            this.idUtente = idUtente;
            this.nome = nome;
            this.cognome = cognome;
            this.tessera = tessera;
        }

        // Metodo per verificare la validità della tessera associata
        public boolean isTesseraValida() {
            return tessera.isValid(); // Utilizza il metodo isValid() della classe Tessera
        }
    }

