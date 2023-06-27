package presenter;

import broadcast.Broadcast;
import lombok.Getter;

import java.util.List;

@Getter
public class RegularPresenter extends Presenter {
    private final double workExperience;

    public RegularPresenter(String name, List<Broadcast> listOfBroadcasts, double workExperience) {
        super(name, listOfBroadcasts);
        this.workExperience = workExperience;
    }
}
