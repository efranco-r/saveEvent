package co.poc.eventstore.co.poc.event.domain;

import co.poc.eventstore.co.poc.event.domain.Event;

public interface EventRepository {
    void save(final Event event);
}
