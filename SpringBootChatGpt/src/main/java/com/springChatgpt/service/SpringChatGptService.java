package com.springChatgpt.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springChatgpt.model.common.Message;
import com.springChatgpt.request.Request;
import com.springChatgpt.response.Response;

/**
 * Project Name:SpringBootChatGpt
 * 
 * @author Vibhuti Saxena Date of Development:-Apr 28, 2023
 */

@Service
public class SpringChatGptService {

	@Value("${openai.api.key}")
	private String apiKey;

	private static final String OPEN_AI_CHAT_ENDPOINT = "https://api.openai.com/v1/chat/completions";

	private RestTemplate restTemplate;

	public SpringChatGptService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public Response getChatCPTResponse(String prompt) {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "Bearer " + apiKey);

		Request ChatRequest = new Request();
		ChatRequest.setModel("gpt-3.5-turbo");
		ChatRequest.setMessages(Arrays.asList(new Message("user", prompt)));
		ChatRequest.setMax_tokens(50);

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Request> request = new HttpEntity<>(ChatRequest, headers);

		return restTemplate.postForObject(OPEN_AI_CHAT_ENDPOINT, request, Response.class);
	}
}
