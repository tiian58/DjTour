import jdk.nashorn.internal.runtime.linker.Bootstrap;
import spark.Spark;

import static spark.Spark.get;

public class HelloWorld {
    public static void main(String[] args) {
        Spark.port(9000);

        get("/helloworld", (req, res) -> "Hello World");
        Spark.get("/:nombre", (request, response) -> "HOLA " + request.params("nombre"));

    }
}