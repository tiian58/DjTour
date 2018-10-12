package Repositories;

import Model.Dj;
import java.util.LinkedList;
import java.util.List;

public class DjRepositorio {
    private List<Dj> djs = new LinkedList<>();
    private static DjRepositorio instance;

    public static DjRepositorio get() {
        if (instance == null) {
            instance = new DjRepositorio();
        }
        return instance;
    }

    public Dj findAny() {
        return djs.stream().findAny().orElse(null);
    }

    public Dj findByUsername(int username) {
        throw new RuntimeException("findByUsername aun no esta implementado");
    }

    public void registrar(Dj dj) {
        djs.add(dj);
    }
}
