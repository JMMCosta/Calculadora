package br.com.db1.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/par")
public class EhPar {

	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") Integer num) {
		String result = "Restful example : " + num;
		return Response.status(200).entity(result).build();
	}

}


