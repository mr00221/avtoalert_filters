package si.fri.rso.samples.imagecatalog.models.entities;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "image_metadata")
@NamedQueries(value =
        {
                @NamedQuery(name = "ImageMetadataEntity.getAll",
                        query = "SELECT im FROM ImageMetadataEntity im")
        })
public class ImageMetadataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer filterId;

    @Column(name = "userId")
    private Integer userId;

    @Column(name = "znamka")
    private String znamka;

    @Column(name = "model")
    private String model;

    @Column(name = "cena_od")
    private Integer cena_od;

    @Column(name = "cena_do")
    private Integer cena_do;

    @Column(name = "letnik_od")
    private Integer letnik_od;

    @Column(name = "letnik_do")
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