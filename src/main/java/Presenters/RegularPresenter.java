package Presenters;

import Broadcasts.Broadcast;
import Broadcasts.Part;
import lombok.Getter;

import java.util.List;

@Getter
public class RegularPresenter extends Presenter {
    private double workExperience;

    public RegularPresenter(String name, List<Broadcast> listOfBroadcasts, double workExperience) {
        super(name, listOfBroadcasts);
        this.workExperience = workExperience;
    }
}
