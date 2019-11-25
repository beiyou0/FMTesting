package com.icbc.fmtesting.mapper;

import com.icbc.fmtesting.entity.PollChoice;
import org.springframework.stereotype.Repository;

@Repository
public interface PollChoiceMapper {
    PollChoice selectChoice(int id);
}
