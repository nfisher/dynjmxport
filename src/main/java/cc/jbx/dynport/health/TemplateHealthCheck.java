package cc.jbx.dynport.health;

import com.codahale.metrics.health.HealthCheck;

/**
 * Created by nathan.fisher on 25/11/14.
 */
public class TemplateHealthCheck extends HealthCheck {
    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
