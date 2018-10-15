package Controllers;

import Repositories.DjRepositorio;


import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class ControllerHome {
    public static String index(Request req, Response res) {
        return "<html> <body> Hola" + DjRepositorio.get().findAny() + " </body></html>";
    }

    public static ModelAndView home(Request req, Response res){
        return new ModelAndView(null, "/home.hbs");
    }
}
