package com.springChatgpt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springChatgpt.request.InputRequest;
import com.springChatgpt.response.Response;
import com.springChatgpt.service.SpringChatGptService;

/**
 * Project Name:SpringBootChatGpt
 * 
 * @author Vibhuti Saxena Date of Development:-Apr 28, 2023
 */
@RestController
public class SpringChatGptController {

	private SpringChatGptService springChatGptService;

	public SpringChatGptController(SpringChatGptService springChatGptService) {
		this.springChatGptService = springChatGptService;
	}

	@PostMapping("/chat")
	public ResponseEntity<Response> processInputRequest(@RequestBody InputRequest inputRequest) {
		Response chatResponse = springChatGptService.getChatCPTResponse(inputRequest.getMessage());
		return new ResponseEntity<>(chatResponse, HttpStatus.OK);
	}

}
