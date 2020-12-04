package pierce.task.models;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Option extends BaseEntity {

    private String sortOrder;
    private String attribute;

    public Option() {
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Option(String code, String LABEL_IT, String LABEL_EN_GB, String LABEL_EN_IE, String LABEL_PL, String LABEL_NL, String LABEL_NL_BE, String LABEL_NB, String LABEL_FI, String LABEL_EN_US, String LABEL_ES, String LABEL_DE, String LABEL_DE_CHF, String LABEL_DE_AT, String LABEL_DK, String LABEL_FR, String LABEL_SV, String LABEL_CZ, String sortOrder, String attribute) {
        super(code, LABEL_IT, LABEL_EN_GB, LABEL_EN_IE, LABEL_PL, LABEL_NL, LABEL_NL_BE, LABEL_NB, LABEL_FI, LABEL_EN_US, LABEL_ES, LABEL_DE, LABEL_DE_CHF, LABEL_DE_AT, LABEL_DK, LABEL_FR, LABEL_SV, LABEL_CZ);
        this.sortOrder = sortOrder;
        this.attribute = attribute;
    }

    @Override
    public String getCode() {
        return super.getCode();
    }

    @Override
    public void setCode(String code) {
        super.setCode(code);
    }

    @Override
    public String getLABEL_IT() {
        return super.getLABEL_IT();
    }

    @Override
    public void setLABEL_IT(String LABEL_IT) {
        super.setLABEL_IT(LABEL_IT);
    }

    @Override
    public String getLABEL_EN_GB() {
        return super.getLABEL_EN_GB();
    }

    @Override
    public void setLABEL_EN_GB(String LABEL_EN_GB) {
        super.setLABEL_EN_GB(LABEL_EN_GB);
    }

    @Override
    public String getLABEL_EN_IE() {
        return super.getLABEL_EN_IE();
    }

    @Override
    public void setLABEL_EN_IE(String LABEL_EN_IE) {
        super.setLABEL_EN_IE(LABEL_EN_IE);
    }

    @Override
    public String getLABEL_PL() {
        return super.getLABEL_PL();
    }

    @Override
    public void setLABEL_PL(String LABEL_PL) {
        super.setLABEL_PL(LABEL_PL);
    }

    @Override
    public String getLABEL_NL() {
        return super.getLABEL_NL();
    }

    @Override
    public void setLABEL_NL(String LABEL_NL) {
        super.setLABEL_NL(LABEL_NL);
    }

    @Override
    public String getLABEL_NL_BE() {
        return super.getLABEL_NL_BE();
    }

    @Override
    public void setLABEL_NL_BE(String LABEL_NL_BE) {
        super.setLABEL_NL_BE(LABEL_NL_BE);
    }

    @Override
    public String getLABEL_NB() {
        return super.getLABEL_NB();
    }

    @Override
    public void setLABEL_NB(String LABEL_NB) {
        super.setLABEL_NB(LABEL_NB);
    }

    @Override
    public String getLABEL_FI() {
        return super.getLABEL_FI();
    }

    @Override
    public void setLABEL_FI(String LABEL_FI) {
        super.setLABEL_FI(LABEL_FI);
    }

    @Override
    public String getLABEL_EN_US() {
        return super.getLABEL_EN_US();
    }

    @Override
    public void setLABEL_EN_US(String LABEL_EN_US) {
        super.setLABEL_EN_US(LABEL_EN_US);
    }

    @Override
    public String getLABEL_ES() {
        return super.getLABEL_ES();
    }

    @Override
    public void setLABEL_ES(String LABEL_ES) {
        super.setLABEL_ES(LABEL_ES);
    }

    @Override
    public String getLABEL_DE() {
        return super.getLABEL_DE();
    }

    @Override
    public void setLABEL_DE(String LABEL_DE) {
        super.setLABEL_DE(LABEL_DE);
    }

    @Override
    public String getLABEL_DE_CHF() {
        return super.getLABEL_DE_CHF();
    }

    @Override
    public void setLABEL_DE_CHF(String LABEL_DE_CHF) {
        super.setLABEL_DE_CHF(LABEL_DE_CHF);
    }

    @Override
    public String getLABEL_DE_AT() {
        return super.getLABEL_DE_AT();
    }

    @Override
    public void setLABEL_DE_AT(String LABEL_DE_AT) {
        super.setLABEL_DE_AT(LABEL_DE_AT);
    }

    @Override
    public String getLABEL_DK() {
        return super.getLABEL_DK();
    }

    @Override
    public void setLABEL_DK(String LABEL_DK) {
        super.setLABEL_DK(LABEL_DK);
    }

    @Override
    public String getLABEL_FR() {
        return super.getLABEL_FR();
    }

    @Override
    public void setLABEL_FR(String LABEL_FR) {
        super.setLABEL_FR(LABEL_FR);
    }

    @Override
    public String getLABEL_SV() {
        return super.getLABEL_SV();
    }

    @Override
    public void setLABEL_SV(String LABEL_SV) {
        super.setLABEL_SV(LABEL_SV);
    }

    @Override
    public String getLABEL_CZ() {
        return super.getLABEL_CZ();
    }

    @Override
    public void setLABEL_CZ(String LABEL_CZ) {
        super.setLABEL_CZ(LABEL_CZ);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Option)) return false;
        Option option = (Option) o;
        return sortOrder.equals(option.sortOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sortOrder);
    }


}
