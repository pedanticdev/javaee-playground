package com.airhacks.ping.boundary;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class MyExceptionHandler implements ExceptionMapper<NotFoundException> {
    @Override
    public Response toResponse(NotFoundException exception) {
        return Response.noContent().entity("I'm sorry but I couldn't find what you are looking for!").status(Response.Status.NOT_FOUND).build();
    }
}
