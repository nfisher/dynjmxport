package cc.jbx.dynport.resources;

import cc.jbx.dynport.core.DynPort;
import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class RootResource {
    private final String defaultName;

    public RootResource(String defaultName) {
        this.defaultName = defaultName;
    }

    @GET
    @Timed
    public DynPort getRoot(@QueryParam("message")Optional<String> message) {
        return new DynPort(message.or(defaultName));
    }
}
