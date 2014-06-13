package com.droid.elite.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/d1/status/*")
public class D1_Status {

	private static final String api_version = "00.01.00";

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		return "<p>Java Web Service</p>";

	}

	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion() {
		return "<p>Version:</p>" + api_version;

	}

}
