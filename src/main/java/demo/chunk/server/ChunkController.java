package demo.chunk.server;

import java.time.Instant;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Flowable;

@Controller("/chunk")
public class ChunkController {

    @Get("/")
    public Flowable<String> index() {
        return index(4);
    }

    @Get("/{number}")
    public Flowable<String> index(Integer number) {
        return Flowable.range(1, number)
            .map(v -> {
                Thread.sleep(1000);
                return Instant.now().toString() + "\n";
            });
    }
}