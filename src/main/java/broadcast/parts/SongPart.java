package broadcast.parts;

import lombok.Getter;

@Getter
public class SongPart extends UnpaidPart {
    private final String artistName;
    private final String songName;
    
    public SongPart(int duration,String artistName, String songName) {
        super(duration);
        this.artistName = artistName;
        this.songName = songName;
    }

    @Override
    public void show() {
        System.out.println("Song. Name of the song: "+ songName + ". Artist name: " + artistName);
    }
}
