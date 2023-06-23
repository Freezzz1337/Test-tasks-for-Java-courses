package Presenters;

import Broadcasts.Broadcast;
import Broadcasts.Part;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public abstract class Presenter {
    private String name;
    private List<Broadcast> listOfBroadcasts;

}