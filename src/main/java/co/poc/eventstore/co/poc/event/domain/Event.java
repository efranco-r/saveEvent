package co.poc.eventstore.co.poc.event.domain;

import java.util.Date;

public final class Event {
    private final String id;
    private final String type;
    private final Date ocurredOn;
    private final Attribute attribute;

    public Event(final String id, final String type, final Date ocurredOn, final String idAttribute, final String someParameter ) {
        this.id = id;
        this.type = type;
        this.ocurredOn = ocurredOn;
        this.attribute = new Attribute(idAttribute, someParameter);
    }

    public String id() {
        return id;
    }

    public String type() {
        return type;
    }

    public Date ocurredOn() {
        return ocurredOn;
    }

    public Attribute attribute() {
        return attribute;
    }
}
