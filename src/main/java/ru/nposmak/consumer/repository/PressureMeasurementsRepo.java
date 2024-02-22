package ru.nposmak.consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nposmak.consumer.model.PressureMeasurements;

@Repository
public interface PressureMeasurementsRepo extends JpaRepository<PressureMeasurements, Long> {
}
