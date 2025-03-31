package it.epicode.classi;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

public class Route {

    @Getter
    @Id
    private Long id;

    @Setter
    @Getter
    private String departureArea;

    @Setter
    @Getter
    private String arrivalArea;

    @Setter
    @Getter
    private int expectedTime;

    public Route() {}

    public Route(Long id, String departureArea, String arrivalArea, int expectedTime) {
        this.id = id;
        this.departureArea = departureArea;
        this.arrivalArea = arrivalArea;
        this.expectedTime = expectedTime;
    }

}
