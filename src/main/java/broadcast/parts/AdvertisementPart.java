package broadcast.parts;

import lombok.Getter;

@Getter
public class AdvertisementPart extends PaidPart {
    private final String advertisementName;
    public AdvertisementPart(int duration, String advertisementName) {
        super(duration);
        costPerMinute = 300;
        this.advertisementName = advertisementName;
    }

    @Override
    public void show() {
        System.out.println("Advertisement. Name of the promotional product: " + advertisementName);
    }
}
