package uebunng4;

import java.io.Serializable;

public class DBResult implements Serializable {

    private String value;

    public DBResult() {

    }

    public DBResult(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this.value == null || ((DBResult) obj).value == null) {
            return this.value == ((DBResult) obj).value;
        } else {
            return this.value.equals(((DBResult) obj).value);
        }
    }
}
