package cc.jbx.dynport.core;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DynPort {
    private String message;

    public DynPort() {

    }

    public DynPort(String message) {
        this.message = message;
    }

    @JsonProperty
    public String getMessage() {
        return message;
    }
}
