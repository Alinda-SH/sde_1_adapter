package com.hz;

public class Adapter {

    private String userAnwser;
    private String[] answers  = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};

    public Boolean checkAnswer(String answer) {
        this.userAnwser = answer;
        for (String i:answers) {
            if (answer.equals(i)) {
                return true;
            }
        }
        return false;
    };

}
