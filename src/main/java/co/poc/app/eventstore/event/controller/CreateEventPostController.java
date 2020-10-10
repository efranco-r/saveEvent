package co.poc.app.eventstore.event.controller;

import co.poc.eventstore.co.poc.event.application.create.EventCreate;
import co.poc.eventstore.co.poc.event.application.create.EventRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v.1.0")
public final class CreateEventPostController {
    private final EventCreate eventCreate;

    public CreateEventPostController(final EventCreate eventCreate) {
        this.eventCreate = eventCreate;
    }

    @PostMapping("/event")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void create(@RequestBody EventRequest request) {
        this.eventCreate.create(request);
    }
}
