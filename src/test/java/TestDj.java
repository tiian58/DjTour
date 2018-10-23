import Model.Dj;
import Model.Track;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestDj {

    private Dj martinGarrix;
    private static EntityManager manager;
    private static EntityManagerFactory emf;
    @Before
    public void loadTestDependencies(){
        martinGarrix = new Dj("Martin Garrix");
        emf = Persistence.createEntityManagerFactory("db");
        manager = emf.createEntityManager();
    }

    @Test
    public void addTrack(){
        martinGarrix.addTrack(new Track("Animals"));
        assertEquals(1, martinGarrix.getTracks().size());
    }

    @Test
    public void addDjSQL(){
        manager.getTransaction().begin();

        manager.persist(martinGarrix);
        manager.getTransaction().commit();

        manager.close();
    }

    @Test
    public void editEntity(){
        manager.getTransaction().begin();

        Dj martin = manager.find(Dj.class, 7L);
        martin.setNickName("+X");
        manager.persist(martin);
        manager.getTransaction().commit();

        manager.close();
    }


}
