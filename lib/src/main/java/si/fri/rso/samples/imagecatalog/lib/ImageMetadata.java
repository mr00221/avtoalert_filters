package si.fri.rso.samples.imagecatalog.lib;

import java.time.Instant;

public class ImageMetadata {

    private Integer filterId;
    private Integer userId;
    private String znamka;
    private String model;
    private Integer cena_od;
    private Integer cena_do;
    private Integer letnik_od;
    private Integer letnik_do;


    public Integer getFilterId() {
        return filterId;
    }

    public void setFilterId(Integer filterId) {
        this.filterId = filterId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getZnamka() {
        return znamka;
    }

    public void setZnamka(String znamka) {
        this.znamka = znamka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getCena_od() {
        return cena_od;
    }

    public void setCena_od(Integer cena_od) {
        this.cena_od = cena_od;
    }

    public Integer getCena_do() {
        return cena_do;
    }

    public void setCena_do(Integer cena_do) {
        this.cena_do = cena_do;
    }

    public Integer getLetnik_od() {
        return letnik_od;
    }

    public void setLetnik_od(Integer letnik_od) {
        this.letnik_od = letnik_od;
    }

    public Integer getLetnik_do() {
        return letnik_do;
    }

    public void setLetnik_do(Integer letnik_do) {
        this.letnik_do = letnik_do;
    }
}
