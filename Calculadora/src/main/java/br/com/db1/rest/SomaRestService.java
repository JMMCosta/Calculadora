package br.com.db1.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/soma")
public class SomaRestService {

	@GET
	@Path("/{param1}/{param2}")
	public Response printMessage(@PathParam("param1") Integer num1, @PathParam("param2") Integer num2) {
		Integer resultado = num1 + num2;
		String result = "Restful example : " + resultado;
		return Response.status(200).entity(result).build();
	}

}


