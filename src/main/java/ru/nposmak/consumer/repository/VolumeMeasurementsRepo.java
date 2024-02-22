package ru.nposmak.consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nposmak.consumer.model.VolumeMeasurements;

@Repository
public interface VolumeMeasurementsRepo extends JpaRepository<VolumeMeasurements, Long> {
}
