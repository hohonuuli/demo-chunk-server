package demo.chunk.server;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;

@OpenAPIDefinition(info = @Info(title = "Demo Chunk Server", version = "0.1.0", description = "Testing server for chunked requests", license = @License(name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0"), contact = @Contact(url = "https://www.mbari.org/schlining-brian/", name = "Brian", email = "bschlining@gmail.com")))
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }
}