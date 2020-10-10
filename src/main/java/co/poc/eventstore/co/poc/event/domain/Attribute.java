package co.poc.eventstore.co.poc.event.domain;

public final class Attribute {
    private final String id;
    private final String someParameter;

    public Attribute(final String id, final String someParameter) {
        this.id = id;
        this.someParameter = someParameter;
    }

    public String id() {
        return id;
    }

    public String someParameter() {
        return someParameter;
    }
}
