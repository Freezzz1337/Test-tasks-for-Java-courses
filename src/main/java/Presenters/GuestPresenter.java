package Presenters;

import Broadcasts.Broadcast;
import Broadcasts.Part;
import lombok.Getter;

import java.util.List;

@Getter
public class GuestPresenter extends Presenter{
    private String resume;
    public GuestPresenter(String name, List<Broadcast> listOfBroadcasts, String resume) {
        super(name, listOfBroadcasts);
        this.resume = resume;
    }
}
