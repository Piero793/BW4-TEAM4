package it.epicode.classi;

import jakarta.persistence.*;

public class Route {

    @Id
    private Long id;

    private String departureArea;
    private String arrivalArea;
    private int expectedTime;


}
