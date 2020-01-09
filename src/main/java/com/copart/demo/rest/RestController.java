package com.copart.demo.rest;

import com.copart.demo.response.ContentItem;
import com.copart.demo.response.MainResponse;
import com.copart.demo.rest_assured.RestAssuredMain;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/")
public class RestController {

    @GetMapping("/")
    public String getString (){
        return "Hello!!";
    }

    @GetMapping(value = "/car/{model}")
    public /*List<ContentItem>*/List<ContentItem> getContent(@PathVariable String model){
        RestAssuredMain restAssuredMain = new RestAssuredMain();
                MainResponse mainResponse = restAssuredMain.getResult(model);
        return mainResponse.getData().getResults().getContent();
    }
}
