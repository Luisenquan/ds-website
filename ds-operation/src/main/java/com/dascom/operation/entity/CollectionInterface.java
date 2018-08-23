package com.dascom.operation.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="collection_operation")
public class CollectionInterface implements Serializable{

	private static final long serialVersionUID = -956081880943583457L;
	
	@Id
	private String _id;
	private String interfaceName;
	private String method;
	private String portName;
	private String requestUrl;
	private String jsonParameter;
	private String urlParameter;
	private String headerParameter;
	private String note;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getInterfaceName() {
		return interfaceName;
	}
	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getPortName() {
		return portName;
	}
	public void setPortName(String portName) {
		this.portName = portName;
	}
	public String getRequestUrl() {
		return requestUrl;
	}
	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}
	public String getJsonParameter() {
		return jsonParameter;
	}
	public void setJsonParameter(String jsonParameter) {
		this.jsonParameter = jsonParameter;
	}
	public String getUrlParameter() {
		return urlParameter;
	}
	public void setUrlParameter(String urlParameter) {
		this.urlParameter = urlParameter;
	}
	public String getHeaderParameter() {
		return headerParameter;
	}
	public void setHeaderParameter(String headerParameter) {
		this.headerParameter = headerParameter;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public CollectionInterface(String _id, String interfaceName, String method, String portName, String requestUrl,
			String jsonParameter, String urlParameter, String headerParameter, String note) {
		super();
		this._id = _id;
		this.interfaceName = interfaceName;
		this.method = method;
		this.portName = portName;
		this.requestUrl = requestUrl;
		this.jsonParameter = jsonParameter;
		this.urlParameter = urlParameter;
		this.headerParameter = headerParameter;
		this.note = note;
	}
	public CollectionInterface() {
		super();
	}
	
	

}
