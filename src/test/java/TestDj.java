import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDj {

    private Dj martinGarrix;
    @Before
    public void loadTestDependencies(){
        martinGarrix = new Dj("Martin Garrix");
    }

    @Test
    public void addTrack(){
        Track animals = new Track("Animals");
        martinGarrix.addTrack(animals);

        assertEquals(2, martinGarrix.tracks.size());
    }
}
