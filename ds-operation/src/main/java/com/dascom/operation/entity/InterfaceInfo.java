package com.dascom.operation.entity;

import java.io.Serializable;

public class InterfaceInfo implements Serializable{
	
	private static final long serialVersionUID = 2102335868720464874L;
	
	private String interfaceName;
	private String url;
	private String method;
	private String jsonPara;
	private String urlPara;
	private String resultLine;
	private int statusCode;
	public String getInterfaceName() {
		return interfaceName;
	}
	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getJsonPara() {
		return jsonPara;
	}
	public void setJsonPara(String jsonPara) {
		this.jsonPara = jsonPara;
	}
	public String getUrlPara() {
		return urlPara;
	}
	public void setUrlPara(String urlPara) {
		this.urlPara = urlPara;
	}
	public String getResultLine() {
		return resultLine;
	}
	public void setResultLine(String resultLine) {
		this.resultLine = resultLine;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public InterfaceInfo(String interfaceName, String url, String method, String jsonPara, String urlPara,
			String resultLine, int statusCode) {
		super();
		this.interfaceName = interfaceName;
		this.url = url;
		this.method = method;
		this.jsonPara = jsonPara;
		this.urlPara = urlPara;
		this.resultLine = resultLine;
		this.statusCode = statusCode;
	}
	public InterfaceInfo() {
		super();
	}
	
	
	

	

}
