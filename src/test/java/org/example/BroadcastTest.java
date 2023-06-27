package org.example;

import broadcast.Broadcast;
import broadcast.Part;
import broadcast.parts.AdvertisementPart;
import broadcast.parts.InterviewPart;
import broadcast.parts.SongPart;
import broadcast.parts.UnpaidPart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class BroadcastTest {
    Broadcast broadcast;
    List<Part> partList;

    @BeforeEach
    void addValuesToList() {
        partList = new ArrayList<>();
        partList.add(new SongPart(8, "Artist1", "Song1"));
        partList.add(new AdvertisementPart(5, "Advert 1"));
        partList.add(new InterviewPart(5, "Iterw 3"));
        partList.add(new SongPart(7, "Artist3", "Song3"));
        partList.add(new InterviewPart(8, "Iterw 1"));
        partList.add(new AdvertisementPart(2, "Advert 1"));
        partList.add(new AdvertisementPart(4, "Advert 1"));
        partList.add(new SongPart(5, "Artist2", "Song2"));
        partList.add(new InterviewPart(3, "Iterw 2"));
        partList.add(new InterviewPart(3, "Iterw 2"));
        broadcast = new Broadcast(30, partList);
    }

    @Test
    void testBroadcastDuration() {
        assertTrue(
                broadcast.getPartsList().stream()
                        .mapToDouble(Part::getDuration)
                        .sum() <= broadcast.getMinutes()
        );
    }
    @Test
    void testDurationOfThePaidParts() {
        assertTrue(
                broadcast.getPartsList().stream()
                        .filter(a -> a instanceof UnpaidPart)
                        .mapToInt(Part::getDuration)
                        .sum() <= broadcast.getMinutes() / 2
        );
    }
    @Test
    void testBroadcastIncome() {
        assertEquals("Income from the current broadcast is 2340.0 €", broadcast.broadcastIncome());
    }

    @Test
    void testShowAllPartsOfTheBroadcast() {
        assertEquals(6, broadcast.getPartsList().size());
    }

}
