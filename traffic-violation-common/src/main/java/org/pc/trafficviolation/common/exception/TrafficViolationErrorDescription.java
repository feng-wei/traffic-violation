package org.pc.trafficviolation.common.exception;

/**
 * The templates below are used to return a human-readable description
 * in the error response.
 */
public final class TrafficViolationErrorDescription {

    public static final String INVALID_PARAMETER = "Input Parameter is invalid";
    public static final String INTERNAL_SERVER_ERROR = "Internal service error";

    public static final String VIMSI_PROVISION_INVALID_PARAMETER = "Input imsi range is invalid";
    public static final String VIMSI_PROVISION_INTERNAL_WORK_MANAGER_ERROR = "Internal service work manager error";

    public static final String VIMSI_CREATE_MISSING_IMSI_OR_OWNERID = "Missing parameter: imsi or ownerId.";
    public static final String VIMSI_CREATE_INVALID_PARAMETER = "Invalid request parameter: %s.";
    public final static String VIMSI_CREATE_NOT_ENOUGH_VIMSI = "Not enough unused vimsi left for allocation.";
    public final static String VIMSI_CREATE_RESOURCE_BUSY = "Vimsi allocation traffic too high, can not allocate vimsi temporarily.";
    public static final String VIMSI_DELETE_ILLEGAL_VIMSI_STATUS = "Illegal vimsi status.";
    public static final String VIMSI_DELETE_MISSING_IMSI = "Missing parameter: imsi.";
    public static final String VIMSI_DELETE_MISSING_VIMSI = "Missing parameter: vimsi.";
    public static final String VIMSI_DELETE_INVALID_PARAMETER = "Invalid request parameter: %s.";
    public static final String VIMSI_DELETE_EMPTY_VIMSI = "Empty vimsi of imsi: %s for deletion.";
    public static final String VIMSI_DELETE_EMPTY = "Empty vimsi %s for deletion.";
    public static final String VIMSI_DELETE_MISSING_PARAMMETER = "Missing delete parameter: %s.";
    public static final String VIMSI_DELETE_BAD_RANGE = "Start vimsi is less than end vimsi";
    public static final String VIMSI_DELETE_OUT_OF_RANGE = "The vimsis number is much more than can be deleted in once time";
    public static final String VIMSI_DELETE_BAD_STATUS = "Some vimsis can't be deleted because its status is used";
    public static final String VIMSI_UPDATE_MISSING_PARAMMETER = "Missing update parameter: %s.";
    public static final String VIMSI_QUERY_MISSING_IMSI = "Missing parameter: imsi.";
    public static final String VIMSI_QUERY_INVALID_PARAMETER = "Invalid request parameter: %s.";
    public static final String VIMSI_QUERY_NOT_FOUND = "No vimsi found for imsi: %s.";

    //b2bua
    public static final String SIPUSER_MISSING_SIPUSERNAME = "Missing parameter sipusername.";
    public static final String SIPUSER_MISSING_REQUEST_BODY = "Missing _b64 value";
    public static final String SIPUSER_BAD_REQUEST_BODY = "The parameter _b64's Json Body is not well format";
    public static final String SIPUSER_NOT_FOUND_REQUESTD_DATA = "Not found the requested SipCredential data";
    public static final String SIPUSER_DIGEST_DIFFERENT = "Authenticate fail:the ueDigest is error";
    public static final String SIPUSER_BATCH_INVALID_EXPIREDDATE = "Invalid parameter expiredDate";
    public static final String SIPUSER_BATCH_INVALID_AMOUNT = "Invalid parameter amount";
    public static final String SIPUSER_BATCH_LARGE_AMOUNT = "Parameter amount can't be more than 100";
    public static final String SIPUSER_BATCH_NOT_FOUND = "Not found";
    public static final String SIPUSER_BATCH_DB_ACCESS_ERROR = "Db access error";
    public static final String SIPUSER_BATCH_UNSUPPORTED_DB_TYPE = "Unsupported db type";

    //EMA
    public static final String PROFILE_PROVISIONING_INIT_FAIL = "Init ema client failed";
    public static final String PROFILE_PROVISIONING_INIT_FAIL_REASON = "Init ema client failed: %s.";
    public static final String PROFILE_PROVISIONING_CAI3G_FAULT = "Cai3g throws fault";
    public static final String PROFILE_PROVISIONING_CAI3G_FAULT_LOGIN = "Cai3g throws fault for login failed";
    public static final String PROFILE_PROVISIONING_CAI3G_EXIST = "Cai3g throws already exist";
    public static final String PROFILE_PROVISIONING_CAI3G_EXIST_MSG = "already exists";
    public static final String PROFILE_PROVISIONING_CREATE_FAIL = "Provision device profile failed";
    public static final String PROFILE_PROVISIONING_VIMSI = "Missing parameter vimsi.";
    public static final String PROFILE_PROVISIONING_VIMSI_PARAMETER = "Missing parameter: %s.";
    public static final String PROFILE_PROVISIONING_STATUS = "Input Status error.";
    public static final String PROFILE_AAA_STATUS = "AAA User Status error, just support ENABLE/DISABLE/RESET";
    public static final String PROFILE_CONFIGURATION = "Configuration aog properties error !";
    public static final String PROFILE_SEND_EXTENAL_FAIL = "send to the extenal system error, the status code is: %s.";
    public static final String PROFILE_NO_SUCH_INSTANCE_ERROR = "No request mapping to this instance .";
    public static final String EMA_CONNECT_ERROR = "EMA Server connection can not be established";
    public static final String B2BUA_CONNECT_ERROR = "B2BUA Server connection can not be established";

    //SIM Authorization
    public static final String SIM_AUTHORIZATION_NOT_FOUND = "no match SimAuthorization is found";
    public static final String SIM_AUTHORIZATION_INVALID_IMSI = "imsi is invalid,imsi={%s}";
    public static final String SIM_AUTHORIZATION_INVALID_MSISDN = "msisdn is invalid, msisdn={%s}";
    public static final String SIM_AUTHORIZATION_INVALID_SERVICE_NAMES = "serviceNames is invalid, serviceNames={%s}";
    public static final String SIM_AUTHORIZATION_INVALID_NEWIMSI_OR_MSISDN = "newImsi or msisdn is invalid, newImsi={%s},msisdn={%s}";
    public static final String SIM_AUTHORIZATION_INVALID_SERVICES = "no match service info, such as: voiceOverWifiService, missedCallAlertService, visualVoiceMailService and genericPushService";
    public static final String SIM_AUTHORIZATION_CREATE_VIOLATE_DATA_INTEGRITY = "batchSaveSimAuthorization encounters DataIntegrityViolationException, root cause : %s";
    public static final String SIM_AUTHORIZATION_CREATE_FAILED = "batchSaveSimAuthorization failed, return affected rows is %d";
    public static final String SIM_AUTHORIZATION_UPDATE_NO_RECORD = "Can not update due to sim atuhorization is not existing";
    public static final String SIM_AUTHORIZATION_DELTE_FAILED = "batchDeleteSimAuthorizationByImsiAndServiceId failed, return affected rows is 0";

    public static final String PROFILE_PROVISIONING_NULL_RESPONSE = "Response is null.";
    //Generic Solution
    public static final String GENERIC_SERVICE_CREATE_VIMIS_ZERO = "vIMSI array size is 0.";
    public static final String GENERIC_SERVICE_CREATE_MISS_REQUIRE_PARAM = "Msisdn,Ownerid and Device id are required.";
    public static final String GENERIC_SERVICE_QUERY_MISS_PARAM = "OwnerId or DeviceId or Msisdn is required.";
    public static final String GENERIC_SERVICE_QUERY_MISS_ENCRYPT = "Encrypt Key is required.";
    public static final String GENERIC_SERVICE_QUERY_EMPTY = "Batch query result set size is zero.";
    public static final String GENERIC_SERVICE_QUERY_REQUIRED_PARAM = "serviceInstanceId and EncryptKey are required.";
    public static final String GENERIC_SERVICE_QUERY_RETURN_NULL = "The ServiceSubscription with specific serviceInstanceId : {%s} is not existed";
    public static final String GENERIC_SERVICE_DELETE_REQUIRED_PARAM = "serviceInstanceId is required.";
    public static final String GENERIC_SERVICE_QUERY_NOT_FOUND = "No match service subscription with OWNER_ID: {%s} and MSISDN: {%s}";

}
