package com.example;

import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class ExampleResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response hello() {
    return Response.ok(Map.of("test", "Hello from RESTEasy Reactive")).build();
  }
}
