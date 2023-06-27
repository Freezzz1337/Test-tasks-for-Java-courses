package broadcast;

import broadcast.parts.PaidPart;
import broadcast.parts.UnpaidPart;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Broadcast {
    private double minutes;
    private List<Part> partsList = new ArrayList<>();
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

            if (part instanceof PaidPart && timeOfPaidContent <= ((PaidPart) part).getCostPerMinute()) {
                timeOfPaidContent -= part.getDuration();
                currentBroadcastTime += part.getDuration();
                this.partsList.add(part);
            } else if (part instanceof UnpaidPart) {
                this.partsList.add(part);
                currentBroadcastTime += part.getDuration();
            }
        }
    }

    public String broadcastIncome(){
        return "Income from the current broadcast is " + partsList.stream()
                .filter(a-> a instanceof PaidPart)
                .mapToDouble(a -> ((PaidPart) a).amountOfMoneyForBroadcasting())
                .sum() + " €";
    }

    public void showAllPartsOfTheBroadcast(){
        partsList.forEach(Part::show);
    }
}
