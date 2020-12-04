package pierce.task.models;

public enum LabelTypes {

    LABEL_IT("label-it_IT"),
    LABEL_EN_GB("label-en_GB"),
    LABEL_EN_IE("label-en_IE"),
    LABEL_PL("label-pl_PL"),
    LABEL_NL("label-nl_NL"),
    LABEL_NL_BE("label-nl_BE"),
    LABEL_NB("label-nb_NO"),
    LABEL_FI("label-fi_FI"),
    LABEL_EN_US("label-en_US"),
    LABEL_ES("label-es_ES"),
    LABEL_DE("label-de_DE"),
    LABEL_DE_CHF("label-de_CH"),
    LABEL_DE_AT("label-de_AT"),
    LABEL_DK("label-da_DK"),
    LABEL_FR("label-fr_FR"),
    LABEL_SV("label-sv_SE"),
    LABEL_CZ("label-cs_CZ");

    private String prefix = "label-";
    private String labelType;
    public String getLabelType() {
        return labelType;
    }

    LabelTypes(String labelType) {
        this.labelType = labelType;
    }
}
