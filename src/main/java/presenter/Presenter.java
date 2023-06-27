package presenter;

import broadcast.Broadcast;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public abstract class Presenter {
    private String name;
    private List<Broadcast> listOfBroadcasts;

}