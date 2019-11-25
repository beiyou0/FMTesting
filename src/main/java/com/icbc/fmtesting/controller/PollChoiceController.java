package com.icbc.fmtesting.controller;

import com.icbc.fmtesting.service.PollChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class PollChoiceController {
    @Autowired
    private PollChoiceService pollChoiceService;

    @RequestMapping("getChoice/{id}")
    public String getPollChoice(@PathVariable int id) {
        return pollChoiceService.selectChoice(id).toString();
    }
}
