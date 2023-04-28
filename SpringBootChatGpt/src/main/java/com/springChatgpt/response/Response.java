package com.springChatgpt.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Project Name:SpringBootChatGpt
 * 
 * @author Vibhuti Saxena Date of Development:-Apr 28, 2023
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
	public String id;
	public String object;
	public int created;
	public List<Choice> choices;
	public Usage usage;

	public Response() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public int getCreated() {
		return created;
	}

	public void setCreated(int created) {
		this.created = created;
	}

	public List<Choice> getChoices() {
		return choices;
	}

	public void setChoices(List<Choice> choices) {
		this.choices = choices;
	}

	public Usage getUsage() {
		return usage;
	}

	public void setUsage(Usage usage) {
		this.usage = usage;
	}

}
