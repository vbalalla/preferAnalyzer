package com.example.controller;

import com.example.core.TwitterAccess;
import com.example.view.TwitterData;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vibodha on 11/19/16.
 */
@RestController
public class MainController {

    @CrossOrigin
    @RequestMapping("/search/{word}")
    public TwitterData greating(@RequestParam String word){
        TwitterAccess twitterAccess = new TwitterAccess();
        return twitterAccess.getTweetLocations(word);
    }
}
