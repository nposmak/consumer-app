package ru.nposmak.consumer.service;

import ru.nposmak.consumer.dto.PressureDto;
import ru.nposmak.consumer.dto.VolumeDto;

import java.util.List;

public interface SaveParamService {
    void saveParams(List<PressureDto> pressureDto, List<VolumeDto> volumeDto);
}
