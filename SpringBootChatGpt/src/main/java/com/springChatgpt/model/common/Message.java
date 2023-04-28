package com.springChatgpt.model.common;

/**
 * Project Name:SpringBootChatGpt
 * 
 * @author Vibhuti Saxena Date of Development:-Apr 28, 2023
 */

public class Message {

	public String role;
	public String content;

	public Message() {
	}

	public Message(String role, String content) {
		this.role = role;
		this.content = content;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
