package com.icbc.fmtesting.entity;

public class PollChoice {
    private int id;
    private String choice_text;
    private int votes;
    private int question_id;

    public int getID() {
        return this.id;
    }

    public String getChoiceText() {
        return this.choice_text;
    }

    public int getVotes() {
        return this.votes;
    }

    public int getQuestionId() {
        return this.question_id;
    }

    @Override
    public String toString() {
        return id + "," + choice_text + "," + votes + "," + question_id;
    }
}
