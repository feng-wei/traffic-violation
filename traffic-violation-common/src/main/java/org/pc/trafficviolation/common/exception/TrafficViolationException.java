package org.pc.trafficviolation.common.exception;

public class TrafficViolationException extends RuntimeException {

    private static final long serialVersionUID = 7317970843575077827L;

    private final TrafficViolationErrorEntity error;

    // This is the default status code.
    private int statusCode = 400;

    public TrafficViolationException(TrafficViolationErrorEntity errorEntity, int statusCode) {
        this.error = errorEntity;
        this.statusCode = statusCode;
    }

    public TrafficViolationException(TrafficViolationErrorCode errorCode, String errorMessage) {
        this.error = new TrafficViolationErrorEntity(errorCode, errorMessage);
    }

    public TrafficViolationException(TrafficViolationErrorCode errorCode, String errorMessage, int statusCode) {
        this(errorCode, errorMessage);
        this.statusCode = statusCode;
    }

    public TrafficViolationException(TrafficViolationErrorCode errorCode, String errorMessage, Throwable cause, String message) {
        super(message, cause);
        this.error = new TrafficViolationErrorEntity(errorCode, errorMessage);
    }

    public TrafficViolationException(TrafficViolationErrorCode error, String errorMessage, Throwable cause, String message,
            int statusCode) {
        this(error, errorMessage, cause, message);
        this.statusCode = statusCode;
    }

    public TrafficViolationErrorEntity getError() {
        return error;
    }

    public int getStatusCode() {
        return statusCode;
    }

    @Override
    public String getMessage() {
        if (super.getMessage() != null) {
            return super.getMessage();
        }
        if (error != null) {
            return error.toString();
        }
        return null;
    }

}
