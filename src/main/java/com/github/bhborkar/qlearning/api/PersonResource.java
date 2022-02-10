package com.github.bhborkar.qlearning.api;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.github.bhborkar.qlearning.entities.Person;
import com.github.bhborkar.qlearning.enums.EyeColor;
import com.github.bhborkar.qlearning.model.DataTable;

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
    
    @GET
    @Path("/datatable")
    @Produces(MediaType.APPLICATION_JSON)
    public DataTable<Person> datatable(
        @QueryParam(value = "draw") int draw,
        @QueryParam(value = "start") int start,
        @QueryParam(value = "length") int length,
        @QueryParam(value = "search[value]") String searchVal

        ) {
            DataTable<Person> datatable = new DataTable<>();
            datatable.setDraw(draw);
            return datatable;
    }
    
}
