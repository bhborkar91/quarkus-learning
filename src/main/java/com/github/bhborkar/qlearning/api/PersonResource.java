package com.github.bhborkar.qlearning.api;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.github.bhborkar.qlearning.entities.Person;
import com.github.bhborkar.qlearning.enums.EyeColor;

@Path("/person")
@ApplicationScoped
public class PersonResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getAll() {
        return Person.listAll();
    }
    
    @GET
    @Path("/by/color/{color}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getByColor(@PathParam("color") EyeColor color) {
        return Person.findByColor(color);
    }
}
