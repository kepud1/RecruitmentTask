package pierce.task.models;

import org.springframework.lang.NonNull;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Objects;

@MappedSuperclass
public class BaseEntity {

    @Id
    @NonNull
    private String code;
    private String LABEL_IT;
    private String LABEL_EN_GB;
    private String LABEL_EN_IE;
    private String LABEL_PL;
    private String LABEL_NL;
    private String LABEL_NL_BE;
    private String LABEL_NB;
    private String LABEL_FI;
    private String LABEL_EN_US;
    private String LABEL_ES;
    private String LABEL_DE;
    private String LABEL_DE_CHF;
    private String LABEL_DE_AT;
    private String LABEL_DK;
    private String LABEL_FR;
    private String LABEL_SV;
    private String LABEL_CZ;


    public BaseEntity() {
    }

    public BaseEntity(String code, String LABEL_IT, String LABEL_EN_GB, String LABEL_EN_IE, String LABEL_PL, String LABEL_NL, String LABEL_NL_BE, String LABEL_NB, String LABEL_FI, String LABEL_EN_US, String LABEL_ES, String LABEL_DE, String LABEL_DE_CHF, String LABEL_DE_AT, String LABEL_DK, String LABEL_FR, String LABEL_SV, String LABEL_CZ) {
        this.code = code;
        this.LABEL_IT = LABEL_IT;
        this.LABEL_EN_GB = LABEL_EN_GB;
        this.LABEL_EN_IE = LABEL_EN_IE;
        this.LABEL_PL = LABEL_PL;
        this.LABEL_NL = LABEL_NL;
        this.LABEL_NL_BE = LABEL_NL_BE;
        this.LABEL_NB = LABEL_NB;
        this.LABEL_FI = LABEL_FI;
        this.LABEL_EN_US = LABEL_EN_US;
        this.LABEL_ES = LABEL_ES;
        this.LABEL_DE = LABEL_DE;
        this.LABEL_DE_CHF = LABEL_DE_CHF;
        this.LABEL_DE_AT = LABEL_DE_AT;
        this.LABEL_DK = LABEL_DK;
        this.LABEL_FR = LABEL_FR;
        this.LABEL_SV = LABEL_SV;
        this.LABEL_CZ = LABEL_CZ;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLABEL_IT() {
        return LABEL_IT;
    }

    public void setLABEL_IT(String LABEL_IT) {
        this.LABEL_IT = LABEL_IT;
    }

    public String getLABEL_EN_GB() {
        return LABEL_EN_GB;
    }

    public void setLABEL_EN_GB(String LABEL_EN_GB) {
        this.LABEL_EN_GB = LABEL_EN_GB;
    }

    public String getLABEL_EN_IE() {
        return LABEL_EN_IE;
    }

    public void setLABEL_EN_IE(String LABEL_EN_IE) {
        this.LABEL_EN_IE = LABEL_EN_IE;
    }

    public String getLABEL_PL() {
        return LABEL_PL;
    }

    public void setLABEL_PL(String LABEL_PL) {
        this.LABEL_PL = LABEL_PL;
    }

    public String getLABEL_NL() {
        return LABEL_NL;
    }

    public void setLABEL_NL(String LABEL_NL) {
        this.LABEL_NL = LABEL_NL;
    }

    public String getLABEL_NL_BE() {
        return LABEL_NL_BE;
    }

    public void setLABEL_NL_BE(String LABEL_NL_BE) {
        this.LABEL_NL_BE = LABEL_NL_BE;
    }

    public String getLABEL_NB() {
        return LABEL_NB;
    }

    public void setLABEL_NB(String LABEL_NB) {
        this.LABEL_NB = LABEL_NB;
    }

    public String getLABEL_FI() {
        return LABEL_FI;
    }

    public void setLABEL_FI(String LABEL_FI) {
        this.LABEL_FI = LABEL_FI;
    }

    public String getLABEL_EN_US() {
        return LABEL_EN_US;
    }

    public void setLABEL_EN_US(String LABEL_EN_US) {
        this.LABEL_EN_US = LABEL_EN_US;
    }

    public String getLABEL_ES() {
        return LABEL_ES;
    }

    public void setLABEL_ES(String LABEL_ES) {
        this.LABEL_ES = LABEL_ES;
    }

    public String getLABEL_DE() {
        return LABEL_DE;
    }

    public void setLABEL_DE(String LABEL_DE) {
        this.LABEL_DE = LABEL_DE;
    }

    public String getLABEL_DE_CHF() {
        return LABEL_DE_CHF;
    }

    public void setLABEL_DE_CHF(String LABEL_DE_CHF) {
        this.LABEL_DE_CHF = LABEL_DE_CHF;
    }

    public String getLABEL_DE_AT() {
        return LABEL_DE_AT;
    }

    public void setLABEL_DE_AT(String LABEL_DE_AT) {
        this.LABEL_DE_AT = LABEL_DE_AT;
    }

    public String getLABEL_DK() {
        return LABEL_DK;
    }

    public void setLABEL_DK(String LABEL_DK) {
        this.LABEL_DK = LABEL_DK;
    }

    public String getLABEL_FR() {
        return LABEL_FR;
    }

    public void setLABEL_FR(String LABEL_FR) {
        this.LABEL_FR = LABEL_FR;
    }

    public String getLABEL_SV() {
        return LABEL_SV;
    }

    public void setLABEL_SV(String LABEL_SV) {
        this.LABEL_SV = LABEL_SV;
    }

    public String getLABEL_CZ() {
        return LABEL_CZ;
    }

    public void setLABEL_CZ(String LABEL_CZ) {
        this.LABEL_CZ = LABEL_CZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseEntity)) return false;
        BaseEntity that = (BaseEntity) o;
        return code.equals(that.code) && LABEL_IT.equals(that.LABEL_IT) && LABEL_EN_GB.equals(that.LABEL_EN_GB) && LABEL_EN_IE.equals(that.LABEL_EN_IE) && LABEL_PL.equals(that.LABEL_PL) && LABEL_NL.equals(that.LABEL_NL) && LABEL_NL_BE.equals(that.LABEL_NL_BE) && LABEL_NB.equals(that.LABEL_NB) && LABEL_FI.equals(that.LABEL_FI) && LABEL_EN_US.equals(that.LABEL_EN_US) && LABEL_ES.equals(that.LABEL_ES) && LABEL_DE.equals(that.LABEL_DE) && LABEL_DE_CHF.equals(that.LABEL_DE_CHF) && LABEL_DE_AT.equals(that.LABEL_DE_AT) && LABEL_DK.equals(that.LABEL_DK) && LABEL_FR.equals(that.LABEL_FR) && LABEL_SV.equals(that.LABEL_SV) && LABEL_CZ.equals(that.LABEL_CZ);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, LABEL_IT, LABEL_EN_GB, LABEL_EN_IE, LABEL_PL, LABEL_NL, LABEL_NL_BE, LABEL_NB, LABEL_FI, LABEL_EN_US, LABEL_ES, LABEL_DE, LABEL_DE_CHF, LABEL_DE_AT, LABEL_DK, LABEL_FR, LABEL_SV, LABEL_CZ);
    }
}
