package co.poc.eventstore.co.poc.event.application.create;

import co.poc.eventstore.co.poc.event.domain.Event;
import co.poc.eventstore.co.poc.event.domain.EventRepository;
import org.springframework.stereotype.Service;

@Service
public final class EventCreate {
    private final EventRepository repository;

    public EventCreate(final EventRepository repository) { this.repository = repository; }

    public void create(final EventRequest request) {
        final Event event = new Event(request.id(), request.type(), request.ocurredOn(), request.idAttribute(), request.someParameter());
        repository.save(event);
    }
}
