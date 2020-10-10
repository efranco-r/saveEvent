package co.poc.eventstore.co.poc.event.application.create;

import java.util.Date;

public final class EventRequest {
    private final String id;
    private final String type;
    private final Date ocurredOn;
    private final String idAttribute;
    private final String someParameter;

    public EventRequest(final String id, final String type, final Date ocurredOn, final String idAttribute, final String someParameter ) {
        this.id = id;
        this.type = type;
        this.ocurredOn = ocurredOn;
        this.idAttribute = idAttribute;
        this.someParameter = someParameter;
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

    public String idAttribute() { return idAttribute; }

    public String someParameter() { return someParameter; }
}
