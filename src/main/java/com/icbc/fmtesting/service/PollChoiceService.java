package com.icbc.fmtesting.service;

import com.icbc.fmtesting.entity.PollChoice;
import com.icbc.fmtesting.mapper.PollChoiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PollChoiceService {

    @Autowired
    private PollChoiceMapper pollChoiceMapper;

    public PollChoice selectChoice(int id) {
        return pollChoiceMapper.selectChoice(id);
    }
}
