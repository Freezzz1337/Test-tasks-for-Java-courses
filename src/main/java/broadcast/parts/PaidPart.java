package broadcast.parts;

import broadcast.Part;
import lombok.Getter;

@Getter
public abstract class PaidPart extends Part {
    protected double costPerMinute = 0;
    public PaidPart(int duration) {
        super(duration);
    }
    public double amountOfMoneyForBroadcasting(){
        return getDuration() * costPerMinute;
    }
}
