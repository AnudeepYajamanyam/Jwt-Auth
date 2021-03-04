package com.sa.common.api.config;

import org.glassfish.jersey.server.ResourceConfig;

import com.sa.common.api.provider.ObjectMapperProvider;
import com.sa.greeting.api.resource.GreetingResource;
import com.sa.security.api.exeptionmapper.AccessDeniedExceptionMapper;
import com.sa.security.api.exeptionmapper.AuthenticationExceptionMapper;
import com.sa.security.api.exeptionmapper.AuthenticationTokenRefreshmentExceptionMapper;
import com.sa.security.api.filter.AuthenticationFilter;
import com.sa.security.api.filter.AuthorizationFilter;
import com.sa.security.api.resource.AuthenticationResource;
import com.sa.user.api.resource.UserResource;

import javax.ws.rs.ApplicationPath;

/**
 * Jersey configuration class.
 *
 * @author cassiomolin
 */
@ApplicationPath("api")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {

        register(AuthenticationResource.class);
        register(GreetingResource.class);
        register(UserResource.class);

        register(AuthenticationFilter.class);
        register(AuthorizationFilter.class);

        register(AccessDeniedExceptionMapper.class);
        register(AuthenticationExceptionMapper.class);
        register(AuthenticationTokenRefreshmentExceptionMapper.class);

        register(ObjectMapperProvider.class);
    }
}