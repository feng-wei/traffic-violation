package org.pc.trafficviolation.common.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrafficViolationExceptionMapper implements ExceptionMapper<TrafficViolationException> {

	private static Logger logger = LoggerFactory.getLogger(TrafficViolationExceptionMapper.class);

	@Override
	public Response toResponse(TrafficViolationException e) {
		// only logged the errors for server related error, 4xx error will only
		// be logged for debug.
		if (e.getStatusCode() >= Status.INTERNAL_SERVER_ERROR.getStatusCode()) {
			logger.error(e.getMessage(), e);
		} else {
			logger.debug(e.getMessage(), e);
		}

		return Response.status(e.getStatusCode()).type(MediaType.APPLICATION_JSON).entity(e.getError()).build();
	}

}
