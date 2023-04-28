package com.springChatgpt.request;

import java.util.List;

import com.springChatgpt.model.common.Message;

/**
 * Project Name:SpringBootChatGpt
 * 
 * @author Vibhuti Saxena Date of Development:-Apr 28, 2023
 */

public class Request {

	private String model;

	private List<Message> messages;

	private Integer max_tokens;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public Integer getMax_tokens() {
		return max_tokens;
	}

	public void setMax_tokens(Integer max_tokens) {
		this.max_tokens = max_tokens;
	}
}
