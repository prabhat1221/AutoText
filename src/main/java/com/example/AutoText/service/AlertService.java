package com.example.AutoText.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.example.AutoText.entity.Product;

@Service
public class AlertService {
	
	public String post(String url, String text) throws URISyntaxException{
		RestTemplate restTemplate = new RestTemplate();
		JSONObject request = new JSONObject();
		request.put("text", text);
		URI uri = new URI(url);
        return restTemplate.postForObject(uri, request.toString(), String.class);
	}
	
	
	/*public String post1(String url, String text) throws URISyntaxException{
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		//headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		//JSONObject personJsonObject = new JSONObject();
	    //personJsonObject.put("id", 1);
	    //personJsonObject.put("name", "John");
		
		//HttpEntity<String> request = 
			      //new HttpEntity<String>(personJsonObject.toString(), headers);
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("email", "first.last@example.com");

		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
		URI uri = new URI(url);
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.postForObject(uri, request, String.class);
		
	}
	public String post2() {
        // TODO Auto-generated method stub
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
        Map map = new HashMap<String, String>();
        map.put("Content-Type", "application/json");

        headers.setAll(map);

        Map req_payload = new HashMap();
        req_payload.put("name", "piyush");
        req_payload.put("na2me", "piyush");

        HttpEntity<?> request = new HttpEntity<>(req_payload, headers);
        String url = "https://chat.googleapis.com/v1/spaces/AAAArCfwLlk/messages?key=AIzaSyDdI0hCZtE6vySjMm-WEfRq3CPzqKqqsHI&token=9rnn9crnagOyo_drdWfeU7qHgLiTFn8TWcp57SMt_4Y%3D";
		return null;

	}*/
}
