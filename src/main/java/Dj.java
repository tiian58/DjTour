import java.util.List;

public class Dj {

    public String name;
    public String nickName;
    public List<Track> tracks;

    public Dj(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void addTrack(Track track){
        tracks.add(track);
    }
}
