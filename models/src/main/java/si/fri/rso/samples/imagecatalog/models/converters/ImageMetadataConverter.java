package si.fri.rso.samples.imagecatalog.models.converters;

import si.fri.rso.samples.imagecatalog.lib.ImageMetadata;
import si.fri.rso.samples.imagecatalog.models.entities.ImageMetadataEntity;

public class ImageMetadataConverter {

    public static ImageMetadata toDto(ImageMetadataEntity entity) {

        ImageMetadata dto = new ImageMetadata();
        dto.setFilterId(entity.getFilterId());
        dto.setUserId(entity.getUserId());
        dto.setZnamka(entity.getZnamka());
        dto.setModel(entity.getModel());
        dto.setCena_od(entity.getCena_od());
        dto.setCena_do(entity.getCena_do());
        dto.setLetnik_od(entity.getLetnik_do());
        dto.setLetnik_do(entity.getLetnik_do());

        return dto;

    }

    public static ImageMetadataEntity toEntity(ImageMetadata dto) {

        ImageMetadataEntity entity = new ImageMetadataEntity();
        entity.setUserId(dto.getUserId());
        entity.setZnamka(dto.getZnamka());
        entity.setModel(dto.getModel());
        entity.setCena_od(dto.getCena_od());
        entity.setCena_do(dto.getCena_do());
        entity.setLetnik_od(dto.getLetnik_od());
        entity.setLetnik_do(dto.getLetnik_do());

        return entity;

    }

}
