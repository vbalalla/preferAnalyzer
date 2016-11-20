package com.example.core;

import com.example.view.TwitterData;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by vibodha on 11/19/16.
 */
public class TwitterAccess {
    public TwitterData getTweetLocations(String word){

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer "+"AAAAAAAAAAAAAAAAAAAAADqsxwAAAAAAHzqGDu4raM%2B4y5XRn58dkPP0dmA%3Dv3jH34xKgyA7CiTXuL7NYD6nKUGj0azE7Obwtsiv46Q32eKvJG");
        HttpEntity<String> entity = new HttpEntity<>(headers);
        String resourceUrl = "https://api.twitter.com/1.1/search/tweets.json?q=" + word;
        ResponseEntity<TwitterData> response = restTemplate.exchange(resourceUrl, HttpMethod.GET, entity, TwitterData.class);
        return response.getBody();

    }
}
