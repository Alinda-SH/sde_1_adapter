package com.hz;

public class Adapter {

    ConsoleReader reader;
    private String[] answers  = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};

   public Adapter(ConsoleReader reader) {
       this.reader = reader;
   }

    public Boolean checkAnswer() {
        for (String i:answers) {
            if (reader.readLine().equals(i)) {
                return true;
            }
        }
        return false;
    };

}
