package com.app.dto;

import java.time.LocalDateTime;

public class ApiResponse {
    private String message;
    private LocalDateTime timestamp;
    public ApiResponse(String message) {
		this.message=message;
		this.timestamp=LocalDateTime.now();
	}
	@Override
	public String toString() {
		return "ApiResponse [message=" + message + ", timestamp=" + timestamp + "]";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	
    
}
