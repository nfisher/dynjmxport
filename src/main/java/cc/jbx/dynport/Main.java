package cc.jbx.dynport;

import cc.jbx.dynport.health.TemplateHealthCheck;
import cc.jbx.dynport.resources.RootResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class Main extends Application<Configuration> {
    public static void main(String[] args) throws Exception {
        new Main().run(args);
    }

    @Override
    public String getName() {
        return "dynport";
    }

    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {

    }

    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {
        final RootResource rootResource = new RootResource(configuration.getDefaultName());
        final TemplateHealthCheck healthCheck = new TemplateHealthCheck();

        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(rootResource);
    }
}
