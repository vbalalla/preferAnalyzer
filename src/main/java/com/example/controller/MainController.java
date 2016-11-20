package com.example.controller;

import com.example.core.TwitterAccess;
import com.example.view.TwitterData;
import org.springframework.web.bind.annotation.*;

/**
 * Created by vibodha on 11/19/16.
 */
@RestController
public class MainController {

    @CrossOrigin
    @RequestMapping("/search/{word}")
    public TwitterData greating(@PathVariable String word){
        TwitterAccess twitterAccess = new TwitterAccess();
        return twitterAccess.getTweetLocations(word);
    }
}
