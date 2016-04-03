package com.androidnanodegree.cr.wizardjoke;

import com.androidnanodegree.cr.manualjoke.JokeSmith;

public class JokeWizard {
    public String getWizardJoke() {
        JokeSmith jokeSmith = new JokeSmith();
        return "Then the wizard said: " + jokeSmith.getJoke();
    }
}
