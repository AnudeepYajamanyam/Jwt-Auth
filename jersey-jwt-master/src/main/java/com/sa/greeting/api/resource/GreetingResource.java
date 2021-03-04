package com.sa.greeting.api.resource;

import javax.annotation.security.PermitAll;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.sa.greeting.service.GreetingService;

/**
 * JAX-RS resource class that provides operations for greetings.
 *
 * @author cassiomolin
 */
@RequestScoped
@Path("greetings")
public class GreetingResource {

    @Context
    private SecurityContext securityContext;

    @Inject
    private GreetingService greetingService;

    @GET
    @Path("public")
    @Produces(MediaType.TEXT_PLAIN)
    @PermitAll
    public Response getPublicGreeting() {
        return Response.ok(greetingService.getPublicGreeting()).build();
    }

// Write a method to get a greeting for the specific user
// Authentication and USER role are required to perform this operation.


}