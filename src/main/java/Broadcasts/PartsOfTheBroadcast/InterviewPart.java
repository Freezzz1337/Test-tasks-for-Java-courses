package Broadcasts.PartsOfTheBroadcast;

import Broadcasts.PaidBroadcast;
import lombok.Getter;

@Getter
public class InterviewPart extends PaidBroadcast {
    private final String personName;
    public InterviewPart(int duration, String personName) {
        super(duration);
        costPerMinute = 30;
        this.personName = personName;
    }

    @Override
    public void show() {
        System.out.println("Interview. Interviewer named: " + personName);
    }
}
