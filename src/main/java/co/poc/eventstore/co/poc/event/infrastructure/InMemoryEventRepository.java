package co.poc.eventstore.co.poc.event.infrastructure;

import co.poc.eventstore.co.poc.event.domain.Event;
import co.poc.eventstore.co.poc.event.domain.EventRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public final class InMemoryEventRepository implements EventRepository {
    private final HashMap<String, Event> events = new HashMap<>();

    @Override
    public void save(final Event event) { this.events.put(event.id(), event); }
}
