import Broadcasts.Broadcast;
import Broadcasts.Part;
import Broadcasts.PartsOfTheBroadcast.AdvertisementPart;
import Broadcasts.PartsOfTheBroadcast.InterviewPart;
import Broadcasts.PartsOfTheBroadcast.SongPart;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Part> partList = new LinkedList<>();
        partList.add(new SongPart(8,"Artist1","Song1"));
        partList.add(new AdvertisementPart(5,"Advert 1"));
        partList.add(new InterviewPart(5,"Iterw 3"));
        partList.add(new SongPart(7,"Artist3","Song3"));
        partList.add(new InterviewPart(8,"Iterw 1"));
        partList.add(new AdvertisementPart(2,"Advert 1"));
        partList.add(new AdvertisementPart(4,"Advert 1"));
        partList.add(new SongPart(5,"Artist2","Song2"));
        partList.add(new InterviewPart(3,"Iterw 2"));
        partList.add(new InterviewPart(3,"Iterw 2"));

        Broadcast broadcast = new Broadcast(30,partList);

        System.out.println(broadcast.getPartsList().size());
        System.out.println(broadcast.broadcastIncome());


        broadcast.showAllPartsOfTheBroadcast();
    }
}
