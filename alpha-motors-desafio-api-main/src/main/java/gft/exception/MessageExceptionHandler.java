package gft.exception;

import java.util.Date;

public class MessageExceptionHandler {
	
	private Date timestamp;
	private Integer status;
	private String msgUsuario;
	private String msgDesenvolvedor;
	
	public MessageExceptionHandler() {
		super();
	}

	public MessageExceptionHandler(Date timestamp, Integer status, String msgUsuario, String msgDesenvolvedor) {
		this.timestamp = timestamp;
		this.status = status;
		this.msgUsuario = msgUsuario;
		this.msgDesenvolvedor = msgDesenvolvedor;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsgUsuario() {
		return msgUsuario;
	}

	public void setMsgUsuario(String msgUsuario) {
		this.msgUsuario = msgUsuario;
	}

	public String getMsgDesenvolvedor() {
		return msgDesenvolvedor;
	}

	public void setMsgDesenvolvedor(String msgDesenvolvedor) {
		this.msgDesenvolvedor = msgDesenvolvedor;
	}
	
	
	

}
