package jiratests.enums;

public enum JiraTestData {
    USERNAME("changeMe"),
    PASSWORD("changeMe");

    final String value;

    JiraTestData(String propName) {
        value = propName;
    }

    public String getValue(){
        return value;
    }


}
