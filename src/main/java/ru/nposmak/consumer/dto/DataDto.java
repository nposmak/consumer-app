package ru.nposmak.consumer.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Builder
@Data
public class DataDto implements Serializable {

    private List<PressureDto> pressureDto;
    private List<VolumeDto> volumeDto;

}
