package cc.jbx.dynport;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class Configuration extends io.dropwizard.Configuration {
    @NotEmpty
    private String defaultName = "DynPort";

    @JsonProperty
    public void setDefaultName(String defaultName) { this.defaultName = defaultName; }

    @JsonProperty
    public String getDefaultName() {
        return defaultName;
    }
}
