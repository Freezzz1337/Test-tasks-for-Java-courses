import broadcast.Broadcast;
import broadcast.Part;
import broadcast.parts.AdvertisementPart;
import broadcast.parts.InterviewPart;
import broadcast.parts.SongPart;
import presenter.RegularPresenter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Part> partList = new ArrayList<>();
        partList.add(new SongPart(8, "Artist1", "Song1"));
        partList.add(new AdvertisementPart(5, "Advert 3"));
        partList.add(new InterviewPart(5, "Iterw 3"));
        partList.add(new SongPart(7, "Artist3", "Song3"));
        partList.add(new InterviewPart(8, "Iterw 1"));
        partList.add(new AdvertisementPart(2, "Advert 1"));
        partList.add(new AdvertisementPart(4, "Advert 2"));
        partList.add(new SongPart(5, "Artist2", "Song2"));
        partList.add(new InterviewPart(3, "Iterw 3"));
        partList.add(new InterviewPart(3, "Iterw 2"));

        Broadcast broadcast = new Broadcast(30, partList);
        RegularPresenter rg = new RegularPresenter("Artem", Collections.singletonList(broadcast), 2);

        rg.getListOfBroadcasts().get(0).showAllPartsOfTheBroadcast();

        System.out.println("Broadcast size " + broadcast.getPartsList().size());
        System.out.println(broadcast.broadcastIncome());

    }
}
