package ru.nposmak.consumer.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Table(name="app_pressure_measurements")
@Entity(name = "app_pressure_measurements")
public class PressureMeasurements {
    @Id
    @SequenceGenerator(name = "pressure_meas_seq", sequenceName = "pressure_meas_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pressure_meas_seq")
    @Column(name = "id")
    private Long id;

    @Column(name = "orig")
    private String orig;

    @Column(name = "measure_timestamp")
    private LocalDateTime measureTimestamp;

    @Column(name = "value")
    private Double value;

}
