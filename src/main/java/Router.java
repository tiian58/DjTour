import Controllers.ControllerHome;
import spark.Spark;
import spark.template.handlebars.HandlebarsTemplateEngine;
import spark.utils.HandlebarsTemplateEngineBuilder;


public class Router {
    public static void configure() {
        HandlebarsTemplateEngine engine = HandlebarsTemplateEngineBuilder
                .create()
                .withDefaultHelpers()
                //.withHelper("isTrue", BooleanHelper.isTrue)
                .build();

        Spark.staticFiles.location("/public");

        Spark.get("/", ControllerHome::home, engine);
    }
}
