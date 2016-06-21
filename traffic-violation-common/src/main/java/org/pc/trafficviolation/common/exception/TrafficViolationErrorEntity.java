package org.pc.trafficviolation.common.exception;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The error includes error code and error description.
 * 
 * @see TrafficViolationErrorCode
 * @see TrafficViolationErrorDescription
 */
public class TrafficViolationErrorEntity implements Serializable {

    private static final long serialVersionUID = 193965175648915846L;
    
    @JsonProperty("errorCode")
    private String errorCode;
    
    @JsonProperty("errorMessage")
    private String errorMessage;

    public TrafficViolationErrorEntity() {
    }

    public TrafficViolationErrorEntity(TrafficViolationErrorCode errorCode, String errorMessage) {
        this.errorCode = errorCode.getErrorCode();
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorDescription) {
        this.errorMessage = errorDescription;
    }

    @Override
    public String toString() {
        return errorCode + ": " + errorMessage;
    }
}
