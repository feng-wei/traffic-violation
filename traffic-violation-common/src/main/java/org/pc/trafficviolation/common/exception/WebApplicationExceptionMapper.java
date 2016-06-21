/*------------------------------------------------------------------------------
 * COPYRIGHT Ericsson 2013
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package org.pc.trafficviolation.common.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The purpose of this class convert the WebApplicationException to
 * Response.
 */
@Provider
public class WebApplicationExceptionMapper implements ExceptionMapper<WebApplicationException> {

    private Logger logger = LoggerFactory.getLogger(WebApplicationExceptionMapper.class);

    @Override
    public Response toResponse(WebApplicationException exception) {
        logger.error(exception.getMessage(), exception);

        Response response = exception.getResponse();
        if (response == null) {
            return buildInternalErrorResponse();
        }

        int status = response.getStatus();
        if (status == Status.INTERNAL_SERVER_ERROR.getStatusCode()) {
            return buildInternalErrorResponse();
        }

        return Response.status(status).build();
    }

    private Response buildInternalErrorResponse() {
        TrafficViolationErrorEntity error = new TrafficViolationErrorEntity(TrafficViolationErrorCode.UNKNOWN_INTERNAL_ERROR,
                "Internal Server Error");
        return Response.status(Status.INTERNAL_SERVER_ERROR).type(MediaType.APPLICATION_JSON).entity(error).build();
    }

}
