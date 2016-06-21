package org.pc.trafficviolation.web.action;

public class HomeAction extends AbstractActionSupport {
	private static final long serialVersionUID = 4594282336720976554L;

	public String show() {

		System.out.println("HomeAction...");

		return SUCCESS;
	}

}
