package Broadcasts;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Broadcast {
    private double minutes;
    private List<Part> partsList = new LinkedList<>();

    public Broadcast(double minutes, List<Part> partsList) {
        this.minutes = minutes;
        setPartsList(partsList);
    }

    public void setPartsList(List<Part> partsList) {

        double timeOfPaidContent = minutes / 2;
        double currentBroadcastTime = 0;

        for (Part part : partsList) {

            if (minutes <= currentBroadcastTime || minutes < currentBroadcastTime + part.getDuration()) {
                continue;
            }

            if (part instanceof PaidBroadcast && timeOfPaidContent <= ((PaidBroadcast) part).getCostPerMinute()) {
                timeOfPaidContent -= part.getDuration();
                currentBroadcastTime += part.getDuration();
                this.partsList.add(part);
            } else if (part instanceof UnpaidBroadcast) {
                this.partsList.add(part);
                currentBroadcastTime += part.getDuration();
            }

        }
    }

    public String broadcastIncome(){
        return partsList.stream()
                .filter(a-> a instanceof PaidBroadcast)
                .mapToDouble(a -> ((PaidBroadcast) a).amountOfMoneyForBroadcasting())
                .sum() + " €";
    }


    public void showAllPartsOfTheBroadcast(){
        partsList.forEach(Part::show);
    }
}
