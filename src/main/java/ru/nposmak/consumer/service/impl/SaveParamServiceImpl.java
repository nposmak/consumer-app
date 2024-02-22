package ru.nposmak.consumer.service.impl;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.nposmak.consumer.dto.PressureDto;
import ru.nposmak.consumer.dto.VolumeDto;
import ru.nposmak.consumer.model.PressureMeasurements;
import ru.nposmak.consumer.model.VolumeMeasurements;
import ru.nposmak.consumer.repository.PressureMeasurementsRepo;
import ru.nposmak.consumer.repository.VolumeMeasurementsRepo;
import ru.nposmak.consumer.service.SaveParamService;

import java.util.List;

@Slf4j
@Data
@Service
public class SaveParamServiceImpl implements SaveParamService {

    private final PressureMeasurementsRepo pressureMeasRepo;
    private final VolumeMeasurementsRepo volumeMeasRepo;
    private ModelMapper mapper = new ModelMapper();

    @Override
    public void saveParams(List<PressureDto> pressureDto, List<VolumeDto> volumeDto) {
        if(pressureDto != null && volumeDto != null) {
            List<PressureMeasurements> pressureMeas = pressureDto.stream().map(dto -> mapper.map(dto, PressureMeasurements.class)).toList();
            List<VolumeMeasurements> volumeMeas = volumeDto.stream().map(dto -> mapper.map(dto, VolumeMeasurements.class)).toList();
            List<PressureMeasurements> savedPr = pressureMeasRepo.saveAll(pressureMeas);
            List<VolumeMeasurements> savedVol = volumeMeasRepo.saveAll(volumeMeas);
            log.info(String.format("В таблицу app_pressure_measurements добавлено записей: %s  В таблицу app_volume_measurements добавлено записей: %s",
                    savedPr.size(), savedVol.size()));
        }
    }
}
