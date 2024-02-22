package ru.nposmak.consumer.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Table(name="app_volume_measurements")
@Entity(name = "app_volume_measurements")
public class VolumeMeasurements {
    @Id
    @SequenceGenerator(name = "volume_meas_seq", sequenceName = "volume_meas_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "volume_meas_seq")
    @Column(name = "id")
    private Long id;

    @Column(name = "orig")
    private String orig;

    @Column(name = "measure_timestamp")
    private LocalDateTime measureTimestamp;

    @Column(name = "value")
    private Double value;
}
