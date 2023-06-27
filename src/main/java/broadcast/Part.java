package broadcast;

import lombok.Getter;

@Getter
public abstract class Part {
    private final int duration;
    public Part(int duration) {
        this.duration = duration;
    }

    public abstract void show();
}
