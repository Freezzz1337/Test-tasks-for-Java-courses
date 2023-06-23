package Broadcasts;

import lombok.Getter;

@Getter
public class PaidBroadcast extends Part {
    protected double costPerMinute = 0;
    public PaidBroadcast(int duration) {
        super(duration);
    }

    @Override
    public void show() {}

    protected double amountOfMoneyForBroadcasting(){
        return getDuration() * costPerMinute;
    }
}
