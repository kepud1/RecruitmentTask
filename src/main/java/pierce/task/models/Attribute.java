package pierce.task.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Attribute extends BaseEntity{

    @OneToMany(
            mappedBy = "attribute",
    cascade = CascadeType.ALL)
    private Set<Option> optionsList = new HashSet<>();

    public Attribute() {

    }

    public Attribute(String code, String LABEL_IT, String LABEL_EN_GB, String LABEL_EN_IE, String LABEL_PL, String LABEL_NL, String LABEL_NL_BE, String LABEL_NB, String LABEL_FI, String LABEL_EN_US, String LABEL_ES, String LABEL_DE, String LABEL_DE_CHF, String LABEL_DE_AT, String LABEL_DK, String LABEL_FR, String LABEL_SV, String LABEL_CZ, Set<Option> optionsList) {
        super(code, LABEL_IT, LABEL_EN_GB, LABEL_EN_IE, LABEL_PL, LABEL_NL, LABEL_NL_BE, LABEL_NB, LABEL_FI, LABEL_EN_US, LABEL_ES, LABEL_DE, LABEL_DE_CHF, LABEL_DE_AT, LABEL_DK, LABEL_FR, LABEL_SV, LABEL_CZ);
        this.optionsList = optionsList;
    }

    public void addOption(Option option) {
        this.optionsList.add(option);
        setOptionsList(this.optionsList);
    }

    public Set<Option> getOptionsList() {
        return optionsList;
    }

    public void setOptionsList(Set<Option> optionsList) {
        this.optionsList = optionsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Attribute)) return false;
        if (!super.equals(o)) return false;
        Attribute attribute = (Attribute) o;
        return Objects.equals(optionsList, attribute.optionsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), optionsList);
    }

    @Override
    public String toString() {
        return "Attribute{" +
                "optionsList=" + optionsList +
                '}';
    }
}
