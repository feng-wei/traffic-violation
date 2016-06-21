package org.pc.trafficviolation.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;

public abstract class AbstractActionSupport extends ActionSupport {
	private static final long serialVersionUID = 1L;
	protected static final String JSON = "json";
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected HttpSession session;

	protected void init() {
		logger.info("init BaseAction......");
		this.request = ServletActionContext.getRequest();
		this.session = request.getSession();
		this.response = ServletActionContext.getResponse();
	}

	protected void setNoCache() {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
	}

	public String execute() throws Exception {
		return SUCCESS;
	}

}
